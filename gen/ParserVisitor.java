// Generated from S:/JavaProjects/CFG/src\Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(Parser.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#truthpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthpar(Parser.TruthparContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(Parser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functiondcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondcl(Parser.FunctiondclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(Parser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#truedcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruedcl(Parser.TruedclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(Parser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(Parser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(Parser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(Parser.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#repeatuntilstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatuntilstmt(Parser.RepeatuntilstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#fromstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromstmt(Parser.FromstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(Parser.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Parser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddexpr(Parser.AddexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#truthexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthexpr(Parser.TruthexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#truth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth(Parser.TruthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(Parser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(Parser.TypesContext ctx);
}