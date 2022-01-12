package L3;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;


public class CmmSemanticListener extends CmmParserBaseListener {
    ParseTreeProperty<Type> values = new ParseTreeProperty<>(); // 用于传值
    SymbolTable symbolTable = SymbolTable.getInstance(); // 符号表
    ErrorReporter errorReporter = ErrorReporter.getInstance(); // 用于输出error

    // 记录所有丢弃的节点 fixme 这方法实在是太垃圾了
    ArrayList<ParserRuleContext> abandonedCtx = new ArrayList<>();

    // 判断是否有父节点被丢弃
    public boolean isAbandoned(ParserRuleContext ctx) {
        boolean flag = false;
        while (!(ctx instanceof CmmParser.ProgramContext)) {
            if (abandonedCtx.contains(ctx)) {
                flag = true;
                break;
            }
            ctx = ctx.getParent();
        }
        return flag;
    }

    // 检查是否为左值
    public boolean isLeftValue(CmmParser.ExpContext ctx) {
        boolean flag = ctx.LB() != null // Exp LB Exp RB
                || ctx.DOT() != null; // Exp DOT ID
        if (ctx.getChildCount() == 1 && ctx.ID() != null) { // ID
            flag = !(values.get(ctx) instanceof Function);
        }
        if (ctx.ASSIGNOP() != null) { // Exp ASSIGNOP Exp
            return isLeftValue(ctx.exp(0));
        }
        if (ctx.ID() == null && ctx.LP() != null) { // LP Exp RP
            return isLeftValue(ctx.exp(0));
        }
        return flag;
    }

    // todo 就硬碰
//    @Override
//    public void enterEveryRule(ParserRuleContext ctx) {
//        errorReporter.printError(ErrorType.NOT_ARRAY, ctx.start.getLine(), null);
//    }

