public abstract class AbstractNodeVisitor<T>{
    public abstract T visit(AbstractNode node);
    public abstract T visit(And node);
    public abstract T visit(ArithmOperator node);
    public abstract T visit(ArithmParenthesis node);
    public abstract T visit(ArrayAssignment node);
    public abstract T visit(ArrayDeclaration node);
    public abstract T visit(ArrayElementAddStatement node);
    public abstract T visit(ArrayIndexStatement node);
<<<<<<< Updated upstream
    public abstract T visit(ArrayLiteral node);
=======
>>>>>>> Stashed changes
    public abstract T visit(Divide node);
    public abstract T visit(Downto node);
    public abstract T visit(DriveStatement node);
    public abstract T visit(ElseIfStatement node);
    public abstract T visit(ElseThenStmt node);
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
<<<<<<< Updated upstream
    public abstract T visit(Operator node);
=======
>>>>>>> Stashed changes
    public abstract T visit(Or node);
    public abstract T visit(Parameter node);
    public abstract T visit(Plus node);
    public abstract T visit(RepeatStatement node);
    public abstract T visit(ReturnFunctionDeclaration node);
    public abstract T visit(ReturnStatement node);
    public abstract T visit(SingleElementAssign node);
    public abstract T visit(Statement node);
    public abstract T visit(StatementList node);
<<<<<<< Updated upstream
    public abstract T visit(Terminal node);
=======
>>>>>>> Stashed changes
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
    public abstract T visit(ValueAssignment node);
    public abstract T visit(WhileStatement node);
}