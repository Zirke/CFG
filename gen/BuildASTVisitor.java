import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BuildASTVisitor extends AbstractParseTreeVisitor<AbstractNode> implements PyTrunVisitor<AbstractNode> {

	@Override public AbstractNode visitStart(PyTrun.StartContext ctx) {
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
		Identifier functionName = new Identifier( ctx.ID().getText());
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
			return new TextDeclaration(varName, (Value)visitDclValue(ctx.dclValue()));
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

	@Override public AbstractNode visitValue(PyTrun.ValueContext ctx) {
		if(ctx.arithmexpr() != null){
			return visitArithmexpr(ctx.arithmexpr());
		}else if(ctx.functioncall() != null){
			return visitFunctioncall(ctx.functioncall());
		}else if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}
		return null;
	}

	@Override public AbstractNode visitExpr(PyTrun.ExprContext ctx) {
		if(ctx.append() != null){
			System.out.println("hello");
			return visitAppend(ctx.append());
		}else if(ctx.truthexpr() != null){
			return visitTruthexpr(ctx.truthexpr());
		}else if(ctx.arithmexpr() != null){
			return visitArithmexpr(ctx.arithmexpr());
		}

		return null;
	}

	//Arithmetic expression visit methods
	@Override public AbstractNode visitArithmexpr(PyTrun.ArithmexprContext ctx) {
		ArrayList<ArithmOperator> plusMinus = new ArrayList<>();
		List<PyTrun.MultexprContext> exprs = ctx.multexpr();
		for(ParseTree x : ctx.children){
				 if(x.getText().equals("+")){
					 plusMinus.add(new Plus());
				 }else if(x.getText().equals("-")){
				 	 plusMinus.add(new Minus());
				 }
		}
		if(plusMinus.isEmpty()){
			return visitMultexpr(ctx.multexpr(0));
		}else{

			plusMinus.get(0).left = (Value) visitMultexpr(exprs.get(0));
			exprs.remove(0);
			if(plusMinus.size() > 1){
			    plusMinus.get(0).right = plusMinus.get(1);
			    plusMinus.get(1).left =  (Value) visitMultexpr(exprs.get(0));
			    exprs.remove(0);
			}
			while (plusMinus.size() > 1){


			}
		}
		System.out.println(ctx.children.size());
		return null;
	}
	@Override public AbstractNode visitMultexpr(PyTrun.MultexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitParexpr(PyTrun.ParexprContext ctx) { return visitChildren(ctx); }




	//Truth expression methods
	@Override public AbstractNode visitTruthexpr(PyTrun.TruthexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitLogicalexpr(PyTrun.LogicalexprContext ctx) { return visitChildren(ctx); }
	@Override public AbstractNode visitRelationalexpr(PyTrun.RelationalexprContext ctx) { return visitChildren(ctx); }


	//needs to be tested
	@Override public AbstractNode visitAppend(PyTrun.AppendContext ctx) {
		Value left = null;
		Value right = null;
		if(ctx.TEXT() != null){
			left = new TextLiteral( ctx.TEXT().get(0).getText());
			if(ctx.TEXT().size() == 2){
				right = new TextLiteral( ctx.TEXT().get(1).getText());
				return new Plus("Append", left, right);
			}else{
				right = new Identifier(ctx.ID(0).toString());
				return new Plus("Append", left, right);
			}
		}/*else if(ctx.ID() != null){   //this will never happen as an arithmetic expression instead.
			   left = new Identifier(ctx.ID().get(0).getText());
			   right = new Identifier(ctx.ID().get(1).getText());
			   return new Append("Append", left, right);
		}*/

		return null;
	}


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

		if(ctx.TEXT() != null){
			return new TextLiteral(ctx.TEXT().getText());
		}else if(ctx.value() != null){
			return visitValue(ctx.value()); //needs to return
		}else if(ctx.expr() != null){
			return visitExpr(ctx.expr()); //needs to return
		}

		return null;
	}
}