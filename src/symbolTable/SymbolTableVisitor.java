package symbolTable;

import Exceptions.SemanticCheckerExceptions.DublicateDeclaration;
import Exceptions.SemanticCheckerExceptions.IncompatibleTypes;
import Exceptions.SemanticCheckerExceptions.IncorrectOperatorUse;
import Exceptions.SemanticCheckerExceptions.VariableMissing;
import ast.*;
import astVisitor.AbstractNodeVisitor;

public class SymbolTableVisitor extends AbstractNodeVisitor<Object> {


    public SymbolTable symbolTable = new SymbolTable();

    @Override
    public Object visit(And node) {
        if(node.getLhs() instanceof TruthLiteral && node.getRhs() instanceof TruthLiteral){
            return new TruthLiteral(node.getSpelling());
        }else return new IncorrectOperatorUse("Operator " + node.spelling + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    @Override
    public Object visit(ArrayAssignment arrayAssignment) {
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis node) {
        return visit(node.getLeft());
    }

    @Override
    public Object visit(ArrayDeclaration node) {


        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), node.getType()));
        } else{
            throw new DublicateDeclaration("Variable " + node.getId().spelling + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ArrayElementAddStatement node) {
        return null;
    }

    @Override
    public Object visit(ArrayIndexStatement node) {
        return null;
    }

    @Override
    public Object visit(Divide node) {
        if(node.getRight() instanceof IntegerLiteral && node.getLeft() instanceof IntegerLiteral){
            return new IntegerLiteral(node.getSpelling());
        }else if(node.getLeft() instanceof FloatLiteral && node.getRight() instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(node.getLeft() instanceof FloatLiteral && node.getRight() instanceof IntegerLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(node.getLeft() instanceof IntegerLiteral && node.getRight() instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else {
            throw new IncorrectOperatorUse("Operator " + node.spelling + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    @Override
    public Object visit(Downto node) {
        return null;
    }

    @Override
    public Object visit(DriveStatement node) {
        if(!(visit(node.getVal()) instanceof IntegerLiteral)){
            throw new IncompatibleTypes(node.toString() + " cannot use " + node.getVal().getClass() + " has to be an integer");
        }
        return null;
    }

    @Override
    public Object visit(ElseIfStatement node) {
        if(!(node.getTruth().getClass().equals(TruthLiteral.class))){
            throw new IncompatibleTypes("Expression is not a truth expression");
        }else {
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
        ast.Type variableType;
        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getId().getSpelling());

        if(!isInSymbolTable){
            throw new VariableMissing("Variable " + node.getId().spelling + " is not declared");
        }else{
            variableType = symbolTable.getIdTable().get(node.getId().getSpelling()).getType();
        }

        if(!(   variableType.getClass().equals((visit(node.getValue()).getClass())) ||
                variableType instanceof ast.INTDCL && visit(node.getValue()) instanceof IntegerLiteral ||
                variableType instanceof ast.FLOATDCL && visit(node.getValue()) instanceof FloatLiteral ||
                variableType instanceof ast.TRUTHDCL && visit(node.getValue()) instanceof TruthLiteral ||
                variableType instanceof ast.TEXTDCL && visit(node.getValue()) instanceof TextLiteral)){
            throw new IncompatibleTypes(node.getValue().getClass().getName() + " cannot be assigned to " + node.getId().getSpelling());
        }

        return null;
    }

    @Override
    public Object visit(FLOATDCL node) {
        return null;
    }

    @Override
    public Object visit(FloatDeclaration node) {
        if(node.getStm() != null && !(visit(node.getStm()) instanceof FloatLiteral)){
            throw new IncompatibleTypes(node.getStm() + " cannot be assigned to " + node.getId().getSpelling());
        }
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new FLOATDCL()));
        } else{
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

    
    @Override
    public Object visit(FunctionDeclaration node) {
        if(symbolTable.getIdTable().get(node.getFunctionName().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getFunctionName().getSpelling())){
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), null));
            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else{
            throw new DublicateDeclaration("Variable " + node.getFunctionName().getSpelling() + " is already declared");
        }
        return null;
    }

    //greater than can be performed on ints and floats, returns as a truthliteral
    @Override
    public Object visit(GreaterThan node) {
        if(visit(node.getLhs()) instanceof IntegerLiteral && visit(node.getRhs()) instanceof IntegerLiteral){
        return new TruthLiteral(node.getSpelling());
    }else if(visit(node.getLhs()) instanceof FloatLiteral && visit(node.getRhs()) instanceof FloatLiteral){
        return new TruthLiteral(node.getSpelling());
    }else if(visit(node.getLhs()) instanceof FloatLiteral && visit(node.getRhs()) instanceof IntegerLiteral){
        return new TruthLiteral(node.getSpelling());
    }else if(visit(node.getLhs()) instanceof IntegerLiteral && visit(node.getRhs()) instanceof FloatLiteral){
        return new TruthLiteral(node.getSpelling());
    }else {
        throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }
}

    //firstly checks if the identifier exists in the symbol table then returns the type of literal the identifier is
    @Override
    public Object visit(Identifier node) {
        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getSpelling());

        if(!isInSymbolTable) {
            throw new VariableMissing("Variable " + node.getSpelling() + " is not declared");
        }

        return symbolTable.getIdTable().get(node.getSpelling()).getType();
    }

    //the condition in the if statement has to be of the type truthliteral
    //a new scope is opened for the if statements and afterwards closed, the elseif statements are visited and lastly else then
    @Override
    public Object visit(IfStatement node) {
        if(!(visit(node.getTruthVal()) instanceof TruthLiteral)){
            throw new IncompatibleTypes("Expression is not a truth expression");
        }else {
            symbolTable.openScope();
            visit(node.getTrueStm());
            symbolTable.closeScope();
            for(ElseIfStatement elseIfStatement : node.getElseifs()){
                visit(elseIfStatement);
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
        if(node.getStm() != null && !(visit(node.getStm()) instanceof IntegerLiteral)){
            throw new IncompatibleTypes(node.getStm().getClass().getName() + " cannot be assigned to " + node.getId().getSpelling());
        }
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new INTDCL()));
        } else{
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
        if(node.getLhs() instanceof IntegerLiteral && node.getRhs() instanceof IntegerLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(node.getLhs() instanceof FloatLiteral && node.getRhs() instanceof FloatLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(node.getLhs() instanceof FloatLiteral && node.getRhs() instanceof IntegerLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(node.getLhs() instanceof IntegerLiteral && node.getRhs() instanceof FloatLiteral){
            return new TruthLiteral(node.getSpelling());
        }else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
        }
    }

    //minus can only be performed on ints and floats, returns float if they are mixed
    @Override
    public Object visit(Minus node) {
        if(visit(node.getRight()) instanceof IntegerLiteral && visit(node.getLeft()) instanceof IntegerLiteral){
            return new IntegerLiteral(node.getSpelling());
        }else if(visit(node.getLeft()) instanceof FloatLiteral && visit(node.getRight()) instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(visit(node.getLeft()) instanceof FloatLiteral && visit(node.getRight()) instanceof IntegerLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(visit(node.getLeft()) instanceof IntegerLiteral && visit(node.getRight()) instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else {
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    @Override
    public Object visit(MultipleElementAssign node) {
        return null;
    }

    //has to be of type truth literal
    @Override
    public Object visit(Not node) {
        if(visit(node.getTruth()) instanceof TruthLiteral){
            return new TruthLiteral(node.getSpelling());
        }else return new IncorrectOperatorUse("Operator " + node.getClass().toString() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    //both left and right hands side has to be a truthliteral
    @Override
    public Object visit(Or node) {
        if(visit(node.getLhs()) instanceof TruthLiteral && visit(node.getRhs()) instanceof TruthLiteral){
            return new TruthLiteral(node.getSpelling());
        }else return new IncorrectOperatorUse("Operator " + node.getSpelling() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    @Override
    public Object visit(Parameter node) {
        return null;
    }

    @Override
    public Object visit(Plus node) {

        return null;
    }

    //the expression in the "until" has to be of type truthliteral
    // if so the statements in the body will be visited and a new scope will be opened, afterwards closed.
    @Override
    public Object visit(RepeatStatement node) {
        if(!(visit(node.getExpr()) instanceof  TruthLiteral)){
            throw new IncompatibleTypes("Until expression is not a truth expression");
        }else {
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }


    @Override
    public Object visit(ReturnFunctionDeclaration node) {
        if(symbolTable.getIdTable().get(node.getFunctionName().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getFunctionName().getSpelling())){
            symbolTable.put(node.getFunctionName().getSpelling(), new Symbol(node, symbolTable.getDepth(), node.getReturnType()));
            symbolTable.openScope();
            visit(node.getStmtBody());
            symbolTable.closeScope();
        } else{
            throw new DublicateDeclaration("Variable " + node.getFunctionName().getSpelling() + " is already declared");
        }
        return null;
    }

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
        for(Statement stm : node.getStmts()){
            visit(stm);
        }
        return null;
    }

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
        if(node.getVal() != null && !(visit(node.getVal()) instanceof TextLiteral)){
            throw new IncompatibleTypes(node.getVal() + " cannot be assigned to " + node.getId().getSpelling());
        }

        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(),new TEXTDCL()));
        } else{
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
        if(visit(node.getRight()) instanceof IntegerLiteral && visit(node.getLeft()) instanceof IntegerLiteral){
            return new IntegerLiteral(node.getSpelling());
        }else if(visit(node.getLeft()) instanceof FloatLiteral && visit(node.getRight()) instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(visit(node.getLeft()) instanceof FloatLiteral && visit(node.getRight()) instanceof IntegerLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(visit(node.getLeft()) instanceof IntegerLiteral && visit(node.getRight()) instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else {
            throw new IncorrectOperatorUse("Operator " + node.getSpelling() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    @Override
    public Object visit(TRUTHDCL node) {
        return null;
    }

    // if there is an assigment to be made, then that expression has to be a truthliteral,
    // when declaring a variable it checks if it already exists in the symbol table, if not, it is put in the symbol table
    @Override
    public Object visit(TruthDeclaration node) {
        if(node.getExpr() != null && !(visit(node.getExpr()) instanceof TruthLiteral)){
            throw new IncompatibleTypes(node.getExpr() + " cannot be assigned to " + node.getId().getSpelling());
        }
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
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
        if(!(visit(node.getVal()) instanceof IntegerLiteral)){
            throw new IncompatibleTypes(node.toString() + " cannot use " + node.getVal().getClass() + " has to be an integer");
        }
        return null;
    }

    // turn right statement only takes ints as a parameter
    @Override
    public Object visit(TurnRightStatement node) {
        if(!(visit(node.getVal()) instanceof IntegerLiteral)){
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
        if(!(visit(node.getExpr()) instanceof TruthLiteral)){
            throw new IncompatibleTypes("Expression is not a truth expression");
        }else{
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }

    //equal can be performed on floats ints and truth
    @Override
    public Object visit(Equal node) {
        if(visit(node.getLhs()) instanceof IntegerLiteral && visit(node.getRhs()) instanceof IntegerLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(visit(node.getLhs()) instanceof FloatLiteral && visit(node.getRhs()) instanceof FloatLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(visit(node.getLhs()) instanceof FloatLiteral && visit(node.getRhs()) instanceof IntegerLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(visit(node.getLhs()) instanceof IntegerLiteral && visit(node.getRhs()) instanceof FloatLiteral){
            return new TruthLiteral(node.getSpelling());
        }else if(visit(node.getLhs()) instanceof TruthLiteral && visit(node.getRhs()) instanceof TruthLiteral) {
            return new TruthLiteral(node.getSpelling());
        }else{
            throw new IncorrectOperatorUse("Operator " + node.getClass().getName() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
        }
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
