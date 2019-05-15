package sidevisitors;

import ast.AbstractNode;
import ast.ReturnStatement;
import astVisitor.AbstractNodeVisitor;

public class ReturnTypeChecker extends AbstractNodeVisitor<AbstractNode> {


    public AbstractNode visit(ReturnStatement node){

        return null;
    }
}