    @Override
    public void enterProgram(CmmParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(CmmParser.ProgramContext ctx) {
    }

    @Override
    public void enterExtDef(CmmParser.ExtDefContext ctx) {
    }

    @Override
    public void exitExtDef(CmmParser.ExtDefContext ctx) {
    }

    @Override
    public void enterExtDecList(CmmParser.ExtDecListContext ctx) {
        // 存父节点的继承属性
        values.put(ctx, values.get(ctx.getParent()));
    }

    @Override
    public void exitExtDecList(CmmParser.ExtDecListContext ctx) {
    }

    @Override
    public void enterSpecifier(CmmParser.SpecifierContext ctx) {
    }

    @Override
    public void exitSpecifier(CmmParser.SpecifierContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        String text = ctx.start.getText();
        // 均传递到父节点
        if (text.equals("int")) {
            values.put(ctx.getParent(), new Basic(Kind.INT));
        } else if (text.equals("float")) {
            values.put(ctx.getParent(), new Basic(Kind.FLOAT));
        } else { // struct
            values.put(ctx.getParent(), values.get(ctx.structSpecifier()));
        }
    }

    @Override
    public void enterStructSpecifier(CmmParser.StructSpecifierContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        if (ctx.getChildCount() > 2) { // struct定义
            if (ctx.optTag().children != null) { // 非匿名
                String name = ctx.optTag().ID().getText();
                if (symbolTable.seek(name) != null) {
                    abandonedCtx.add(ctx);
                    errorReporter.printError(ErrorType.DUPLICATED_STRUCT, ctx.optTag().start.getLine(), name);
                    values.put(ctx, new UNKNOWN());
                } else {
                    values.put(ctx, new Structure(name, null));
                }
            } else { // 匿名
                values.put(ctx, new Structure(null, null));
            }
        }
    }

    @Override
    public void exitStructSpecifier(CmmParser.StructSpecifierContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        if (ctx.getChildCount() > 2) { // struct 定义
            Structure type = (Structure) values.get(ctx);
            FieldList fieldList = null;
            List<ParseTree> defs = ctx.defList().children;
            if (defs != null) {
                for (ParseTree pt : defs) {
                    CmmParser.DefContext def = (CmmParser.DefContext) pt;
                    List<ParseTree> decs = def.decList().children;
                    for (int i = 0; i < decs.size(); i = i + 2) { // 注意是i+2 跳过COMMA
                        CmmParser.DecContext dec = (CmmParser.DecContext) decs.get(i);
                        Type t = values.get(dec.varDec());
                        if (t != null && !(t instanceof UNKNOWN)) {
                            String n = dec.varDec().ID(0).getText();
                            if (fieldList == null) {
                                fieldList = new FieldList(n, t, null);
                                type.memberList = fieldList;
                            } else {
                                fieldList.next = new FieldList(n, t, null);
                                fieldList = fieldList.next;
                            }
                        }
                    }
                }
            }
            values.removeFrom(ctx);
            values.put(ctx, type);
            // 加入符号表
            if (type.name != null) { // 匿名就不加符号表了，否则空指针
                symbolTable.fill(type.name, type);
            }
        } else {
            String name = ctx.tag().ID().getText();
            Type type = symbolTable.seek(name);
            if (!(type instanceof Structure)) {
                errorReporter.printError(ErrorType.UNDEFINED_STRUCT, ctx.tag().start.getLine(), name);
                values.put(ctx, new UNKNOWN());
            } else {
                if (!name.equals(((Structure) type).name)) { // 一定要比较一下！！！
                    errorReporter.printError(ErrorType.UNDEFINED_STRUCT, ctx.tag().start.getLine(), name);
                    values.put(ctx, new UNKNOWN());
                } else {
                    values.put(ctx, type);
                }
            }
        }
    }

    @Override
    public void enterOptTag(CmmParser.OptTagContext ctx) {
    }

    @Override
    public void exitOptTag(CmmParser.OptTagContext ctx) {
    }

    @Override
    public void enterTag(CmmParser.TagContext ctx) {
    }

    @Override
    public void exitTag(CmmParser.TagContext ctx) {
    }

    @Override
    public void enterVarDec(CmmParser.VarDecContext ctx) {
    }

    // 在 varDec 判断重复 + 加入符号表
    @Override
    public void exitVarDec(CmmParser.VarDecContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        String name = ctx.ID(0).getText();
        boolean isInStruct = false;
        Type type = values.get(ctx.getParent()); // 拿到父节点的继承属性
        if (type == null || type instanceof UNKNOWN) {
            return;
        }
        if (ctx.parent instanceof CmmParser.DecContext) { // 否则空指针
            isInStruct = ctx.parent.parent.parent.parent.parent instanceof CmmParser.StructSpecifierContext; // 救……非要在varDec里判断似乎只能这么写了……
        }
        if (symbolTable.seek(name) != null) {
            if (isInStruct) {
                errorReporter.printError(ErrorType.REDEFINED_FIELD, ctx.start.getLine(), name);
            } else {
                errorReporter.printError(ErrorType.REDEFINED_VAR, ctx.start.getLine(), name);
            }
        } else {
            if (ctx.getChildCount() > 1) { // array
                for (int i = ctx.getChildCount() / 3 - 1; i >= 0; i--) {
                    type = new Array(type, Integer.parseInt(ctx.INT(i).getText()));
                }
            }
            // 若在结构体中，检查一下后面是否赋值了
            if (isInStruct && ctx.parent.getChildCount() > 1) {
                errorReporter.printError(ErrorType.REDEFINED_FIELD, ctx.start.getLine(), name);
            } // fixme 这种情况还要存入符号表吗？
            else {
                values.put(ctx, type);
                // 存入符号表
                symbolTable.fill(name, type);
            }
        }
    }

    @Override
    public void enterFunDec(CmmParser.FunDecContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        String name = ctx.ID().getText();
        if (symbolTable.seek(name) != null) {
            abandonedCtx.add(ctx.getParent()); // 注意这里是将父节点加入
            errorReporter.printError(ErrorType.REDEFINED_FUN, ctx.start.getLine(), name);
            values.put(ctx, new UNKNOWN());
        } else {
            values.put(ctx, new Function(values.get(ctx.getParent()), null));
            // 注意此时遇到ID就要加入符号表
            symbolTable.fill(ctx.ID().getText(), new Function()); // exit时再完善type
        }
    }

    @Override
    public void exitFunDec(CmmParser.FunDecContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        Function type = (Function) values.get(ctx);
        FieldList fieldList = null;
        if (ctx.varList() != null) {
            List<CmmParser.ParamDecContext> params = ctx.varList().paramDec();
            for (CmmParser.ParamDecContext param : params) {
                Type t = values.get(param.varDec());
                if (t != null && !(t instanceof UNKNOWN)) {
                    String n = param.varDec().ID(0).getText();
                    if (fieldList == null) {
                        fieldList = new FieldList(n, t, null);
                        type.paramList = fieldList;
                    } else {
                        fieldList.next = new FieldList(n, t, null);
                        fieldList = fieldList.next;
                    }
                }
            }
        }
        values.removeFrom(ctx);
        values.put(ctx, type);
        // 完善符号表
        symbolTable.replace(ctx.ID().getText(), type);
    }

    @Override
    public void enterVarList(CmmParser.VarListContext ctx) {
    }

    @Override
    public void exitVarList(CmmParser.VarListContext ctx) {
    }

    @Override
    public void enterParamDec(CmmParser.ParamDecContext ctx) {
    }

    @Override
    public void exitParamDec(CmmParser.ParamDecContext ctx) {
    }

    @Override
    public void enterCompSt(CmmParser.CompStContext ctx) {
        // 存父节点的继承属性
        values.put(ctx, values.get(ctx.getParent()));
    }

    @Override
    public void exitCompSt(CmmParser.CompStContext ctx) {
    }

    @Override
    public void enterStmtList(CmmParser.StmtListContext ctx) {
        // 存父节点的继承属性
        values.put(ctx, values.get(ctx.getParent()));
    }

    @Override
    public void exitStmtList(CmmParser.StmtListContext ctx) {
    }

    @Override
    public void enterStmt(CmmParser.StmtContext ctx) {
        // 存父节点的继承属性
        values.put(ctx, values.get(ctx.getParent()));
    }

    @Override
    public void exitStmt(CmmParser.StmtContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        if (ctx.RETURN() != null) {
            Type retType = values.get(ctx.exp());
            Type defType = values.get(ctx.getParent());
            if (retType != null && defType != null && !(retType instanceof UNKNOWN) && !(defType instanceof UNKNOWN)) {
                if (!retType.equals(defType)) {
                    errorReporter.printError(ErrorType.MISMATCHED_RET, ctx.exp().start.getLine(), null);
                }
            }
        } else if (ctx.IF() != null || ctx.WHILE() != null) { // 勿忘
            Type type = values.get(ctx.exp());
            if (!(type instanceof UNKNOWN) && type != null && type.kind != Kind.INT) {
                errorReporter.printError(ErrorType.MISMATCHED_OPE, ctx.exp().start.getLine(), null);
            }
        }
    }

    @Override
    public void enterDefList(CmmParser.DefListContext ctx) {
    }

    @Override
    public void exitDefList(CmmParser.DefListContext ctx) {
    }

    @Override
    public void enterDef(CmmParser.DefContext ctx) {
    }

    @Override
    public void exitDef(CmmParser.DefContext ctx) {

    }

    @Override
    public void enterDecList(CmmParser.DecListContext ctx) {
        // 存父节点的继承属性
        values.put(ctx, values.get(ctx.getParent()));
    }

    @Override
    public void exitDecList(CmmParser.DecListContext ctx) {
    }

    @Override
    public void enterDec(CmmParser.DecContext ctx) {
        // 存父节点的继承属性
        values.put(ctx, values.get(ctx.getParent()));
    }

    @Override
    public void exitDec(CmmParser.DecContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        // 别忘了
        Type type = values.get(ctx);
        if (ctx.ASSIGNOP() != null && !(ctx.parent.parent.parent.parent instanceof CmmParser.StructSpecifierContext)) { // 注意不能是结构体
            Type expType = values.get(ctx.exp());
            if (!type.equals(expType)) {
                if (!(type instanceof UNKNOWN) && !(expType instanceof UNKNOWN)) {
                    errorReporter.printError(ErrorType.MISMATCHED_ASSIGN, ctx.varDec().start.getLine(), null);
                }
            }
        }
    }

    @Override
    public void enterExp(CmmParser.ExpContext ctx) {
//        if (isAbandoned(ctx)) {
//            return;
//        }
        // todo 检查函数调用
//        if (ctx.ID() != null && ctx.LP() != null) {
//            String name = ctx.ID().getText();
//            if (symbolTable.seek(name) == null) { // 不能用 instance of Function
//                abandonedCtx.add(ctx);
//                errorReporter.printError(ErrorType.UNDEFINED_FUN, ctx.start.getLine(), name);
//            }
//        }
    }

    @Override
    public void exitExp(CmmParser.ExpContext ctx) {
        if (isAbandoned(ctx)) {
            return;
        }
        if (ctx.getChildCount() == 1) {
            if (ctx.ID() != null) { // ID
                String name = ctx.ID().getText();
                Type type = symbolTable.seek(name);
                if (type == null) {
                    values.put(ctx, new UNKNOWN());
                    errorReporter.printError(ErrorType.UNDEFINED_VAR, ctx.start.getLine(), name);
                } else {
                    values.put(ctx, type);
                }
            } else if (ctx.INT() != null) { // INT
                values.put(ctx, new Basic(Kind.INT));
            } else { // FLOAT
                values.put(ctx, new Basic(Kind.FLOAT));
            }
        } else if (ctx.getChildCount() == 2) { // (NOT|MINUS) exp todo 需要分开判断吗
            Type type = values.get(ctx.exp(0));
            boolean hasError = true;
            int line;
            if (ctx.NOT() != null) {
                line = ctx.NOT().getSymbol().getLine();
                if (type.kind == Kind.INT) {
                    hasError = false;
                }
            } else {
                line = ctx.MINUS().getSymbol().getLine();
                if (type instanceof Basic) {
                    hasError = false;
                }
            }
            if (!hasError) {
                values.put(ctx, type);
            } else {
                values.put(ctx, new UNKNOWN());
                if (!(type instanceof UNKNOWN)) {
                    errorReporter.printError(ErrorType.MISMATCHED_OPE, line, null);
                }
            }
        } else {
            if (ctx.ASSIGNOP() != null) { // exp ASSIGNOP exp
                Type leftType = values.get(ctx.exp(0));
                Type rightType = values.get(ctx.exp(1));
                if (leftType != null && rightType != null) { // 勿忘: 防空 + 更底层
                    // fixme 尚未测试
                    if (!isLeftValue(ctx.exp(0))) { // 检查左值
                        values.put(ctx, new UNKNOWN());
                        if (!(values.get(ctx.exp(0)) instanceof UNKNOWN) && !(values.get(ctx.exp(1)) instanceof UNKNOWN)) {
                            errorReporter.printError(ErrorType.MISMATCHED_LEFT_HAND, ctx.ASSIGNOP().getSymbol().getLine(), null);
                        }
                    } else if (!leftType.equals(rightType)) { // 检查两边类型是否匹配
                        values.put(ctx, new UNKNOWN());
                        if (!(leftType instanceof UNKNOWN) && !(rightType instanceof UNKNOWN)) {
                            errorReporter.printError(ErrorType.MISMATCHED_ASSIGN, ctx.ASSIGNOP().getSymbol().getLine(), null);
                        }
                    } else {
                        values.put(ctx, leftType);
                    }
                }
            } else if (ctx.DOT() != null) { // exp DOT ID
                Type type = values.get(ctx.exp(0));
                String name = ctx.ID().getText();
                if (!(type instanceof Structure)) {
                    values.put(ctx, new UNKNOWN());
                    if (!(type instanceof UNKNOWN)) {
                        errorReporter.printError(ErrorType.ILLEGAL_DOT, ctx.DOT().getSymbol().getLine(), null);
                    }
                } else {
                    Type t = new UNKNOWN();
                    FieldList fieldList = ((Structure) type).memberList;
                    while (fieldList != null) {
                        if (fieldList.name.equals(name)) {
                            t = fieldList.type;
                            break;
                        }
                        fieldList = fieldList.next;
                    }
                    if (t instanceof UNKNOWN) {
                        errorReporter.printError(ErrorType.NONEXISTENT_FIELD, ctx.DOT().getSymbol().getLine(), name);
                    }
                    values.put(ctx, t);
                }
            } else if (ctx.LB() != null) { // exp LB exp RB 数组
                Type type1 = values.get(ctx.exp(0));
                Type type2 = values.get(ctx.exp(1));
                // 注意检查顺序
                if (type1 instanceof Array) {
                    if (type2 instanceof Basic && type2.kind == Kind.INT) {
                        values.put(ctx, ((Array) type1).elementType);
                    } else {
                        values.put(ctx, new UNKNOWN());
                        if (!(type2 instanceof UNKNOWN)) {
                            errorReporter.printError(ErrorType.NOT_INT, ctx.LB().getSymbol().getLine(), null);
                        }
                    }
                } else {
                    values.put(ctx, new UNKNOWN());
                    if (!(type1 instanceof UNKNOWN)) {
                        errorReporter.printError(ErrorType.NOT_ARRAY, ctx.LB().getSymbol().getLine(), null);
                    }
                }
            } else if (ctx.ID() != null) { // ID LP args? RP 函数调用 fixme 需测试
                String name = ctx.ID().getText();
                Type type = symbolTable.seek(name);
                // 注意区分错误类型2和11
                if (type == null) {
                    values.put(ctx, new UNKNOWN());
                    errorReporter.printError(ErrorType.UNDEFINED_FUN, ctx.start.getLine(), name);
                } else if (!(type instanceof Function)) {
                    values.put(ctx, new UNKNOWN());
                    errorReporter.printError(ErrorType.NOT_FUN, ctx.start.getLine(), name);
                } else { // 检查参数匹配
                    FieldList fieldList = null;
                    FieldList tmp = null;
                    if (ctx.args() != null) { // 勿忘
                        List<CmmParser.ExpContext> args = ctx.args().exp();
                        for (CmmParser.ExpContext arg : args) {
                            Type t = values.get(arg);
                            if (t != null) { // 勿忘
                                if (tmp == null) {
                                    tmp = new FieldList(null, t, null);
                                    fieldList = tmp;
                                } else {
                                    tmp.next = new FieldList(null, t, null);
                                    tmp = tmp.next;
                                }
                            }
                        }
                    }
                    if (fieldList == null && ((Function) type).paramList == null
                            || fieldList != null && fieldList.equals(((Function) type).paramList)
                            || fieldList != null && fieldList.type instanceof UNKNOWN) {
                        values.put(ctx, ((Function) type).returnType);
                    } else {
                        values.put(ctx, new UNKNOWN());
                        errorReporter.printError(ErrorType.MISMATCHED_ARGS, ctx.ID().getSymbol().getLine(), name);
                    }
                }
            } else if (ctx.LP() != null) { // LP exp RP
                values.put(ctx, values.get(ctx.exp(0)));
            } else if (ctx.AND() != null || ctx.OR() != null) { // AND OR
                Type type1 = values.get(ctx.exp(0));
                Type type2 = values.get(ctx.exp(1));
                if (type1.kind == Kind.INT && type2.kind == Kind.INT) {
                    values.put(ctx, type1);
                } else {
                    values.put(ctx, new UNKNOWN());
                    boolean hasError = !(type1 instanceof UNKNOWN) && !(type2 instanceof UNKNOWN);
                    if (hasError) {
                        int line = ctx.AND() != null ? ctx.AND().getSymbol().getLine() : ctx.OR().getSymbol().getLine();
                        errorReporter.printError(ErrorType.MISMATCHED_OPE, line, null);
                    }
                }
            } else { // RELOP + - * /
                Type type1 = values.get(ctx.exp(0));
                Type type2 = values.get(ctx.exp(1));
                if (type1.kind == type2.kind && (type1.kind == Kind.INT || type1.kind == Kind.FLOAT)) {
                    if (ctx.RELOP() != null) {
                        values.put(ctx, new Basic(Kind.INT));
                    } else {
                        values.put(ctx, type1);
                    }
                } else {
                    boolean hasError = false;
                    values.put(ctx, new UNKNOWN());
                    if ((type1.kind == Kind.INT && type2.kind == Kind.FLOAT) || (type1.kind == Kind.FLOAT && type2.kind == Kind.INT)) {
                        hasError = true;
                    } else {
                        if (!(type1 instanceof UNKNOWN) && !(type1 instanceof Basic)) {
                            hasError = true;
                        }
                        if (!(type2 instanceof UNKNOWN) && !(type2 instanceof Basic)) {
                            hasError = true;
                        }
                    }
                    if (type1 instanceof UNKNOWN || type2 instanceof UNKNOWN) {
                        hasError = false;
                    }
                    if (hasError) {
                        int line = 0;
                        if (ctx.DIV() != null) line = ctx.DIV().getSymbol().getLine();
                        if (ctx.STAR() != null) line = ctx.STAR().getSymbol().getLine();
                        if (ctx.MINUS() != null) line = ctx.MINUS().getSymbol().getLine();
                        if (ctx.PLUS() != null) line = ctx.PLUS().getSymbol().getLine();
                        if (ctx.RELOP() != null) line = ctx.RELOP().getSymbol().getLine();
                        errorReporter.printError(ErrorType.MISMATCHED_OPE, line, null);
                    }
                }
            }
        }
    }

    @Override
    public void enterArgs(CmmParser.ArgsContext ctx) {
    }

    @Override
    public void exitArgs(CmmParser.ArgsContext ctx) {
    }

}
