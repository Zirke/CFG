package sidevisitors;

import ast.*;
import astVisitor.AbstractNodeVisitor;
import symbolTable.SymbolTable;

public class Evaluator extends AbstractNodeVisitor<Object> {
    SymbolTable symtable;

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
        }else if(right instanceof String && left instanceof String){
            return (String)left + (String)right;
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

    public Object visit(DecimalLiteral node){
        return Double.parseDouble(node.getSpelling());
    }

    public Object visit(Identifier node) throws NoSuchMethodException {
        if(symtable.getIdTable().get(node.getSpelling()).getType() instanceof IntegerLiteral){
            return Integer.valueOf(((IntegerLiteral)symtable.getIdTable().get(node.getSpelling()).getValue()).getSpelling());
        }else if(symtable.getIdTable().get(node.getSpelling()).getType() instanceof DecimalLiteral){
            return Double.valueOf(((DecimalLiteral)symtable.getIdTable().get(node.getSpelling()).getValue()).getSpelling());
        }
        return null;
    }

    public Object visit(TextLiteral node){
        return node.getSpelling();
    }

    public static Value convertNumberToValue(Object number){
        if(number instanceof Integer){
            return new IntegerLiteral(number.toString());
        }else if(number instanceof Double){
            return new DecimalLiteral(number.toString());
        }else{
            return null;
        }
    }
}
