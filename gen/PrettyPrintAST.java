import ast.*;
import astVisitor.AbstractNodeVisitor;

public class PrettyPrintAST extends AbstractNodeVisitor<AbstractNode> {

/*    @Override
    public AbstractNode visit(AbstractNode node) {
        if(node instanceof StatementList){
            visit((StatementList) node);
        }else if(node instanceof Statement){
            visit((Statement) node);
        }else if(node instanceof Terminal){
            visit((Terminal) node); //should not be possible
        }else if(node instanceof Type){
            visit((Type) node);
        }
        return null;
    }*/

    @Override
    public AbstractNode visit(And node) {
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("ast.And Node");
        return null;
    }

    @Override
    public AbstractNode visit(ArithmParenthesis node) {
        visit(node.getLeft());
        System.out.println("Arithmetic Parenthesis");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayAssignment node) {
        visit(node.getId());
        visit(node.getValue());
        System.out.println("Array assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayAsmValue node) {
        if(node instanceof SingleElementAssign){
            visit((SingleElementAssign)node);
        }else if(node instanceof MultipleElementAssign){
            visit((MultipleElementAssign) node);
        }else if(node instanceof FunctionCall){
            visit((FunctionCall)node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(ArrayDeclaration node) {
        visit(node.getId());
        visit(node.getType());
        visit(node.getValues());
        System.out.println("Array declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayElementAddStatement node) {
        visit(node.getArrayName());
        visit(node.getElementNumber());
        visit(node.getValue());
        System.out.println("Array element add statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayIndexStatement node) {
        visit(node.getId());
        visit(node.getNumber());
        System.out.println("ast.ArrayIndexStatement node");
        return null;
    }

    @Override
    public AbstractNode visit(Divide node) {
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Divide node");
        return null;
    }

    @Override
    public AbstractNode visit(Downto node) {
        System.out.println("Down to Node");
        return null;
    }

    @Override
    public AbstractNode visit(ElseIfStatement node) {
        visit(node.getTruth());
        visit(node.getStms());
        System.out.println("Else if statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ElseThenStmt node) {
        visit(node.getStms());
        System.out.println("Else then statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ValueAssignment node) {
        visit(node.getId());
        visit(node.getValue());
        System.out.println("ast.Value assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(FLOATDCL node) {
        System.out.println("Float Node");
        return null;
    }

    @Override
    public AbstractNode visit(FloatDeclaration node) {
        visit(node.getId());
        visit(node.getStm());
        System.out.println("Float Declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(FloatLiteral node) {
        System.out.println(node.getSpelling());
        System.out.println("Float Literal Node");
        return null;
    }

    @Override
    public AbstractNode visit(FromKeyword node) {
        System.out.println("From Keyword node");
        return null;
    }

    @Override
    public AbstractNode visit(FromStatement node) {
        visit(node.getFromVal());
        visit(node.getToVal());
        visit(node.getUptoOrDownto());
        visit(node.getStmts());
        System.out.println("From statement");
        return null;
    }

    @Override
    public AbstractNode visit(FunctionCall node) {
        visit(node.getFunctionName());
        for(Value x : node.getArguments()){
            visit(x);
        }
        System.out.println("Function Call node");
        return null;
    }

    @Override
    public AbstractNode visit(FunctionDeclaration node) {
        visit(node.getFunctionName());
        for(Parameter x : node.getParameters()){
            visit(x);
        }
        visit(node.getStmtBody());
        System.out.println("Function declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(GreaterThan node) {
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("Greater than Node");
        return null;
    }

    @Override
    public AbstractNode visit(Identifier node) {
        System.out.println(node.spelling +"  : ast.Identifier Node");
        return null;
    }

    @Override
    public AbstractNode visit(IfStatement node) {
        visit(node.getTruthVal());
        visit(node.getTrueStm());
        if(node.getElseifs() != null) {
            for (ElseIfStatement x : node.getElseifs()) {
                visit(x);
            }
        }
        if(node.getElsethen() != null)
            visit(node.getElsethen());
        System.out.println("If statement node");
        return null;
    }

    @Override
    public AbstractNode visit(INTDCL node) {
        System.out.println("Int dcl");
        return null;
    }

    @Override
    public AbstractNode visit(IntDeclaration node) {
        visit(node.getId());
        visit(node.getStm());
        System.out.println("Integer declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(IntegerLiteral node) {
        System.out.println(node.getSpelling());
        System.out.println("Integer Literal node");
        return null;
    }

    @Override
    public AbstractNode visit(LessThan node) {
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("Less than node");
        return null;
    }

    @Override
    public AbstractNode visit(Minus node) {
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Minus node");
        return null;
    }

    @Override
    public AbstractNode visit(MultipleElementAssign node) {
        for(Value x : node.getElements()){
            visit(x);
        }
        return null;
    }

    @Override
    public AbstractNode visit(Not node) {
        visit(node.getTruth());
        System.out.println("ast.Not node");
        return null;
    }

    @Override
    public AbstractNode visit(Or node) {
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("ast.Or node");
        return null;
    }

    @Override
    public AbstractNode visit(Parameter node) {
        visit(node.getParamType());
        visit(node.getId());
        System.out.println("Paramenter node");
        return null;
    }

    @Override
    public AbstractNode visit(Plus node) {
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Plus node");
        return null;
    }

    @Override
    public AbstractNode visit(RepeatStatement node) {
        visit(node.getExpr());
        visit(node.getStmts());
        System.out.println("Repeat statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ReturnFunctionDeclaration node) {
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
    public AbstractNode visit(SingleElementAssign node) {
        visit(node.getElementNr());
        visit(node.getAssignemntVal());
        return null;
    }

    @Override
    public AbstractNode visit(StatementList node) {
        for(Statement x : node.getStmts()){
            visit(x);
        }
        return null;
    }

    @Override
    public AbstractNode visit(TextAssignment node) {
        visit(node.getId());
        visit(node.getText());
        System.out.println("Text assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(TEXTDCL node) {
        System.out.println("Text dcl node");
        return null;
    }

    @Override
    public AbstractNode visit(TextDeclaration node) {
        visit(node.getId());
        visit(node.getVal());
        System.out.println("Text declaration");
        return null;
    }

    @Override
    public AbstractNode visit(TextLiteral node) {
        System.out.println(node.getSpelling());
        return null;
    }

    @Override
    public AbstractNode visit(Times node) {
        visit(node.getLeft());
        visit(node.getRight());
        System.out.println("ast.Times node");
        return null;
    }

    @Override
    public AbstractNode visit(TRUTHDCL node) {
        System.out.println("Truth dcl");
        return null;
    }

    @Override
    public AbstractNode visit(TruthDeclaration node) {
        visit(node.getId());
        visit(node.getExpr());
        System.out.println("Truth declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(TruthLiteral node) {
        System.out.println(node.getSpelling());
        return null;
    }

    @Override
    public AbstractNode visit(TruthParenthesis node) {
        visit(node.getExpr());
        System.out.println("Truth Parenthesis node");
        return null;
    }

    @Override
    public AbstractNode visit(Type node) {
        if(node instanceof INTDCL){
            visit((INTDCL) node);
        }else if(node instanceof FLOATDCL){
            visit((FLOATDCL) node);
        }else if(node instanceof TRUTHDCL){
            visit((TRUTHDCL) node);
        }else if(node instanceof TEXTDCL){
            visit((TEXTDCL) node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(Upto node) {
        System.out.println("upto node");
        return null;
    }

    @Override
    public AbstractNode visit(WhileStatement node) {
        visit(node.getExpr());
        visit(node.getStmts());
        System.out.println("While statement");
        return null;
    }

    @Override
    public AbstractNode visit(Value node) {
        if(node instanceof FunctionCall){
            visit((FunctionCall)node);
        }else if(node instanceof TruthOperator){
            visit((TruthOperator)node);
        }else if(node instanceof ArithmOperator){
            visit((ArithmOperator)node);
        }else if(node instanceof IntegerLiteral){
            visit((IntegerLiteral)node);
        }else if(node instanceof FloatLiteral){
            visit((FloatLiteral)node);
        }else if(node instanceof TextLiteral){
            visit((TextLiteral)node);
        }else if(node instanceof TruthLiteral){
            visit((TruthLiteral)node);
        }else if(node instanceof Identifier){
            visit((Identifier)node);
        }else if(node instanceof Parameter) {
            visit((Parameter)node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(TruthOperator node) {
        if(node instanceof Or){
            visit((Or) node);
        }else if( node instanceof  Not){
            visit((Not) node);
        }else if(node instanceof GreaterThan){
            visit((GreaterThan) node);
        }else if(node instanceof LessThan){
            visit((LessThan)node);
        }else if(node instanceof Equal){
            visit((Equal)node);
        }else if(node instanceof TruthParenthesis){
            visit((TruthParenthesis)node);
        }else if(node instanceof And){
            visit((And) node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(Equal node) {
        visit(node.getLhs());
        visit(node.getRhs());
        System.out.println("ast.Equal node");
        return null;
    }

    @Override
    public AbstractNode visit(ArithmOperator node) {
        if(node instanceof Plus)
            visit((Plus) node);
        else if(node instanceof Minus)
            visit((Minus) node);
        else if(node instanceof Divide)
            visit((Divide) node);
        else if(node instanceof Times)
            visit((Times) node);
        else if(node instanceof ArithmParenthesis)
            visit((ArithmParenthesis) node);
        return null;
    }



    @Override
    public AbstractNode visit(Statement node){
        if(node instanceof IntDeclaration){
            visit((IntDeclaration) node);
        }else if(node instanceof FloatDeclaration){
            visit((FloatDeclaration) node);
        }else if(node instanceof TextDeclaration){
            visit((TextDeclaration) node);
        }else if(node instanceof TruthDeclaration){
            visit((TruthDeclaration) node);
        } else if(node instanceof ArrayDeclaration){
            visit((ArrayDeclaration) node);
        } else if(node instanceof ValueAssignment){
            visit((ValueAssignment) node);
        } else if(node instanceof TextAssignment){
            visit((TextAssignment) node);
        } else if(node instanceof ArrayAssignment){
            visit((ArrayAssignment) node);
        } else if(node instanceof ArrayIndexStatement){
            visit((ArrayIndexStatement) node);
        } else if(node instanceof ArrayElementAddStatement){
            visit((ArrayElementAddStatement) node);
        } else if(node instanceof IfStatement){
            visit((IfStatement) node);
        } else if(node instanceof WhileStatement){
            visit((WhileStatement) node);
        } else if(node instanceof RepeatStatement){
            visit((RepeatStatement) node);
        } else if(node instanceof FromStatement){
            visit((FromStatement) node);
        } else if(node instanceof ReturnStatement){
            visit((ReturnStatement) node);
        }else if(node instanceof ReturnFunctionDeclaration){
            visit((ReturnFunctionDeclaration) node);
        }else if(node instanceof FunctionDeclaration){
            visit((FunctionDeclaration) node);
        } else if(node instanceof FunctionCall){
            visit((FunctionCall) node);
        } else if(node instanceof DriveStatement){
            visit((DriveStatement) node);
        } else if(node instanceof TurnLeftStatement){
            visit((TurnLeftStatement) node);
        } else if(node instanceof TurnRightStatement){
            visit((TurnRightStatement) node);
        }
        return null;
    }


    @Override
    public AbstractNode visit(DriveStatement node) {
        visit(node.getVal());
        System.out.println("Drive Statmenet node");
        return null;
    }

    @Override
    public AbstractNode visit(ReturnStatement node) {
        visit(node.getVal());
        System.out.println("Return ast.Statement node");
        return null;
    }

    @Override
    public AbstractNode visit(TurnLeftStatement node) {
        visit(node.getVal());
        System.out.println("Turn Left Node");
        return null;
    }

    @Override
    public AbstractNode visit(TurnRightStatement node) {
        visit(node.getVal());
        System.out.println("Turn Right ast.Statement");
        return null;
    }
}
