package astVisitor;

import ast.*;

public abstract class AbstractNodeVisitor<T>{
    public T visit(AbstractNode node){
        if(node instanceof StatementList){
            return visit((StatementList) node);
        }else if(node instanceof Statement){
            return visit((Statement) node);
        }else if(node instanceof Terminal){
            return visit((Terminal) node);
        }else if(node instanceof Type){
           return visit((Type) node);
        }
        return null;
    }

    public T visit(Value node){
        if(node instanceof FunctionCall){
            return visit((FunctionCall)node);
        }else if(node instanceof TruthOperator){
            return visit((TruthOperator)node);
        }else if(node instanceof ArithmOperator){
            return visit((ArithmOperator)node);
        }else if(node instanceof IntegerLiteral){
            return visit((IntegerLiteral)node);
        }else if(node instanceof FloatLiteral){
            return visit((FloatLiteral)node);
        }else if(node instanceof TextLiteral){
            return visit((TextLiteral)node);
        }else if(node instanceof TruthLiteral){
            return visit((TruthLiteral)node);
        }else if(node instanceof Identifier){
            return visit((Identifier)node);
        }else if(node instanceof Parameter){
            return visit((Parameter)node);
        }
        return null;
    }
    public abstract T visit(And node);

    public T visit(ArithmOperator node) {
        if (node instanceof Plus) {
            return visit((Plus) node);
        } else if (node instanceof Minus) {
            return visit((Minus) node);
        } else if (node instanceof Divide) {
            return visit((Divide) node);
        } else if (node instanceof Times) {
            return visit((Times) node);
        } else if (node instanceof ArithmParenthesis) {
            return visit((ArithmParenthesis) node);
        }
        return null;
    }
    public abstract T visit(ArithmParenthesis node);

    public abstract T visit(ArrayAssignment node);
    public T visit(ArrayAsmValue node){
        if(node instanceof SingleElementAssign){
            return visit((SingleElementAssign)node);
        }else if(node instanceof MultipleElementAssign){
            return visit((MultipleElementAssign) node);
        }else if(node instanceof FunctionCall){
            return visit((FunctionCall)node);
        }
        return null;
    }
    public abstract T visit(ArrayDeclaration node);
    public abstract T visit(ArrayElementAddStatement node);
    public abstract T visit(ArrayIndexStatement node);
    public abstract T visit(Divide node);
    public abstract T visit(Downto node);
    public abstract T visit(DriveStatement node);
    public abstract T visit(ElseIfStatement node);
    public abstract T visit(ElseThenStmt node);
    public abstract T visit(ValueAssignment node);
    public abstract T visit(FLOATDCL node);
    public abstract T visit(FloatDeclaration node);
    public abstract T visit(FloatLiteral node);
    public abstract T visit(FromKeyword node);
    public abstract T visit(FromStatement node);
    public abstract T visit(FunctionCall node);
    public abstract T visit(FunctionDeclaration node);
    public abstract T visit(GreaterThan node);
    public abstract T visit(Identifier node);
    public abstract T visit(IfStatement node);
    public abstract T visit(INTDCL node);
    public abstract T visit(IntDeclaration node);
    public abstract T visit(IntegerLiteral node);
    public abstract T visit(LessThan node);
    public abstract T visit(Minus node);
    public abstract T visit(MultipleElementAssign node);
    public abstract T visit(Not node);
    public abstract T visit(Or node);
    public abstract T visit(Parameter node);
    public abstract T visit(Plus node);
    public abstract T visit(RepeatStatement node);
    public abstract T visit(ReturnFunctionDeclaration node);
    public abstract T visit(ReturnStatement node);
    public abstract T visit(SingleElementAssign node);

    public  T visit(Statement node){
        if(node instanceof IntDeclaration){
           return visit((IntDeclaration) node);
        }else if(node instanceof FloatDeclaration){
            return visit((FloatDeclaration) node);
        }else if(node instanceof TextDeclaration){
            return visit((TextDeclaration) node);
        }else if(node instanceof TruthDeclaration){
            return visit((TruthDeclaration) node);
        } else if(node instanceof ArrayDeclaration){
            return visit((ArrayDeclaration) node);
        } else if(node instanceof ValueAssignment){
            return visit((ValueAssignment) node);
        } else if(node instanceof TextAssignment){
            return visit((TextAssignment) node);
        } else if(node instanceof ArrayAssignment){
            return visit((ArrayAssignment) node);
        } else if(node instanceof ArrayIndexStatement){
            return visit((ArrayIndexStatement) node);
        } else if(node instanceof ArrayElementAddStatement){
            return visit((ArrayElementAddStatement) node);
        } else if(node instanceof IfStatement){
            return visit((IfStatement) node);
        } else if(node instanceof WhileStatement){
            return visit((WhileStatement) node);
        } else if(node instanceof RepeatStatement){
            return visit((RepeatStatement) node);
        } else if(node instanceof FromStatement){
            return visit((FromStatement) node);
        } else if(node instanceof ReturnStatement){
            return visit((ReturnStatement) node);
        }else if(node instanceof ReturnFunctionDeclaration){
            return visit((ReturnFunctionDeclaration) node);
        }else if(node instanceof FunctionDeclaration){
            return visit((FunctionDeclaration) node);
        } else if(node instanceof FunctionCall){
            return visit((FunctionCall) node);
        } else if(node instanceof DriveStatement){
            return visit((DriveStatement) node);
        } else if(node instanceof TurnLeftStatement){
            return visit((TurnLeftStatement) node);
        } else if(node instanceof TurnRightStatement){
            return visit((TurnRightStatement) node);
        }
        return null;
    }

    public abstract T visit(StatementList node);
    public abstract T visit(TextAssignment node);
    public abstract T visit(TEXTDCL node);
    public abstract T visit(TextDeclaration node);
    public abstract T visit(TextLiteral node);
    public abstract T visit(Times node);
    public abstract T visit(TRUTHDCL node);
    public abstract T visit(TruthDeclaration node);
    public abstract T visit(TruthLiteral node);

    public T visit(TruthOperator node){
        if(node instanceof Or){
            return visit((Or) node);
        }else if( node instanceof  Not){
            return visit((Not) node);
        }else if(node instanceof GreaterThan){
            return visit((GreaterThan) node);
        }else if(node instanceof LessThan){
            return visit((LessThan)node);
        }else if(node instanceof Equal){
            return visit((Equal)node);
        }else if(node instanceof TruthParenthesis){
            return visit((TruthParenthesis)node);
        }else if(node instanceof And){
            return visit((And) node);
        }
        return null;
    }
    public abstract T visit(TruthParenthesis node);
    public abstract T visit(TurnLeftStatement node);
    public abstract T visit(TurnRightStatement node);
    public T visit(Type node){
        if(node instanceof INTDCL){
            return visit((INTDCL) node);
        }else if(node instanceof FLOATDCL){
            return visit((FLOATDCL) node);
        }else if(node instanceof TRUTHDCL){
            return visit((TRUTHDCL) node);
        }else if(node instanceof TEXTDCL){
            return visit((TEXTDCL) node);
        }
        return null;
    }
    public abstract T visit(Upto node);
    public abstract T visit(WhileStatement node);
    public abstract T visit(Equal node);
}