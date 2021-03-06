package CodeGeneration;

import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

import java.util.HashSet;
import java.util.Random;

public class CodeGenVisitor extends BasicAbstractNodeVisitor {

    private Emitter emitter;
    private boolean isFunctionGen;
    private boolean dclInBlocks;
    private HashSet<String> noDuplicateStrings = new HashSet<>();

    public CodeGenVisitor(Emitter emitter, boolean isFunctionGen) {
        super();
        this.emitter = emitter;
        this.isFunctionGen = isFunctionGen;
    }

    private String uniqueString(){
        String generatedString;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(10);
        for (int i = 0; i < 8; i++) {
            int randomLimitedInt = 97 + (int)
                    (random.nextFloat() * (122 - 97 + 1));
            buffer.append((char) randomLimitedInt);
        }
        generatedString = buffer.toString();
        while(!noDuplicateStrings.add(generatedString)){
            for (int i = 0; i < 1; i++) {
                int randomLimitedInt = 97 + (int)
                        (random.nextFloat() * (122 - 97 + 1));
                buffer.append((char) randomLimitedInt);
            }
            generatedString = buffer.toString();
        }
        return generatedString;
    }

    @Override
    public Object visit(And and) throws NoSuchMethodException {
        visit(and.getLhs());
        emitter.emit(" && ");
        visit(and.getRhs());
        return null;
    }

    public Object visit(Append append) throws NoSuchMethodException{
        emitter.emit("stringConcat(");
        visit(append.getLeft());
        emitter.emit(", ");
        visit(append.getRight());
        emitter.emit(")");
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis arithmParenthesis) throws NoSuchMethodException {
        emitter.emit("(");
        // only needs to visit left
        visit(arithmParenthesis.getLeft());
        emitter.emit(")");
        return null;
    }

    //TODO fix pls
    @Override
    public Object visit(ArrayAssignment arrayAssignment) throws NoSuchMethodException {
        visit(arrayAssignment.getId());
        emitter.emit("[(");
        visit(arrayAssignment.getValue());

        return null;
    }

    // The array size is set statically when translating to C.
    // Current size is 128 but not checked if the source array is bigger.
    @Override
    public Object visit(ArrayDeclaration arrayDeclaration) throws NoSuchMethodException {
        if (!(arrayDeclaration.getType() instanceof TEXTDCL)){
            visit(arrayDeclaration.getType());
            emitter.emit("*");
            visit(arrayDeclaration.getId());
            emitter.emit(" = (");
            visit(arrayDeclaration.getType());
            emitter.emit("*) calloc(128, sizeof(");
            visit(arrayDeclaration.getType());
            emitter.emit("))");
        }else{
            emitter.emit("char** ");
            visit(arrayDeclaration.getId());
            emitter.emit(" = (char**) calloc(128, sizeof(char*))");
        }

        return null;
    }

    //TODO This does not work?
    @Override
    public Object visit(ArrayElementAddStatement arrayElementAddStatement) throws NoSuchMethodException {
        visit(arrayElementAddStatement.getArrayName());
        emitter.emit("[(");
        visit(arrayElementAddStatement.getElementNumber());
        emitter.emit(")-1] = ");
        visit(arrayElementAddStatement.getValue());
        return null;
    }

    @Override
    public Object visit(ArrayIndexStatement arrayIndexStatement) throws NoSuchMethodException {
        visit(arrayIndexStatement.getId());
        emitter.emit("[(");
        visit(arrayIndexStatement.getNumber());
        emitter.emit(")-1]");
        return null;
    }

    @Override
    public Object visit(Divide divide) throws NoSuchMethodException {
        visit(divide.getLeft());
        emitter.emit(" / ");
        visit(divide.getRight());
        return null;
    }


    @Override
    public Object visit(Downto downto) throws NoSuchMethodException {
        return "downto";
    }

