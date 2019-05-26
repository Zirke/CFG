package ReachabilityAnalysis;

import ast.*;
import astVisitor.BasicAbstractNodeVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReachabilityVisitor extends BasicAbstractNodeVisitor {

    private boolean isReachable;
    private boolean terminatesNormally;
    private HashMap<String, Integer> sizeOfArrays = new HashMap<>();
    private List<Integer> listOfNumbers = new ArrayList<>();
    private List<String> listOfKeys = new ArrayList<>();

    private void arraySize(Integer i){
        listOfNumbers.add(i);
    }

    private void orderOfArrays(String key){
        listOfKeys.add(key);
    }

    private List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    private List<String> getListOfKeys() {
        return listOfKeys;
    }

    public HashMap<String, Integer> getSizeOfArraysMap() {
        return sizeOfArrays;
    }

    @Override
    public Object visit(And and) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Append append) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis arithmParenthesis) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ArrayAssignment arrayAssignment) throws NoSuchMethodException {
        visit((visitable) arrayAssignment.getValue());
        orderOfArrays(arrayAssignment.getId().getSpelling());
        return null;
    }
    @Override
    public Object visit(UnaryMinus node) throws NoSuchMethodException {

        return null;
    }
    @Override
    public Object visit(ArrayDeclaration arrayDeclaration) throws NoSuchMethodException {
        //Value value = (Value) visit((visitable) arrayDeclaration.getValues());


        //if(value == null){
        arraySize(0);
        //}
        orderOfArrays(arrayDeclaration.getId().getSpelling());
        return null;
    }

    @Override
    public Object visit(ArrayElementAddStatement arrayElementAddStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ArrayIndexStatement arrayIndexStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Divide divide) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Downto downto) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DriveStatement driveStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ElseIfStatement elseIfStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ElseThenStmt elseThenStmt) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ValueAssignment valueAssignment) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DECIMALDCL floatdcl) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(DecimalDeclaration floatDeclaration) throws NoSuchMethodException {
        return null;
    }

    @Override
    public String visit(DecimalLiteral floatLiteral) throws NoSuchMethodException {
        return floatLiteral.getSpelling();
    }

    @Override
    public Object visit(FromKeyword fromKeyword) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(FromStatement fromStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(FunctionCall functionCall) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(FunctionDeclaration functionDeclaration) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(GreaterThan greaterThan) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Identifier identifier) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(IfStatement ifStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(INTDCL intdcl) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(IntDeclaration intDeclaration) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(IntegerLiteral integerLiteral) throws NoSuchMethodException {
        return integerLiteral.getSpelling();
    }

    @Override
    public Object visit(LessThan lessThan) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Minus minus) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Not not) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Or or) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Parameter parameter) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Plus plus) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(RepeatStatement repeatStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration returnFunctionDeclaration) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(ReturnStatement returnStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(SingleElementAssign singleElementAssign) throws NoSuchMethodException {
        arraySize(Integer.valueOf(singleElementAssign.getElementNr().getSpelling()));
        return null;
    }

    @Override
    public Object visit(StatementList statementList) throws NoSuchMethodException {
        for (Statement stm : statementList.getStmts()) {
            visit(stm);
        }
        return null;
    }

    @Override
    public Object visit(TextAssignment textAssignment) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TEXTDCL textdcl) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TextDeclaration textDeclaration) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TextLiteral textLiteral) throws NoSuchMethodException {
        return textLiteral.getSpelling();
    }

    @Override
    public Object visit(Times times) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TRUTHDCL truthdcl) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TruthDeclaration truthDeclaration) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TruthLiteral truthLiteral) throws NoSuchMethodException {
        return truthLiteral.getSpelling();
    }

    @Override
    public Object visit(TruthParenthesis truthParenthesis) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TurnLeftStatement turnLeftStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(TurnRightStatement turnRightStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Upto upto) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(WhileStatement whileStatement) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(Equal equal) throws NoSuchMethodException {
        return null;
    }

    @Override
    public Object visit(PauseStatement pauseStatement) throws NoSuchMethodException {
        return null;
    }

    //creates map of arrays and their sizes for code gen.
    public void establishArrayHashMap(){
        for (int i=0; i<getListOfKeys().size(); i++) {
            if(!getSizeOfArraysMap().containsKey(getListOfKeys().get(i))) {
                getSizeOfArraysMap().put(getListOfKeys().get(i),getListOfNumbers().get(i));
            }else if(getSizeOfArraysMap().get(getListOfKeys().get(i)) < getListOfNumbers().get(i)) {
                getSizeOfArraysMap().replace(getListOfKeys().get(i), getListOfNumbers().get(i));
            }
        }
    }
}
