// Generated from C:/Users/Zirke/Documents/JavaProjects/CFG/src/cfg\PyTrun.g4 by ANTLR 4.7.2
package cfg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PyTrun}.
 */
public interface PyTrunListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PyTrun#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PyTrun.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PyTrun.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(PyTrun.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(PyTrun.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PyTrun.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PyTrun.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#functiondcl}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondcl(PyTrun.FunctiondclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#functiondcl}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondcl(PyTrun.FunctiondclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(PyTrun.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(PyTrun.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#dclValue}.
	 * @param ctx the parse tree
	 */
	void enterDclValue(PyTrun.DclValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#dclValue}.
	 * @param ctx the parse tree
	 */
	void exitDclValue(PyTrun.DclValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#truedcl}.
	 * @param ctx the parse tree
	 */
	void enterTruedcl(PyTrun.TruedclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#truedcl}.
	 * @param ctx the parse tree
	 */
	void exitTruedcl(PyTrun.TruedclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(PyTrun.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(PyTrun.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(PyTrun.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(PyTrun.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(PyTrun.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(PyTrun.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#repeatuntilstmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatuntilstmt(PyTrun.RepeatuntilstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#repeatuntilstmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatuntilstmt(PyTrun.RepeatuntilstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#fromstmt}.
	 * @param ctx the parse tree
	 */
	void enterFromstmt(PyTrun.FromstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#fromstmt}.
	 * @param ctx the parse tree
	 */
	void exitFromstmt(PyTrun.FromstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(PyTrun.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(PyTrun.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PyTrun.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PyTrun.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PyTrun.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PyTrun.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PyTrun.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PyTrun.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#arithmexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmexpr(PyTrun.ArithmexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#arithmexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmexpr(PyTrun.ArithmexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#multexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultexpr(PyTrun.MultexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#multexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultexpr(PyTrun.MultexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#parexpr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(PyTrun.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#parexpr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(PyTrun.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#truthexpr}.
	 * @param ctx the parse tree
	 */
	void enterTruthexpr(PyTrun.TruthexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#truthexpr}.
	 * @param ctx the parse tree
	 */
	void exitTruthexpr(PyTrun.TruthexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#logicalexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalexpr(PyTrun.LogicalexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#logicalexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalexpr(PyTrun.LogicalexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#relationalexpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpr(PyTrun.RelationalexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#relationalexpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpr(PyTrun.RelationalexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(PyTrun.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(PyTrun.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#arrindex}.
	 * @param ctx the parse tree
	 */
	void enterArrindex(PyTrun.ArrindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#arrindex}.
	 * @param ctx the parse tree
	 */
	void exitArrindex(PyTrun.ArrindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#arradd}.
	 * @param ctx the parse tree
	 */
	void enterArradd(PyTrun.ArraddContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#arradd}.
	 * @param ctx the parse tree
	 */
	void exitArradd(PyTrun.ArraddContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#drive}.
	 * @param ctx the parse tree
	 */
	void enterDrive(PyTrun.DriveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#drive}.
	 * @param ctx the parse tree
	 */
	void exitDrive(PyTrun.DriveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#turnleft}.
	 * @param ctx the parse tree
	 */
	void enterTurnleft(PyTrun.TurnleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#turnleft}.
	 * @param ctx the parse tree
	 */
	void exitTurnleft(PyTrun.TurnleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#turnright}.
	 * @param ctx the parse tree
	 */
	void enterTurnright(PyTrun.TurnrightContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#turnright}.
	 * @param ctx the parse tree
	 */
	void exitTurnright(PyTrun.TurnrightContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#nums}.
	 * @param ctx the parse tree
	 */
	void enterNums(PyTrun.NumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#nums}.
	 * @param ctx the parse tree
	 */
	void exitNums(PyTrun.NumsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(PyTrun.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(PyTrun.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#truthpar}.
	 * @param ctx the parse tree
	 */
	void enterTruthpar(PyTrun.TruthparContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#truthpar}.
	 * @param ctx the parse tree
	 */
	void exitTruthpar(PyTrun.TruthparContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#truth}.
	 * @param ctx the parse tree
	 */
	void enterTruth(PyTrun.TruthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#truth}.
	 * @param ctx the parse tree
	 */
	void exitTruth(PyTrun.TruthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PyTrun.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PyTrun.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyTrun#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(PyTrun.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyTrun#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(PyTrun.TypesContext ctx);
}