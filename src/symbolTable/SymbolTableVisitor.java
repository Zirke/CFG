package symbolTable;

import Exceptions.SemanticCheckerExceptions.*;
import Exceptions.SemanticException;
import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class SymbolTableVisitor extends BasicAbstractNodeVisitor<Object> {
    SymbolTable symbolTable = new SymbolTable();

    //both left hand side and right hand side of the and node has to be truth literals
    @Override
    public Object visit(And node) throws NoSuchMethodException {
        if (visit(node.getLhs()) instanceof TruthLiteral && visit(node.getRhs()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node.getClass().getName(), node.getLhs().toString(), node.getRhs().toString(), node.getLineNumber());
        }
        return null;
    }

    //array assignment, checks if the variable exists in the symbol table then compares the type of the variable with
    // what is trying to be assigned.
    @Override
    public Object visit(ArrayAssignment arrayAssignment) throws NoSuchMethodException {
        Value variableType = variableTypeCheck(arrayAssignment.getId().getSpelling(), arrayAssignment.getLineNumber());
        Value expressionType = (Value) visit(arrayAssignment.getValue());

        if (!(variableType.getClass().equals(expressionType.getClass()))) {
            errorCallArrayIncompatibleTypes(arrayAssignment.getValue(), arrayAssignment.getId().getSpelling(), arrayAssignment.getLineNumber());
        }

        symbolTable.getIdTable().get(arrayAssignment.getId().getSpelling()).setNodes(arrayAssignment);
        return null;
    }

    //goes into the parenthesis and visits the nodes in there
    @Override
    public Object visit(ArithmParenthesis node) throws NoSuchMethodException {
        return visit(node.getLeft());
    }


    @Override
    public Object visit(ArrayDeclaration node) throws NoSuchMethodException {
        Value vType = typeCasting(node.getType());
        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), vType));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(), node.getLineNumber());
        }
        symbolTable.getIdTable().get(node.getId().getSpelling()).setNodes(node);
        return null;
    }

    @Override
    public Object visit(ArrayElementAddStatement node) throws NoSuchMethodException {
        Value elementNumber = (Value) visit(node.getElementNumber());
        Value valueElement = (Value) visit(node.getValue());

        if (!(elementNumber instanceof IntegerLiteral)) {
            try {
                throw new IncompatibleTypes("line: " + node.getLineNumber() + " -- " + " Element index number is not an integer");
            } catch (SemanticException e) {
                err.println("IncompatibleTypes " + e.getLocalizedMessage());
                exit(0);
            }
        }

        return valueElement;
    }

    @Override
    public Object visit(ArrayIndexStatement node) throws NoSuchMethodException {
        Value value = (Value) visit(node.getNumber());
        if (!(value instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node.getClass().getName(), node.getLineNumber());
        } else if(Integer.valueOf(((IntegerLiteral) value).getSpelling()) > 128 || Integer.valueOf(((IntegerLiteral) value).getSpelling()) < 0){
            try{
                throw new OutOfBounds("line: "+ node + " -- " + " is out of bounds");
            }catch (SemanticException e){
                err.println("OutOfBounds " + e.getLocalizedMessage());
                exit(0);
            }
        }
        return visit(node.getId());
    }

    @Override
    public Object visit(Divide node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLeft());
        Value rightValue = (Value) visit(node.getRight());

        return evaluateArithmetic(node.getClass().getName(), leftValue, rightValue, node.getLineNumber());
    }

    @Override
    public Object visit(Downto node) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DriveStatement node) throws NoSuchMethodException {

        out.println((Value) visit(node.getVal()));
        if (!(visit(node.getVal()) instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node.getClass().getName().substring(4), node.getLineNumber());
        }
        return null;
    }

    //checks if the value is a truth literal, then opens a scope and goes through the statements, then closes the scope
    @Override
    public Object visit(ElseIfStatement node) throws NoSuchMethodException {
        if (!(visit(node.getTruth()) instanceof TruthLiteral)) {
            errorCallTruthIncompatibleTypes(node.getLineNumber());
        } else {
            symbolTable.openScope();
            visit(node.getStms());
            symbolTable.closeScope();
        }
        return null;
    }

    //opens scopes and visits statements then closes scopes.
    @Override
    public Object visit(ElseThenStmt node) throws NoSuchMethodException {
        symbolTable.openScope();
        visit(node.getStms());
        symbolTable.closeScope();
        return null;
    }

    //assigns the value of ints, floats or truths, it is firstly type checked.
        @Override
        public Object visit(ValueAssignment node) throws NoSuchMethodException {
            Value variableType = variableTypeCheck(node.getId().getSpelling(), node.getLineNumber());
            Value expressionType = (Value) visit(node.getValue());

            if (!(variableType.getClass().equals(expressionType.getClass()))) {
                errorCallAssignIncompatibleTypes(node.getValue().getClass().getName(), node.getId().getSpelling(), node.getLineNumber());
            }
            symbolTable.getIdTable().get(node.getId().getSpelling()).setNodes(node);
            symbolTable.getIdTable().get(node.getId().getSpelling()).setValue(expressionType); ///TODO EVALUATE VIISTOR

            return null;
        }

    @Override
    public Object visit(FLOATDCL node) throws NoSuchMethodException {
        return null;
    }

    //float declaration checks if the declaration has any value and that has to be a float literal. afterwards it is put in the symbol table
    @Override
    public Object visit(FloatDeclaration node) throws NoSuchMethodException {
        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new FloatLiteral(node.getId().getSpelling())));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(), node.getLineNumber());
        }
        if (node.getStm() != null) {
            Value value = (Value) visit(node.getStm());
            symbolTable.getIdTable().get(node.getId().getSpelling()).setNodes(node);
            symbolTable.getIdTable().get(node.getId().getSpelling()).setValue(node.getStm()); ///TODO EVALUATE VIISTOR
            if (!(value instanceof FloatLiteral)) {
                errorCallAssignIncompatibleTypes(value.getClass().getName().substring(4, value.getClass().getName().length() - 7), node.getId().getSpelling(), node.getLineNumber());
            }
        }
        return null;
    }

    //returns as a float literal
    @Override
    public Object visit(FloatLiteral node) {
        return new FloatLiteral(node.getSpelling());
    }

    @Override
    public Object visit(FromKeyword node) throws NoSuchMethodException {
        return null;
    }

    //from statement checks if the values are of type integer literal
    @Override
    public Object visit(FromStatement node) throws NoSuchMethodException {
        Value fromValue = (Value) visit(node.getFromVal());
        Value toValue = (Value) visit(node.getToVal());

        if (!(fromValue instanceof IntegerLiteral && toValue instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node.getClass().getName(), node.getLineNumber());
        }

        symbolTable.openScope();
        visit(node.getStmts());
        symbolTable.closeScope();
        return null;
    }

    //function call checks if the parameters are the same type as the ones in the function name also checks if the right amount of parameters are present
    @Override
    public Object visit(FunctionCall node) throws NoSuchMethodException {
        List<Value> parameters = symbolTable.getIdTable().get(node.getFunctionName().getSpelling()).getParameters();
        if (parameters != null) {
            if (parameters.size() == node.getArguments().size()) {
                for (int i = 0; i < node.getArguments().size(); i++) {
                    if (!(node.getArguments().get(i).getClass().equals(parameters.get(i).getClass()))) {
                        errorCallFunctionCallIncorrectTypes(node.getClass().getName().substring(4), node.getLineNumber());
                    }
                }
            } else {
                errorCallTooFewParameters(node.getClass().getName().substring(4), node.getLineNumber());
            }
        }
        return symbolTable.getIdTable().get(node.getFunctionName().getSpelling()).getType();
    }

    //function declaration for a function with no return, opens a scope within the function if the name declaration does not exist in the symbol table
    @Override
    public Object visit(FunctionDeclaration node) throws NoSuchMethodException {
        List<Value> parameters = new ArrayList<>();
        if (!isInSymbolTable(node.getFunctionName().getSpelling())) {
            for (Parameter parameter : node.getParameters()) {
                parameters.add((Value) visit(parameter));
            }
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), null, parameters));

            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else {
            errorCallDuplicateDeclaration(node.getFunctionName().getSpelling(), node.getLineNumber());
        }
        return null;
    }

    //greater than can be performed on ints and floats, returns as a truth literal
    @Override
    public Object visit(GreaterThan node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLhs());
        Value rightValue = (Value) visit(node.getRhs());

        return evaluateTruth(node.getClass().getName(), leftValue, rightValue, node.getLineNumber());
    }

    //firstly checks if the identifier exists in the symbol table then returns the type of literal the identifier is
    @Override
    public Object visit(Identifier node) throws NoSuchMethodException {
        if (!isInSymbolTable(node.getSpelling())) {
            errorCallVariableMissing(node.getSpelling(), node.getLineNumber());
        }
        if (symbolTable.getIdTable().get(node.getSpelling()).getNodes().size() > 1) {
            return symbolTable.getIdTable().get(node.getSpelling()).getType();
        }else {
            try{
                throw new UninitializedVariable("line " + node.getLineNumber() + " -- " + node.getSpelling() + " is not initialized");
            }catch (SemanticException e){
                err.println("UninitializedVariable " + e.getLocalizedMessage());
            }
        }
        return null;
    }

    //the condition in the if statement has to be of the type truth literal
    //a new scope is opened for the if statements and afterwards closed, the elseif statements are visited and lastly else then
    @Override
    public Object visit(IfStatement node) throws NoSuchMethodException {
        if (!(visit(node.getTruthVal()) instanceof TruthLiteral)) {
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
        if (!(isInSymbolTable(node.getId().getSpelling()))) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new IntegerLiteral(node.getId().getSpelling())));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(), node.getLineNumber());
        }
        if (node.getStm() != null) {
            symbolTable.getIdTable().get(node.getId().getSpelling()).setNodes(node);
            symbolTable.getIdTable().get(node.getId().getSpelling()).setValue(node.getStm()); ///TODO EVALUATE VIISTOR
            Value value = (Value) visit(node.getStm());
            if (!(value instanceof IntegerLiteral)) {
                if (value instanceof FloatLiteral) {
                    errorCallAssignIncompatibleTypes("Decimal", node.getId().getSpelling(), node.getLineNumber());
                } else {
                    errorCallAssignIncompatibleTypes(value.getClass().getName().substring(4, value.getClass().getName().length() - 7), node.getId().getSpelling(), node.getLineNumber());
                }
            }
        }
        return new IntegerLiteral(node.getId().getSpelling());
    }

    // returns integer literal
    @Override
    public Object visit(IntegerLiteral node) throws NoSuchMethodException {
        return new IntegerLiteral(node.getSpelling());
    }

    // less than can be performed on ints and floats, returns as a truth literal
    @Override
    public Object visit(LessThan node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLhs());
        Value rightValue = (Value) visit(node.getRhs());

        return evaluateTruth(node.getClass().getName(), leftValue, rightValue, node.getLineNumber());
    }

    //minus can only be performed on ints and floats, returns float if they are mixed
    @Override
    public Object visit(Minus node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLeft());
        Value rightValue = (Value) visit(node.getRight());

        return evaluateArithmetic(node.getClass().getName(), leftValue, rightValue, node.getLineNumber());
    }

    //checks if every element in the multiple assign node is the same. if so it returns in the first elements type.
    @Override
    public Object visit(MultipleElementAssign node) throws NoSuchMethodException {
        Value firstElement = null;
        if (!node.getElements().isEmpty()) {
            firstElement = (Value) visit(node.getElements().get(0));
            for (Value x : node.getElements()) {
                if (!(visit(x).getClass().equals(firstElement.getClass()))) {
                    try {
                        throw new IncompatibleTypes("line: " + node.getLinenumber() + " -- " + " Array elements are not of the same types");
                    } catch (SemanticException e) {
                        err.println("IncompatibleTypes" + e.getLocalizedMessage());
                        exit(0);
                    }
                }
            }
        }

        return firstElement;
    }

    //has to be of type truth literal
    @Override
    public Object visit(Not node) throws NoSuchMethodException {
        Value truth = (Value) visit(node.getTruth());
        if (truth instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node.getClass().getName(), truth.getClass().getName().substring(4), null, node.getLineNumber());
        }
        return null;
    }

    //both left and right hands side has to be a truth literal
    @Override
    public Object visit(Or node) throws NoSuchMethodException {
        Value rightHand = (Value) visit(node.getRhs());
        Value leftHand = (Value) visit(node.getLhs());
        if (leftHand instanceof TruthLiteral && rightHand instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node.getClass().getName(), leftHand.getClass().getName().substring(4), rightHand.getClass().getName().substring(4), node.getLineNumber());
        }
        return null;
    }

    //depending on which parameter type it is, it is declared in the symbol table
    //TODO null fix seems hacky
    @Override
    public Object visit(Parameter node) throws NoSuchMethodException {
        AbstractNode typeOfDCL = node.getParamType();

        if (typeOfDCL instanceof INTDCL) {
            return visit(new IntDeclaration(node.getId(), new IntegerLiteral("null")));
        } else if (typeOfDCL instanceof FLOATDCL) {
            return visit(new FloatDeclaration(node.getId(), new FloatLiteral("null")));
        } else if (typeOfDCL instanceof TRUTHDCL) {
            return visit(new TruthDeclaration(node.getId(), new TruthLiteral("null")));
        } else if (typeOfDCL instanceof TEXTDCL) {
            return visit(new TextDeclaration(node.getId(), new TextLiteral("null")));
        }
        return null;
    }

    //plus can be applied to ints, floats and text.
    //int + int = int, any float mixed with ints equals floats and text + text = text
    @Override
    public Object visit(Plus node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLeft());
        Value rightValue = (Value) visit(node.getRight());

        if (leftValue instanceof TextLiteral) {
            if (rightValue instanceof TextLiteral) {
                return new TextLiteral(node.getSpelling());
            } else {
                errorCallIncorrectOperatorUse(node.getClass().getName(), node.getLeft().toString(), node.getRight().toString(), node.getLineNumber());
            }
        }
        return evaluateArithmetic(node.getClass().getName(), leftValue, rightValue, node.getLineNumber());
    }

    //the expression in the "until" has to be of type truth literal
    // if so the statements in the body will be visited and a new scope will be opened, afterwards closed.
    @Override
    public Object visit(RepeatStatement node) throws NoSuchMethodException {
        if (!(visit(node.getExpr()) instanceof TruthLiteral)) {
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
        List<Value> parameters = new ArrayList<>();
        if (!isInSymbolTable(node.getFunctionName().getSpelling())) {
            for (Parameter parameter : node.getParameters()) {
                parameters.add((Value) visit(parameter));
            }
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), typeCasting(node.getReturnType()), parameters));

            symbolTable.openScope();
            visit(node.getStmtBody());
            for (Statement statement : node.getStmtBody().getStmts()) {
                if (statement instanceof ReturnStatement) {
                    if (!(visit(statement)).getClass().equals(typeCasting(node.getReturnType()).getClass())) {
                        errorCallAssignIncompatibleTypes(typeCasting(node.getReturnType()).getClass().getName(), statement.getClass().getName(), node.lineNumber);
                    }
                }
            }
            symbolTable.closeScope();
        } else {
            errorCallDuplicateDeclaration(node.getFunctionName().getSpelling(), node.getLineNumber());
        }
        return null;
    }

    //checks the node that the value in the return statement, will be used higher up for type checking
    @Override
    public Object visit(ReturnStatement node) throws NoSuchMethodException {
        return visit(node.getVal());
    }

    //checks if the element number is an integer literal
    @Override
    public Object visit(SingleElementAssign node) throws NoSuchMethodException {
        Value elementNumber = (Value) visit((visitable) node.getElementNr());
        Value valueElement = (Value) visit(node.getAssignemntVal());

        if (!(elementNumber instanceof IntegerLiteral)) {
            try {
                throw new IncompatibleTypes("line: " + node.getLinenumber() + " -- " + " Element index number is not an integer");
            } catch (SemanticException e) {
                err.println("IncompatibleTypes" + e.getLocalizedMessage());
                exit(0);
            }
        }else if(Integer.valueOf(((IntegerLiteral) elementNumber).getSpelling()) > 128 || Integer.valueOf(((IntegerLiteral) elementNumber).getSpelling()) < 0){
            try{
                throw new OutOfBounds("line: "+ node.getLinenumber() + " -- " + " is out of bounds");
            }catch (SemanticException e){
                err.println("OutOfBounds " + e.getLocalizedMessage());
                exit(0);
            }
        }
        return valueElement;
    }

    //visit every statement in the statement list
    @Override
    public Object visit(StatementList node) throws NoSuchMethodException {
        for (Statement stm : node.getStmts()) {
            visit(stm);
        }
        return null;
    }

    //a variable check is performed to ensure its in the symbol table
    @Override
    public Object visit(TextAssignment node) throws NoSuchMethodException {
        Value variableType = variableTypeCheck(node.getId().getSpelling(), node.getLineNumber());
        Value expressionType = (Value) visit((visitable) node.getText());

        if (!(variableType.getClass().equals(expressionType.getClass()))) {
            errorCallAssignIncompatibleTypes(node.getText().getClass().getName(), node.getId().getSpelling(), node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(TEXTDCL node) throws NoSuchMethodException {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a text literal,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(TextDeclaration node) throws NoSuchMethodException {
        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TextLiteral(node.getId().getSpelling())));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(), node.getLineNumber());
        }
        if (node.getVal() != null) {
            Value value = (Value) visit(node.getVal());
            symbolTable.getIdTable().get(node.getId().getSpelling()).setNodes(node);
            symbolTable.getIdTable().get(node.getId().getSpelling()).setValue(node.getVal()); ///TODO EVALUATE VIISTOR
            if (!(value instanceof TextLiteral)) {
                if (value instanceof FloatLiteral) {
                    errorCallAssignIncompatibleTypes("Decimal", node.getId().getSpelling(), node.getLineNumber());
                } else {
                    errorCallAssignIncompatibleTypes(value.getClass().getName().substring(4, value.getClass().getName().length() - 7), node.getId().getSpelling(), node.getLineNumber());
                }
            }
        }
        return null;
    }

    // returns text literal
    @Override
    public Object visit(TextLiteral node) throws NoSuchMethodException {
        return new TextLiteral(node.getSpelling());
    }

    // multiplicity can only be applied to floats and ints, if ints and floats are mixed the result is of type floatliteral
    @Override
    public Object visit(Times node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLeft());
        Value rightValue = (Value) visit(node.getRight());

        return evaluateArithmetic(node.getClass().getName(), leftValue, rightValue, node.getLineNumber());
    }

    @Override
    public Object visit(TRUTHDCL node) throws NoSuchMethodException {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a truth literal,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(TruthDeclaration node) throws NoSuchMethodException {
        if (!isInSymbolTable(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TruthLiteral(node.getId().getSpelling())));
        } else {
            errorCallDuplicateDeclaration(node.getId().getSpelling(), node.getLineNumber());
        }
        if (node.getExpr() != null) {
            Value value = (Value) visit(node.getExpr());
            symbolTable.getIdTable().get(node.getId().getSpelling()).setNodes(node);
            symbolTable.getIdTable().get(node.getId().getSpelling()).setValue(node.getExpr()); ///TODO EVALUATE VIISTOR
            if (!(value instanceof TruthLiteral)) {
                if (value instanceof FloatLiteral) {
                    errorCallAssignIncompatibleTypes("Decimal", node.getId().getSpelling(), node.getLineNumber());
                } else {
                    errorCallAssignIncompatibleTypes(value.getClass().getName().substring(4, value.getClass().getName().length() - 7), node.getId().getSpelling(), node.getLineNumber());
                }
            }
        }
        return null;
    }

    // returns truth literal
    @Override
    public Object visit(TruthLiteral node) throws NoSuchMethodException {
        return new TruthLiteral(node.getSpelling());
    }

    // goes to the expression within the parenthesis
    @Override
    public Object visit(TruthParenthesis node) throws NoSuchMethodException {
        return visit(node.getExpr());
    }

    // turn left statement only takes ints as a parameter
    @Override
    public Object visit(TurnLeftStatement node) throws NoSuchMethodException {
        if (!(visit(node.getVal()) instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node.getClass().getName().substring(4), node.getLineNumber());
        }
        return null;
    }

    // turn right statement only takes ints as a parameter
    @Override
    public Object visit(TurnRightStatement node) throws NoSuchMethodException {
        if (!(visit(node.getVal()) instanceof IntegerLiteral)) {
            errorCallIntegerIncompatibleTypes(node.getClass().getName().substring(4), node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(PauseStatement node) throws NoSuchMethodException {
        if(!(visit(node.getVal()) instanceof IntegerLiteral)){
            errorCallIntegerIncompatibleTypes(node.getClass().getName().substring(4), node.getLineNumber());
        }
        return null;
    }

    @Override
    public Object visit(Upto node) throws NoSuchMethodException {
        return null;
    }

    //the expression has to be a type truth literal
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

    //equal can be performed on floats ints, truth and text
    @Override
    public Object visit(Equal node) throws NoSuchMethodException {
        Value leftValue = (Value) visit(node.getLhs());
        Value rightValue = (Value) visit(node.getRhs());

        if (leftValue.getClass().equals(rightValue.getClass())) {
            return new TruthLiteral(node.getSpelling());
        } else {
            errorCallIncorrectOperatorUse(node.getClass().getName(), leftValue.getClass().getName(), rightValue.getClass().getName(), node.getLineNumber());
        }
        return null;
    }

    /*
     * Error calls for variety of type issues; list goes; IncorrectOperatorUse
     *                                                    DuplicateDeclaration
     *                                                    VariableMissing
     *                                                    IncompatibleTypes
     *                                                    FunctionCallParameters
     */
    private void errorCallIncorrectOperatorUse(String node, String leftHand, String rightHand, int linenumber) {
        try {
            if (rightHand != null) {
                throw new IncorrectOperatorUse("line: " + linenumber + " -- " + " Operator " + node.substring(4) + " cannot be applied to " + leftHand + " & " + rightHand);
            } else {
                throw new IncorrectOperatorUse("line: " + linenumber + " -- " + " Operator " + node.substring(4) + " cannot be applied to " + leftHand);
            }
        } catch (IncorrectOperatorUse e) {
            err.println("IncorrectOperatorUse " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallDuplicateDeclaration(String identifier, int linenumber) {
        try {
            throw new DuplicateDeclaration("line: " + linenumber + " -- " + " Variable " + identifier + " is already declared");
        } catch (DuplicateDeclaration e) {
            err.println("DuplicateDeclaration " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallVariableMissing(String identifier, int linenumber) {
        try {
            throw new VariableMissing("line: " + linenumber + " -- " + " Variable " + identifier + " is not declared");
        } catch (VariableMissing e) {
            err.println("VariableMissing " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallAssignIncompatibleTypes(String node, String identifier, int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " + node + " cannot be assigned to " + identifier);
        } catch (IncompatibleTypes e) {
            err.println("IncompatibleTypes " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallArrayIncompatibleTypes(ArrayAsmValue node, String identifier, int linenumber) {
        try {
            throw new IncompatibleTypes(" line: " + linenumber + " -- " + node.getClass().getName() + " cannot be assigned to " + identifier);
        } catch (IncompatibleTypes e) {
            err.println("IncompatibleTypes " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallTruthIncompatibleTypes(int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " + " Expression is not a truth expression");
        } catch (IncompatibleTypes e) {
            err.println("IncompatibleTypes " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallIntegerIncompatibleTypes(String node, int linenumber) {
        try {
            throw new IncompatibleTypes("line: " + linenumber + " -- " + node + " requires an integer");
        } catch (IncompatibleTypes e) {
            err.println("IncompatibleTypes " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallTooFewParameters(String node, int linenumber) {
        try {
            throw new FunctionCallParameter("line: " + linenumber + " -- " + node + " has incorrect amount of paramters");
        } catch (FunctionCallParameter e) {
            err.println("FunctionCallParameter " + e.getLocalizedMessage());
            exit(0);
        }
    }

    private void errorCallFunctionCallIncorrectTypes(String node, int linenumber) {
        try {
            throw new FunctionCallParameter("line: " + linenumber + " -- " + node + " the parameters are not correct");
        } catch (FunctionCallParameter e) {
            err.println("FunctionCallParameter " + e.getLocalizedMessage());
            exit(0);
        }
    }

    // When mixing floats and ints it is evaluated as a float, if int and int it is considered an int
    private Object evaluateArithmetic(String node, Value leftValue, Value rightValue, int linenumber) {
        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new IntegerLiteral("integer");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral("float");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new FloatLiteral("float");
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral("float");
        } else {
            errorCallIncorrectOperatorUse(node, leftValue.toString(), rightValue.toString(), linenumber);
        }
        return null;
    }

    //used for greater and less than, where floats and ints can be mixed, the expression returns as a truth value
    private Object evaluateTruth(String node, Value leftValue, Value rightValue, int linenumber) {
        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral("truth");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral("truth");
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral("truth");
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral("truth");
        } else {
            errorCallIncorrectOperatorUse(node, leftValue.toString(), rightValue.toString(), linenumber);
        }
        return null;
    }

    //checks if variable is in symbol table, returns the type of the node.
    private Value variableTypeCheck(String identifier, int linenumber) {
        if (!(isInSymbolTable(identifier))) {
            errorCallVariableMissing(identifier, linenumber);
        }
        return symbolTable.getIdTable().get(identifier).getType();
    }

    //is in symbol table
    private boolean isInSymbolTable(String nodeName) {
        return symbolTable.getIdTable().containsKey(nodeName);
    }

    //turns a dcl into a literal, makes it easier for comparing
    private Value typeCasting(Type vType) {
        if (vType instanceof INTDCL) {
            return new IntegerLiteral("integer");
        } else if (vType instanceof FLOATDCL) {
            return new FloatLiteral("decimal");
        } else if (vType instanceof TRUTHDCL) {
            return new TruthLiteral("truth");
        } else {
            return new TextLiteral("text");
        }
    }
}