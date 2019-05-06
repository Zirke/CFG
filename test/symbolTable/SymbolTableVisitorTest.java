package symbolTable;

import Exceptions.SemanticCheckerExceptions.IncompatibleTypes;
import Exceptions.SemanticCheckerExceptions.IncorrectOperatorUse;
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
        And nodeWithOutTruths = new And("And node", new FloatLiteral("float"), new IntegerLiteral("integer"), 3);
        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            symbolTableVisitor.visit(nodeWithOutTruths);
            thrown.expect(IncorrectOperatorUse.class);
        }catch (NoSuchMethodException e ){
            e.printStackTrace();
        }
    }

    //TODO
    @org.junit.Test
    public void visitArrayAssignmentTest() {
        Identifier identifier = new Identifier("a");
        ArrayAsmValue asmValue = new ArrayAsmValue() {};
        ArrayAssignment node = new ArrayAssignment(identifier,asmValue, 10 );

        try{
            assertNull(symbolTableVisitor.visit(node));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitArthimParenTest() {
        Minus minusNode = new Minus("Minus",new IntegerLiteral("19"),new IntegerLiteral("9"), 10);
        ArithmParenthesis node = new ArithmParenthesis("ArthimParen", minusNode, null, 4);

        Plus plusNode = new Plus("Plus",new FloatLiteral("19.0"),new IntegerLiteral("9"), 11);
        ArithmParenthesis nodePlus = new ArithmParenthesis("ArthimParen", plusNode, null, 4);
        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertTrue(symbolTableVisitor.visit(nodePlus) instanceof FloatLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitArrayDeclaration() {
        List<Value> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(new IntegerLiteral("1"));
        listOfIntegers.add(new IntegerLiteral("2"));
        Identifier identifier = new Identifier("identifier");
        Identifier noValIden = new Identifier("novals");
        MultipleElementAssign multiple = new MultipleElementAssign(listOfIntegers, 10);
        ArrayDeclaration node = new ArrayDeclaration(identifier,multiple,new INTDCL());
        ArrayDeclaration nodeWithOutValues = new ArrayDeclaration(identifier,null,new FLOATDCL());

        try{
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(nodeWithOutValues);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(noValIden.getSpelling()));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }

    }
    //TODO
    @org.junit.Test
    public void visitArrayElementAddTest() {
    }

    //TODO fix exception
    @org.junit.Test
    public void visitArrayIndexStatementTest() {
        IntegerLiteral intNode = new IntegerLiteral("2");
        FloatLiteral floatLiteral = new FloatLiteral("3.3");
        Identifier id = new Identifier("intdcl");
        ArrayIndexStatement node = new ArrayIndexStatement(id, intNode, 3);
        ArrayIndexStatement fnode = new ArrayIndexStatement(id, floatLiteral, 4);
        try{
            assertNull(symbolTableVisitor.visit(node));
            symbolTableVisitor.visit(fnode);
            thrown.expect(IncompatibleTypes.class);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitDivideTest() {
        Divide node = new Divide("Divide", new FloatLiteral("float"),new IntegerLiteral("integer"), 10);
        Divide iNode = new Divide("Divide", new IntegerLiteral("integer"),new IntegerLiteral("integer"), 11);
        Divide wNode = new Divide("Divide", new TextLiteral("mistake"),new IntegerLiteral("integer"), 11);
        try{
            assertTrue(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertTrue(symbolTableVisitor.visit(iNode) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            //exception
            assertFalse(symbolTableVisitor.visit(wNode) instanceof FloatLiteral);
            thrown.expect(IncorrectOperatorUse.class);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitDriveStatementTest() {
        IntegerLiteral intlit = new IntegerLiteral("2");
        Identifier identifier = new Identifier("b");
        IntDeclaration intDeclaration = new IntDeclaration(identifier,null);
        DriveStatement node = new DriveStatement(intlit, 10);
        DriveStatement wIDnode = new DriveStatement(identifier, 12);

        try{
            symbolTableVisitor.visit(intDeclaration);
            assertNull(symbolTableVisitor.visit(node));
            assertNull(symbolTableVisitor.visit(wIDnode));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitElseIfTest() {

    }

    @org.junit.Test
    public void visitElseThenTest() {
    }

    //TODO Catch an exception
    @org.junit.Test
    public void visitValueAssignmentTest() {

    }

    @org.junit.Test
    public void visitFloatDeclarationTest() {
        Identifier identifier = new Identifier("b");
        Identifier secondID = new Identifier("c");
        FloatLiteral floatlit = new FloatLiteral("2.2");
        FloatDeclaration node = new FloatDeclaration(identifier,floatlit);
        FloatDeclaration noVal = new FloatDeclaration(secondID,null);

        try{
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(noVal);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(secondID.getSpelling()));
        }catch (NoSuchMethodException e){
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

    //TODO
    @org.junit.Test
    public void visitFromStatementTest() {
    }

    //TODO
    @org.junit.Test
    public void visitFunctionCallTest() {
    }

    @org.junit.Test
    public void visitFunctionDeclarationTest() {
        Identifier identifier = new Identifier("funcName");
        List<Parameter> listOfParameters = new ArrayList<>();
        List<Statement> listOfStatements = new ArrayList<>();
        Parameter parameter = new Parameter(new INTDCL(), new Identifier("param"),10);
        listOfParameters.add(parameter);
        FunctionDeclaration node = new FunctionDeclaration(identifier,listOfParameters,new StatementList(listOfStatements),10);

        try{
            symbolTableVisitor.visit(node);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertNull(symbolTableVisitor.symbolTable.getIdTable().get(identifier.getSpelling()).getType());
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitGreaterThanTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        FloatLiteral floatLiteral = new FloatLiteral("1.1");
        IntegerLiteral integerLiteral1 = new IntegerLiteral("10");
        GreaterThan node = new GreaterThan("GreaterThan", integerLiteral,floatLiteral,10);
        GreaterThan intNode = new GreaterThan("GreaterThan1", integerLiteral,integerLiteral1,10);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertTrue(symbolTableVisitor.visit(intNode) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(intNode) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    //TODO Exception
    @org.junit.Test
    public void visitIdentifierTest() {
        Identifier identifier = new Identifier("b");
        IntDeclaration intDeclaration = new IntDeclaration(identifier, null);

        try{
            symbolTableVisitor.visit(intDeclaration);
            assertTrue(symbolTableVisitor.visit(identifier) instanceof INTDCL);
            assertFalse(symbolTableVisitor.visit(identifier) instanceof FLOATDCL);
            assertFalse(symbolTableVisitor.visit(identifier) instanceof TRUTHDCL);
            assertFalse(symbolTableVisitor.visit(identifier) instanceof TEXTDCL);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    //TODO
    @org.junit.Test
    public void visitIfStatementTest() {
    }

    @org.junit.Test
    public void visitIntDeclarationTest() {
        Identifier identifier = new Identifier("b");
        Identifier secondID = new Identifier("c");
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        IntDeclaration node = new IntDeclaration(identifier,integerLiteral);
        IntDeclaration noVal = new IntDeclaration(secondID,null);

        try{
            symbolTableVisitor.visit(node);
            symbolTableVisitor.visit(noVal);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(secondID.getSpelling()));
        }catch (NoSuchMethodException e){
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
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitLessThanTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("2");
        FloatLiteral floatLiteral = new FloatLiteral("1.1");
        IntegerLiteral integerLiteral1 = new IntegerLiteral("10");
        LessThan node = new LessThan("LessThan", integerLiteral,floatLiteral,10);
        LessThan intNode = new LessThan("LessThan1", integerLiteral,integerLiteral1,12);

        try {
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertTrue(symbolTableVisitor.visit(intNode) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(intNode) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }


    }

    @org.junit.Test
    public void visitMinusTest() {
        IntegerLiteral integerLiteral = new IntegerLiteral("1");
        IntegerLiteral integerLiteral1 = new IntegerLiteral("20");
        FloatLiteral floatLiteral = new FloatLiteral("2.2");
        Minus node = new Minus("Minus", integerLiteral, integerLiteral1,10);
        Minus mixNode = new Minus("Minus2", integerLiteral, floatLiteral, 20);

        try{
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof FloatLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TruthLiteral);
            assertFalse(symbolTableVisitor.visit(node) instanceof TextLiteral);
            assertTrue(symbolTableVisitor.visit(mixNode) instanceof FloatLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void visitMultipleAssignTest() {
        List<Value> listOfValues = new ArrayList<>();
        listOfValues.add(new IntegerLiteral("2"));
        listOfValues.add(new IntegerLiteral("4"));
        MultipleElementAssign node = new MultipleElementAssign(listOfValues,10);

        try{
            assertTrue(symbolTableVisitor.visit(node) instanceof IntegerLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitNotTest() {
        Not node = new Not("not", new TruthLiteral("true"),10);

        try{
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitOrTest() {
        Or node = new Or("or", new TruthLiteral("false"), new TruthLiteral("true"), 10);

        try{
            assertTrue(symbolTableVisitor.visit(node) instanceof TruthLiteral);
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visitParameterTest() {
        Type type = new INTDCL();
        Identifier identifier = new Identifier("b");
        Parameter node = new Parameter(type,identifier,10);

        try{
            symbolTableVisitor.visit(node);
            assertTrue(symbolTableVisitor.symbolTable.getIdTable().containsKey(identifier.getSpelling()));
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void visit31() {
    }

    @org.junit.Test
    public void visit32() {
    }

    @org.junit.Test
    public void visit33() {
    }

    @org.junit.Test
    public void visit34() {
    }

    @org.junit.Test
    public void visit35() {
    }

    @org.junit.Test
    public void visit36() {
    }

    @org.junit.Test
    public void visit37() {
    }

    @org.junit.Test
    public void visit38() {
    }

    @org.junit.Test
    public void visit39() {
    }

    @org.junit.Test
    public void visit40() {
    }

    @org.junit.Test
    public void visit41() {
    }

    @org.junit.Test
    public void visit42() {
    }

    @org.junit.Test
    public void visit43() {
    }

    @org.junit.Test
    public void visit44() {
    }

    @org.junit.Test
    public void visit45() {
    }

    @org.junit.Test
    public void visit46() {
    }

    @org.junit.Test
    public void visit47() {
    }

    @org.junit.Test
    public void visit48() {
    }

    @org.junit.Test
    public void visit49() {
    }

    @org.junit.Test
    public void visit50() {
    }

    @org.junit.Test
    public void putTogetherArrayHashMap() {
    }

    @org.junit.Test
    public void getSizeOfArrays() {
    }
}
