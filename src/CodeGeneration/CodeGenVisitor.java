package CodeGeneration;

import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

public class CodeGenVisitor extends BasicAbstractNodeVisitor {

    Emitter emitter = new Emitter();

    GenSetup setup = new GenSetup();

    public CodeGenVisitor() {
        super();
    }

    @Override
    public Object visit(And and) throws NoSuchMethodException{
        visit((visitable) and.getLhs());
        emitter.emit( " && ");
        visit((visitable)and.getRhs());
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis arithmParenthesis) throws NoSuchMethodException{
        emitter.emit("(");
        // only needs to visit left cause of sketchy implementation
        visit((visitable) arithmParenthesis.getLeft());
        emitter.emit(")");
        return null;
    }

    //TODO fix pls
    @Override
    public Object visit(ArrayAssignment arrayAssignment)throws NoSuchMethodException {
        return null;
    }

    // TODO weird, the array size is not know.
    @Override
    public Object visit(ArrayDeclaration arrayDeclaration)throws NoSuchMethodException {
        return null;
    }

    //TODO Fix pls
    @Override
    public Object visit(ArrayElementAddStatement arrayElementAddStatement)throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ArrayIndexStatement arrayIndexStatement)throws NoSuchMethodException {
        visit(arrayIndexStatement.getId());
        emitter.emit("[");
        visit((visitable)arrayIndexStatement.getNumber());
        emitter.emit("];\n");
        return null;
    }

    @Override
    public Object visit(Divide divide)throws NoSuchMethodException {
        visit((visitable)divide.getLeft());
        emitter.emit(" / ");
        visit((visitable)divide.getRight());
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(Downto downto)throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DriveStatement driveStatement) throws NoSuchMethodException{
        emitter.emit(" digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, HIGH);\n delay(");
        visit((visitable)driveStatement.getVal());
        emitter.emit(");\ndigitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }

    @Override
    public Object visit(ElseIfStatement elseIfStatement)throws NoSuchMethodException {
        emitter.emit("else if(");
        visit((visitable)elseIfStatement.getTruth());
        emitter.emit("){");
        visit(elseIfStatement.getStms());
        emitter.emit("} ");
        return null;
    }

    @Override
    public Object visit(ElseThenStmt elseThenStmt) throws NoSuchMethodException{
        emitter.emit("else{\n");
        visit(elseThenStmt.getStms());
        emitter.emit("}\n");
        return null;
    }

    // Assuming ValueAssignment is only for ints and floats.
    @Override
    public Object visit(ValueAssignment valueAssignment) throws NoSuchMethodException{
        visit(valueAssignment.getId());
        emitter.emit(" = ");
        visit((visitable)valueAssignment.getValue());
        return null;
    }

    @Override
    public Object visit(FLOATDCL floatdcl) throws NoSuchMethodException{
        emitter.emit("float ");

        return null;
    }

    @Override
    public Object visit(FloatDeclaration floatDeclaration)throws NoSuchMethodException {
        emitter.emit("float ");
        visit(floatDeclaration.getId());
        return null;
    }

    @Override
    public Object visit(FloatLiteral floatLiteral) throws NoSuchMethodException{
        emitter.emit(floatLiteral.getSpelling());
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(FromKeyword fromKeyword)throws NoSuchMethodException {
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(FromStatement fromStatement)throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(FunctionCall functionCall) throws NoSuchMethodException{
        visit(functionCall.getFunctionName());

        // Visit each argument in the functionCall argument list
        for(Value val : functionCall.getArguments()){
            visit((visitable)val);
        }
        return null;
    }

    @Override
    public Object visit(FunctionDeclaration functionDeclaration)throws NoSuchMethodException {
        visit(functionDeclaration.getFunctionName());
        for(Value val : functionDeclaration.getParameters()){
            visit((visitable)val);
        }
        visit(functionDeclaration.getStmtBody());
        return null;
    }

    @Override
    public Object visit(GreaterThan greaterThan) throws NoSuchMethodException{
        visit((visitable)greaterThan.getLhs());
        emitter.emit(" > ");
        visit((visitable)greaterThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Identifier identifier) throws NoSuchMethodException{
        emitter.emit(identifier.getSpelling());
        return null;
    }

    @Override
    public Object visit(IfStatement ifStatement) throws NoSuchMethodException{

        emitter.emit("if(");
        visit((visitable)ifStatement.getTruthVal());
        emitter.emit("){\n");
        visit(ifStatement.getTrueStm());

        if(!(ifStatement.getElseifs() == null)){
            for(ElseIfStatement elifStmt : ifStatement.getElseifs()) {
                visit(elifStmt);
            }
        }

        visit(ifStatement.getElsethen());
        return null;
    }

    @Override
    public Object visit(INTDCL intdcl) throws NoSuchMethodException{
        emitter.emit("int ");
        return null;
    }

    @Override
    public Object visit(IntDeclaration intDeclaration) throws NoSuchMethodException{
        emitter.emit("int ");
        visit(intDeclaration.getId());
        return null;
    }

    @Override
    public Object visit(IntegerLiteral integerLiteral) throws NoSuchMethodException{
        emitter.emit(integerLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(LessThan lessThan) throws NoSuchMethodException{
        visit((visitable)lessThan.getLhs());
        emitter.emit(" < ");
        visit((visitable)lessThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Minus minus) throws NoSuchMethodException{
        visit((visitable)minus.getLeft());
        emitter.emit(" - ");
        visit((visitable)minus.getRight());
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(MultipleElementAssign multipleElementAssign) throws NoSuchMethodException{

        return null;
    }

    @Override
    public Object visit(Not not) throws NoSuchMethodException{
        emitter.emit("!");
        visit((visitable)not.getTruth());
        return null;
    }

    @Override
    public Object visit(Or or) throws NoSuchMethodException{
        visit((visitable)or.getLhs());
        emitter.emit(" || ");
        visit((visitable)or.getRhs());
        return null;
    }

    @Override
    public Object visit(Parameter parameter) throws NoSuchMethodException{
        visit((visitable)parameter.getParamType());
        visit(parameter.getId());
        return null;
    }

    @Override
    public Object visit(Plus plus) throws NoSuchMethodException{
        visit((visitable)plus.getLeft());
        emitter.emit(" + ");
        visit((visitable)plus.getRight());
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(RepeatStatement repeatStatement) throws NoSuchMethodException{
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration returnFunctionDeclaration) throws NoSuchMethodException{
        visit((visitable)returnFunctionDeclaration.getReturnType());
        visit(returnFunctionDeclaration.getFunctionName());
        emitter.emit("(");
        for(Value val : returnFunctionDeclaration.getParameters()){
            visit((visitable)val);
        }
        emitter.emit("){\n");
        visit(returnFunctionDeclaration.getStmtBody());
        emitter.emit("}\n");
        return null;
    }

    @Override
    public Object visit(ReturnStatement returnStatement) throws NoSuchMethodException{
        emitter.emit("return ");
        visit((visitable)returnStatement.getVal());
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(SingleElementAssign singleElementAssign) throws NoSuchMethodException{
        return null;
    }

    @Override
    public Object visit(StatementList statementList) throws NoSuchMethodException{

        emitter.emit(setup.getInitialCode());

        for(Statement s : statementList.getStmts()){
            visit((visitable)s);
        }

        emitter.emit("}\n");

        emitter.closeFile();
        return null;
    }

    //TODO Fixes senere
    @Override
    public Object visit(TextAssignment textAssignment) throws NoSuchMethodException{

        return null;
    }

    @Override
    public Object visit(TEXTDCL textdcl) throws NoSuchMethodException{
        emitter.emit(textdcl.getId().getSpelling());
        return null;
    }

    //TODO weird when the size of the array is not yet known.
    @Override
    public Object visit(TextDeclaration textDeclaration)throws NoSuchMethodException {
        return null;
    }


    @Override
    public Object visit(TextLiteral textLiteral) throws NoSuchMethodException{
        emitter.emit(textLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(Times times) throws NoSuchMethodException{
        visit((visitable)times.getLeft());
        emitter.emit(" * ");
        visit((visitable)times.getRight());
        return null;
    }

    @Override
    public Object visit(TRUTHDCL truthdcl) throws NoSuchMethodException{
        emitter.emit(truthdcl.getId().getSpelling());
        return null;
    }

    @Override
    public Object visit(TruthDeclaration truthDeclaration) throws NoSuchMethodException{
        emitter.emit("int ");
        visit(truthDeclaration.getId());
        return null;
    }

    @Override
    public Object visit(TruthLiteral truthLiteral) throws NoSuchMethodException{
        emitter.emit(truthLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(TruthParenthesis truthParenthesis) throws NoSuchMethodException{
        emitter.emit("(");
        visit((visitable)truthParenthesis.getExpr());
        emitter.emit(")");
        return null;
    }

    @Override
    public Object visit(TurnLeftStatement turnLeftStatement) throws NoSuchMethodException{
        emitter.emit("digitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, HIGH);\ndelay(");
        visit((visitable)turnLeftStatement.getVal());
        emitter.emit(");\ndigitalWrite(lefMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }

    @Override
    public Object visit(TurnRightStatement turnRightStatement) throws NoSuchMethodException{
        emitter.emit("digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, LOW);\ndelay(");
        visit((visitable)turnRightStatement.getVal());
        emitter.emit(");\ndigitalWrite(lefMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }


    //TODO Fix
    @Override
    public Object visit(Upto upto)throws NoSuchMethodException {
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(WhileStatement whileStatement)throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Equal equal) throws NoSuchMethodException{
        visit((visitable)equal.getLhs());
        emitter.emit(" = ");
        visit((visitable)equal.getRhs());
        return null;
    }
}