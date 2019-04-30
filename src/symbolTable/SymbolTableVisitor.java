package symbolTable;

import Exceptions.SemanticCheckerExceptions.DublicateDeclaration;
import Exceptions.SemanticCheckerExceptions.IncompatibleTypes;
import Exceptions.SemanticCheckerExceptions.IncorrectOperatorUse;
import Exceptions.SemanticCheckerExceptions.VariableMissing;
import ast.*;
import astVisitor.AbstractNodeVisitor;

public class SymbolTableVisitor extends AbstractNodeVisitor<Object> {


    private SymbolTable symbolTable = new SymbolTable();

    //both left hand side and right hand side of the and node has to be truth literals
    @Override
    public Object visit(And node) {
        if (visit(node.getLhs()) instanceof TruthLiteral && visit(node.getRhs()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else
            return new IncorrectOperatorUse("Operator " + node.spelling + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    //array assignment, checks if the variable exists in the symbol table then compares the type of the variable with
    // what is trying to be assigned.
    @Override
    public Object visit(ArrayAssignment arrayAssignment) {
        Type variableType;
        AbstractNode expressionType = (AbstractNode) visit(arrayAssignment.getValue());

        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(arrayAssignment.getId().getSpelling());

        if (!isInSymbolTable) {
            throw new VariableMissing("Variable " + arrayAssignment.getId().getSpelling() + " is not declared");
        } else {
            variableType = symbolTable.getIdTable().get(arrayAssignment.getId().getSpelling()).getType();
        }

        if (!(variableType.getClass().equals(expressionType.getClass()) ||
                variableType instanceof INTDCL && expressionType instanceof IntegerLiteral ||
                variableType instanceof FLOATDCL && expressionType instanceof FloatLiteral ||
                variableType instanceof TRUTHDCL && expressionType instanceof TruthLiteral ||
                variableType instanceof TEXTDCL && expressionType instanceof TextLiteral)) {
            throw new IncompatibleTypes(expressionType.getClass().getName() + "  cannot be assigned to " + arrayAssignment.getId().getSpelling());
        }
        return null;
    }

    //goes into the parenthesis and visits the nodes in there
    @Override
    public Object visit(ArithmParenthesis node) {
        return visit(node.getLeft());
    }


    @Override
    public Object visit(ArrayDeclaration node) {

        if (visit(node.getValues()) != null) {
            AbstractNode value = (AbstractNode) visit(node.getValues());
            AbstractNode type = node.getType();
            if(!(type instanceof INTDCL && value instanceof IntegerLiteral ||
                 type instanceof FLOATDCL && value instanceof FloatLiteral ||
                 type instanceof TRUTHDCL && value instanceof TruthLiteral ||
                 type instanceof TEXTDCL && value instanceof TextLiteral)) {
                throw new IncompatibleTypes(value.getClass().getName() + " cannot be assigned to " + node.getId().getSpelling());
            }
        }

        if (symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), node.getType()));
        } else {
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    //TODO
    @Override
    public Object visit(ArrayElementAddStatement node) {
        return null;
    }
    //TODO
    @Override
    public Object visit(ArrayIndexStatement node) {
        return null;
    }

    @Override
    public Object visit(Divide node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit(node.getRight());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new IntegerLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getClass() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    @Override
    public Object visit(Downto node) {
        return null;
    }

    @Override
    public Object visit(DriveStatement node) {
        if (!(visit(node.getVal()) instanceof IntegerLiteral)) {
            throw new IncompatibleTypes(node.toString() + " cannot use " + node.getVal().getClass() + " has to be an integer");
        }
        return null;
    }

    @Override
    public Object visit(ElseIfStatement node) {
        if (!(node.getTruth().getClass().equals(TruthLiteral.class))) {
            throw new IncompatibleTypes("Expression is not a truth expression");
        } else {
            symbolTable.openScope();
            visit(node.getStms());
            symbolTable.closeScope();
        }
        return null;
    }

    @Override
    public Object visit(ElseThenStmt node) {
        symbolTable.openScope();
        visit(node.getStms());
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ValueAssignment node) {
        Type variableType;
        AbstractNode expressionType = (AbstractNode) visit(node.getValue());
        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getId().getSpelling());

        if (!isInSymbolTable) {
            throw new VariableMissing("Variable " + node.getId().spelling + " is not declared");
        } else {
            variableType = symbolTable.getIdTable().get(node.getId().getSpelling()).getType();
        }

        if (!(variableType.getClass().equals(expressionType.getClass()) ||
                variableType instanceof ast.INTDCL && expressionType instanceof IntegerLiteral ||
                variableType instanceof ast.FLOATDCL && expressionType instanceof FloatLiteral ||
                variableType instanceof ast.TRUTHDCL && expressionType instanceof TruthLiteral)) {
            throw new IncompatibleTypes(expressionType.getClass().getName() + "  cannot be assigned to " + node.getId().getSpelling());
        }
        return null;
    }

    @Override
    public Object visit(FLOATDCL node) {
        return null;
    }

    @Override
    public Object visit(FloatDeclaration node) {
        AbstractNode value = (AbstractNode) visit(node.getStm());

        if (node.getStm() != null && !(value instanceof FloatLiteral)) {
            throw new IncompatibleTypes(value + " cannot be assigned to " + node.getId().getSpelling());
        }
        if (symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new FLOATDCL()));
        } else {
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(FloatLiteral node) {
        return new FloatLiteral(node.getSpelling());
    }

    @Override
    public Object visit(FromKeyword node) {
        return null;
    }

    @Override
    public Object visit(FromStatement node) {

        symbolTable.openScope();
        visit(node.getStmts());
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(FunctionCall node) {
        return null;
    }


    //function declaration for a function with no return, opens a scope within the function if the name declaration does not exist in the symbol table
    @Override
    public Object visit(FunctionDeclaration node) {
        if (symbolTable.getIdTable().get(node.getFunctionName().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getFunctionName().getSpelling())) {
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), null));

            for (Parameter parameter : node.getParameters()) {
                visit(parameter);
            }

            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else {
            throw new DublicateDeclaration("Variable " + node.getFunctionName().getSpelling() + " is already declared");
        }
        return null;
    }

    //greater than can be performed on ints and floats, returns as a truthliteral
    @Override
    public Object visit(GreaterThan node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLhs());
        AbstractNode rightValue = (AbstractNode) visit(node.getRhs());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
        }
    }

