// Generated from C:/Users/Zirke/Documents/JavaProjects/CFG23/src/cfg\Trun.g4 by ANTLR 4.7.2
package cfg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Trun}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TrunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Trun#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Trun.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#dclblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclblock(Trun.DclblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#arrdclblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdclblock(Trun.ArrdclblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#functiondclblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondclblock(Trun.FunctiondclblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#stmtstartblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtstartblock(Trun.StmtstartblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Trun.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#functiondcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondcl(Trun.FunctiondclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(Trun.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#arrdcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdcl(Trun.ArrdclContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#dclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclValue(Trun.DclValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(Trun.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(Trun.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(Trun.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(Trun.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#repeatuntilstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatuntilstmt(Trun.RepeatuntilstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#fromstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromstmt(Trun.FromstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(Trun.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Trun.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Trun.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#valueorfunctioncallortext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueorfunctioncallortext(Trun.ValueorfunctioncallortextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Trun.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#arithmexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmexpr(Trun.ArithmexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#multexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultexpr(Trun.MultexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#unaryminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryminus(Trun.UnaryminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#parexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(Trun.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#truthexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthexpr(Trun.TruthexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#logicalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalexpr(Trun.LogicalexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#relationalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpr(Trun.RelationalexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(Trun.AppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#textorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextorid(Trun.TextoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#arrindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrindex(Trun.ArrindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#arradd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArradd(Trun.ArraddContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive(Trun.DriveContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#turnleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnleft(Trun.TurnleftContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#turnright}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnright(Trun.TurnrightContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#pause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPause(Trun.PauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(Trun.NumsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(Trun.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#truthpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthpar(Trun.TruthparContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#truth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth(Trun.TruthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Trun.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Trun#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(Trun.ArgContext ctx);
}