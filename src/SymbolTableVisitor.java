import Exceptions.SymbolTableErrorExceptions.DublicateDeclaration;
import Exceptions.SymbolTableErrorExceptions.IncompatibleTypes;
import Exceptions.SymbolTableErrorExceptions.VariableMissing;
import ast.*;

public class SymbolTableVisitor extends AbstractNodeVisitor{
    private SymbolTable symbolTable = new SymbolTable();


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
        if(symbolTable.getIdTable().get(node.getId().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getId().getSpelling())){
            symbolTable.put(node.getId().getSpelling(), new Sym(node, symbolTable.getDepth(), node.getType()));
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
        TRUNType vType = (TRUNType) visit(node.getId());
        TRUNType eType = (TRUNType) visit(node.getValue());

        boolean isInSymbolTable = symbolTable.getIdTable().containsKey(node.getId().getSpelling());

        if(!isInSymbolTable){
            throw new VariableMissing("Variable " + node.getId().spelling + " is not declared");
        }
        if(!(symbolTable.getIdTable().get(node.getId().getSpelling()).getType() instanceof INTDCL && node.getValue() instanceof IntegerLiteral)){
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
            symbolTable.put(node.getId().getSpelling(), new Sym(node, symbolTable.getDepth(), new FLOATDCL()));
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
            symbolTable.put(node.getFunctionName().getSpelling(), new Sym(node, symbolTable.getDepth(), null));
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
        return null;
    }

    @Override
    public Object visit(Identifier node) {
        return null;
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
            symbolTable.put(node.getId().getSpelling(), new Sym(node, symbolTable.getDepth(), new INTDCL()));
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
        visit(node.getStmts());
        symbolTable.closeScope();
        return null;
    }

    @Override
    public Object visit(ReturnFunctionDeclaration node) {
        if(symbolTable.getIdTable().get(node.getFunctionName().getSpelling()) == null && !symbolTable.getIdTable().containsKey(node.getFunctionName().getSpelling())){
            symbolTable.put(node.getFunctionName().getSpelling(), new Sym(node, symbolTable.getDepth(), node.getReturnType()));
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
        }else if(node instanceof ValueAssignment) {
            visit((ValueAssignment) node);
        }else if(node instanceof IfStatement){
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
            symbolTable.put(node.getId().getSpelling(), new Sym(node, symbolTable.getDepth(),new TEXTDCL()));
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
            symbolTable.put(node.getId().getSpelling(), new Sym(node, symbolTable.getDepth(), new TRUTHDCL()));
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
        visit(node.getStmts());
        symbolTable.closeScope();
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
