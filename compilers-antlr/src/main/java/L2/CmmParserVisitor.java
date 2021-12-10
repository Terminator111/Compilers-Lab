// Generated from D:/DATA/Program/Compilers-Principles/Lab/compilers-antlr/src/main/java/L2\CmmParser.g4 by ANTLR 4.9.2
package L2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#extDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtDef(CmmParser.ExtDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#extDecList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtDecList(CmmParser.ExtDecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifier(CmmParser.SpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructSpecifier(CmmParser.StructSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#optTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptTag(CmmParser.OptTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(CmmParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(CmmParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#funDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDec(CmmParser.FunDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(CmmParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#paramDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDec(CmmParser.ParamDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#compSt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompSt(CmmParser.CompStContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(CmmParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CmmParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#defList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefList(CmmParser.DefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(CmmParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#decList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecList(CmmParser.DecListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CmmParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CmmParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CmmParser.ArgsContext ctx);
}