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
        return null;
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
        return null;
    }

    @Override
    public Object visit(ElseIfStatement node) {
        symbolTable.openScope();
        visit(node.getStms());
        symbolTable.closeScope();
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
        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getId().getSpelling());

        if(!isInSymbolTable){
            throw new VariableMissing("Variable " + node.getId().spelling + " is not declared");
        }else{
            variableType = symbolTable.getIdTable().get(node.getId().getSpelling()).getType();
        }

        if(!(   variableType.getClass().equals((visit(node.getValue()).getClass())) ||
                variableType instanceof INTDCL && visit(node.getValue()) instanceof IntegerLiteral ||
                variableType instanceof FLOATDCL && visit(node.getValue()) instanceof FloatLiteral ||
                variableType instanceof TRUTHDCL && visit(node.getValue()) instanceof TruthLiteral ||
                variableType instanceof TEXTDCL && visit(node.getValue()) instanceof TextLiteral)){
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
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new FLOATDCL()));
        } else{
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(FloatLiteral node) {
        return null;
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

    @Override
    public Object visit(GreaterThan node) {
        if(node.getLhs() instanceof IntegerLiteral && node.getRhs() instanceof IntegerLiteral){
        return new TruthLiteral(node.getSpelling());
    }else if(node.getLhs() instanceof FloatLiteral && node.getRhs() instanceof FloatLiteral){
        return new TruthLiteral(node.getSpelling());
    }else if(node.getLhs() instanceof FloatLiteral && node.getRhs() instanceof IntegerLiteral){
        return new TruthLiteral(node.getSpelling());
    }else if(node.getLhs() instanceof IntegerLiteral && node.getRhs() instanceof FloatLiteral){
        return new TruthLiteral(node.getSpelling());
    }else {
        throw new IncorrectOperatorUse("Operator " + node.spelling + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }
}

    @Override
    public Object visit(Identifier node) {
        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getSpelling());

        if(!isInSymbolTable) {
            throw new VariableMissing("Variable " + node.getSpelling() + " is not declared");
        }

        return symbolTable.getIdTable().get(node.getSpelling()).getType();
    }

    @Override
    public Object visit(IfStatement node) {
        symbolTable.openScope();
        visit(node.getTrueStm());
        symbolTable.closeScope();
        for(ElseIfStatement elseIfStatement : node.getElseifs()){
            visit(elseIfStatement);
        }
        visit(node.getElsethen());
        return null;
    }

    @Override
    public Object visit(INTDCL node) {
        return null;
    }

    @Override
    public Object visit(IntDeclaration node) {
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new INTDCL()));
        } else{
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(IntegerLiteral node) {
        return null;
    }

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
            throw new IncorrectOperatorUse("Operator " + node.spelling + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
        }
    }

    @Override
    public Object visit(Minus node) {
        if(node.getRight() instanceof IntegerLiteral && node.getLeft() instanceof IntegerLiteral){
            return new IntegerLiteral(node.getSpelling());
        }else if(node.getLeft() instanceof FloatLiteral && node.getRight() instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(node.getLeft() instanceof FloatLiteral && node.getRight() instanceof IntegerLiteral){
            return new FloatLiteral(node.getSpelling());
        }else if(node.getLeft() instanceof IntegerLiteral && node.getRight() instanceof FloatLiteral){
            return new FloatLiteral(node.getSpelling());
        }else {
            throw new IncorrectOperatorUse("Operator " + node.getSpelling() + " cannot be applied to " + node.getLeft() + " & " + node.getRight());
        }
    }

    @Override
    public Object visit(MultipleElementAssign node) {
        return null;
    }

    @Override
    public Object visit(Not node) {
        if(node.getTruth() instanceof TruthLiteral){
            return new TruthLiteral(node.getSpelling());
        }else return new IncorrectOperatorUse("Operator " + node.getSpelling() + " cannot be applied to " + node.getLhs() + " & " + node.getRhs());
    }

    @Override
    public Object visit(Or node) {
        if(node.getLhs() instanceof TruthLiteral && node.getRhs() instanceof TruthLiteral){
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

    @Override
    public Object visit(RepeatStatement node) {
        if(!(node.getExpr().getClass().equals(TruthLiteral.class))){
            throw new IncompatibleTypes("Expression is not a truth expression");
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

    @Override
    public Object visit(TextDeclaration node) {
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(),new TEXTDCL()));
        } else{
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(TextLiteral node) {
        return null;
    }

    @Override
    public Object visit(Times node) {
        return null;
    }

    @Override
    public Object visit(TRUTHDCL node) {
        return null;
    }

    @Override
    public Object visit(TruthDeclaration node) {
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Symbol(node, symbolTable.getDepth(), new TRUTHDCL()));
        } else {
            throw new DublicateDeclaration("Variable " + node.getId().getSpelling() + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(TruthLiteral node) {
        return null;
    }

    @Override
    public Object visit(TruthParenthesis node) {
        return null;
    }

    @Override
    public Object visit(TurnLeftStatement node) {
        return null;
    }

    @Override
    public Object visit(TurnRightStatement node) {
        return null;
    }

    @Override
    public Object visit(Upto node) {
        return null;
    }

    @Override
    public Object visit(WhileStatement node) {
        if(!(node.getExpr().getClass().equals(TruthLiteral.class))){
            throw new IncompatibleTypes("Expression is not a truth expression");
        }else{
            symbolTable.openScope();
            visit(node.getStmts());
            symbolTable.closeScope();
        }
        return null;
    }

    //TODO What can equals be performed on?
    @Override
    public Object visit(Equal node) {
        return null;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
