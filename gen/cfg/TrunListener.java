// Generated from C:/Users/Abiram Mohanaraj/Documents/GitHub/CFG/src/cfg\Trun.g4 by ANTLR 4.7.2
package cfg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Trun}.
 */
public interface TrunListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Trun#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Trun.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Trun.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#dclblock}.
	 * @param ctx the parse tree
	 */
	void enterDclblock(Trun.DclblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#dclblock}.
	 * @param ctx the parse tree
	 */
	void exitDclblock(Trun.DclblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#arrdclblock}.
	 * @param ctx the parse tree
	 */
	void enterArrdclblock(Trun.ArrdclblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#arrdclblock}.
	 * @param ctx the parse tree
	 */
	void exitArrdclblock(Trun.ArrdclblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#functiondclblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondclblock(Trun.FunctiondclblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#functiondclblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondclblock(Trun.FunctiondclblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#stmtstartblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtstartblock(Trun.StmtstartblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#stmtstartblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtstartblock(Trun.StmtstartblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Trun.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Trun.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#functiondcl}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondcl(Trun.FunctiondclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#functiondcl}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondcl(Trun.FunctiondclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(Trun.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(Trun.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#arrdcl}.
	 * @param ctx the parse tree
	 */
	void enterArrdcl(Trun.ArrdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#arrdcl}.
	 * @param ctx the parse tree
	 */
	void exitArrdcl(Trun.ArrdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#dclValue}.
	 * @param ctx the parse tree
	 */
	void enterDclValue(Trun.DclValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#dclValue}.
	 * @param ctx the parse tree
	 */
	void exitDclValue(Trun.DclValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Trun.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Trun.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(Trun.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(Trun.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(Trun.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(Trun.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(Trun.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(Trun.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#repeatuntilstmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatuntilstmt(Trun.RepeatuntilstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#repeatuntilstmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatuntilstmt(Trun.RepeatuntilstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#fromstmt}.
	 * @param ctx the parse tree
	 */
	void enterFromstmt(Trun.FromstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#fromstmt}.
	 * @param ctx the parse tree
	 */
	void exitFromstmt(Trun.FromstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(Trun.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(Trun.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Trun.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Trun.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Trun.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Trun.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#valueorfunctioncallortext}.
	 * @param ctx the parse tree
	 */
	void enterValueorfunctioncallortext(Trun.ValueorfunctioncallortextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#valueorfunctioncallortext}.
	 * @param ctx the parse tree
	 */
	void exitValueorfunctioncallortext(Trun.ValueorfunctioncallortextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Trun.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Trun.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#arithmexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmexpr(Trun.ArithmexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#arithmexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmexpr(Trun.ArithmexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#multexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultexpr(Trun.MultexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#multexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultexpr(Trun.MultexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#unaryminus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryminus(Trun.UnaryminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#unaryminus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryminus(Trun.UnaryminusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#parexpr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(Trun.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#parexpr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(Trun.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#truthexpr}.
	 * @param ctx the parse tree
	 */
	void enterTruthexpr(Trun.TruthexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#truthexpr}.
	 * @param ctx the parse tree
	 */
	void exitTruthexpr(Trun.TruthexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#logicalexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalexpr(Trun.LogicalexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#logicalexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalexpr(Trun.LogicalexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#relationalexpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpr(Trun.RelationalexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#relationalexpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpr(Trun.RelationalexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(Trun.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(Trun.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#textorid}.
	 * @param ctx the parse tree
	 */
	void enterTextorid(Trun.TextoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#textorid}.
	 * @param ctx the parse tree
	 */
	void exitTextorid(Trun.TextoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#arrindex}.
	 * @param ctx the parse tree
	 */
	void enterArrindex(Trun.ArrindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#arrindex}.
	 * @param ctx the parse tree
	 */
	void exitArrindex(Trun.ArrindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#arradd}.
	 * @param ctx the parse tree
	 */
	void enterArradd(Trun.ArraddContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#arradd}.
	 * @param ctx the parse tree
	 */
	void exitArradd(Trun.ArraddContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#drive}.
	 * @param ctx the parse tree
	 */
	void enterDrive(Trun.DriveContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#drive}.
	 * @param ctx the parse tree
	 */
	void exitDrive(Trun.DriveContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#turnleft}.
	 * @param ctx the parse tree
	 */
	void enterTurnleft(Trun.TurnleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#turnleft}.
	 * @param ctx the parse tree
	 */
	void exitTurnleft(Trun.TurnleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#turnright}.
	 * @param ctx the parse tree
	 */
	void enterTurnright(Trun.TurnrightContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#turnright}.
	 * @param ctx the parse tree
	 */
	void exitTurnright(Trun.TurnrightContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#pause}.
	 * @param ctx the parse tree
	 */
	void enterPause(Trun.PauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#pause}.
	 * @param ctx the parse tree
	 */
	void exitPause(Trun.PauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#nums}.
	 * @param ctx the parse tree
	 */
	void enterNums(Trun.NumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#nums}.
	 * @param ctx the parse tree
	 */
	void exitNums(Trun.NumsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(Trun.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(Trun.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#truthpar}.
	 * @param ctx the parse tree
	 */
	void enterTruthpar(Trun.TruthparContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#truthpar}.
	 * @param ctx the parse tree
	 */
	void exitTruthpar(Trun.TruthparContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#truth}.
	 * @param ctx the parse tree
	 */
	void enterTruth(Trun.TruthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#truth}.
	 * @param ctx the parse tree
	 */
	void exitTruth(Trun.TruthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Trun.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Trun.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Trun#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(Trun.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Trun#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(Trun.ArgContext ctx);
}