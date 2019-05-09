package astVisitor;

import ast.*;

abstract public class BasicAbstractNodeVisitor<T> extends AbstractNodeVisitor  {

    public abstract T visit(And node) throws NoSuchMethodException;
    public abstract T visit(ArithmParenthesis node)throws NoSuchMethodException;
    public abstract T visit(ArrayAssignment node)throws NoSuchMethodException;
    public abstract T visit(ArrayDeclaration node)throws NoSuchMethodException;
    public abstract T visit(ArrayElementAddStatement node)throws NoSuchMethodException;
    public abstract T visit(ArrayIndexStatement node)throws NoSuchMethodException;
    public abstract T visit(Divide node)throws NoSuchMethodException;
    public abstract T visit(Downto node)throws NoSuchMethodException;
    public abstract T visit(DriveStatement node)throws NoSuchMethodException;
    public abstract T visit(ElseIfStatement node)throws NoSuchMethodException;
    public abstract T visit(ElseThenStmt node)throws NoSuchMethodException;
    public abstract T visit(ValueAssignment node)throws NoSuchMethodException;
    public abstract T visit(FLOATDCL node)throws NoSuchMethodException;
    public abstract T visit(FloatDeclaration node)throws NoSuchMethodException;
    public abstract T visit(FloatLiteral node)throws NoSuchMethodException;
    public abstract T visit(FromKeyword node)throws NoSuchMethodException;
    public abstract T visit(FromStatement node)throws NoSuchMethodException;
    public abstract T visit(FunctionCall node)throws NoSuchMethodException;
    public abstract T visit(FunctionDeclaration node)throws NoSuchMethodException;
    public abstract T visit(GreaterThan node)throws NoSuchMethodException;
    public abstract T visit(Identifier node)throws NoSuchMethodException;
    public abstract T visit(IfStatement node)throws NoSuchMethodException;
    public abstract T visit(INTDCL node)throws NoSuchMethodException;
    public abstract T visit(IntDeclaration node)throws NoSuchMethodException;
    public abstract T visit(IntegerLiteral node)throws NoSuchMethodException;
    public abstract T visit(LessThan node)throws NoSuchMethodException;
    public abstract T visit(Minus node)throws NoSuchMethodException;
    public abstract T visit(MultipleElementAssign node)throws NoSuchMethodException;
    public abstract T visit(Not node)throws NoSuchMethodException;
    public abstract T visit(Or node)throws NoSuchMethodException;
    public abstract T visit(Parameter node)throws NoSuchMethodException;
    public abstract T visit(Plus node)throws NoSuchMethodException;
    public abstract T visit(RepeatStatement node)throws NoSuchMethodException;
    public abstract T visit(ReturnFunctionDeclaration node)throws NoSuchMethodException;
    public abstract T visit(ReturnStatement node)throws NoSuchMethodException;
    public abstract T visit(SingleElementAssign node)throws NoSuchMethodException;
    public abstract T visit(StatementList node)throws NoSuchMethodException;
    public abstract T visit(TextAssignment node)throws NoSuchMethodException;
    public abstract T visit(TEXTDCL node)throws NoSuchMethodException;
    public abstract T visit(TextDeclaration node)throws NoSuchMethodException;
    public abstract T visit(TextLiteral node)throws NoSuchMethodException;
    public abstract T visit(Times node)throws NoSuchMethodException;
    public abstract T visit(TRUTHDCL node)throws NoSuchMethodException;
    public abstract T visit(TruthDeclaration node)throws NoSuchMethodException;
    public abstract T visit(TruthLiteral node)throws NoSuchMethodException;
    public abstract T visit(TruthParenthesis node) throws NoSuchMethodException;
    public abstract T visit(TurnLeftStatement node)throws NoSuchMethodException;
    public abstract T visit(TurnRightStatement node)throws NoSuchMethodException;
    public abstract T visit(WaitStatement node)throws NoSuchMethodException;
    public abstract T visit(Upto node) throws NoSuchMethodException;
    public abstract T visit(WhileStatement node) throws NoSuchMethodException;
    public abstract T visit(Equal node) throws NoSuchMethodException;
}
