import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;

public class BuildASTVisitor extends AbstractParseTreeVisitor<AbstractNode> implements PyTrunVisitor<AbstractNode> {

	@Override public AbstractNode visitStart(PyTrun.StartContext ctx) {
		//return visitChildren(ctx);
		return visit(ctx.stmts());
	}

	@Override public AbstractNode visitStmts(PyTrun.StmtsContext ctx) {
		ArrayList<AbstractNode> stmts = new ArrayList();
		List<PyTrun.StmtContext> bStmts = ctx.stmt();
		for (PyTrun.StmtContext x : bStmts){
			stmts.add(visitStmt(x));
		}
		return new StatementList((ArrayList)stmts);
	}

	@Override public AbstractNode visitStmt(PyTrun.StmtContext ctx) {
		Statement stmt = null;
		if( null != ctx.dcl()){
			stmt = (Statement) visitDcl(ctx.dcl());
		}else if(null != ctx.ifstmt()){
			stmt = (Statement) visitIfstmt(ctx.ifstmt());
		}else if(null != ctx.whilestmt()){
			stmt = (Statement) visitWhilestmt(ctx.whilestmt());
		}else if(null != ctx.returnstmt()){
			stmt = (Statement) visitReturnstmt(ctx.returnstmt());
		}else if(null != ctx.functioncall()){
			stmt = (Statement) visitFunctioncall(ctx.functioncall());
		}else if(null != ctx.repeatuntilstmt()){
			stmt = (Statement) visitRepeatuntilstmt(ctx.repeatuntilstmt());
		}else if(null != ctx.fromstmt()){
			stmt = (Statement) visitFromstmt(ctx.fromstmt());
		}else if(null != ctx.assignment()){
			stmt = (Statement) visitAssignment(ctx.assignment());
		}else if(null != ctx.arradd()){
			stmt = (Statement) visitArradd(ctx.arradd());
		}else if(null != ctx.arrindex()){
			stmt = (Statement) visitArrindex(ctx.arrindex());
		}else if(null != ctx.functiondcl()){
			stmt = (Statement) visitFunctiondcl(ctx.functiondcl());
		}
		return stmt;
	}

	@Override public AbstractNode visitFunctiondcl(PyTrun.FunctiondclContext ctx) {
		Identifier functionName = new Identifier( ctx.ID().toString());
		return visitChildren(ctx);

	}

	@Override public AbstractNode visitDcl(PyTrun.DclContext ctx) {
		Identifier varName = new Identifier(ctx.ID().toString());

		if(ctx.ARRDCL() != null){
			return null;//for now untill implementation.
		}else if(ctx.FLOATDCL() != null){
			return new floatDeclaration(varName,(Statement) visitDclValue(ctx.dclValue()));
		} else if(ctx.INTDCL() != null){
			return new IntDeclaration(varName, (Statement) visitDclValue(ctx.dclValue()));
		}else if(ctx.TEXTDCL() != null){
			return new TextDeclaration(varName, (Statement) visitDclValue(ctx.dclValue()));
		}else if(ctx.TRUTHDCL() != null){
			return new TruthDeclaration(varName, (TruthOperator) visitTruthexpr(ctx.truthexpr()));
		}else{
			return null;
		}
	}


	@Override public AbstractNode visitTruedcl(PyTrun.TruedclContext ctx) { return visitChildren(ctx); }

	@Override public AbstractNode visitFunctioncall(PyTrun.FunctioncallContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitArgs(PyTrun.ArgsContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitIfstmt(PyTrun.IfstmtContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitWhilestmt(PyTrun.WhilestmtContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitRepeatuntilstmt(PyTrun.RepeatuntilstmtContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitFromstmt(PyTrun.FromstmtContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitReturnstmt(PyTrun.ReturnstmtContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitAssignment(PyTrun.AssignmentContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitValue(PyTrun.ValueContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitExpr(PyTrun.ExprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitArithmexpr(PyTrun.ArithmexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitMultexpr(PyTrun.MultexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitParexpr(PyTrun.ParexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitTruthexpr(PyTrun.TruthexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitLogicalexpr(PyTrun.LogicalexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitRelationalexpr(PyTrun.RelationalexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitAppend(PyTrun.AppendContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitArrelems(PyTrun.ArrelemsContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitArrindex(PyTrun.ArrindexContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitArradd(PyTrun.ArraddContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitNums(PyTrun.NumsContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitParamlist(PyTrun.ParamlistContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitStmtblock(PyTrun.StmtblockContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitTruthpar(PyTrun.TruthparContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitTruth(PyTrun.TruthContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitType(PyTrun.TypeContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitTypes(PyTrun.TypesContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitStmtend(PyTrun.StmtendContext ctx) { return visitChildren(ctx); }


	//need to be placed in a more appropriate place.
	@Override
	public AbstractNode visitDclValue(PyTrun.DclValueContext ctx) {


		return null;
	}
}