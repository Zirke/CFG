import ast.*;
import cfg.Trun;
import cfg.TrunVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class BuildASTVisitor extends AbstractParseTreeVisitor<AbstractNode> implements TrunVisitor<AbstractNode> {
	boolean isSyntaxError = false;

	@Override public AbstractNode visitStart(Trun.StartContext ctx) {
		ArrayList<Statement> stmtList = new ArrayList<>();
		if(!ctx.dclblock().isEmpty()) {
			isSyntaxError = true;
			stmtList.addAll(((StatementList) visitDclblock(ctx.dclblock())).getStmts());
		}

		if(!ctx.arrdclblock().isEmpty()) {
			isSyntaxError = true;
			stmtList.addAll(((StatementList) visitArrdclblock(ctx.arrdclblock())).getStmts());
		}

		if(!ctx.functiondclblock().isEmpty()) {
			isSyntaxError = true;
			stmtList.addAll(((StatementList) visitFunctiondclblock(ctx.functiondclblock())).getStmts());
		}

		if(!ctx.stmtstartblock().isEmpty()) {
			isSyntaxError = true;
			stmtList.addAll(((StatementList) visitStmtstartblock(ctx.stmtstartblock())).getStmts());
		}
		ArrayList<Statement> noNullStmts = new ArrayList<>();
		for(Statement s : stmtList){
			if(s != null){
				noNullStmts.add(s);
			}
		}
		if(isSyntaxError){
			System.err.println("Syntax Error");
			System.exit(0);
		}
		return new StatementList(noNullStmts);
	}

	@Override
	public AbstractNode visitDclblock(Trun.DclblockContext ctx) {
		ArrayList<Statement> dclList = new ArrayList<>();
		if(ctx.dcl() != null) {
			dclList.add((Statement) visitDcl(ctx.dcl()));
		}
		for(Trun.DclblockContext x : ctx.dclblock()){
			if(x != null){
				dclList.addAll(((StatementList) visitDclblock(x)).getStmts());
			}
		}
		ArrayList<Statement> noNullStmts = new ArrayList<>();
		for(Statement s : dclList){
			if(s != null){
				noNullStmts.add(s);
			}
		}
		if(ctx.EOF() != null){
			isSyntaxError = false;
		}
		return new StatementList(noNullStmts);
	}

	@Override
	public AbstractNode visitArrdclblock(Trun.ArrdclblockContext ctx) {
		ArrayList<Statement> arrdclList = new ArrayList<>();
		if(ctx.arrdcl() != null) {
			arrdclList.add((Statement) visitArrdcl(ctx.arrdcl()));
		}
		for(Trun.ArrdclblockContext x : ctx.arrdclblock()){
			if(x != null){
				arrdclList.addAll(((StatementList) visitArrdclblock(x)).getStmts());
			}
		}
		ArrayList<Statement> noNullStmts = new ArrayList<>();
		for(Statement s : arrdclList){
			if(s != null){
				noNullStmts.add(s);
			}
		}
		if(ctx.EOF() != null){
			isSyntaxError = false;
		}
		return new StatementList(noNullStmts);
	}

	@Override
	public AbstractNode visitFunctiondclblock(Trun.FunctiondclblockContext ctx) {
		ArrayList<Statement> funcdclList = new ArrayList<>();
		if(ctx.functiondcl() != null) {
			funcdclList.add((Statement) visitFunctiondcl(ctx.functiondcl()));
		}
		for(Trun.FunctiondclblockContext x : ctx.functiondclblock()){
			if(x != null){
				funcdclList.addAll(((StatementList) visitFunctiondclblock(x)).getStmts());
			}
		}
		ArrayList<Statement> noNullStmts = new ArrayList<>();
		for(Statement s : funcdclList){
			if(s != null){
				noNullStmts.add(s);
			}
		}
		if(ctx.EOF() != null){
			isSyntaxError = false;
		}
		return new StatementList(noNullStmts);
	}

	@Override
	public AbstractNode visitStmtstartblock(Trun.StmtstartblockContext ctx) {
		ArrayList<Statement> stmtList = new ArrayList<>();
		if(ctx.stmt() != null) {
			stmtList.add((Statement) visitStmt(ctx.stmt()));
		}
		for(Trun.StmtstartblockContext x : ctx.stmtstartblock()){
			if(x != null){
				stmtList.addAll(((StatementList) visitStmtstartblock(x)).getStmts());
			}
		}
		ArrayList<Statement> noNullStmts = new ArrayList<>();
		for(Statement s : stmtList){
			if(s != null){
				noNullStmts.add(s);
			}
		}
		if(ctx.EOF() != null){
			isSyntaxError = false;
		}
		return new StatementList(noNullStmts);
	}

	@Override public AbstractNode visitStmt(Trun.StmtContext ctx) {
		Statement stmt = null;
		if(null != ctx.ifstmt()){
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
		}else if(ctx.drive() != null){
			stmt = (Statement) visitDrive(ctx.drive());
		}else if(ctx.turnleft() != null){
			stmt = (Statement) visitTurnleft(ctx.turnleft());
		}else if(ctx.turnright()!= null){
			stmt = (Statement) visitTurnright(ctx.turnright());
		}else if(ctx.pause() != null) {
			stmt = (Statement) visitPause(ctx.pause());
		}

		return stmt;
	}

	@Override public AbstractNode visitFunctiondcl(Trun.FunctiondclContext ctx) {
		Identifier functionName = new Identifier( ctx.ID().getText());
		ArrayList<Parameter> parameters = new ArrayList<>();

		for(Trun.ParamContext x : ctx.param()){
			parameters.add((Parameter) visitParam(	x));
		}

		if(ctx.RETURNS() == null){
			FunctionDeclaration i =new FunctionDeclaration(functionName, parameters,(StatementList) visitStmtblock(ctx.stmtblock()), ctx.getStart().getLine());
			i.setLineNumber(ctx.getStart().getLine());
			return i;
		}else{
			if(ctx.type() != null){
				ReturnFunctionDeclaration i = new ReturnFunctionDeclaration(functionName, parameters, (StatementList)visitStmtblock(ctx.stmtblock()), (Type) visitType(ctx.type()),ctx.getStart().getLine());
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}else{
				ReturnFunctionDeclaration i = new ReturnFunctionDeclaration(functionName, parameters,(StatementList) visitStmtblock(ctx.stmtblock()), null,ctx.getStart().getLine());
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}

		}
	}

	@Override public AbstractNode visitDcl(Trun.DclContext ctx) {
		if(ctx.FLOATDCL() != null){
			if(null != ctx.dclValue()){
				DecimalDeclaration i = new DecimalDeclaration(new Identifier(ctx.ID().getText()),(Value) visitDclValue(ctx.dclValue()));
				i.setLineNumber(ctx.start.getLine());
				return i;
			}else {
				DecimalDeclaration i = new DecimalDeclaration(new Identifier(ctx.ID().getText()), null);
				i.setLineNumber(ctx.start.getLine());
				return i;
			}

		} else if(ctx.INTDCL() != null){
			if(null != ctx.dclValue()){
				IntDeclaration i =new IntDeclaration(new Identifier(ctx.ID().getText()), (Value) visitDclValue(ctx.dclValue()));
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}else{
				IntDeclaration i = new IntDeclaration(new Identifier(ctx.ID().getText()), null);
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}
		}else if(ctx.TEXTDCL() != null){
			if(ctx.dclValue() != null){
				TextDeclaration i = new TextDeclaration(new Identifier(ctx.ID().getText()), (Value)visitDclValue(ctx.dclValue()));
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}else{
				TextDeclaration i = new TextDeclaration(new Identifier(ctx.ID().getText()),null);
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}
		}else if(ctx.TRUTHDCL() != null){
			if(ctx.truthexpr() != null){
				TruthDeclaration i =new TruthDeclaration(new Identifier(ctx.ID().getText()), (Value) visitTruthexpr(ctx.truthexpr()));
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}
			else{
				TruthDeclaration i =new TruthDeclaration(new Identifier(ctx.ID().getText()), null);
				i.setLineNumber(ctx.getStart().getLine());
				return i;
			}
		}else{
			return null;
		}
	}

	@Override public AbstractNode visitParam(Trun.ParamContext ctx) {
		if(ctx.INTDCL() != null){
			return new Parameter( new INTDCL(new Identifier( ctx.ID().getText())), new Identifier(ctx.ID().getText()),ctx.getStart().getLine());
		}else if(ctx.FLOATDCL() != null){
			return new Parameter( new DECIMALDCL(new Identifier( ctx.ID().getText())), new Identifier(ctx.ID().getText()),ctx.getStart().getLine());
		}else if(ctx.TEXTDCL() != null){
			return new Parameter( new TEXTDCL(new Identifier( ctx.ID().getText())), new Identifier(ctx.ID().getText()),ctx.getStart().getLine());
		}else if(ctx.TRUTHDCL() != null){
			return new Parameter( new TRUTHDCL(new Identifier( ctx.ID().getText())), new Identifier(ctx.ID().getText()),ctx.getStart().getLine());
		}else
			return null;
	}

	@Override public AbstractNode visitFunctioncall(Trun.FunctioncallContext ctx) {
		Identifier functionName = new Identifier( ctx.ID().getText());
		ArrayList<Value> arguments = new ArrayList<>();

		for(Trun.ArgContext x : ctx.arg()){
			arguments.add((Value) visitArg(x));
		}
		return new FunctionCall(functionName, arguments,ctx.getStart().getLine());
	}

	@Override public AbstractNode visitIfstmt(Trun.IfstmtContext ctx) {
		if(ctx.ELSE().isEmpty() && ctx.IF().size() == 1){
			if(visitTruthpar(ctx.truthpar(0)) instanceof Identifier){
				return new IfStatement((Identifier) visitTruthpar( ctx.truthpar(0)),(StatementList) visitStmtblock(ctx.stmtblock(0)),ctx.getStart().getLine());
			}else{
				return new IfStatement( (Value) visitTruthpar( ctx.truthpar(0)),(StatementList) visitStmtblock(ctx.stmtblock(0)),ctx.getStart().getLine());
			}
		}else if(ctx.IF().size() > 1){
			ArrayList<ElseIfStatement> elseIfStatements = new ArrayList<>();

			int i = 1;
			while(i < ctx.IF().size()){

				if(visitTruthpar(ctx.truthpar(i)) instanceof Identifier){
					elseIfStatements.add(new ElseIfStatement((Identifier) visitTruthpar(ctx.truthpar(i)),
							(StatementList) visitStmtblock(ctx.stmtblock(i)), ctx.stmtblock(i).getStart().getLine()));
				}else{
					elseIfStatements.add(new ElseIfStatement((Value) visitTruthpar(ctx.truthpar(i)),
							(StatementList) visitStmtblock(ctx.stmtblock(i)), ctx.stmtblock(i).getStart().getLine()));
				}
				i++;
			}
			if(ctx.ELSE().size() == i){
				return new IfStatement((Value) visitTruthpar( ctx.truthpar(0)),
						(StatementList) visitStmtblock(ctx.stmtblock(0)),
						elseIfStatements,
						new ElseThenStmt((StatementList) visitStmtblock(ctx.stmtblock(ctx.stmtblock().size() -1)),
								ctx.stmtblock(ctx.stmtblock().size() -1).getStart().getLine()), //line nr for else then.
						ctx.getStart().getLine()); //Line nr for if stmt.
			}else{
				return new IfStatement((Value) visitTruthpar( ctx.truthpar(0)),
						(StatementList) visitStmtblock(ctx.stmtblock(0)),
						elseIfStatements,
						ctx.getStart().getLine());
			}

		}else{
			return new IfStatement((Value) visitTruthpar( ctx.truthpar(0)),(StatementList) visitStmtblock(ctx.stmtblock(0)),
					new ElseThenStmt((StatementList) visitStmtblock(ctx.stmtblock( 1)), ctx.stmtblock( 1).getStart().getLine())
					,ctx.getStart().getLine());
		}
	}

	@Override public AbstractNode visitWhilestmt(Trun.WhilestmtContext ctx) {
		return new WhileStatement((Value) visitTruthpar(ctx.truthpar()),
				(StatementList) visitStmtblock(ctx.stmtblock()), ctx.getStart().getLine());
	}

	@Override public AbstractNode visitRepeatuntilstmt(Trun.RepeatuntilstmtContext ctx) {
		return new RepeatStatement((StatementList) visitStmtblock(ctx.stmtblock()),
				(Value) visitTruthpar(ctx.truthpar()), ctx.getStart().getLine());
	}

	@Override public AbstractNode visitFromstmt(Trun.FromstmtContext ctx) {
		if(ctx.UPTO() != null){
			return new FromStatement( (Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext(0)), (Value)visitValueorfunctioncallortext(ctx.valueorfunctioncallortext(1)), new Upto("upto"),
					(StatementList) visitStmtblock(ctx.stmtblock()), ctx.getStart().getLine());
		}else if(ctx.DOWNTO() != null){
			return new FromStatement( (Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext(0)), (Value)visitValueorfunctioncallortext(ctx.valueorfunctioncallortext(1)), new Downto("ast.Downto"),
					(StatementList) visitStmtblock(ctx.stmtblock()), ctx.getStart().getLine());
		}else
			return null;
	}

	@Override public AbstractNode visitReturnstmt(Trun.ReturnstmtContext ctx) {
		if(ctx.valueorfunctioncallortext() != null){
			return new ReturnStatement((Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext()), ctx.getStart().getLine());
		}else if(ctx.truthexpr() != null){
			return new ReturnStatement((Value) visitTruthexpr(ctx.truthexpr()), ctx.getStart().getLine());
		}else{
			return null;
		}
	}

	@Override public AbstractNode visitAssignment(Trun.AssignmentContext ctx) {
		if(ctx.TEXT() != null){
			return new TextAssignment(new Identifier(ctx.ID().getText()), new TextLiteral(ctx.TEXT().getText()), ctx.getStart().getLine());
		}else if (ctx.valueorfunctioncallortext() != null){
			return new ValueAssignment(new Identifier(ctx.ID().getText()), (Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext()), ctx.getStart().getLine());
		}else if(ctx.expr() != null){
			return new ValueAssignment(new Identifier(ctx.ID().getText()), (Value) visitExpr(ctx.expr()), ctx.getStart().getLine());
		}else
			return null;
	}

	@Override public AbstractNode visitValue(Trun.ValueContext ctx) {
		if(ctx.arithmexpr() != null){
			return visitArithmexpr(ctx.arithmexpr());
		}else if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}else if(ctx.arrindex() != null){
			return visitArrindex(ctx.arrindex());
		}
		return null;
	}

	@Override public AbstractNode visitExpr(Trun.ExprContext ctx) {
		if(ctx.append() != null){
			return visitAppend(ctx.append());
		}else if(ctx.truthexpr() != null){
			return visitTruthexpr(ctx.truthexpr());
		}else if(ctx.arithmexpr() != null){
			return visitArithmexpr(ctx.arithmexpr());
		}

		return null;
	}

	//Arithmetic expression visit methods
	@Override public AbstractNode visitArithmexpr(Trun.ArithmexprContext ctx) {
		ArrayList<ArithmOperator> plusMinus = new ArrayList<>();
		List<Trun.MultexprContext> exprs = ctx.multexpr();
		for(ParseTree x : ctx.children){
				 if(x.getText().equals("+")){
					 plusMinus.add(new Plus(ctx.getStart().getLine()));
				 }else if(x.getText().equals("-")){
				 	 plusMinus.add(new Minus(ctx.getStart().getLine()));
				 }
		}
		if(plusMinus.isEmpty()){
			return visitMultexpr(ctx.multexpr(0));
		}else if(plusMinus.size() == 1){
			plusMinus.get(0).setRight ((Value)visitMultexpr(ctx.multexpr(1)));
			plusMinus.get(0).setLeft((Value)visitMultexpr(ctx.multexpr(0)));
			return plusMinus.get(0);
		}else{
			plusMinus.get(0).setLeft((Value) visitMultexpr(exprs.get(0)));
			exprs.remove(0);
			plusMinus.get(0).setRight(plusMinus.get(1));
			int i = 1;
			while (i < (plusMinus.size())){
				if( exprs.size() == 2){
					plusMinus.get(i).setRight((Value) visitMultexpr(exprs.get(1)));
					plusMinus.get(i).setLeft((Value) visitMultexpr(exprs.get(0)));
					exprs.remove(1);
					exprs.remove(0);
					break;
				}else {
					plusMinus.get(i).setLeft((Value) visitMultexpr(exprs.get(0)));
					plusMinus.get(i).setRight(plusMinus.get(i + 1));
					exprs.remove(0);
				}
				i++;
			}
			return plusMinus.get(0);
		}
	}
	@Override public AbstractNode visitMultexpr(Trun.MultexprContext ctx) {
		ArrayList<ArithmOperator> timesDivide = new ArrayList<>();
		List<Trun.UnaryminusContext> exprs = ctx.unaryminus();
		for(ParseTree x : ctx.children){
			if(x.getText().equals("*")){
				timesDivide.add(new Times(ctx.getStart().getLine()));
			}else if(x.getText().equals("/")){
				timesDivide.add(new Divide(ctx.getStart().getLine()));
			}
		}

		if(timesDivide.isEmpty()){
			return visitUnaryminus(ctx.unaryminus(0));
		}else if(timesDivide.size() == 1){
			timesDivide.get(0).setLeft((Value)visitUnaryminus(ctx.unaryminus(0)));
			timesDivide.get(0).setRight((Value)visitUnaryminus(ctx.unaryminus(1)));
			return timesDivide.get(0);
		}else{
			timesDivide.get(0).setLeft((Value) visitUnaryminus (exprs.get(0)));
			timesDivide.get(0).setRight(timesDivide.get(1));
			exprs.remove(0);
			int i = 1;
			while (i < (timesDivide.size())){
				if( exprs.size() == 2){
					timesDivide.get(i).setRight((Value) visitUnaryminus(exprs.get(1)));
					timesDivide.get(i).setLeft((Value) visitUnaryminus(exprs.get(0)));
					exprs.remove(1);
					exprs.remove(0);
					break;
				}else {
					timesDivide.get(i).setRight(timesDivide.get(i + 1));
					timesDivide.get(i).setLeft((Value) visitUnaryminus(exprs.get(0)));
					exprs.remove(0);
				}
				i++;
			}
			return timesDivide.get(0);
		}
	}

	@Override
	public AbstractNode visitUnaryminus(Trun.UnaryminusContext ctx) {
		if(ctx.MINUS() == null){
			return visitParexpr(ctx.parexpr());
		}else if(ctx.MINUS() != null){
			return new UnaryMinus("unary minus",(Value) visitParexpr(ctx.parexpr()),null);
		}
		return null;
	}

	@Override public AbstractNode visitParexpr(Trun.ParexprContext ctx) {
		if(ctx.LPAR() != null){
			return new ArithmParenthesis("parenthesis", (Value)visitArithmexpr(ctx.arithmexpr()),null, ctx.getStart().getLine());
		}else if(ctx.arrindex() != null){
			return visitArrindex(ctx.arrindex());
		}else if(ctx.nums() != null){
			return visitNums(ctx.nums()) ;
		}else if(ctx.functioncall() != null){
			return visitFunctioncall(ctx.functioncall());
		}else
			return null;
	}

	//Truth expression methods
	@Override public AbstractNode visitTruthexpr(Trun.TruthexprContext ctx) {
		return visitLogicalexpr(ctx.logicalexpr());
	}


	@Override public AbstractNode visitLogicalexpr(Trun.LogicalexprContext ctx) {
		ArrayList<TruthOperator> operators = new ArrayList<>();
		List<Trun.RelationalexprContext> exprs = ctx.relationalexpr();

		for(ParseTree x : ctx.children){
			switch (x.getText()) {
				case "NOT":
					operators.add(new Not(ctx.getStart().getLine()));
					break;
				case "OR":
					operators.add(new Or(ctx.getStart().getLine()));
					break;
				case "AND":
					operators.add(new And(ctx.getStart().getLine()));
					break;
			}
		}

		if(operators.isEmpty()){
			return visitRelationalexpr(ctx.relationalexpr(0));
		}else if(operators.size() == 1){
			if(operators.get(0) instanceof Not){
				((Not)operators.get(0)).setTruth((Value)visitRelationalexpr(exprs.get(0)));
				return operators.get(0);
			}else{
				operators.get(0).setRhs((Value)visitRelationalexpr(ctx.relationalexpr(0)));
				operators.get(0).setLhs((Value)visitRelationalexpr(ctx.relationalexpr(1)));
				return operators.get(0);
			}
		}else{
			if(operators.get(0) instanceof Not){
				((Not)operators.get(0)).setTruth(operators.get(1));
			}else{
				operators.get(0).setRhs(operators.get(1));
				operators.get(0).setLhs((Value)visitRelationalexpr(exprs.get(0)));
				exprs.remove(0);
			}

			int i = 1;
			while (i < (operators.size())){
				if( ((exprs.size()) == 2) && (! (operators.get(i) instanceof Not)) ){
					operators.get(i).setLhs ((Value) visitRelationalexpr(exprs.get(0)));
					operators.get(i).setRhs((Value) visitRelationalexpr(exprs.get(1)));
					exprs.remove(1);
					exprs.remove(0);
				}else if(((exprs.size()) == 1) && (operators.get(i) instanceof Not)){
					((Not)operators.get(i)).setTruth((Value) visitRelationalexpr(exprs.get(0)));
					exprs.remove(0);
				}else {
					if(operators.get(i) instanceof Not){
						((Not) operators.get(i)).setTruth(operators.get(i + 1));
					}else {
						operators.get(i).setRhs(operators.get(i + 1));
						operators.get(i).setLhs((Value) visitRelationalexpr(exprs.get(0)));
						exprs.remove(0);
					}
				}
				i++;
			}
			return operators.get(0);
		}
	}

	@Override public AbstractNode visitRelationalexpr(Trun.RelationalexprContext ctx) {
		if(ctx.truth() != null){
			return visitTruth(ctx.truth());
		}else if(ctx.LPAR() != null){
			return new TruthParenthesis("truth parenthesis",(Value) visitLogicalexpr(ctx.logicalexpr()), ctx.getStart().getLine());
		}else if(ctx.functioncall() != null){
			return visitFunctioncall(ctx.functioncall());
		} else{
			if(ctx.EQUALS() != null){
				return new Equal((Value) visitValueorfunctioncallortext( ctx.valueorfunctioncallortext(0)),(Value) visitValueorfunctioncallortext( ctx.valueorfunctioncallortext(1)), ctx.getStart().getLine());
			}else if(ctx.LESSTHAN() != null){
				return new LessThan("less than",(Value)visitValueorfunctioncallortext( ctx.valueorfunctioncallortext(0)), (Value) visitValueorfunctioncallortext( ctx.valueorfunctioncallortext(1)), ctx.getStart().getLine());
			}else if(ctx.GRTHAN() != null){
				return new GreaterThan("less than",(Value) visitValueorfunctioncallortext( ctx.valueorfunctioncallortext(0)), (Value) visitValueorfunctioncallortext( ctx.valueorfunctioncallortext(1)), ctx.getStart().getLine());
			}
			return null;
		}
	}

	@Override public AbstractNode visitAppend(Trun.AppendContext ctx) {
		Value left = (Value) visitTextorid(ctx.textorid(0));
		Value right = (Value) visitTextorid(ctx.textorid(1));
		return new Append("append", left, right, ctx.getStart().getLine());
	}

	@Override
	public AbstractNode visitTextorid(Trun.TextoridContext ctx) {
		if(ctx.TEXT() != null){
			return new TextLiteral(ctx.TEXT().getText());
		}else if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}else if(ctx.arrindex() != null){
			return visitArrindex(ctx.arrindex());
		}else
			return null;
	}

	@Override public AbstractNode visitArrindex(Trun.ArrindexContext ctx) {
		return new ArrayIndexStatement(new Identifier(ctx.ID().getText()), (Value) visitArithmexpr(ctx.arithmexpr()), ctx.getStart().getLine());
	}

	@Override public AbstractNode visitArradd(Trun.ArraddContext ctx) {
		if (ctx.expr() != null){
			return new ArrayElementAddStatement(new Identifier(ctx.ID().getText()),
				(Value) visitArithmexpr(ctx.arithmexpr()),
				(Value) visitExpr(ctx.expr()), ctx.getStart().getLine());
		} else if(ctx.TEXT() != null){
			return new ArrayElementAddStatement(new Identifier(ctx.ID().getText()),
					(Value) visitArithmexpr(ctx.arithmexpr()),
					 new TextLiteral(ctx.TEXT().getText()), ctx.getStart().getLine());
		}
		return null;
	}

	@Override public AbstractNode visitNums(Trun.NumsContext ctx) {
		if(ctx.INUM() != null){
			return new IntegerLiteral(ctx.INUM().getText());
		}else if(ctx.FNUM() != null){
			return new DecimalLiteral(ctx.FNUM().getText());
		}else if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}else
			return null;
	}

	@Override public AbstractNode visitStmtblock(Trun.StmtblockContext ctx) {
		ArrayList<Statement> statements = new ArrayList<>();
		if(ctx != null){
			statements.addAll(((StatementList)visitDclblock(ctx.dclblock())).getStmts());
			statements.addAll(((StatementList)(visitStmtstartblock(ctx.stmtstartblock()))).getStmts());
			ArrayList<Statement> noNullStmts = new ArrayList<>();
			for(Statement s : statements){
				if(s != null){
					noNullStmts.add(s);
				}
			}
			return new StatementList(noNullStmts);
		}else return new StatementList(statements);
	}

	@Override public AbstractNode visitTruthpar(Trun.TruthparContext ctx) {
		return visitTruthexpr(ctx.truthexpr());
	}

	@Override public AbstractNode visitTruth(Trun.TruthContext ctx) {
		if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}else if(ctx.TRUTHVAL() != null){
			return new TruthLiteral(ctx.TRUTHVAL().getText());
		}else
			return null;
	}

	@Override public AbstractNode visitType(Trun.TypeContext ctx) {
		if(ctx.INTDCL() != null){
			return new INTDCL();
		}else if(ctx.FLOATDCL() != null){
			return new DECIMALDCL();
		}else if(ctx.TRUTHDCL() != null){
			return new TRUTHDCL();
		}else if(ctx.TEXTDCL() != null){
			return new TEXTDCL();
		}else
			return null;
	}

	@Override public AbstractNode visitArg(Trun.ArgContext ctx) {
		if(ctx.nums() != null){
			return visitNums(ctx.nums());
		} else if(ctx.expr() != null){
			return visitExpr(ctx.expr());
		} else if(ctx.TEXT() != null){
			return new TextLiteral(ctx.TEXT().getText());
		}else if(ctx.TRUTHVAL() != null){
			return new TruthLiteral(ctx.TRUTHVAL().getText());
		}else
			return null;
	}

	@Override
	public AbstractNode visitDclValue(Trun.DclValueContext ctx) {
		if(ctx.value() != null){
			return visitValue(ctx.value());
		}else if(ctx.expr() != null){
			return visitExpr(ctx.expr());
		}else if(null != ctx.TEXT()){
			return new TextLiteral(ctx.TEXT().getText());
		}else{
			return null;
		}

	}

	@Override
	public AbstractNode visitArrdcl(Trun.ArrdclContext ctx) {
		if(ctx.ID() != null) {
			return new ArrayDeclaration(new Identifier(ctx.ID().getText()), (Type) visitType(ctx.type()));
		}else return null;
	}

	@Override
	public AbstractNode visitValueorfunctioncallortext(Trun.ValueorfunctioncallortextContext ctx) {
		if(ctx.functioncall() != null){
			return visitFunctioncall(ctx.functioncall());
		}else if(ctx.value() != null){
			return visitValue(ctx.value());
		}else if(ctx.TEXT() != null){
			return new TextLiteral(ctx.TEXT().getText());
		}
		else
			return  null;
	}

	@Override
	public AbstractNode visitDrive(Trun.DriveContext ctx) {
		return new DriveStatement((Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext()), ctx.getStart().getLine());
	}

	@Override
	public AbstractNode visitTurnleft(Trun.TurnleftContext ctx) {
		return new TurnLeftStatement((Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext()), ctx.getStart().getLine());
	}

	@Override
	public AbstractNode visitTurnright(Trun.TurnrightContext ctx) {
		return new TurnRightStatement((Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext()), ctx.getStart().getLine());
	}

	@Override
	public AbstractNode visitPause(Trun.PauseContext ctx) {
		return new PauseStatement((Value) visitValueorfunctioncallortext(ctx.valueorfunctioncallortext()), ctx.getStart().getLine());
	}
}