    //firstly checks if the identifier exists in the symbol table then returns the type of literal the identifier is
    @Override
    public Object visit(Identifier node) {
        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getSpelling());

        if (!isInSymbolTable) {
            throw new VariableMissing("Variable " + node.getSpelling() + " is not declared");
        }

        return symbolTable.getIdTable().get(node.getSpelling()).getType();
    }

    //the condition in the if statement has to be of the type truthliteral
    //a new scope is opened for the if statements and afterwards closed, the elseif statements are visited and lastly else then
    @Override
    public Object visit(IfStatement node) {
        if (!(visit(node.getTruthVal()) instanceof TruthLiteral)) {
            throw new IncompatibleTypes("Expression is not a truth expression");
        } else {
            symbolTable.openScope();
            visit(node.getTrueStm());
            symbolTable.closeScope();
            if(!(node.getElseifs() == null)) {
                for (ElseIfStatement elseIfStatement : node.getElseifs()) {
                visit(elseIfStatement);
                }
            }
            visit(node.getElsethen());
        }
        return null;
    }

    @Override
    public Object visit(INTDCL node) {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a integerliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(IntDeclaration node) {
        AbstractNode value = (AbstractNode) visit(node.getStm());
        if (node.getStm() != null && !(value instanceof IntegerLiteral)) {
            throw new IncompatibleTypes(value.getClass().getName() + " cannot be assigned to " + node.getId().getSpelling());
        }
        if (symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new INTDCL()));
        } else {
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    //returns integerliteral
    @Override
    public Object visit(IntegerLiteral node) {
        return new IntegerLiteral(node.getSpelling());
    }

    // less than can be performed on ints and floats, returns as a truthliteral
    @Override
    public Object visit(LessThan node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLhs());
        AbstractNode rightValue = (AbstractNode) visit(node.getRhs());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + leftValue.getClass().getName() + " & " + rightValue.getClass().getName());
        }
    }

    //minus can only be performed on ints and floats, returns float if they are mixed
    @Override
    public Object visit(Minus node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit(node.getRight());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new IntegerLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    //TODO
    @Override
    public Object visit(MultipleElementAssign node) {
        Value firstElement = null;
        if(!node.getElements().isEmpty()) {
            firstElement = node.getElements().get(0);

            for (Value x : node.getElements()) {
                if (!(x.getClass().equals(firstElement.getClass()))) {
                    throw new IncompatibleTypes("Array elements are not of the same types");
                }
            }
        }
        return firstElement;
    }

    //has to be of type truth literal
    @Override
    public Object visit(Not node) {
        if (visit(node.getTruth()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else
            return new IncorrectOperatorUse("Operator " + node.getClass().toString() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    //both left and right hands side has to be a truthliteral
    @Override
    public Object visit(Or node) {
        if (visit(node.getLhs()) instanceof TruthLiteral && visit(node.getRhs()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else
            return new IncorrectOperatorUse("Operator " + node.getSpelling() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    @Override
    public Object visit(Parameter node) {
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

    //TODO
    //plus can be applied to ints, floats and text.
    //int + int = int, any float mixed with ints equals floats and text + text = text
    @Override
    public Object visit(Plus node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit(node.getRight());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new IntegerLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof TextLiteral && rightValue instanceof TextLiteral) {
            return new TextLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    //the expression in the "until" has to be of type truthliteral
    // if so the statements in the body will be visited and a new scope will be opened, afterwards closed.
    @Override
    public Object visit(RepeatStatement node) {
        if (!(visit(node.getExpr()) instanceof TruthLiteral)) {
            throw new IncompatibleTypes("Until expression is not a truth expression");
        } else {
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }

    //checks if the variable name for the function is taken, then goes through all the parameters and lastly goes through the body. Also opens and closes scopes.
    @Override
    public Object visit(ReturnFunctionDeclaration node) {
        if (symbolTable.getIdTable().get(node.getFunctionName().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getFunctionName().getSpelling())) {
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), node.getReturnType()));
            for (Parameter parameter : node.getParameters()) {
                visit(parameter);
            }
            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else {
            throw new DublicateDeclaration("Variable " + node.getFunctionName().getSpelling() + " is already declared");
        }
        return null;
    }

    //TODO
    @Override
    public Object visit(ReturnStatement node) {
        return null;
    }

    @Override
    public Object visit(SingleElementAssign node) {
        return null;
    }

    //visit every statement in the statementlist
    @Override
    public Object visit(StatementList node) {
        for (Statement stm : node.getStmts()) {
            visit(stm);
        }
        return null;
    }

    //TODO gør den noget?
    @Override
    public Object visit(TextAssignment node) {
        return null;
    }

    @Override
    public Object visit(TEXTDCL node) {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a textliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(TextDeclaration node) {
        if (node.getVal() != null && !(visit(node.getVal()) instanceof TextLiteral)) {
            throw new IncompatibleTypes(node.getVal().getClass().getName() + " cannot be assigned to " + node.getId().getSpelling());
        }

        if (symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TEXTDCL()));
        } else {
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    // returns textliteral
    @Override
    public Object visit(TextLiteral node) {
        return new TextLiteral(node.getSpelling());
    }

    // multiplicity can only be applied to floats and ints, if ints and floats are mixed the result is of type floatliteral
    @Override
    public Object visit(Times node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLeft());
        AbstractNode rightValue = (AbstractNode) visit(node.getRight());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new IntegerLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof IntegerLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else if (leftValue instanceof IntegerLiteral && rightValue instanceof FloatLiteral) {
            return new FloatLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getSpelling() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    @Override
    public Object visit(TRUTHDCL node) {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a truthliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    //TODO assigning big compound statements
    @Override
    public Object visit(TruthDeclaration node) {
        AbstractNode value = (AbstractNode) visit(node.getExpr());
        if (node.getExpr() != null && !(value instanceof TruthLiteral)) {
            throw new IncompatibleTypes(value.getClass().getName() + " cannot be assigned to " + node.getId().getSpelling());
        }
        if (symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())) {
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TRUTHDCL()));
        } else {
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    // returns truthliteral
    @Override
    public Object visit(TruthLiteral node) {
        return new TruthLiteral(node.getSpelling());
    }

    // goes to the expression within the parenthesis
    @Override
    public Object visit(TruthParenthesis node) {
        return visit(node.getExpr());
    }

    // turn left statement only takes ints as a parameter
    @Override
    public Object visit(TurnLeftStatement node) {
        if (!(visit(node.getVal()) instanceof IntegerLiteral)) {
            throw new IncompatibleTypes(node.toString() + " cannot use " + node.getVal().getClass() + " has to be an integer");
        }
        return null;
    }

    // turn right statement only takes ints as a parameter
    @Override
    public Object visit(TurnRightStatement node) {
        if (!(visit(node.getVal()) instanceof IntegerLiteral)) {
            throw new IncompatibleTypes(node.toString() + " cannot use " + node.getVal().getClass() + " has to be an integer");
        }
        return null;
    }

    @Override
    public Object visit(Upto node) {
        return null;
    }

    //the expression has to be a type truthliteral
    @Override
    public Object visit(WhileStatement node) {
        if (!(visit(node.getExpr()) instanceof TruthLiteral)) {
            throw new IncompatibleTypes("Expression is not a truth expression");
        } else {
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }

    //equal can be performed on floats ints and truth
    @Override
    public Object visit(Equal node) {
        AbstractNode leftValue = (AbstractNode) visit(node.getLhs());
        AbstractNode rightValue = (AbstractNode) visit(node.getRhs());

        if (leftValue instanceof IntegerLiteral && rightValue instanceof IntegerLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof FloatLiteral && rightValue instanceof FloatLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else if (leftValue instanceof TruthLiteral && rightValue instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        } else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
        }
    }
}