    @Override
    public Object visit(DriveStatement driveStatement) throws NoSuchMethodException {
        emitter.emit("\ndigitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, HIGH);\ndelay(1000*(");
        visit(driveStatement.getVal());
        emitter.emit("));\ndigitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, LOW)");
        return null;
    }

    @Override
    public Object visit(ElseIfStatement elseIfStatement) throws NoSuchMethodException {
        emitter.emit("else if(");
        visit(elseIfStatement.getTruth());
        emitter.emit("){\n");
        visit(elseIfStatement.getStms());
        emitter.emit("} ");
        return null;
    }

    @Override
    public Object visit(ElseThenStmt elseThenStmt) throws NoSuchMethodException {
        emitter.emit("else{\n");
        visit(elseThenStmt.getStms());
        emitter.emit("}\n");
        return null;
    }

    @Override
    public String visit(ValueAssignment valueAssignment) throws NoSuchMethodException {
        visit(valueAssignment.getId());
        emitter.emit(" = ");
        visit(valueAssignment.getValue());
        return null;
    }

    @Override
    public Object visit(DECIMALDCL floatdcl) {
        emitter.emit("float ");

        return null;
    }

    @Override
    public Object visit(DecimalDeclaration decimalDeclaration) throws NoSuchMethodException {
        emitter.emit("float ");
        visit(decimalDeclaration.getId());
        if (decimalDeclaration.getValue() != null) {
            emitter.emit(" = ");
            visit(decimalDeclaration.getValue());
        }
        return null;
    }

