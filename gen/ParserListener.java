// Generated from S:/JavaProjects/CFG/src\Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functiondcl}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondcl(Parser.FunctiondclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functiondcl}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondcl(Parser.FunctiondclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(Parser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(Parser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#truedcl}.
	 * @param ctx the parse tree
	 */
	void enterTruedcl(Parser.TruedclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#truedcl}.
	 * @param ctx the parse tree
	 */
	void exitTruedcl(Parser.TruedclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(Parser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(Parser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(Parser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(Parser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(Parser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(Parser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#repeatuntilstmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeatuntilstmt(Parser.RepeatuntilstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#repeatuntilstmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeatuntilstmt(Parser.RepeatuntilstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#fromstmt}.
	 * @param ctx the parse tree
	 */
	void enterFromstmt(Parser.FromstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#fromstmt}.
	 * @param ctx the parse tree
	 */
	void exitFromstmt(Parser.FromstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(Parser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(Parser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arithmexpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmexpr(Parser.ArithmexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arithmexpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmexpr(Parser.ArithmexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#multexpr}.
	 * @param ctx the parse tree
	 */
	void enterMultexpr(Parser.MultexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#multexpr}.
	 * @param ctx the parse tree
	 */
	void exitMultexpr(Parser.MultexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#parexpr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(Parser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#parexpr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(Parser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#truthexpr}.
	 * @param ctx the parse tree
	 */
	void enterTruthexpr(Parser.TruthexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#truthexpr}.
	 * @param ctx the parse tree
	 */
	void exitTruthexpr(Parser.TruthexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#append}.
	 * @param ctx the parse tree
	 */
	void enterAppend(Parser.AppendContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#append}.
	 * @param ctx the parse tree
	 */
	void exitAppend(Parser.AppendContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrelems}.
	 * @param ctx the parse tree
	 */
	void enterArrelems(Parser.ArrelemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrelems}.
	 * @param ctx the parse tree
	 */
	void exitArrelems(Parser.ArrelemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arrindex}.
	 * @param ctx the parse tree
	 */
	void enterArrindex(Parser.ArrindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arrindex}.
	 * @param ctx the parse tree
	 */
	void exitArrindex(Parser.ArrindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#arradd}.
	 * @param ctx the parse tree
	 */
	void enterArradd(Parser.ArraddContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#arradd}.
	 * @param ctx the parse tree
	 */
	void exitArradd(Parser.ArraddContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#nums}.
	 * @param ctx the parse tree
	 */
	void enterNums(Parser.NumsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#nums}.
	 * @param ctx the parse tree
	 */
	void exitNums(Parser.NumsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(Parser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(Parser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void enterStmtblock(Parser.StmtblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#stmtblock}.
	 * @param ctx the parse tree
	 */
	void exitStmtblock(Parser.StmtblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#truthpar}.
	 * @param ctx the parse tree
	 */
	void enterTruthpar(Parser.TruthparContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#truthpar}.
	 * @param ctx the parse tree
	 */
	void exitTruthpar(Parser.TruthparContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#truth}.
	 * @param ctx the parse tree
	 */
	void enterTruth(Parser.TruthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#truth}.
	 * @param ctx the parse tree
	 */
	void exitTruth(Parser.TruthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(Parser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(Parser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parser#stmtend}.
	 * @param ctx the parse tree
	 */
	void enterStmtend(Parser.StmtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parser#stmtend}.
	 * @param ctx the parse tree
	 */
	void exitStmtend(Parser.StmtendContext ctx);
}