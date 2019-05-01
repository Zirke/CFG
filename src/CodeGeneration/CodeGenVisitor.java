package CodeGeneration;

import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

public class CodeGenVisitor extends BasicAbstractNodeVisitor {

    private Emitter emitter;

    public CodeGenVisitor(Emitter emitter) {
        super();
        this.emitter = emitter;
    }

    @Override
    public Object visit(And and) throws NoSuchMethodException{
        visit(and.getLhs());
        emitter.emit( " && ");
        visit(and.getRhs());
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis arithmParenthesis)throws NoSuchMethodException {
        emitter.emit("(");
        // only needs to visit left because of sketchy implementation
        visit(arithmParenthesis.getLeft());
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
    public Object visit(ArrayIndexStatement arrayIndexStatement) throws NoSuchMethodException{
        visit(arrayIndexStatement.getId());
        emitter.emit("[");
        visit(arrayIndexStatement.getNumber());
        emitter.emit("];\n");
        return null;
    }

    @Override
    public Object visit(Divide divide)throws NoSuchMethodException {
        visit(divide.getLeft());
        emitter.emit(" / ");
        visit(divide.getRight());
        emitter.emit(";\n");
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(Downto downto)throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DriveStatement driveStatement)throws NoSuchMethodException {
        emitter.emit(" digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, HIGH);\n delay(");
        visit(driveStatement.getVal());
        emitter.emit(");\ndigitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }

    @Override
    public Object visit(ElseIfStatement elseIfStatement) throws NoSuchMethodException{
        emitter.emit("else if(");
        visit(elseIfStatement.getTruth());
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
        visit(valueAssignment.getValue());
        return null;
    }

    @Override
    public Object visit(FLOATDCL floatdcl) throws NoSuchMethodException{
        emitter.emit("float ");

        return null;
    }

    @Override
    public Object visit(FloatDeclaration floatDeclaration) throws NoSuchMethodException{
        emitter.emit("float ");
        visit(floatDeclaration.getId());
        if(floatDeclaration.getStm() != null){
            emitter.emit(" = ");
            visit(floatDeclaration.getStm());
        }
        emitter.emit(";\n");
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
        emitter.emit("(");
        // Visit each argument in the functionCall argument list
        for(Value val : functionCall.getArguments()){
            visit(val);
        }
        emitter.emit(");\n");
        return null;
    }

    @Override
    public Object visit(FunctionDeclaration functionDeclaration)throws NoSuchMethodException {
        /* emitter.emit("void ");
        visit(functionDeclaration.getFunctionName());
        for(Value val : functionDeclaration.getParameters()){
            visit(val);
        }
        visit(functionDeclaration.getStmtBody());
        */
        return null;
    }

    @Override
    public Object visit(GreaterThan greaterThan) throws NoSuchMethodException{
        visit(greaterThan.getLhs());
        emitter.emit(" > ");
        visit(greaterThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Identifier identifier) throws NoSuchMethodException{
        emitter.emit(identifier.getSpelling());
        return null;
    }

    @Override
    public Object visit(IfStatement ifStatement)throws NoSuchMethodException {

        emitter.emit("if(");
        visit(ifStatement.getTruthVal());
        emitter.emit("){\n");
        visit(ifStatement.getTrueStm());
        emitter.emit("}\n");

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
        emitter.emit(" int ");
        return null;
    }

    @Override
    public Object visit(IntDeclaration intDeclaration) throws NoSuchMethodException{
        emitter.emit("int ");
        visit(intDeclaration.getId());
        if(intDeclaration.getStm() != null){
            emitter.emit(" = ");
            visit(intDeclaration.getStm());
        }
        emitter.emit(";\n");
        return null;
    }

    @Override
    public Object visit(IntegerLiteral integerLiteral) throws NoSuchMethodException{
        emitter.emit(integerLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(LessThan lessThan) throws NoSuchMethodException{
        visit(lessThan.getLhs());
        emitter.emit(" < ");
        visit(lessThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Minus minus) throws NoSuchMethodException{
        visit(minus.getLeft());
        emitter.emit(" - ");
        visit(minus.getRight());
        emitter.emit(";\n");
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
        visit(not.getTruth());
        return null;
    }

    @Override
    public Object visit(Or or) throws NoSuchMethodException{
        visit(or.getLhs());
        emitter.emit(" || ");
        visit(or.getRhs());
        return null;
    }

    @Override
    public Object visit(Parameter parameter) throws NoSuchMethodException{
        visit(parameter.getParamType());
        visit(parameter.getId());
        return null;
    }

    @Override
    public Object visit(Plus plus) throws NoSuchMethodException{
        visit(plus.getLeft());
        emitter.emit(" + ");
        visit(plus.getRight());
        emitter.emit(";\n");
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(RepeatStatement repeatStatement)throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration returnFunctionDeclaration) throws NoSuchMethodException{
        /* visit(returnFunctionDeclaration.getReturnType());
        visit(returnFunctionDeclaration.getFunctionName());
        emitter.emit("(");
        for(Value val : returnFunctionDeclaration.getParameters()){
            visit(val);
        }
        emitter.emit("){\n");
        visit(returnFunctionDeclaration.getStmtBody());
        emitter.emit("}\n");
        */
        return null;
    }

    @Override
    public Object visit(ReturnStatement returnStatement) throws NoSuchMethodException{
        emitter.emit("return ");
        visit(returnStatement.getVal());
        emitter.emit(";\n");
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(SingleElementAssign singleElementAssign) {

        return null;
    }

    @Override
    public Object visit(StatementList statementList) throws NoSuchMethodException{

        //emitter.emit(setup.getInitialCode());

        for(Statement s : statementList.getStmts()){
            visit(s);
        }

        //emitter.emit("}\n");

        //emitter.closeFile();
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
    public Object visit(Times times)throws NoSuchMethodException {
        visit(times.getLeft());
        emitter.emit(" * ");
        visit(times.getRight());
        emitter.emit(";\n");
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
        if(truthDeclaration.getExpr() != null){
            emitter.emit(" = ");
            visit(truthDeclaration.getExpr());
        }
        emitter.emit(";\n");
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
        visit(truthParenthesis.getExpr());
        emitter.emit(")");
        return null;
    }

    @Override
    public Object visit(TurnLeftStatement turnLeftStatement) throws NoSuchMethodException{
        emitter.emit("digitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, HIGH);\ndelay(");
        visit(turnLeftStatement.getVal());
        emitter.emit(");\ndigitalWrite(lefMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }

    @Override
    public Object visit(TurnRightStatement turnRightStatement) throws NoSuchMethodException{
        emitter.emit("digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, LOW);\ndelay(");
        visit(turnRightStatement.getVal());
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
    public Object visit(Equal equal)throws NoSuchMethodException {
        visit(equal.getLhs());
        emitter.emit(" = ");
        visit(equal.getRhs());
        return null;
    }

    public void setup(){
        GenSetup setup = new GenSetup();
        emitter.emit(setup.getInitialCode());
    }
}
