// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src\PyTrun.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PyTrun}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PyTrunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PyTrun#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PyTrun.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(PyTrun.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PyTrun.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#functiondcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondcl(PyTrun.FunctiondclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(PyTrun.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#dclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclValue(PyTrun.DclValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#truedcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruedcl(PyTrun.TruedclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(PyTrun.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PyTrun.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(PyTrun.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#whilestmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestmt(PyTrun.WhilestmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#repeatuntilstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatuntilstmt(PyTrun.RepeatuntilstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#fromstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromstmt(PyTrun.FromstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#returnstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstmt(PyTrun.ReturnstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PyTrun.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PyTrun.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PyTrun.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#arithmexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmexpr(PyTrun.ArithmexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#multexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultexpr(PyTrun.MultexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#parexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(PyTrun.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#truthexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthexpr(PyTrun.TruthexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#logicalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalexpr(PyTrun.LogicalexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#relationalexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalexpr(PyTrun.RelationalexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend(PyTrun.AppendContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#arrelems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrelems(PyTrun.ArrelemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#arrindex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrindex(PyTrun.ArrindexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#arradd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArradd(PyTrun.ArraddContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#nums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(PyTrun.NumsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(PyTrun.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#stmtblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtblock(PyTrun.StmtblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#truthpar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthpar(PyTrun.TruthparContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#truth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth(PyTrun.TruthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PyTrun.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(PyTrun.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyTrun#stmtend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtend(PyTrun.StmtendContext ctx);
}