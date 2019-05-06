package symbolTable;

import Exceptions.SemanticCheckerExceptions.DuplicateDeclaration;
import Exceptions.SemanticCheckerExceptions.IncompatibleTypes;
import Exceptions.SemanticCheckerExceptions.IncorrectOperatorUse;
import Exceptions.SemanticCheckerExceptions.VariableMissing;
import Exceptions.SemanticException;
import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

public class SymbolTableVisitor extends BasicAbstractNodeVisitor<Object> {
    public SymbolTable symbolTable = new SymbolTable();

    //both left hand side and right hand side of the and node has to be truth literals
    @Override
    public Object visit(And node) throws NoSuchMethodException {
        if (visit((visitable) node.getLhs()) instanceof TruthLiteral && visit((visitable) node.getRhs()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node, node.getLhs().toString(), node.getRhs().toString(),node.getLineNumber());
        }
        return null;
    }

    //array assignment, checks if the variable exists in the symbol table then compares the type of the variable with
    // what is trying to be assigned.
    @Override
    public Object visit(ArrayAssignment arrayAssignment) throws NoSuchMethodException {
        Type variableType = variableTypeCheck(arrayAssignment.getId().getSpelling(),arrayAssignment.getLineNumber());
        AbstractNode expressionType = (AbstractNode) visit((visitable) arrayAssignment.getValue());

        if (!(variableType.getClass().equals(expressionType.getClass()) ||
                variableType instanceof INTDCL && expressionType instanceof IntegerLiteral ||
                variableType instanceof FLOATDCL && expressionType instanceof FloatLiteral ||
                variableType instanceof TRUTHDCL && expressionType instanceof TruthLiteral ||
                variableType instanceof TEXTDCL && expressionType instanceof TextLiteral)) {
            errorCallArrayIncompatibleTypes(arrayAssignment.getValue(), arrayAssignment.getId().getSpelling(),arrayAssignment.getLineNumber());
        }
        return null;
    }

    //goes into the parenthesis and visits the nodes in there
    @Override
    public Object visit(ArithmParenthesis node) throws NoSuchMethodException {
        return visit((visitable) node.getLeft());
    }


