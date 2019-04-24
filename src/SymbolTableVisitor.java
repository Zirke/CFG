import Exceptions.SymbolTableErrorExceptions.DublicateDeclaration;

public class SymbolTableVisitor extends AbstractNodeVisitor{

    public SymbolTable symbolTable = new SymbolTable();

    @Override
    public Object visit(AbstractNode node) {
        if(node instanceof StatementList){
            visit((StatementList) node);
        } else if(node instanceof Statement) {
            visit((Statement) node);
        }
        return null;
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
        if(symbolTable.get(node.id) == null){
            symbolTable.put(node.id, new Sym(node, symbolTable.getDepth()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id + "is already declared");
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
    public Object visit(FloatDeclaration node) {
        if(symbolTable.get(node.id) == null){
            symbolTable.put(node.id, new Sym(node, symbolTable.getDepth()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id + "is already declared");
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
        return null;
    }

    @Override
    public Object visit(FunctionCall node) {
        return null;
    }

    @Override
    public Object visit(FunctionDeclaration node) {
        if(symbolTable.get(node.functionName) == null){
            symbolTable.put(node.functionName, new Sym(node, symbolTable.getDepth()));
        } else{
            throw new DublicateDeclaration("Variable " + node.functionName + "is already declared");
        }
        return null;
    }

    @Override
    public Object visit(GreaterThan node) {
        return null;
    }

    @Override
    public Object visit(Identifier node) {
        return null;
    }

    @Override
    public Object visit(IfStatement node) {
        symbolTable.openScope();
        visit(node.trueStm);
        symbolTable.closeScope();
        for(ElseIfStatement elseIfStatement : node.elseifs){
            visit(elseIfStatement);
        }
        visit(node.elsethen);
        return null;
    }

    @Override
    public Object visit(INTDCL node) {
        return null;
    }

    @Override
    public Object visit(IntDeclaration node) {
        if(!symbolTable.getIdTable().containsKey(node.id)){
            symbolTable.put(node.id, new Sym(node, symbolTable.getDepth()));
        } else{
            throw new DublicateDeclaration("Variable Int " + node.id.toString() + "is already declared");
        }
        return null;
    }

    @Override
    public Object visit(IntegerLiteral node) {
        return null;
    }

    @Override
    public Object visit(LessThan node) {
        return null;
    }

    @Override
    public Object visit(Minus node) {
        return null;
    }

    @Override
    public Object visit(MultipleElementAssign node) {
        return null;
    }

    @Override
    public Object visit(Not node) {
        return null;
    }

    @Override
    public Object visit(Or node) {
        return null;
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
        symbolTable.openScope();
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration node) {
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
    public Object visit(Statement node) {
        if(node instanceof IntDeclaration){
            visit((IntDeclaration) node);
        }else if(node instanceof FloatDeclaration){
            visit((FloatDeclaration) node);
        }else if(node instanceof TextDeclaration){
            visit((TextDeclaration) node);
        }else if(node instanceof TruthDeclaration){
            visit((TruthDeclaration) node);
        } else if(node instanceof ArrayDeclaration) {
            visit((ArrayDeclaration) node);
        } else if(node instanceof IfStatement){
            visit((IfStatement) node);
        } else if(node instanceof WhileStatement){
            visit((WhileStatement) node);
        } else if(node instanceof RepeatStatement) {
            visit((RepeatStatement) node);
        } else if(node instanceof FromStatement){
            visit((FromStatement) node);
        } else if(node instanceof FunctionDeclaration){
            visit((FunctionDeclaration) node);
        }
        return null;
    }

    @Override
    public Object visit(StatementList node) {
        for(Statement stm : node.stmts){
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
        if(symbolTable.get(node.id) == null){
            symbolTable.put(node.id, new Sym(node, symbolTable.getDepth()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id + "is already declared");
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
        if(symbolTable.get(node.id) == null){
            symbolTable.put(node.id, new Sym(node, symbolTable.getDepth()));
        } else{
            throw new DublicateDeclaration("Variable " + node.id + "is already declared");
        }
        return null;
    }

    @Override
    public Object visit(TruthLiteral node) {
        return null;
    }

    @Override
    public Object visit(TruthOperator node) {
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
    public Object visit(Type node) {
        return null;
    }

    @Override
    public Object visit(Upto node) {
        return null;
    }

    @Override
    public Object visit(WhileStatement node) {
        symbolTable.openScope();
        return null;
    }

    @Override
    public Object visit(Equal node) {
        return null;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
