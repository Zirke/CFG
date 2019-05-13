package evaluator;

import ast.*;
import astVisitor.AbstractNodeVisitor;
import symbolTable.SymbolTable;

public class Evaluator extends AbstractNodeVisitor<Object> {
    SymbolTable symtable = new SymbolTable();

    public Evaluator(SymbolTable symtable) {
        this.symtable = symtable;
    }

    public Object visit(ArithmParenthesis node) throws NoSuchMethodException {
        return visit(node.getLeft());
    }


    public Object visit(Plus node) throws NoSuchMethodException {
        Object right = visit(node.getRight());
        Object left = visit(node.getLeft());
        if(right instanceof Double && left instanceof Double){
            return (Double)left + (Double)right;
        }else if(right instanceof Integer && left instanceof Integer){
            return (Integer)left + (Integer)right;
        }
        return  null;
    }
    public Object visit(Minus node) throws NoSuchMethodException {
        Object right = visit(node.getRight());
        Object left = visit(node.getLeft());
        if(right instanceof Double && left instanceof Double){
            return (Double)left - (Double)right;
        }else if(right instanceof Integer && left instanceof Integer){
            return (Integer)left - (Integer)right;
        }
        return  null;}

    public Object visit(Times node)throws NoSuchMethodException{
        Object right = visit(node.getRight());
        Object left = visit(node.getLeft());
        if(right instanceof Double && left instanceof Double){
            return (Double)left * (Double)right;
        }else if(right instanceof Integer && left instanceof Integer){
            return (Integer)left * (Integer)right;
        }
        return  null;
    }
    public Object visit(Divide node)throws NoSuchMethodException{
        Object right = visit(node.getRight());
        Object left = visit(node.getLeft());
        if(right instanceof Double && left instanceof Double){
            return (Double)left / (Double)right;
        }else if(right instanceof Integer && left instanceof Integer){
            return (Integer)left / (Integer)right;
        }
        return  null;
    }

    public Object visit(IntegerLiteral node)throws NoSuchMethodException{
        return Integer.parseInt(node.getSpelling());
    }

    public Object visit(FloatLiteral node){
        return Double.parseDouble(node.getSpelling());
    }

    public Object visit(Identifier node) throws NoSuchMethodException {
        return visit(symtable.getIdTable().get(node.getSpelling()).getValue());
    }
}