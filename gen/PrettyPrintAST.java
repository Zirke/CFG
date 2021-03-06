import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

public class PrettyPrintAST extends BasicAbstractNodeVisitor<AbstractNode> {

    @Override
    public AbstractNode visit(And node) throws NoSuchMethodException {
        System.out.println("ast.And Node");
        visit(node.getLhs());
        visit(node.getRhs());
        return null;
    }

    @Override
    public AbstractNode visit(Append node) throws NoSuchMethodException {
        System.out.println("ast.Append Node");
        visit(node.getLeft());
        visit(node.getRight());
        return null;
    }

    @Override
    public AbstractNode visit(ArithmParenthesis node) throws NoSuchMethodException{
        System.out.println("Arithmetic Parenthesis");
        visit(node.getLeft());
        return null;
    }

    @Override
    public AbstractNode visit(ArrayAssignment node) throws NoSuchMethodException{
        System.out.println("Array assignment node");
        visit(node.getId());
        return null;
    }

    @Override
    public AbstractNode visit(ArrayDeclaration node) throws NoSuchMethodException{
        System.out.println("Array declaration node");
        visit(node.getId());
        visit(node.getType());
        return null;
    }

    @Override
    public AbstractNode visit(ArrayElementAddStatement node) throws NoSuchMethodException{
        System.out.println("Array element add statement node");
        visit(node.getArrayName());
        visit(node.getElementNumber());
        visit(node.getValue());
        System.out.println("Array element add statement node DONE");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayIndexStatement node) throws NoSuchMethodException{
        System.out.println("ast.ArrayIndexStatement node");
        visit(node.getId());
        visit(node.getNumber());
        System.out.println("ast.ArrayIndexStatement node END");
        return null;
    }

    @Override
    public AbstractNode visit(Divide node) throws NoSuchMethodException{
        System.out.println("ast.Divide node");
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Divide node END");
        return null;
    }

    @Override
    public AbstractNode visit(Downto node) throws NoSuchMethodException{
        System.out.println("Down to Node");
        return null;
    }

    @Override
    public AbstractNode visit(ElseIfStatement node) throws NoSuchMethodException{
        System.out.println("Else if statement node");
        visit(node.getTruth());
        visit(node.getStms());
        System.out.println("Else if statement node END");
        return null;
    }

    @Override
    public AbstractNode visit(ElseThenStmt node) throws NoSuchMethodException{
        System.out.println("Else then statement node");
        visit(node.getStms());
        System.out.println("Else then statement node END");
        return null;
    }

    @Override
    public AbstractNode visit(ValueAssignment node) throws NoSuchMethodException{
        System.out.println("ast.Value assignment node");
        visit(node.getId());
        visit(node.getValue());
        System.out.println("ast.Value assignment node END");
        return null;
    }

    @Override
    public AbstractNode visit(DECIMALDCL node) throws NoSuchMethodException{
        System.out.println("Float Node");
        return null;
    }

    @Override
    public AbstractNode visit(DecimalDeclaration node) throws NoSuchMethodException{
        System.out.println("Float Declaration node");
        visit(node.getId());
        visit(node.getValue());
        System.out.println("Float Declaration node END");
        return null;
    }

    @Override
    public AbstractNode visit(DecimalLiteral node) throws NoSuchMethodException{
        System.out.println(node.getSpelling());
        System.out.println("Float Literal Node");
        return null;
    }

    @Override
    public AbstractNode visit(FromKeyword node) throws NoSuchMethodException{
        System.out.println("From Keyword node");
        return null;
    }

    @Override
    public AbstractNode visit(FromStatement node) throws NoSuchMethodException{
        visit(node.getFromVal());
        visit(node.getToVal());
        visit(node.getUptoOrDownto());
        visit(node.getStmts());
        System.out.println("From statement");
        return null;
    }

    @Override
    public AbstractNode visit(FunctionCall node) throws NoSuchMethodException{
        visit(node.getFunctionName());
        for(Value x : node.getArguments()){
            visit(x);
        }
        System.out.println("Function Call node");
        return null;
    }

