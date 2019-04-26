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
    };
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
        }else if(node instanceof Parameter) {
            return visit((Parameter)node);
        }
        return null;
    };
    public abstract T visit(And node);
    public abstract T visit(ArithmOperator node);
    public abstract T visit(ArithmParenthesis node);
    public abstract T visit(ArrayAssignment node);
    public abstract T visit(ArrayAsmValue node);
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
    public abstract T visit(Statement node);
    public abstract T visit(StatementList node);
    public abstract T visit(TextAssignment node);
    public abstract T visit(TEXTDCL node);
    public abstract T visit(TextDeclaration node);
    public abstract T visit(TextLiteral node);
    public abstract T visit(Times node);
    public abstract T visit(TRUTHDCL node);
    public abstract T visit(TruthDeclaration node);
    public abstract T visit(TruthLiteral node);
    public abstract T visit(TruthOperator node);
    public abstract T visit(TruthParenthesis node);
    public abstract T visit(TurnLeftStatement node);
    public abstract T visit(TurnRightStatement node);
    public abstract T visit(Type node);
    public abstract T visit(Upto node);
    public abstract T visit(WhileStatement node);
    public abstract T visit(Equal node);
}