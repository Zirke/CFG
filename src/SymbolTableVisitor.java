import Exceptions.SymbolTableErrorExceptions.DublicateDeclaration;
import ast.*;

public class SymbolTableVisitor extends AbstractNodeVisitor{
    public SymbolTable symbolTable = new SymbolTable();


    @Override
    public Object visit(AbstractNode node) {
        if(node instanceof StatementList){
            visit((StatementList) node);
        } else if(node instanceof Statement) {
            visit((Statement) node);
        }
        return symbolTable;
    }

    @Override
    public Object visit(Value node) {
        return null;
    }

    @Override
    public Object visit(And node) {
        return null;
    }

    @Override
    public Object visit(ArithmOperator node) {
        return null;
    }

    @Override
    public Object visit(ArithmParenthesis node) {
        return null;
    }

    @Override
    public Object visit(ArrayAssignment node) {
        return null;
    }

    @Override
    public Object visit(ArrayAsmValue node) {
        return null;
    }

    @Override
    public Object visit(ArrayDeclaration node) {
        if(symbolTable.getIdTable().get(node.id.spelling) == null && !symbolTable.getIdTable().containsKey(node.id.spelling)){
            symbolTable.put(node.id.spelling, new Sym(node, symbolTable.getDepth(), node.type));
        } else{
            throw new DublicateDeclaration("Variable " + node.id.spelling + " is already declared");
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
        return null;
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
        visit(node.stms);
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ElseThenStmt node) {
        symbolTable.openScope();
        visit(node.stms);
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ValueAssignment node) {
        return null;
    }

    @Override
    public Object visit(FLOATDCL node) {
        return null;
    }

    @Override
    public Object visit(ast.FloatDeclaration node) {
        if(symbolTable.getIdTable().get(node.id.spelling) == null && !symbolTable.getIdTable().containsKey(node.id.spelling)){
            symbolTable.put(node.id.spelling, new Sym(node, symbolTable.getDepth(), new ast.FLOATDCL()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ast.FloatLiteral node) {
        return null;
    }

    @Override
    public Object visit(ast.FromKeyword node) {
        return null;
    }

    @Override
    public Object visit(ast.FromStatement node) {
        symbolTable.openScope();
        visit(node.stmts);
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ast.FunctionCall node) {
        return null;
    }

    @Override
    public Object visit(ast.FunctionDeclaration node) {
        if(symbolTable.getIdTable().get(node.functionName.spelling) == null && !symbolTable.getIdTable().containsKey(node.functionName.spelling)){
            symbolTable.put(node.functionName.spelling, new Sym(node, symbolTable.getDepth(), null));
            symbolTable.openScope();
            visit(node.stmtBody);
            symbolTable.closeScope();
        } else{
            throw new DublicateDeclaration("Variable " + node.functionName.spelling + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ast.GreaterThan node) {
        return null;
    }

    @Override
    public Object visit(ast.Identifier node) {
        return null;
    }

    @Override
    public Object visit(ast.IfStatement node) {
        symbolTable.openScope();
        visit(node.trueStm);
        symbolTable.closeScope();
        for(ast.ElseIfStatement elseIfStatement : node.elseifs){
            visit(elseIfStatement);
        }
        visit(node.elsethen);
        return null;
    }

    @Override
    public Object visit(ast.INTDCL node) {
        return null;
    }

    @Override
    public Object visit(ast.IntDeclaration node) {
        if(symbolTable.getIdTable().get(node.id.spelling) == null && !symbolTable.getIdTable().containsKey(node.id.spelling)){
            symbolTable.put(node.id.spelling, new Sym(node, symbolTable.getDepth(), new ast.INTDCL()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id.spelling + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ast.IntegerLiteral node) {
        return null;
    }

    @Override
    public Object visit(ast.LessThan node) {
        return null;
    }

    @Override
    public Object visit(ast.Minus node) {
        return null;
    }

    @Override
    public Object visit(ast.MultipleElementAssign node) {
        return null;
    }

    @Override
    public Object visit(ast.Not node) {
        return null;
    }

    @Override
    public Object visit(ast.Or node) {
        return null;
    }

    @Override
    public Object visit(ast.Parameter node) {
        return null;
    }

    @Override
    public Object visit(ast.Plus node) {
        return null;
    }

    @Override
    public Object visit(ast.RepeatStatement node) {
        symbolTable.openScope();
        visit(node.stmts);
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ast.ReturnFunctionDeclaration node) {
        if(symbolTable.getIdTable().get(node.functionName.spelling) == null && !symbolTable.getIdTable().containsKey(node.functionName.spelling)){
            symbolTable.put(node.functionName.spelling, new Sym(node, symbolTable.getDepth(), node.returnType));
            symbolTable.openScope();
            visit(node.stmtBody);
            symbolTable.closeScope();
        } else{
            throw new DublicateDeclaration("Variable " + node.functionName.spelling + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ast.ReturnStatement node) {
        return null;
    }

    @Override
    public Object visit(ast.SingleElementAssign node) {
        return null;
    }

    @Override
    public Object visit(ast.Statement node) {
        if(node instanceof ast.IntDeclaration){
            visit((ast.IntDeclaration) node);
        }else if(node instanceof ast.FloatDeclaration){
            visit((ast.FloatDeclaration) node);
        }else if(node instanceof ast.TextDeclaration){
            visit((ast.TextDeclaration) node);
        }else if(node instanceof ast.TruthDeclaration){
            visit((ast.TruthDeclaration) node);
        } else if(node instanceof ast.ArrayDeclaration) {
            visit((ast.ArrayDeclaration) node);
        } else if(node instanceof ast.IfStatement){
            visit((ast.IfStatement) node);
        } else if(node instanceof ast.WhileStatement){
            visit((ast.WhileStatement) node);
        } else if(node instanceof ast.RepeatStatement) {
            visit((ast.RepeatStatement) node);
        } else if(node instanceof ast.FromStatement){
            visit((ast.FromStatement) node);
        } else if(node instanceof ast.FunctionDeclaration){
            visit((ast.FunctionDeclaration) node);
        }
        return null;
    }

    @Override
    public Object visit(ast.StatementList node) {
        for(ast.Statement stm : node.stmts){
            visit(stm);
        }
        return null;
    }

    @Override
    public Object visit(ast.TextAssignment node) {
        return null;
    }

    @Override
    public Object visit(ast.TEXTDCL node) {
        return null;
    }

    @Override
    public Object visit(ast.TextDeclaration node) {
        if(symbolTable.getIdTable().get(node.id.spelling) == null && !symbolTable.getIdTable().containsKey(node.id.spelling)){
            symbolTable.put(node.id.spelling, new Sym(node, symbolTable.getDepth(),new ast.TEXTDCL()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ast.TextLiteral node) {
        return null;
    }

    @Override
    public Object visit(ast.Times node) {
        return null;
    }

    @Override
    public Object visit(ast.TRUTHDCL node) {
        return null;
    }

    @Override
    public Object visit(ast.TruthDeclaration node) {
        if(symbolTable.getIdTable().get(node.id.spelling) == null && !symbolTable.getIdTable().containsKey(node.id.spelling)){
            symbolTable.put(node.id.spelling, new Sym(node, symbolTable.getDepth(), new ast.TRUTHDCL()));
        } else {
            throw new DublicateDeclaration("Variable " + node.id.spelling + " is already declared");
        }
        return null;
    }

    @Override
    public Object visit(ast.TruthLiteral node) {
        return null;
    }

    @Override
    public Object visit(ast.TruthOperator node) {
        return null;
    }

    @Override
    public Object visit(ast.TruthParenthesis node) {
        return null;
    }

    @Override
    public Object visit(ast.TurnLeftStatement node) {
        return null;
    }

    @Override
    public Object visit(ast.TurnRightStatement node) {
        return null;
    }

    @Override
    public Object visit(ast.Type node) {
        return null;
    }

    @Override
    public Object visit(ast.Upto node) {
        return null;
    }

    @Override
    public Object visit(ast.WhileStatement node) {
        symbolTable.openScope();
        visit(node.stmts);
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ast.Equal node) {
        return null;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