    @Override
    public Object visit(ArrayDeclaration node) throws NoSuchMethodException {
        AbstractNode value = (AbstractNode) visit((visitable) node.getValues());

        if (value != null) {
            AbstractNode type = node.getType();
            if (!(type instanceof INTDCL && value instanceof IntegerLiteral ||
                    type instanceof FLOATDCL && value instanceof FloatLiteral ||
                    type instanceof TRUTHDCL && value instanceof TruthLiteral ||
                    type instanceof TEXTDCL && value instanceof TextLiteral)) {
                errorCallArrayIncompatibleTypes(node.getValues(), node.getId().getSpelling(),node.getLineNumber());
            }
        }

        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), node.getType()));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    //TODO This one gets used when the syntax (arrayId element var is inum) while the other one gets used when the syntax is (arrayId element inum is inum)
    @Override
    public Object visit(ArrayElementAddStatement node) throws NoSuchMethodException {
        AbstractNode elementNumber = (AbstractNode) visit((visitable) node.getElementNumber());
        AbstractNode valueElement = (AbstractNode) visit((visitable) node.getValue());

        if (!(elementNumber instanceof INTDCL)) {
            try {
                throw new IncompatibleTypes("line: " + node.getLineNumber()  + " -- " + " Element index number is not an integer");
            } catch (SemanticException e) {
                System.err.println(e);
                System.exit(0);
            }
        }
        symbolTable.getIdTable().get(elementNumber);
        //arraySize(Integer.valueOf(node.getElementNumber())));
        return valueElement;
    }

    //TODO
    @Override
    public Object visit(ArrayIndexStatement node) throws NoSuchMethodException {
        if(!(visit((visitable)node.getNumber()) instanceof IntegerLiteral)){
            errorCallIntegerIncompatibleTypes(node,node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(Divide node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRight());

        return evaluateArithmetic(node, leftValue, rightValue);
    }

    @Override
    public Object visit(Downto node) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DriveStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getVal()) instanceof IntegerLiteral || visit((visitable)node.getVal()) instanceof INTDCL)) {
            errorCallIntegerIncompatibleTypes(node,node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(ElseIfStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getTruth()) instanceof TruthLiteral || (visit((visitable) node.getTruth()) instanceof TRUTHDCL))) {
            errorCallTruthIncompatibleTypes(node.getLineNumber());
        } else {
            symbolTable.openScope();
            visit(node.getStms());
            symbolTable.closeScope();
        }
        return null;
    }

    @Override
    public Object visit(ElseThenStmt node) throws NoSuchMethodException {
        symbolTable.openScope();
        visit(node.getStms());
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ValueAssignment node) throws NoSuchMethodException {
        Type variableType = variableTypeCheck(node.getId().getSpelling(),node.getLineNumber());
        AbstractNode expressionType = (AbstractNode) visit((visitable) node.getValue());

        if (!(variableType.getClass().equals(expressionType.getClass()) ||
                variableType instanceof ast.INTDCL && expressionType instanceof IntegerLiteral ||
                variableType instanceof ast.FLOATDCL && expressionType instanceof FloatLiteral ||
                variableType instanceof ast.TRUTHDCL && expressionType instanceof TruthLiteral)) {
            errorCallAssignIncompatibleTypes(node.getValue(), node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(FLOATDCL node) {
        return null;
    }

    @Override
    public Object visit(FloatDeclaration node) throws NoSuchMethodException {
        if (node.getStm() != null && !(visit((visitable) node.getStm()) instanceof FloatLiteral)) {
            errorCallAssignIncompatibleTypes(node.getStm(), node.getId().getSpelling(),node.getLineNumber());
        }
        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new FLOATDCL()));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(FloatLiteral node) {
        return new FloatLiteral(node.getSpelling());
    }

    @Override
    public Object visit(FromKeyword node) throws NoSuchMethodException {
        return null;
    }

    //TODO
    @Override
    public Object visit(FromStatement node) throws NoSuchMethodException {
        symbolTable.openScope();
        visit(node.getStmts());
        symbolTable.closeScope();
        return null;
    }

    //TODO
    @Override
    public Object visit(FunctionCall node) throws NoSuchMethodException {
        return null;
    }


    //function declaration for a function with no return, opens a scope within the function if the name declaration does not exist in the symbol table
    @Override
    public Object visit(FunctionDeclaration node) throws NoSuchMethodException {
            if (!isInSymbolTable(node.getFunctionName().getSpelling())) {

            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), null));

            for (Parameter parameter : node.getParameters()) {
                visit(parameter);
            }

            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else {
            errorCallDuplicateDeclaration(node.getFunctionName().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    //greater than can be performed on ints and floats, returns as a truthliteral
    @Override
    public Object visit(GreaterThan node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLhs());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRhs());

        return evaluateTruth(node, leftValue, rightValue);
    }

    //firstly checks if the identifier exists in the symbol table then returns the type of literal the identifier is
    @Override
    public Object visit(Identifier node) throws NoSuchMethodException {
        if (!isInSymbolTable(node.getSpelling())) {
            errorCallVariableMissing(node.getSpelling(),node.getLineNumber());
        }
        return symbolTable.getIdTable().get(node.getSpelling()).getType();
    }

    //the condition in the if statement has to be of the type truthliteral
    //a new scope is opened for the if statements and afterwards closed, the elseif statements are visited and lastly else then
    @Override
    public Object visit(IfStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getTruthVal()) instanceof TruthLiteral || (visit((visitable) node.getTruthVal()) instanceof TRUTHDCL))) {
            errorCallTruthIncompatibleTypes(node.getLineNumber());
        } else {
            symbolTable.openScope();
            visit(node.getTrueStm());
            symbolTable.closeScope();
            if (!(node.getElseifs() == null)) {
                for (ElseIfStatement elseIfStatement : node.getElseifs()) {
                    visit(elseIfStatement);
                }
            }
            visit(node.getElsethen());
        }
        return null;
    }

    @Override
    public Object visit(INTDCL node) throws NoSuchMethodException {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a integerliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(IntDeclaration node) throws NoSuchMethodException {
        if (node.getStm() != null && !(visit((visitable)node.getStm()) instanceof IntegerLiteral || visit((visitable)node.getStm()) instanceof INTDCL)) {
            errorCallAssignIncompatibleTypes(node.getStm(), node.getId().getSpelling(),node.getLineNumber());
        }


        if (!(isInSymbolTable(node.getId().getSpelling()))){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new INTDCL()));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    // returns integerliteral
    @Override
    public Object visit(IntegerLiteral node) throws NoSuchMethodException {
        return new IntegerLiteral(node.getSpelling());
    }

    // less than can be performed on ints and floats, returns as a truthliteral
    @Override
    public Object visit(LessThan node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLhs());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRhs());

        return evaluateTruth(node, leftValue, rightValue);
    }

    //minus can only be performed on ints and floats, returns float if they are mixed
    @Override
    public Object visit(Minus node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRight());

        return evaluateArithmetic(node, leftValue, rightValue);
    }

    //TODO
    @Override
    public Object visit(MultipleElementAssign node) throws NoSuchMethodException {
        Value firstElement = null;
        if (!node.getElements().isEmpty()) {
            firstElement = node.getElements().get(0);
            for (Value x : node.getElements()) {

                if (!(x.getClass().equals(firstElement.getClass()))) {
                    try {
                        throw new IncompatibleTypes("line: " + node.getLinenumber() + " -- " + " Array elements are not of the same types");
                    } catch (SemanticException e) {
                        System.err.println(e);
                        System.exit(0);
                    }
                }
            }
        }
        return firstElement;
    }

    //has to be of type truth literal
    @Override
    public Object visit(Not node) throws NoSuchMethodException {
        if (visit((visitable) node.getTruth()) instanceof TruthLiteral || visit((visitable)node.getTruth()) instanceof TRUTHDCL) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node, node.getTruth().toString(), null,node.getLineNumber());
        }
        return null;
    }

    //both left and right hands side has to be a truthliteral
    @Override
    public Object visit(Or node) throws NoSuchMethodException {
        if (visit((visitable) node.getLhs()) instanceof TruthLiteral && visit((visitable) node.getRhs()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node, node.getLhs().toString(), null,node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(Parameter node) throws NoSuchMethodException {
        AbstractNode typeOfDCL = node.getParamType();

        if (typeOfDCL instanceof INTDCL) {
            visit(new IntDeclaration(node.getId(), null));
        } else if (typeOfDCL instanceof FLOATDCL) {
            visit(new FloatDeclaration(node.getId(), null));
        } else if (typeOfDCL instanceof TRUTHDCL) {
            visit(new TruthDeclaration(node.getId(), null));
        } else if (typeOfDCL instanceof TEXTDCL) {
            visit(new TextDeclaration(node.getId(), null));
        }
        return null;
    }

    //plus can be applied to ints, floats and text.
    //int + int = int, any float mixed with ints equals floats and text + text = text
    @Override
    public Object visit(Plus node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRight());

        if (leftValue instanceof TextLiteral) {
            if (rightValue instanceof TextLiteral) {
                return new TextLiteral(node.getSpelling());
            } else {
                errorCallIncorrectOperatorUse(node, node.getLeft().toString(), node.getRight().toString(),node.getLineNumber());
            }
        }
        return evaluateArithmetic(node, leftValue, rightValue);
    }

    //the expression in the "until" has to be of type truthliteral
    // if so the statements in the body will be visited and a new scope will be opened, afterwards closed.
    @Override
    public Object visit(RepeatStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getExpr()) instanceof TruthLiteral)) {
            errorCallTruthIncompatibleTypes(node.getLineNumber());
        } else {
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }

    //checks if the variable name for the function is taken, then goes through all the parameters and lastly goes through the body. Also opens and closes scopes.
    @Override
    public Object visit(ReturnFunctionDeclaration node) throws NoSuchMethodException {
        if (!isInSymbolTable(node.getFunctionName().getSpelling())) {
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), node.getReturnType()));
            for (Parameter parameter : node.getParameters()) {
                visit(parameter);
            }
            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else {
            errorCallDuplicateDeclaration(node.getFunctionName().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    //TODO
    @Override
    public Object visit(ReturnStatement node) throws NoSuchMethodException {
        return visit((visitable) node.getVal()).getClass();
    }

    @Override
    public Object visit(SingleElementAssign node) throws NoSuchMethodException {
        AbstractNode elementNumber = (AbstractNode) visit((visitable) node.getElementNr());
        AbstractNode valueElement = (AbstractNode) visit((visitable) node.getAssignemntVal());

        if (!(elementNumber instanceof IntegerLiteral)) {
            try {
                throw new IncompatibleTypes("line: " + node.getLinenumber() + " -- " + " Element index number is not an integer");
            } catch (SemanticException e) {
                System.err.println(e);
                System.exit(0);
            }
        }
        return valueElement;
    }

    //visit every statement in the statementlist
    @Override
    public Object visit(StatementList node) throws NoSuchMethodException {
        for (Statement stm : node.getStmts()) {
            visit(stm);
        }
        return null;
    }

    @Override
    public Object visit(TextAssignment node) throws NoSuchMethodException {
        Type variableType = variableTypeCheck(node.getId().getSpelling(),node.getLineNumber());
        AbstractNode expressionType = (AbstractNode) visit((visitable) node.getText());

        if (!(variableType.getClass().equals(expressionType.getClass()) ||
                variableType instanceof TEXTDCL && expressionType instanceof TextLiteral)) {
            errorCallAssignIncompatibleTypes(node.getText(), node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(TEXTDCL node) throws NoSuchMethodException {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a textliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(TextDeclaration node) throws NoSuchMethodException {
        if (node.getVal() != null && !(visit((visitable) node.getVal()) instanceof TextLiteral || visit((visitable)node.getVal()) instanceof TEXTDCL)) {
            errorCallAssignIncompatibleTypes(node.getVal(), node.getId().getSpelling(),node.getLineNumber());
        }

        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TEXTDCL()));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    // returns textliteral
    @Override
    public Object visit(TextLiteral node) throws NoSuchMethodException {
        return new TextLiteral(node.getSpelling());
    }

    // multiplicity can only be applied to floats and ints, if ints and floats are mixed the result is of type floatliteral
    @Override
    public Object visit(Times node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRight());

        return evaluateArithmetic(node, leftValue, rightValue);
    }

    @Override
    public Object visit(TRUTHDCL node) throws NoSuchMethodException {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a truthliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    //TODO assigning big compound statements
    @Override
    public Object visit(TruthDeclaration node) throws NoSuchMethodException {
        if (node.getExpr() != null && !(visit((visitable) node.getExpr()) instanceof TruthLiteral || visit((visitable)node.getExpr()) instanceof TRUTHDCL)) {
            errorCallAssignIncompatibleTypes(node.getExpr(), node.getId().getSpelling(),node.getLineNumber());
        }
        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TRUTHDCL()));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(),node.getLineNumber());
        }
        return null;
    }

    // returns truthliteral
    @Override
    public Object visit(TruthLiteral node) throws NoSuchMethodException {
        return new TruthLiteral(node.getSpelling());
    }

    // goes to the expression within the parenthesis
    @Override
    public Object visit(TruthParenthesis node) throws NoSuchMethodException {
        return visit((visitable) node.getExpr());
    }

    // turn left statement only takes ints as a parameter
    @Override
    public Object visit(TurnLeftStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getVal()) instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node,node.getLineNumber());
        }
        return null;
    }

    // turn right statement only takes ints as a parameter
    @Override
    public Object visit(TurnRightStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getVal()) instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node,node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(Upto node) throws NoSuchMethodException {
        return null;
    }

    //the expression has to be a type truthliteral
    @Override
    public Object visit(WhileStatement node) throws NoSuchMethodException {
        if (!(visit((visitable) node.getExpr()) instanceof TruthLiteral)) {
            errorCallTruthIncompatibleTypes(node.getLineNumber());
        } else {
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }

    //equal can be performed on floats ints and truth
    @Override
    public Object visit(Equal node) throws NoSuchMethodException {
        AbstractNode leftValue = (AbstractNode) visit((visitable) node.getLhs());
        AbstractNode rightValue = (AbstractNode) visit((visitable) node.getRhs());


        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof TruthLiteral && rightValue instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node, node.getLhs().toString(), node.getRhs().toString(),node.getLineNumber());
        }
        return null;
    }

    /*
    * Error calls for variety of type issues; list goes; IncorrectOperatorUse
    *                                                    DuplicateDeclaration
    *                                                    VariableMissing
    *                                                    IncompatibleTypes
     */
    private void errorCallIncorrectOperatorUse(AbstractNode node, String leftHand, String rightHand, int linenumber) {
        try {
            if (rightHand != null) {
                throw new IncorrectOperatorUse("line: " + linenumber + " -- " + " Operator " + node.getClass().getName() + " cannot be applied to " + leftHand + " & " + rightHand);
            } else {
                throw new IncorrectOperatorUse("line: " + linenumber + " -- " + " Operator " + node.getClass().getName() + " cannot be applied to " + leftHand);
            }
        } catch (SemanticException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    private void errorCallDuplicateDeclaration(String identifier, int linenumber) {
        try {
            throw new DuplicateDeclaration("line: " + linenumber + " -- " + " Variable " + identifier + " is already declared");
        } catch (SemanticException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    private void errorCallVariableMissing(String identifier,int linenumber) {
        try {
            throw new VariableMissing("line: " + linenumber + " -- " + " Variable " + identifier + " is not declared");
        } catch (SemanticException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    private void errorCallAssignIncompatibleTypes(Value node, String identifier, int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " + node.getClass().getName() + " cannot be assigned to " + identifier);
        } catch (SemanticException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    private void errorCallArrayIncompatibleTypes(ArrayAsmValue node, String identifier, int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " +node.getClass().getName() + " cannot be assigned to " + identifier);
        } catch (SemanticException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    private void errorCallTruthIncompatibleTypes(int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " + " Expression is not a truth expression");
        } catch (SemanticException e) {
            System.err.println(e.getLocalizedMessage());
            System.exit(0);
        }
    }

    private void errorCallIntegerIncompatibleTypes(AbstractNode node, int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " + node + " needs an integer as input");
        } catch (SemanticException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    // When mixing floats and ints it is evaluated as a float, if int and int it is considered an int
    private Object evaluateArithmetic(AbstractNode node, AbstractNode leftValue, AbstractNode rightValue) {
        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new IntegerLiteral("integer");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral("float");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new FloatLiteral("float");
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral("float");
        } else {
            errorCallIncorrectOperatorUse(node, leftValue.toString(), rightValue.toString(),node.getLineNumber());
        }
        return null;
    }
    //used for greater and less than, where floats and ints can be mixed, the expression returns as a truth value
    private Object evaluateTruth(AbstractNode node, AbstractNode leftValue, AbstractNode rightValue) {
        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral("truth");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral("truth");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral("truth");
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral("truth");
        } else {
            errorCallIncorrectOperatorUse(node, leftValue.toString(), rightValue.toString(),node.getLineNumber());
        }
        return null;
    }

    //checks if variable is in symbol table, returns the type of the node.
    private Type variableTypeCheck(String identifier,int linenumber) {
        if (!(isInSymbolTable(identifier))) {
            errorCallVariableMissing(identifier,linenumber);
        }
        return symbolTable.getIdTable().get(identifier).getType();
    }

    //is in symbol table
    private boolean isInSymbolTable(String nodeName) {
        return symbolTable.getIdTable().containsKey(nodeName);
    }
}