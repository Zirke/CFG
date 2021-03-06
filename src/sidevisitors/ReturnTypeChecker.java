package sidevisitors;

import ast.*;
import astVisitor.AbstractNodeVisitor;
import symbolTable.SymbolTable;

import java.util.ArrayList;

public class ReturnTypeChecker extends AbstractNodeVisitor<Object> {
    ArrayList<Value> returnValus = new ArrayList<>();
    SymbolTable symTable;


    public ReturnTypeChecker(SymbolTable symTable) {
        this.symTable = symTable;
    }

    public void visit(StatementList node){
        Evaluator eval = new Evaluator(symTable);
        for(Statement stm : node.getStmts()){
            if(stm instanceof ReturnStatement){
                ReturnStatement retstm = (ReturnStatement) stm;
                if(retstm.getVal() instanceof TruthOperator){
                    TruthLiteral retval = new TruthLiteral("truth literal"); retval.setLineNumber(retstm.getLineNumber());
                    returnValus.add(retval);

                }if(retstm.getVal() instanceof ArithmOperator){
                    Object value = null;
                    try {
                         value = eval.visit(retstm.getVal());
                    } catch (NoSuchMethodException e) { }
                    if(value instanceof Integer){

                        IntegerLiteral retval = new IntegerLiteral("integer literal"); retval.setLineNumber(retstm.getLineNumber());
                        returnValus.add(retval);
                    }else if(value instanceof Double){
                        DecimalLiteral retval = new DecimalLiteral("float literal"); retval.setLineNumber(retstm.getLineNumber());
                        returnValus.add(retval);
                    }

                }else{
                    returnValus.add(retstm.getVal());
                }
            }else{
                try {
                    visit(stm);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void visit(IfStatement node){
        visit(node.getTrueStm());
        for(ElseIfStatement ifs : node.getElseifs()){
            visit(ifs);
        }
        visit(node.getElsethen());
    }
    public void visit(ElseIfStatement node){
        visit(node.getStms());
    }
    public void visit(ElseThenStmt node){
        visit(node.getStms());
    }

    public void visit(FromStatement node){
        visit(node.getStmts());
    }
    public void visit(FunctionDeclaration node){
        visit(node.getStmtBody());
    }

    public void visit(RepeatStatement node){
        visit(node.getStmts());
    }

    public void visit(ReturnFunctionDeclaration node){
        visit(node.getStmtBody());
    }
    public void visit(WhileStatement node){
        visit(node.getStmts());
    }

    public void defaultVisit(AbstractNode node){}

    public ArrayList<Value> getReturnValus() {
        return returnValus;
    }
}