    @Override
    public AbstractNode visit(FunctionDeclaration node) throws NoSuchMethodException{
        visit(node.getFunctionName());
        for(Parameter x : node.getParameters()){
            visit(x);
        }
        visit(node.getStmtBody());
        System.out.println("Function declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(GreaterThan node) throws NoSuchMethodException{
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("Greater than Node");
        return null;
    }

    @Override
    public AbstractNode visit(Identifier node) throws NoSuchMethodException{
        System.out.println(node.spelling +"  : ast.Identifier Node");
        return null;
    }

    @Override
    public AbstractNode visit(IfStatement node) throws NoSuchMethodException{
        System.out.println("If statement node");
        visit(node.getTruthVal());
        if(node.getTrueStm() != null){
            visit(node.getTrueStm());
        }
        if(node.getElseifs() != null) {
            for (ElseIfStatement x : node.getElseifs()) {
                visit(x);
            }
        }
        if(node.getElsethen() != null)
            visit(node.getElsethen());
        System.out.println("If statement node END");
        return null;
    }

    @Override
    public AbstractNode visit(INTDCL node) throws NoSuchMethodException{
        System.out.println("Int dcl");
        return null;
    }

    @Override
    public AbstractNode visit(IntDeclaration node) throws NoSuchMethodException{
        System.out.println("Integer declaration node");
        visit(node.getId());
        if(node.getValue() != null)
            visit(node.getValue());
        System.out.println("Integer declaration node END");
        return null;
    }

    @Override
    public AbstractNode visit(IntegerLiteral node) throws NoSuchMethodException{
        System.out.println(node.getSpelling());
        System.out.println("Integer Literal node");
        return null;
    }

    @Override
    public AbstractNode visit(LessThan node) throws NoSuchMethodException{
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("Less than node");
        return null;
    }

    @Override
    public AbstractNode visit(Minus node) throws NoSuchMethodException{
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Minus node");
        return null;
    }

    @Override
    public AbstractNode visit(Not node) throws NoSuchMethodException{
        visit(node.getTruth());
        System.out.println("ast.Not node");
        return null;
    }

    @Override
    public AbstractNode visit(Or node) throws NoSuchMethodException{
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("ast.Or node");
        return null;
    }

    @Override
    public AbstractNode visit(Parameter node) throws NoSuchMethodException{
        visit(node.getParamType());
        visit(node.getId());
        System.out.println("Paramenter node");
        return null;
    }

    @Override
    public AbstractNode visit(Plus node) throws NoSuchMethodException{
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Plus node");
        return null;
    }

    @Override
    public AbstractNode visit(RepeatStatement node) throws NoSuchMethodException{
        visit(node.getExpr());
        visit(node.getStmts());
        System.out.println("Repeat statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ReturnFunctionDeclaration node) throws NoSuchMethodException{
        visit(node.getFunctionName());
        visit(node.getReturnType());
        for(Parameter x : node.getParameters()){
            visit(x);
        }
        visit(node.getStmtBody());
        System.out.println("Return Function declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(SingleElementAssign node) throws NoSuchMethodException{
        visit(node.getElementNr());
        visit(node.getAssignemntVal());
        return null;
    }

    @Override
    public AbstractNode visit(StatementList node) throws NoSuchMethodException{
        for(Statement x : node.getStmts()){
            visit(x);
        }
        return null;
    }

    @Override
    public AbstractNode visit(TextAssignment node) throws NoSuchMethodException{
        visit(node.getId());
        visit(node.getText());
        System.out.println("Text assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(TEXTDCL node) throws NoSuchMethodException{
        System.out.println("Text dcl node");
        return null;
    }

    @Override
    public AbstractNode visit(TextDeclaration node) throws NoSuchMethodException{
        visit(node.getId());
        visit(node.getVal());
        System.out.println("Text declaration");
        return null;
    }

    @Override
    public AbstractNode visit(TextLiteral node) throws NoSuchMethodException{
        System.out.println(node.getSpelling());
        return null;
    }

    @Override
    public AbstractNode visit(Times node) throws NoSuchMethodException{
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Times node");
        return null;
    }

    @Override
    public AbstractNode visit(TRUTHDCL node) throws NoSuchMethodException{
        System.out.println("Truth dcl");
        return null;
    }

    @Override
    public AbstractNode visit(TruthDeclaration node) throws NoSuchMethodException{
        visit(node.getId());
        visit(node.getExpr());
        System.out.println("Truth declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(TruthLiteral node) throws NoSuchMethodException{
        System.out.println(node.getSpelling());
        return null;
    }

    @Override
    public AbstractNode visit(TruthParenthesis node) throws NoSuchMethodException{
        visit(node.getExpr());
        System.out.println("Truth Parenthesis node");
        return null;
    }

    @Override
    public AbstractNode visit(Upto node) throws NoSuchMethodException{
        System.out.println("upto node");
        return null;
    }

    @Override
    public AbstractNode visit(WhileStatement node) throws NoSuchMethodException{
        visit(node.getExpr());
        visit(node.getStmts());
        System.out.println("While statement");
        return null;
    }

    @Override
    public AbstractNode visit(Equal node) throws NoSuchMethodException{
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("ast.Equal node");
        return null;
    }


    @Override
    public AbstractNode visit(DriveStatement node) throws NoSuchMethodException{
        visit(node.getVal());
        System.out.println("Drive Statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ReturnStatement node) throws NoSuchMethodException{
        visit(node.getVal());
        System.out.println("Return ast.Statement node");
        return null;
    }

    @Override
    public AbstractNode visit(TurnLeftStatement node) throws NoSuchMethodException{
        visit(node.getVal());
        System.out.println("Turn Left Node");
        return null;
    }

    @Override
    public AbstractNode visit(TurnRightStatement node) throws NoSuchMethodException{
        visit(node.getVal());
        System.out.println("Turn Right ast.Statement");
        return null;
    }

    @Override
    public AbstractNode visit(PauseStatement node) throws NoSuchMethodException{
        visit(node.getVal());
        System.out.println("Pause Statement node");
        return null;
    }

    public AbstractNode defaultVisit(){
        System.out.println("default visit");
        return null;
    }

    @Override
    public AbstractNode visit(UnaryMinus node) throws NoSuchMethodException {
        visit(node.getLeft());
        System.out.println("Unary node");
        return null;
    }
}
