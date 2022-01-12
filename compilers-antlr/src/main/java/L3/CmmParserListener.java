// Generated from D:/DATA/Program/Compilers-Principles/Lab/Compilers-Lab/compilers-antlr/src/main/java/L3\CmmParser.g4 by ANTLR 4.9.2
package L3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#extDef}.
	 * @param ctx the parse tree
	 */
	void enterExtDef(CmmParser.ExtDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#extDef}.
	 * @param ctx the parse tree
	 */
	void exitExtDef(CmmParser.ExtDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#extDecList}.
	 * @param ctx the parse tree
	 */
	void enterExtDecList(CmmParser.ExtDecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#extDecList}.
	 * @param ctx the parse tree
	 */
	void exitExtDecList(CmmParser.ExtDecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 */
	void enterSpecifier(CmmParser.SpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 */
	void exitSpecifier(CmmParser.SpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructSpecifier(CmmParser.StructSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructSpecifier(CmmParser.StructSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#optTag}.
	 * @param ctx the parse tree
	 */
	void enterOptTag(CmmParser.OptTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#optTag}.
	 * @param ctx the parse tree
	 */
	void exitOptTag(CmmParser.OptTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(CmmParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(CmmParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 */
	void enterFunDec(CmmParser.FunDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 */
	void exitFunDec(CmmParser.FunDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(CmmParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(CmmParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#paramDec}.
	 * @param ctx the parse tree
	 */
	void enterParamDec(CmmParser.ParamDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#paramDec}.
	 * @param ctx the parse tree
	 */
	void exitParamDec(CmmParser.ParamDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#compSt}.
	 * @param ctx the parse tree
	 */
	void enterCompSt(CmmParser.CompStContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#compSt}.
	 * @param ctx the parse tree
	 */
	void exitCompSt(CmmParser.CompStContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(CmmParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(CmmParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CmmParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CmmParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#defList}.
	 * @param ctx the parse tree
	 */
	void enterDefList(CmmParser.DefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#defList}.
	 * @param ctx the parse tree
	 */
	void exitDefList(CmmParser.DefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(CmmParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(CmmParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#decList}.
	 * @param ctx the parse tree
	 */
	void enterDecList(CmmParser.DecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#decList}.
	 * @param ctx the parse tree
	 */
	void exitDecList(CmmParser.DecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CmmParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CmmParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CmmParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CmmParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CmmParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CmmParser.ArgsContext ctx);
}