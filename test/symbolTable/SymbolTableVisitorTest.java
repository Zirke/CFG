package symbolTable;

import ast.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class SymbolTableVisitorTest {
    symbolTable.SymbolTableVisitor symbolTableVisitor = new symbolTable.SymbolTableVisitor();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @org.junit.Test
    public void visitAndTest() {
        And node = new And("And node", new TruthLiteral("false"), new TruthLiteral("true"), 2);
        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    //TODO ASM value?
    @org.junit.Test
    public void visitArrayAssignmentTest() {
        Identifier identifier = new Identifier("a");
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        IntDeclaration intDeclaration = new IntDeclaration(identifier,integerLiteral);
        SingleElementAssign singleElementAssign = new SingleElementAssign(new IntegerLiteral("2"),new IntegerLiteral("2"), 10);
        ArrayAssignment node = new ArrayAssignment(identifier, singleElementAssign, 10);

        try {
            symbolTableVisitor.visit(intDeclaration);
            assertNull(symbolTableVisitor.visit(node));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitArthimParenTest() {
        Minus minusNode = new Minus("Minus", new IntegerLiteral("19"), new IntegerLiteral("9"), 10);
        ArithmParenthesis node = new ArithmParenthesis("ArthimParen", minusNode, null, 4);

        Plus plusNode = new Plus("Plus", new FloatLiteral("19.0"), new IntegerLiteral("9"), 11);
        ArithmParenthesis nodePlus = new ArithmParenthesis("ArthimParen", plusNode, null, 4);
        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertTrue(symbolTableVisitor.visit(nodePlus) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitArrayDeclaration() {
        List<Value> listOfIntegers = new ArrayList<>();
        List<Value> listWithout = new ArrayList<>();
        listOfIntegers.add(new IntegerLiteral("1"));
        listOfIntegers.add(new IntegerLiteral("2"));
        Identifier identifier = new Identifier("identifier");
        Identifier noValIden = new Identifier("novals");
        MultipleElementAssign multiple = new MultipleElementAssign(listOfIntegers, 10);
        MultipleElementAssign none = new MultipleElementAssign(listWithout, 20);
        ArrayDeclaration node = new ArrayDeclaration(identifier, multiple, new INTDCL());
        ArrayDeclaration nodeWithOutValues = new ArrayDeclaration(noValIden, none, new FLOATDCL());

        try {
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(nodeWithOutValues);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(noValIden.getSpelling()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void visitArrayElementAddTest() {
        Identifier identifier = new Identifier("id");
        ArrayElementAddStatement node = new ArrayElementAddStatement(identifier, new IntegerLiteral("10"), new IntegerLiteral("20"), 1);
        ArrayElementAddStatement floatnode = new ArrayElementAddStatement(identifier, new IntegerLiteral("10"), new FloatLiteral("2.0"), 2);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertTrue(symbolTableVisitor.visit(floatnode) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitArrayIndexStatementTest() {
        IntegerLiteral intNode = new IntegerLiteral("2");
        Identifier id = new Identifier("intdcl");
        ArrayIndexStatement node = new ArrayIndexStatement(id, intNode, 3);

        try {
            assertNull(symbolTableVisitor.visit(node));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitDivideTest() {
        Divide node = new Divide("Divide", new FloatLiteral("float"), new IntegerLiteral("integer"), 10);
        Divide iNode = new Divide("Divide", new IntegerLiteral("integer"), new IntegerLiteral("integer"), 11);
        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertTrue(symbolTableVisitor.visit(iNode) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitDriveStatementTest() {
        IntegerLiteral intlit = new IntegerLiteral("2");
        Identifier identifier = new Identifier("b");
        IntDeclaration intDeclaration = new IntDeclaration(identifier, null);
        DriveStatement node = new DriveStatement(intlit, 10);
        DriveStatement wIDnode = new DriveStatement(identifier, 12);

        try {
            symbolTableVisitor.visit(intDeclaration);
            assertNull(symbolTableVisitor.visit(node));
            assertNull(symbolTableVisitor.visit(wIDnode));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitElseIfTest() {
        List<Statement> statementList = new ArrayList<>();
        statementList.add(new IntDeclaration(new Identifier("v"), null));
        StatementList statementList1 = new StatementList(statementList);
        ElseIfStatement node = new ElseIfStatement(new TruthLiteral("true"), statementList1,10);

        try{
            assertNull(symbolTableVisitor.visit(node));
            assertTrue(node.getTruth()instanceof TruthLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitElseThenTest() {
        List<Statement> statementList = new ArrayList<>();
        statementList.add(new IntDeclaration(new Identifier("v"), null));
        StatementList statementList1 = new StatementList(statementList);
        ElseThenStmt node = new ElseThenStmt(statementList1,20);

        try{
            assertNull(symbolTableVisitor.visit(node));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitValueAssignmentTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        Identifier identifier = new Identifier("identifier");
        IntDeclaration intDeclaration = new IntDeclaration(identifier,null);
        ValueAssignment valueAssignment = new ValueAssignment(identifier,integerLiteral,20);

        try{
            symbolTableVisitor.visit(intDeclaration);
            assertNull(symbolTableVisitor.visit(valueAssignment));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void visitFloatDeclarationTest() {
        Identifier identifier = new Identifier("b");
        Identifier secondID = new Identifier("c");
        FloatLiteral floatlit = new FloatLiteral("2.2");
        FloatDeclaration node = new FloatDeclaration(identifier, floatlit);
        FloatDeclaration noVal = new FloatDeclaration(secondID, null);

        try {
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(noVal);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(secondID.getSpelling()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void visitFloatLiteralTest() {
        FloatLiteral floatLiteral = new FloatLiteral("2.7");

        assertTrue(symbolTableVisitor.visit(floatLiteral) instanceof FloatLiteral);
        assertFalse(symbolTableVisitor.visit(floatLiteral) instanceof IntegerLiteral);
        assertFalse(symbolTableVisitor.visit(floatLiteral) instanceof TextLiteral);
        assertFalse(symbolTableVisitor.visit(floatLiteral) instanceof TruthLiteral);
    }

    @org.junit.Test
    public void visitFromStatementTest() {
        Upto upto = new Upto("upto");
        List<Statement> statementList = new ArrayList<>();
        statementList.add(new IntDeclaration(new Identifier("v"), null));
        StatementList statementList1 = new StatementList(statementList);
        FromStatement fromStatement = new FromStatement(new IntegerLiteral("2"), new IntegerLiteral("1"),upto,statementList1,10);

        try{
            assertNull(symbolTableVisitor.visit(fromStatement));
            assertTrue(fromStatement.getFromVal() instanceof IntegerLiteral);
            assertTrue(fromStatement.getToVal() instanceof IntegerLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitFunctionCallTest() {
        Identifier identifier = new Identifier("funcName");
        List<Parameter> listOfParameters = new ArrayList<>();
        List<Statement> listOfStatements = new ArrayList<>();
        List<Value> valueList = new ArrayList<>();
        valueList.add(new IntegerLiteral("2"));
        Parameter parameter = new Parameter(new INTDCL(), new Identifier("param"), 10);
        listOfParameters.add(parameter);
        ReturnFunctionDeclaration functionDeclaration = new ReturnFunctionDeclaration(identifier, listOfParameters, new StatementList(listOfStatements),new INTDCL(), 10);
        FunctionCall node = new FunctionCall(identifier,valueList,10);

        try{
            symbolTableVisitor.visit(functionDeclaration);
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitFunctionDeclarationTest() {
        Identifier identifier = new Identifier("funcName");
        List<Parameter> listOfParameters = new ArrayList<>();
        List<Statement> listOfStatements = new ArrayList<>();
        FunctionDeclaration node = new FunctionDeclaration(identifier, listOfParameters, new StatementList(listOfStatements), 10);

        try {
            symbolTableVisitor.visit(node);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertNull(symbolTableVisitor.symbolTable.getIdTable().get(identifier.getSpelling()).getType());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitGreaterThanTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        FloatLiteral floatLiteral = new FloatLiteral("1.1");
        IntegerLiteral integerLiteral1 = new IntegerLiteral("10");
        GreaterThan node = new GreaterThan("GreaterThan", integerLiteral, floatLiteral, 10);
        GreaterThan intNode = new GreaterThan("GreaterThan1", integerLiteral, integerLiteral1, 10);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertTrue(symbolTableVisitor.visit(intNode) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(intNode) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitIdentifierTest() {
        Identifier identifier = new Identifier("b");
        IntDeclaration intDeclaration = new IntDeclaration(identifier, null);

        try {
            symbolTableVisitor.visit(intDeclaration);
            assertTrue(symbolTableVisitor.visit(identifier) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(identifier) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(identifier) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(identifier) instanceof TextLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitIfStatementTest() {
        List<Statement> statementList = new ArrayList<>();
        statementList.add(new IntDeclaration(new Identifier("v"), null));
        StatementList statementList1 = new StatementList(statementList);
        ElseIfStatement node = new ElseIfStatement(new TruthLiteral("true"), statementList1,10);

        try{
            assertNull(symbolTableVisitor.visit(node));
            assertTrue(node.getTruth()instanceof TruthLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitIntDeclarationTest() {
        Identifier identifier = new Identifier("b");
        Identifier secondID = new Identifier("c");
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        IntDeclaration node = new IntDeclaration(identifier, integerLiteral);
        IntDeclaration noVal = new IntDeclaration(secondID, null);

        try {
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(noVal);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(secondID.getSpelling()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitIntegerLiteralTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("2");

        try {
            assertTrue(symbolTableVisitor.visit(integerLiteral) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(integerLiteral) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(integerLiteral) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(integerLiteral) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitLessThanTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        FloatLiteral floatLiteral = new FloatLiteral("1.1");
        IntegerLiteral integerLiteral1 = new IntegerLiteral("10");
        LessThan node = new LessThan("LessThan", integerLiteral, floatLiteral, 10);
        LessThan intNode = new LessThan("LessThan1", integerLiteral, integerLiteral1, 12);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertTrue(symbolTableVisitor.visit(intNode) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(intNode) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }

    @org.junit.Test
    public void visitMinusTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("1");
        IntegerLiteral integerLiteral1 = new IntegerLiteral("20");
        FloatLiteral floatLiteral = new FloatLiteral("2.2");
        Minus node = new Minus("Minus", integerLiteral, integerLiteral1, 10);
        Minus mixNode = new Minus("Minus2", integerLiteral, floatLiteral, 20);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertTrue(symbolTableVisitor.visit(mixNode) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void visitMultipleAssignTest() {
        List<Value> listOfValues = new ArrayList<>();
        listOfValues.add(new IntegerLiteral("2"));
        listOfValues.add(new IntegerLiteral("4"));
        MultipleElementAssign node = new MultipleElementAssign(listOfValues, 10);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitNotTest() {
        Not node = new Not("not", new TruthLiteral("true"), 10);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitOrTest() {
        Or node = new Or("or", new TruthLiteral("false"), new TruthLiteral("true"), 10);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitParameterTest() {
        Type type = new INTDCL();
        Identifier identifier = new Identifier("b");
        Parameter node = new Parameter(type, identifier, 10);

        try {
            symbolTableVisitor.visit(node);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitPlusTest() {
        Plus node = new Plus("plus", new IntegerLiteral("10"), new IntegerLiteral("22"), 10);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitRepeatStatementTest() {
        List<Statement> listOfStatements = new ArrayList<>();
        StatementList statementList = new StatementList(listOfStatements);
        RepeatStatement node = new RepeatStatement(statementList,new TruthLiteral("true"), 10);
        try {
            assertTrue(symbolTableVisitor.visit(node.getExpr()) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitReturnFunctionDeclarationTest() {
        Identifier identifier = new Identifier("funcName");
        List<Parameter> listOfParameters = new ArrayList<>();
        List<Statement> listOfStatements = new ArrayList<>();
        Parameter parameter = new Parameter(new INTDCL(), new Identifier("param"), 10);
        listOfParameters.add(parameter);
        ReturnFunctionDeclaration node = new ReturnFunctionDeclaration(identifier, listOfParameters, new StatementList(listOfStatements), new INTDCL(),10);

        try {
            symbolTableVisitor.visit(node);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().get(identifier.getSpelling()).getType() instanceof IntegerLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitReturnStatementTest() {
        ReturnStatement node = new ReturnStatement(new IntegerLiteral("22"), 10);
        /* try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } */
    }

    @org.junit.Test
    public void visitSingleElementAssignTest() {
        SingleElementAssign node = new SingleElementAssign(new IntegerLiteral("2"),new IntegerLiteral("10"), 10);

            assertTrue(node.getAssignemntVal() instanceof IntegerLiteral);
    }

    @org.junit.Test
    public void visitTextAssignmentTest() {
        Identifier identifier = new Identifier("b");
        TextAssignment node = new TextAssignment(identifier,new TextLiteral("test"), 10);
        TextDeclaration textDeclaration = new TextDeclaration(identifier, new TextLiteral("hello"));

        try {
            symbolTableVisitor.visit(textDeclaration);
            assertNull(symbolTableVisitor.visit(node));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTextDeclarationTest() {
        Identifier identifier = new Identifier("b");
        Identifier secondID = new Identifier("c");
        TextLiteral textLiteral = new TextLiteral("test");
        TextDeclaration node = new TextDeclaration(identifier, textLiteral);
        TextDeclaration noVal = new TextDeclaration(secondID, null);

        try {
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(noVal);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(secondID.getSpelling()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTextLiteralTest() {
        TextLiteral node = new TextLiteral("test");

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TextLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTimesTest() {
        Times node = new Times("times", new IntegerLiteral("2"), new IntegerLiteral("10"), 10);
        Times fnode = new Times("times2", new IntegerLiteral("2"), new FloatLiteral("1.1"), 11);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertTrue(symbolTableVisitor.visit(fnode) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTruthDeclarationTest() {
        Identifier identifier = new Identifier("b");
        Identifier secondID = new Identifier("c");
        TruthLiteral truthlit = new TruthLiteral("2.2");
        TruthDeclaration node = new TruthDeclaration(identifier, truthlit);
        TruthDeclaration noVal = new TruthDeclaration(secondID, null);

        try {
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(noVal);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(secondID.getSpelling()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTruthLiteralTest() {
        TruthLiteral node = new TruthLiteral("true");

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTruthParenthesisTest() {
        TruthParenthesis node = new TruthParenthesis("truthparen",new TruthLiteral("true"), 10);

        try {
            assertTrue(symbolTableVisitor.visit(node.getExpr()) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTurnLeftStatementTest() {
        TurnLeftStatement node = new TurnLeftStatement(new IntegerLiteral("1"), 10);

        try {
            assertTrue(symbolTableVisitor.visit(node.getVal()) instanceof IntegerLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTurnRightStatementTest() {
        TurnRightStatement node = new TurnRightStatement(new IntegerLiteral("10"), 10);

        try {
            assertTrue(symbolTableVisitor.visit(node.getVal()) instanceof IntegerLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitWhileTest() {
        WhileStatement node = new WhileStatement(new TruthLiteral("true"), null, 10);
        try {
            assertTrue(symbolTableVisitor.visit(node.getExpr()) instanceof TruthLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitEqualTest() {
        Equal node = new Equal(new IntegerLiteral("1"), new IntegerLiteral("10"), 10);
        Equal fnode = new Equal(new FloatLiteral("2.2"), new FloatLiteral("10.0"), 11);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertTrue(symbolTableVisitor.visit(fnode) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(fnode) instanceof FloatLiteral);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void visitINTDCL() {
        INTDCL node = new INTDCL();

        try{
            assertNull(symbolTableVisitor.visit(node));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
    @org.junit.Test
    public void visitFLOATDCL() {
        FLOATDCL node = new FLOATDCL();

        try{
            assertNull(symbolTableVisitor.visit(node));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTEXTDCL() {
        TEXTDCL node = new TEXTDCL();

        try{
            assertNull(symbolTableVisitor.visit(node));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitTRUTHDCL() {
        TRUTHDCL node = new TRUTHDCL();

        try{
            assertNull(symbolTableVisitor.visit(node));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}