    @Override
    public Object visit(DecimalLiteral decimalLiteral) throws NoSuchMethodException {
        emitter.emit(decimalLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(FromKeyword fromKeyword) throws NoSuchMethodException {
        return null;
    }

    //Works by generating a random string with 8 length if from value is just an integer in TRUN
    @Override
    public Object visit(FromStatement fromStatement) throws NoSuchMethodException {
        boolean fromValInt = false;
        boolean isUpto = false;
        String generatedString = null;

        //Check if upto or downto
        if (fromStatement.getUptoOrDownto().spelling.equals("upto")) {
            isUpto = true;
        }

        //Check if from value is an integer or variable, if it is an integer, create random string for int name in C
        if (fromStatement.getFromVal() instanceof IntegerLiteral) {
            fromValInt = true;
            generatedString = uniqueString();
        }

        //Start formatting
        emitter.emit("for (");

        //Init expression
        if (fromValInt) {
            emitter.emit("int " + generatedString + " = ");
            visit(fromStatement.getFromVal());
        } else {
            visit(fromStatement.getFromVal());
        }
        emitter.emit("; ");

        //Continue/Update expression if from value is integer
        if (fromValInt) {
            emitter.emit(generatedString);
            if (isUpto) {
                emitter.emit(" < ");
                visit(fromStatement.getToVal());
                emitter.emit("; " + generatedString + "++");
            } else {
                emitter.emit(" > ");
                visit(fromStatement.getToVal());
                emitter.emit("; " + generatedString + "--");
            }
        }
        //Continue/Update expression if from value is variable
        else {
            visit(fromStatement.getFromVal());
            if (isUpto) {
                emitter.emit(" < ");
                visit(fromStatement.getToVal());
                emitter.emit("; ");
                visit(fromStatement.getFromVal());
                emitter.emit("++");
            } else {
                emitter.emit(" > ");
                visit(fromStatement.getToVal());
                emitter.emit("; ");
                visit(fromStatement.getFromVal());
                emitter.emit("--");
            }
        }

        //Open for loop body and print statements + close body and newline
        emitter.emit(") {\n");
        emitter.emit("\t");
        visit(fromStatement.getStmts());
        emitter.emit("}");
        return null;
    }

    @Override
    public Object visit(FunctionCall functionCall) throws NoSuchMethodException {
        visit(functionCall.getFunctionName());
        emitter.emit("(");
        // Visit each argument in the functionCall argument list
        for (int i = 0; i < functionCall.getArguments().size(); i++) {
            visit(functionCall.getArguments().get(i));
            if (functionCall.getArguments().size() > 1 && functionCall.getArguments().size() != i + 1) {
                emitter.emit(",");
            }
        }
        emitter.emit(")");
        return null;
    }

    @Override
    public Object visit(FunctionDeclaration functionDeclaration) throws NoSuchMethodException {
        emitter.emit("void ");
        visit(functionDeclaration.getFunctionName());
        emitter.emit("(");
        for (int i = 0; i < functionDeclaration.getParameters().size(); i++) {
            visit(functionDeclaration.getParameters().get(i));
            if (functionDeclaration.getParameters().size() > 1 && functionDeclaration.getParameters().size() != i + 1) {
                emitter.emit(",");
            }
        }
        emitter.emit(") {\n");
        this.isFunctionGen = false;
        visit(functionDeclaration.getStmtBody());
        emitter.emit("\n}");
        this.isFunctionGen = true;

        return null;
    }

    @Override
    public Object visit(GreaterThan greaterThan) throws NoSuchMethodException {
        visit(greaterThan.getLhs());
        emitter.emit(" > ");
        visit(greaterThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Identifier identifier) throws NoSuchMethodException {
        emitter.emit(identifier.getSpelling());
        return null;
    }

    @Override
    public Object visit(IfStatement ifStatement) throws NoSuchMethodException {

        emitter.emit("if(");
        visit(ifStatement.getTruthVal());
        emitter.emit("){\n");
        visit(ifStatement.getTrueStm());
        emitter.emit("}\n");

        if (!(ifStatement.getElseifs() == null)) {
            for (ElseIfStatement elifStmt : ifStatement.getElseifs()) {
                visit(elifStmt);
            }
        }
        if (!ifStatement.getElsethen().getStms().getStmts().isEmpty()) {
            visit(ifStatement.getElsethen());
        }
        return null;
    }

    @Override
    public Object visit(INTDCL intdcl) throws NoSuchMethodException {
        emitter.emit("int ");
        return null;
    }

    @Override
    public Object visit(IntDeclaration intDeclaration) throws NoSuchMethodException {
        emitter.emit("int ");
        visit(intDeclaration.getId());
        if (intDeclaration.getValue() != null) {
            emitter.emit(" = ");
            visit(intDeclaration.getValue());
        }

        return null;
    }

    @Override
    public Object visit(IntegerLiteral integerLiteral) throws NoSuchMethodException {
        emitter.emit(integerLiteral.getSpelling());
        return null;
    }

    @Override
    public Object visit(LessThan lessThan) throws NoSuchMethodException {
        visit(lessThan.getLhs());
        emitter.emit(" < ");
        visit(lessThan.getRhs());
        return null;
    }

    @Override
    public Object visit(Minus minus) throws NoSuchMethodException {
        visit(minus.getLeft());
        emitter.emit(" - ");
        visit(minus.getRight());
        return null;
    }



    @Override
    public Object visit(Not not) throws NoSuchMethodException {
        emitter.emit("!");
        visit(not.getTruth());
        return null;
    }

    @Override
    public Object visit(Or or) throws NoSuchMethodException {
        visit(or.getLhs());
        emitter.emit(" || ");
        visit(or.getRhs());
        return null;
    }

    @Override
    public Object visit(Parameter parameter) throws NoSuchMethodException {
        visit(parameter.getParamType());
        visit(parameter.getId());
        return null;
    }

    @Override
    public Object visit(PauseStatement pauseStatement) throws NoSuchMethodException {
        emitter.emit("delay(1000*(");
        visit(pauseStatement.getVal());
        emitter.emit("))");
        return null;
    }

    @Override
    public Object visit(Plus plus) throws NoSuchMethodException {
        visit(plus.getLeft());
        emitter.emit(" + ");
        visit(plus.getRight());

        return null;
    }

    @Override
    public Object visit(RepeatStatement repeatStatement) throws NoSuchMethodException {
        emitter.emit("do {\n");
        visit(repeatStatement.getStmts());
        emitter.emit("} while (!(");
        visit(repeatStatement.getExpr());
        emitter.emit("))");
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration returnFunctionDeclaration) throws NoSuchMethodException {
        visit(returnFunctionDeclaration.getReturnType());
        visit(returnFunctionDeclaration.getFunctionName());
        emitter.emit("(");
        for (int i = 0; i < returnFunctionDeclaration.getParameters().size(); i++) {
            visit(returnFunctionDeclaration.getParameters().get(i));
            if (returnFunctionDeclaration.getParameters().size() > 1 && returnFunctionDeclaration.getParameters().size() != i + 1) {
                emitter.emit(",");
            }
        }
        emitter.emit("){\n");
        this.isFunctionGen = false;
        visit(returnFunctionDeclaration.getStmtBody());
        emitter.emit("}\n");
        this.isFunctionGen = true;
        return null;
    }

    @Override
    public Object visit(ReturnStatement returnStatement) throws NoSuchMethodException {
        emitter.emit("return ");
        visit(returnStatement.getVal());
        return null;
    }

    @Override
    public Object visit(SingleElementAssign singleElementAssign) throws NoSuchMethodException {
        visit(singleElementAssign.getElementNr());
        emitter.emit(")-1] = ");
        visit(singleElementAssign.getAssignemntVal());
        return null;
    }

    @Override
    public Object visit(StatementList statementList) throws NoSuchMethodException {

        //emitter.emit(setupInSetup.getInitialCodeForSetup());

        for (Statement s : statementList.getStmts()) {
            if (!isFunctionGen) {
                if ((!(s instanceof FunctionDeclaration) && !(s instanceof IntDeclaration)
                        && !(s instanceof TextDeclaration) && !(s instanceof DecimalDeclaration)
                        && !(s instanceof TruthDeclaration) && !(s instanceof ArrayDeclaration)) || dclInBlocks) {
                    if(s instanceof WhileStatement || s instanceof FromStatement || s instanceof IfStatement){
                        dclInBlocks = true;
                    }
                    visit(s);
                    if(s instanceof WhileStatement || s instanceof FromStatement || s instanceof IfStatement){
                        dclInBlocks = false;
                    }
                    if (!(s instanceof WhileStatement || s instanceof FromStatement || s instanceof IfStatement)) {
                        emitter.emit(";\n");
                    } else {
                        emitter.emit("\n");
                    }
                }
            } else if (isFunctionGen) {
                if ((s instanceof FunctionDeclaration || s instanceof IntDeclaration
                        || s instanceof TextDeclaration || s instanceof DecimalDeclaration
                        || s instanceof TruthDeclaration || s instanceof ArrayDeclaration) || dclInBlocks) {
                    if(s instanceof FunctionDeclaration){
                        dclInBlocks = true;
                    }
                    visit(s);
                    if(s instanceof FunctionDeclaration){
                        dclInBlocks = false;
                    }
                    if(s instanceof FunctionDeclaration){
                        emitter.emit("\n");
                    } else {
                        emitter.emit(";\n");
                    }
                }
            }

        }

        //emitter.emit("}\n");

        //emitter.closeFileForSetup();
        return null;
    }

    @Override
    public Object visit(TextAssignment textAssignment) throws NoSuchMethodException {
        visit(textAssignment.getId());
        emitter.emit(" = ");
        visit(textAssignment.getText());
        return null;
    }

    @Override
    public Object visit(TEXTDCL textdcl) throws NoSuchMethodException {
        emitter.emit(textdcl.getId().getSpelling());
        return null;
    }

    @Override
    public Object visit(TextDeclaration textDeclaration) throws NoSuchMethodException {
        emitter.emit("char *");
        visit(textDeclaration.getId());
        if (textDeclaration.getVal() != null) {
            emitter.emit(" = ");
            visit(textDeclaration.getVal());
        } else{
            emitter.emit(" = (char*)calloc(128, sizeof(char))");
        }

        return null;
    }


    @Override
    public Object visit(TextLiteral textLiteral) throws NoSuchMethodException {

        emitter.emit(textLiteral.getSpelling());
        return new TextLiteral(textLiteral.getSpelling());
    }

    @Override
    public Object visit(Times times) throws NoSuchMethodException {
        visit(times.getLeft());
        emitter.emit(" * ");
        visit(times.getRight());
        return null;

    }

    @Override
    public Object visit(TRUTHDCL truthdcl) throws NoSuchMethodException {
        emitter.emit("int ");
        return null;
    }

    @Override
    public Object visit(TruthDeclaration truthDeclaration) throws NoSuchMethodException {
        emitter.emit("int ");
        visit(truthDeclaration.getId());
        if (truthDeclaration.getExpr() != null) {
            emitter.emit(" = ");
            visit(truthDeclaration.getExpr());
        }
        return null;
    }

    @Override
    public Object visit(TruthLiteral truthLiteral) throws NoSuchMethodException {
        if (truthLiteral.getSpelling().equals("true")) {
            emitter.emit("1");
        } else if (truthLiteral.getSpelling().equals("false")) {
            emitter.emit("0");
        } else {
            emitter.emit(truthLiteral.getSpelling());
        }
        return null;
    }

    @Override
    public Object visit(TruthParenthesis truthParenthesis) throws NoSuchMethodException {
        emitter.emit("(");
        visit(truthParenthesis.getExpr());
        emitter.emit(")");
        return null;
    }

    @Override
    public Object visit(TurnLeftStatement turnLeftStatement) throws NoSuchMethodException {
        emitter.emit("digitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, HIGH);\ndelay(1000*(");
        visit(turnLeftStatement.getVal());
        emitter.emit("));\ndigitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, LOW)");
        return null;
    }

    @Override
    public Object visit(TurnRightStatement turnRightStatement) throws NoSuchMethodException {
        emitter.emit("digitalWrite(leftMotor, HIGH);\ndigitalWrite(rightMotor, LOW);\ndelay(1000*(");
        visit(turnRightStatement.getVal());
        emitter.emit("));\ndigitalWrite(leftMotor, LOW);\ndigitalWrite(rightMotor, LOW)");
        return null;
    }


    @Override
    public Object visit(Upto upto) throws NoSuchMethodException {
        return "upto";
    }

    @Override
    public Object visit(WhileStatement whileStatement) throws NoSuchMethodException {
        emitter.emit("while(");
        visit(whileStatement.getExpr());
        emitter.emit(") {\n");
        visit(whileStatement.getStmts());
        emitter.emit("\n}");
        return null;
    }

    @Override
    public Object visit(Equal equal) throws NoSuchMethodException {
        if(!(equal.getLhs() instanceof TextLiteral)){
            visit(equal.getLhs());
            emitter.emit(" == ");
            visit(equal.getRhs());
        } else {
            emitter.emit("!strcmp(");
            visit(equal.getLhs());
            emitter.emit(", ");
            visit(equal.getRhs());
            emitter.emit(")");
        }
        return null;
    }

    @Override
    public Object visit(UnaryMinus node) throws NoSuchMethodException {
        emitter.emit("-");
        visit(node.getLeft());
        return null;
    }


    public void setupConcat() {
        GenSetup stringSetup = new GenSetup();
        emitter.emit(stringSetup.stringConcat());
    }

    public void setupConsts(){
        GenSetup constSetup = new GenSetup();
        emitter.emit(constSetup.getConsts());
    }

    public void setupInSetup() {
        GenSetup setup = new GenSetup();
        emitter.emit(setup.getInitialCodeForSetup());
    }

    public void setupInLoop() {
        GenSetup setup = new GenSetup();
        emitter.emit(setup.getInitialCodeForLoop());
    }

    public void closeSetupEmitter() {
        emitter.emit("}\n" +
                "void loop(){}\n");
    }

    public void closeLoopEmitter() {
        emitter.emit("}\n");
    }
}
