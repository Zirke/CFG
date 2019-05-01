package CodeGeneration;

import ast.*;
import astVisitor.AbstractNodeVisitor;

public class CodeGenVisitor extends AbstractNodeVisitor {

    private Emitter emitter;

    public CodeGenVisitor(Emitter emitter) {
        super();
        this.emitter = emitter;
    }

    @Override
    public Object visit(And and) {
        visit(and.getLhs());
        emitter.emit( " && ");
        visit(and.getRhs());
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis arithmParenthesis) {
        emitter.emit("(");
        // only needs to visit left because of sketchy implementation
        visit(arithmParenthesis.getLeft());
        emitter.emit(")");
        return null;
    }

    //TODO fix pls
    @Override
    public Object visit(ArrayAssignment arrayAssignment) {
        return null;
    }

    // TODO weird, the array size is not know.
    @Override
    public Object visit(ArrayDeclaration arrayDeclaration) {
        return null;
    }

    //TODO Fix pls
    @Override
    public Object visit(ArrayElementAddStatement arrayElementAddStatement) {
        return null;
    }

    @Override
    public Object visit(ArrayIndexStatement arrayIndexStatement) {
        visit(arrayIndexStatement.getId());
        emitter.emit("[");
        visit(arrayIndexStatement.getNumber());
        emitter.emit("];\n");
        return null;
    }

    @Override
    public Object visit(Divide divide) {
        visit(divide.getLeft());
        emitter.emit(" / ");
        visit(divide.getRight());
        emitter.emit(";\n");
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(Downto downto) {
        return null;
    }

    @Override
    public Object visit(DriveStatement driveStatement) {
        emitter.emit(" digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, HIGH);\n delay(");
        visit(driveStatement.getVal());
        emitter.emit(");\ndigitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }

    @Override
    public Object visit(ElseIfStatement elseIfStatement) {
        emitter.emit("else if(");
        visit(elseIfStatement.getTruth());
        emitter.emit("){");
        visit(elseIfStatement.getStms());
        emitter.emit("} ");
        return null;
    }

    @Override
    public Object visit(ElseThenStmt elseThenStmt) {
        emitter.emit("else{\n");
        visit(elseThenStmt.getStms());
        emitter.emit("}\n");
        return null;
    }

    // Assuming ValueAssignment is only for ints and floats.
    @Override
    public Object visit(ValueAssignment valueAssignment) {
        visit(valueAssignment.getId());
        emitter.emit(" = ");
        visit(valueAssignment.getValue());
        return null;
    }

    @Override
    public Object visit(FLOATDCL floatdcl) {
        emitter.emit("float ");

        return null;
    }

    @Override
    public Object visit(FloatDeclaration floatDeclaration) {
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
    public Object visit(FloatLiteral floatLiteral) {
        emitter.emit(floatLiteral.getSpelling());
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(FromKeyword fromKeyword) {
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(FromStatement fromStatement) {
        return null;
    }

    @Override
    public Object visit(FunctionCall functionCall) {
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
    public Object visit(FunctionDeclaration functionDeclaration) {
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
    public Object visit(GreaterThan greaterThan) {
        visit(greaterThan.getLhs());
        emitter.emit(" > ");
        visit(greaterThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Identifier identifier) {
        emitter.emit(identifier.getSpelling());
        return null;
    }

    @Override
    public Object visit(IfStatement ifStatement) {

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
    public Object visit(INTDCL intdcl) {
        emitter.emit(" int ");
        return null;
    }

    @Override
    public Object visit(IntDeclaration intDeclaration) {
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
    public Object visit(IntegerLiteral integerLiteral) {
        emitter.emit(integerLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(LessThan lessThan) {
        visit(lessThan.getLhs());
        emitter.emit(" < ");
        visit(lessThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Minus minus) {
        visit(minus.getLeft());
        emitter.emit(" - ");
        visit(minus.getRight());
        emitter.emit(";\n");
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(MultipleElementAssign multipleElementAssign) {

        return null;
    }

    @Override
    public Object visit(Not not) {
        emitter.emit("!");
        visit(not.getTruth());
        return null;
    }

    @Override
    public Object visit(Or or) {
        visit(or.getLhs());
        emitter.emit(" || ");
        visit(or.getRhs());
        return null;
    }

    @Override
    public Object visit(Parameter parameter) {
        visit(parameter.getParamType());
        visit(parameter.getId());
        return null;
    }

    @Override
    public Object visit(Plus plus) {
        visit(plus.getLeft());
        emitter.emit(" + ");
        visit(plus.getRight());
        emitter.emit(";\n");
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(RepeatStatement repeatStatement) {
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration returnFunctionDeclaration) {
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
    public Object visit(ReturnStatement returnStatement) {
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
    public Object visit(StatementList statementList) {

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
    public Object visit(TextAssignment textAssignment) {

        return null;
    }

    @Override
    public Object visit(TEXTDCL textdcl) {
        emitter.emit(textdcl.getId().getSpelling());
        return null;
    }

    //TODO weird when the size of the array is not yet known.
    @Override
    public Object visit(TextDeclaration textDeclaration) {
        return null;
    }


    @Override
    public Object visit(TextLiteral textLiteral) {
        emitter.emit(textLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(Times times) {
        visit(times.getLeft());
        emitter.emit(" * ");
        visit(times.getRight());
        emitter.emit(";\n");
        return null;
    }

    @Override
    public Object visit(TRUTHDCL truthdcl) {
        emitter.emit(truthdcl.getId().getSpelling());
        return null;
    }

    @Override
    public Object visit(TruthDeclaration truthDeclaration) {
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
    public Object visit(TruthLiteral truthLiteral) {
        emitter.emit(truthLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(TruthParenthesis truthParenthesis) {
        emitter.emit("(");
        visit(truthParenthesis.getExpr());
        emitter.emit(")");
        return null;
    }

    @Override
    public Object visit(TurnLeftStatement turnLeftStatement) {
        emitter.emit("digitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, HIGH);\ndelay(");
        visit(turnLeftStatement.getVal());
        emitter.emit(");\ndigitalWrite(lefMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }

    @Override
    public Object visit(TurnRightStatement turnRightStatement) {
        emitter.emit("digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, LOW);\ndelay(");
        visit(turnRightStatement.getVal());
        emitter.emit(");\ndigitalWrite(lefMotor, LOW);\ndigitalWrite(rightMotor, LOW);\n");
        return null;
    }


    //TODO Fix
    @Override
    public Object visit(Upto upto) {
        return null;
    }

    //TODO Fix
    @Override
    public Object visit(WhileStatement whileStatement) {
        return null;
    }

    @Override
    public Object visit(Equal equal) {
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
