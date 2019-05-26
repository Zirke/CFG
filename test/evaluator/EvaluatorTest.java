package evaluator;

import ast.*;
import org.junit.Test;
import sidevisitors.Evaluator;
import symbolTable.Symbol;
import symbolTable.SymbolTable;

import static org.junit.Assert.*;

public class EvaluatorTest {
    SymbolTable symbolTable = new SymbolTable();
    Evaluator eval = new Evaluator(symbolTable);

    @Test
    public void visitPlus() {
        AbstractNode node = new Plus("",new IntegerLiteral("2"), new IntegerLiteral("2"), 3);
        Integer test = 0;
        try {
            test = (Integer) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(4, test.intValue());
    }

    @Test
    public void visitMinus() {
        AbstractNode node = new Minus("",new IntegerLiteral("3"), new IntegerLiteral("2"), 3);
        Integer test = 0;
        try {
            test = (Integer) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(1, test.intValue());
    }

    @Test
    public void visitTimes() {
        AbstractNode node = new Times("",new IntegerLiteral("3"), new IntegerLiteral("2"), 3);
        Integer test = 0;
        try {
            test = (Integer) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(6, test.intValue());
    }

    @Test
    public void visitDivide() {
        AbstractNode node = new Divide("",new IntegerLiteral("10"), new IntegerLiteral("5"), 3);
        Integer test = 0;
        try {
            test = (Integer) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(2, test.intValue());
    }

    @Test
    public void visitParenthesis() {
        AbstractNode node = new ArithmParenthesis( "", new Minus("",new IntegerLiteral("3"), new IntegerLiteral("2"), 3),
                null,3);

        Integer test = 0;
        try {
            test = (Integer) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(1, test.intValue());
    }

    @Test
    public void visitIntegerLiteral() {
        AbstractNode node = new IntegerLiteral("3");
        Integer test = 0;
        try {
            test = (Integer) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(3, test.intValue());
    }

    @Test
    public void visitFloatLiteral() {
        AbstractNode node = new DecimalLiteral("3.3");
        Double test = 0.0;
        try {
            test = (Double) eval.visit(node);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertTrue(test == 3.3);
    }

    @Test
    public void visitIdentifier() {
        Identifier testid =new Identifier("s");
        IntDeclaration intdecl= new IntDeclaration(testid, new IntegerLiteral("10"));
        Symbol sym = new Symbol(intdecl, symbolTable.getDepth(), new IntegerLiteral("integer"));
        sym.setValue(new IntegerLiteral("3"));
        symbolTable.put(intdecl.getId().getSpelling(), sym);
        Integer test = 0;
        try {
            test = (Integer) eval.visit(testid);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        assertEquals(3, test.intValue());
    }
}