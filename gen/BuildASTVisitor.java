import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.ArrayList;
import java.util.List;

public class BuildASTVisitor extends AbstractParseTreeVisitor<AbstractNode> implements PyTrunVisitor<AbstractNode> {

	@Override public AbstractNode visitStart(PyTrun.StartContext ctx) {
		ArrayList<Statement> statements = new ArrayList<>();
		for (PyTrun.StmtsContext x: ctx.stmts()) {
			statements.addAll(((StatementList)visitStmts(x)).stmts);
		}
		for (PyTrun.FunctiondclContext x: ctx.functiondcl()) {
			statements.add((Statement) visitFunctiondcl(x));
		}
		return new StatementList(statements);
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
		}/*else if(null != ctx.functiondcl()){
			stmt = (Statement) visitFunctiondcl(ctx.functiondcl());
		}*/
		return stmt;
	}

	@Override public AbstractNode visitFunctiondcl(PyTrun.FunctiondclContext ctx) {
		Identifier functionName = new Identifier( ctx.ID().getText());
		ArrayList<Parameter> parameters = new ArrayList<>();
		ArrayList<Statement> statements = new ArrayList<>();

		for(PyTrun.TruedclContext x : ctx.truedcl()){
			parameters.add((Parameter) visitTruedcl(x));
		}

		for(PyTrun.StmtContext x : ctx.stmt()){
			statements.add((Statement) visitStmt(x));
		}

		if(ctx.RETURNS() == null){
			return new FunctionDeclaration(functionName, parameters, new StatementList(statements));
		}else{
			if(ctx.type() != null){
				return new ReturnFunctionDeclaration(functionName, parameters, new StatementList(statements), (Type) visitType(ctx.type()));
			}else{
				return new ReturnFunctionDeclaration(functionName, parameters, new StatementList(statements), null);
			}

		}
	}

	@Override public AbstractNode visitDcl(PyTrun.DclContext ctx) {
		Identifier varName = new Identifier(ctx.ID().toString());

		if(ctx.ARRDCL() != null){
			if(ctx.functioncall() != null){
				return new ArrayDeclaration(new Identifier(ctx.ID().getText()) , (ArrayAsmValue) visitFunctioncall(ctx.functioncall()),(Type) visitType(ctx.type()));
			}else if(ctx.types() != null){
				ArrayList<Value> values = new ArrayList<>();
				for (PyTrun.TypesContext x :ctx.types()){
					values.add( (Value) visitTypes(x));
				}
				return new ArrayDeclaration(new Identifier(ctx.ID().getText()) , new MultipleElementAssign(values),(Type) visitType(ctx.type()));
			}else{
				return new ArrayDeclaration(new Identifier(ctx.ID().getText()) , null,(Type) visitType(ctx.type()));
			}
		}else if(ctx.FLOATDCL() != null){
			if(null != ctx.dclValue()){
				return new FloatDeclaration(varName,(Value) visitDclValue(ctx.dclValue()));
			}else
				return new FloatDeclaration(varName,null);


		} else if(ctx.INTDCL() != null){
			if(null != ctx.dclValue()){
				return new IntDeclaration(varName, (Value) visitDclValue(ctx.dclValue()));
			}else
				return new IntDeclaration(varName, null);

		}else if(ctx.TEXTDCL() != null){
			return new TextDeclaration(varName, (Value)visitDclValue(ctx.dclValue()));
		}else if(ctx.TRUTHDCL() != null){
			return new TruthDeclaration(varName, (TruthOperator) visitTruthexpr(ctx.truthexpr()));
		}else{
			return null;
		}
	}


	@Override public AbstractNode visitTruedcl(PyTrun.TruedclContext ctx) {
		if(ctx.INTDCL() != null){
			return new Parameter( new INTDCL(new Identifier( ctx.ID().getText())));
		}else if(ctx.FLOATDCL() != null){
			return new Parameter( new FLOATDCL(new Identifier( ctx.ID().getText())));
		}else if(ctx.TEXTDCL() != null){
			return new Parameter( new TEXTDCL(new Identifier( ctx.ID().getText())));
		}else if(ctx.TRUTHDCL() != null){
			return new Parameter( new TRUTHDCL(new Identifier( ctx.ID().getText())));
		}else
			return null;
	}

	@Override public AbstractNode visitFunctioncall(PyTrun.FunctioncallContext ctx) {
		Identifier functionName = new Identifier( ctx.ID().getText());
		ArrayList<Value> arguments = new ArrayList<>();

		for(PyTrun.TypesContext x : ctx.types()){
			arguments.add((Value) visitTypes(x));
		}
		return new FunctionCall(functionName, arguments);
	}

	//TODO test needs to be done
	@Override public AbstractNode visitIfstmt(PyTrun.IfstmtContext ctx) {
		if(ctx.ELSE() == null){
			return new IfStatement((TruthOperator) visitTruthpar( ctx.truthpar(0)),(StatementList) visitStmtblock(ctx.stmtblock(0)));
		}else if(ctx.IF().size() > 1){
			ArrayList<ElseIfStatement> elseIfStatements = new ArrayList<>();

			int i = 1;
			while(i < ctx.IF().size()){

				if(visitTruthpar(ctx.truthpar(i)) instanceof Identifier){
					elseIfStatements.add(new ElseIfStatement((Identifier) visitTruthpar(ctx.truthpar(i)),
							(StatementList) visitStmtblock(ctx.stmtblock(i))));
				}else{
					elseIfStatements.add(new ElseIfStatement((TruthOperator) visitTruthpar(ctx.truthpar(i)),
							(StatementList) visitStmtblock(ctx.stmtblock(i))));
				}

				/*elseIfStatements.add(new ElseIfStatement((TruthOperator) visitTruthpar( ctx.truthpar(i)),
						(StatementList) visitStmtblock(ctx.stmtblock(i))));*/
				i++;
			}
			if(ctx.ELSE().size() == i){
				return new IfStatement((TruthOperator) visitTruthpar( ctx.truthpar(0)),
						(StatementList) visitStmtblock(ctx.stmtblock(0)),
						elseIfStatements,
						new ElseThenStmt((StatementList) visitStmtblock(ctx.stmtblock(ctx.stmtblock().size() -1))));
			}else{
				return new IfStatement((TruthOperator) visitTruthpar( ctx.truthpar(0)),
						(StatementList) visitStmtblock(ctx.stmtblock(0)),
						elseIfStatements);
			}

		}else{
			return new IfStatement((TruthOperator) visitTruthpar( ctx.truthpar(0)),(StatementList) visitStmtblock(ctx.stmtblock(0)),
					new ElseThenStmt((StatementList) visitStmtblock(ctx.stmtblock( 1))));
		}
	}


	@Override public AbstractNode visitWhilestmt(PyTrun.WhilestmtContext ctx) {
		return new WhileStatement((TruthOperator) visitTruthpar(ctx.truthpar()),
				(StatementList) visitStmtblock(ctx.stmtblock()));
	}

	@Override public AbstractNode visitRepeatuntilstmt(PyTrun.RepeatuntilstmtContext ctx) {
		return new RepeatStatement((StatementList) visitStmtblock(ctx.stmtblock()),
				(TruthOperator) visitTruthpar(ctx.truthpar()));
	}

	@Override public AbstractNode visitFromstmt(PyTrun.FromstmtContext ctx) {
		if(ctx.UPTO() != null){
			return new FromStatement( (Value) visitValue(ctx.value(0)), (Value)visitValue(ctx.value(1)), new Upto("upto"),
					(StatementList) visitStmtblock(ctx.stmtblock()));
		}else if(ctx.DOWNTO() != null){
			return new FromStatement( (Value) visitValue(ctx.value(0)), (Value)visitValue(ctx.value(1)), new Downto("Downto"),
					(StatementList) visitStmtblock(ctx.stmtblock()));
		}else
			return null;
	}

	@Override public AbstractNode visitReturnstmt(PyTrun.ReturnstmtContext ctx) {
		if(ctx.value() != null){
			return new ReturnStatement((Value) visitValue(ctx.value()));
		}else if(ctx.truthexpr() != null){
			return new ReturnStatement((Value) visitTruthexpr(ctx.truthexpr()));
		}else{
			return null;
		}
	}

	//TODO needs to be done
	@Override public AbstractNode visitAssignment(PyTrun.AssignmentContext ctx) {
		if(ctx.TEXT() != null){
			return new TextAssignment(new Identifier(ctx.ID().getText()), new TextLiteral(ctx.TEXT().getText()));
		}else if(ctx.ELEMENT() != null){
			return new ArrayAssignment(new Identifier(ctx.ID().getText()), new SingleElementAssign(
					new IntegerLiteral(ctx.INUM().getText()),(Value) visitValue(ctx.value())));
		}else if (ctx.value() != null){
			return new ValueAssignment(new Identifier(ctx.ID().getText()), (Value) visitValue(ctx.value()));
		}else if(ctx.types() != null){
			ArrayList<Value> values = new ArrayList<>();
			for (PyTrun.TypesContext x :ctx.types()){
				values.add( (Value) visitTypes(x));
			}
			return new ArrayAssignment(new Identifier(ctx.ID().getText()) , new MultipleElementAssign(values));
		}else if(ctx.expr() != null){
			return new ValueAssignment(new Identifier(ctx.ID().getText()), (Value) visitExpr(ctx.expr()));
		}else
			return null;
	}

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
		}else if(plusMinus.size() == 1){
			plusMinus.get(0).left =(Value)visitMultexpr(ctx.multexpr(0));
			plusMinus.get(0).right =(Value)visitMultexpr(ctx.multexpr(1));
			return plusMinus.get(0);
		}else{
			plusMinus.get(0).left = (Value) visitMultexpr(exprs.get(0)) ;
			exprs.remove(0);
			int i = 0;
			/*if(plusMinus.size() > 1){
			    plusMinus.get(0).right = plusMinus.get(1);
			    plusMinus.get(1).left =  (Value) visitMultexpr(exprs.get(0));
			    exprs.remove(0);
			}*/
			while (i < (exprs.size())){
				if( (exprs.size()) == 2){
					plusMinus.get(i).right = (Value) visitMultexpr(exprs.get(0));
					plusMinus.get(i).left =  (Value) visitMultexpr(exprs.get(1));
					exprs.remove(1);
					exprs.remove(0);
				}else {
					plusMinus.get(i).right = plusMinus.get(i + 1);
					plusMinus.get(i + 1).left = (Value) visitMultexpr(exprs.get(0));
					exprs.remove(0);
				}
				i++;
			}
			return plusMinus.get(0);
		}
	}
	@Override public AbstractNode visitMultexpr(PyTrun.MultexprContext ctx) {
		ArrayList<ArithmOperator> timesDivide = new ArrayList<>();
		List<PyTrun.ParexprContext> exprs = ctx.parexpr();
		for(ParseTree x : ctx.children){
			if(x.getText().equals("*")){
				timesDivide.add(new Times());
			}else if(x.getText().equals("/")){
				timesDivide.add(new Divide());
			}
		}

		if(timesDivide.isEmpty()){
			return visitParexpr(ctx.parexpr(0));
		}else if(timesDivide.size() == 1){
			timesDivide.get(0).left =(Value)visitParexpr(ctx.parexpr(0));
			timesDivide.get(0).right =(Value)visitParexpr(ctx.parexpr(1));
			return timesDivide.get(0);
		}else{
			timesDivide.get(0).left = (Value) visitParexpr (exprs.get(0)) ;
			exprs.remove(0);
			int i = 0; // moske 1 istedet
			while (i < (exprs.size())){
				if( (exprs.size()) == 2){
					timesDivide.get(i).right = (Value) visitParexpr(exprs.get(0));
					timesDivide.get(i).left =  (Value) visitParexpr(exprs.get(1));
					exprs.remove(1);
					exprs.remove(0);
				}else {
					timesDivide.get(i).right = timesDivide.get(i + 1);
					timesDivide.get(i + 1).left = (Value) visitParexpr(exprs.get(0));
					exprs.remove(0);
				}
				i++;
			}
			return timesDivide.get(0);
		}
	}

	@Override public AbstractNode visitParexpr(PyTrun.ParexprContext ctx) {
		if(ctx.LPAR() != null){
			return new ArithmParenthesis("parenthesis", (Value)visitArithmexpr(ctx.arithmexpr()),null);
		}else if(ctx.nums() != null){
			return visitNums(ctx.nums());
		}else if(ctx.functioncall() != null){
			return visitFunctioncall(ctx.functioncall());
		}else
			return null;
	}

	//Truth expression methods
	@Override public AbstractNode visitTruthexpr(PyTrun.TruthexprContext ctx) {
		return visitLogicalexpr(ctx.logicalexpr());
	}

	//TODO needs to be impemented.
	@Override public AbstractNode visitLogicalexpr(PyTrun.LogicalexprContext ctx) {
		ArrayList<TruthOperator> operators = new ArrayList<>();
		List<PyTrun.RelationalexprContext> exprs = ctx.relationalexpr();

		for(ParseTree x : ctx.children){
			if(x.getText().equals("NOT")){
				operators.add(new Not());
			}else if(x.getText().equals("OR")){
				operators.add(new Or());
			}else if(x.getText().equals("AND")){
				operators.add(new And());
			}
		}

		if(operators.isEmpty()){
			return visitRelationalexpr(ctx.relationalexpr(0));
		}else if(operators.size() == 1){
			if(operators.get(0) instanceof Not){
				operators.get(0).lhs = (Value)visitRelationalexpr(ctx.relationalexpr(0));
				return operators.get(0);
			}else{
				operators.get(0).rhs = (Value)visitRelationalexpr(ctx.relationalexpr(0));
				operators.get(0).lhs = (Value)visitRelationalexpr(ctx.relationalexpr(1));
				return operators.get(0);
			}
		}else{
			operators.get(0).lhs = (Value) visitRelationalexpr (exprs.get(0)) ;
			exprs.remove(0);
			int i = 0;
			while (i < (exprs.size())){
				if( ((exprs.size()) == 2) && (! (operators.get(i) instanceof Not)) ){
					operators.get(i).rhs = (Value) visitRelationalexpr(exprs.get(0));
					operators.get(i).lhs = (Value) visitRelationalexpr(exprs.get(1));
					exprs.remove(1);
					exprs.remove(0);
				}else if(((exprs.size()) == 1) && (operators.get(i) instanceof Not)){
					operators.get(i).lhs = (Value) visitRelationalexpr(exprs.get(0));
					exprs.remove(0);
				}else {
					if(operators.get(i) instanceof Not){
						operators.get(i).rhs = operators.get(i + 1);
					}else {
						operators.get(i).rhs = operators.get(i + 1);
						operators.get(i + 1).lhs = (Value) visitRelationalexpr(exprs.get(0));
						exprs.remove(0);
					}
				}
				i++;
			}

			return operators.get(0);
		}
	}

	@Override public AbstractNode visitRelationalexpr(PyTrun.RelationalexprContext ctx) {
		if(ctx.truth() != null){
			return visitTruth(ctx.truth());
		}else if(ctx.LPAR() != null){
			return new TruthParenthesis("truth parenthesis",(Value) visitLogicalexpr(ctx.logicalexpr()));
		}else{
			if(ctx.EQUALS() != null){
				return new Equal((Value) visitValue( ctx.value(0)),(Value) visitValue( ctx.value(1)));
			}else if(ctx.LESSTHAN() != null){
				return new LessThan("less than",(Value)visitValue( ctx.value(0)), (Value) visitValue( ctx.value(1)));
			}else if(ctx.GRTHAN() != null){
				return new GreaterThan("less than",(Value) visitValue( ctx.value(0)), (Value) visitValue( ctx.value(1)));
			}
			return null;
		}
	}


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

	@Override public AbstractNode visitArrindex(PyTrun.ArrindexContext ctx) {
		return new ArrayIndexStatement(new Identifier(ctx.ID().getText()), new IntegerLiteral(ctx.INUM().getText()));
	}

	@Override public AbstractNode visitArradd(PyTrun.ArraddContext ctx) {
		if(ctx.INUM() != null){
			return new ArrayElementAddStatement(new Identifier(ctx.ID().get(0).getText()),
					new IntegerLiteral(ctx.INUM().getText()),
					(Value) visitTypes(ctx.types()));
		}else if(ctx.ID().size() == 2){
			return new ArrayElementAddStatement(new Identifier(ctx.ID().get(0).getText()),
					new Identifier(ctx.ID().get(1).getText()),
					(Value) visitTypes(ctx.types()));
		}else
			return null;
	}

	@Override public AbstractNode visitNums(PyTrun.NumsContext ctx) {
		if(ctx.INUM() != null){
			return new IntegerLiteral(ctx.INUM().getText());
		}else if(ctx.FNUM() != null){
			return new FloatLiteral(ctx.FNUM().getText());
		}else if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}else
			return null;
	}

	@Override public AbstractNode visitStmtblock(PyTrun.StmtblockContext ctx) {
		ArrayList<Statement> statements = new ArrayList<>();

		for(PyTrun.StmtContext x : ctx.stmt()){
			statements.add((Statement) visitStmt(x));
		}
		return new StatementList(statements);
	}

	@Override public AbstractNode visitTruthpar(PyTrun.TruthparContext ctx) {
		return visitTruthexpr(ctx.truthexpr());
	}

	@Override public AbstractNode visitTruth(PyTrun.TruthContext ctx) {
		if(ctx.ID() != null){
			return new Identifier(ctx.ID().getText());
		}else if(ctx.TRUTHVAL() != null){
			return new TruthLiteral(ctx.TRUTHVAL().getText());
		}else
			return null;
	}

	@Override public AbstractNode visitType(PyTrun.TypeContext ctx) {
		if(ctx.INTDCL() != null){
			return new INTDCL();
		}else if(ctx.FLOATDCL() != null){
			return new FLOATDCL();
		}else if(ctx.TRUTHDCL() != null){
			return new TRUTHDCL();
		}else if(ctx.TEXTDCL() != null){
			return new TEXTDCL();
		}else
			return null;
	}

	@Override public AbstractNode visitTypes(PyTrun.TypesContext ctx) {
		if(ctx.nums() != null){
			return visitNums(ctx.nums());
		}else if(ctx.TEXT() != null){
			return new TextLiteral(ctx.TEXT().getText());
		}else if(ctx.TRUTHVAL() != null){
			return new TruthLiteral(ctx.TRUTHVAL().getText());
		}else
			return null;
	}


	//need to be placed in a more appropriate place.
	@Override
	public AbstractNode visitDclValue(PyTrun.DclValueContext ctx) {



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
	public AbstractNode visitDrive(PyTrun.DriveContext ctx) {
		return new DriveStatement((Value) visitValue(ctx.value()));
	}

	@Override
	public AbstractNode visitTurnleft(PyTrun.TurnleftContext ctx) {
		return new TurnLeftStatement((Value) visitValue(ctx.value()));
	}

	@Override
	public AbstractNode visitTurnright(PyTrun.TurnrightContext ctx) {
		return new TurnRightStatement((Value) visitValue(ctx.value()));
	}
}