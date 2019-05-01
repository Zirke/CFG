package ast;

public abstract class AbstractNode implements visitable{

}



/*class IntAssignment extends ast.Statement{
    ast.Identifier id;
    ast.Value value; //needs arithmeritc expression

    public IntAssignment(ast.Identifier id, ast.Value value) {
        this.id = id;
        this.value = value;
    }
}

class FloatAssignment extends ast.Statement{
    ast.Identifier id;
    ast.Value value;

    public FloatAssignment(ast.Identifier id, ast.Value value) {
        this.id = id;
        this.value = value;
    }
}*/


//TruthExpression
/*abstract class TruthExpr {

}*/

/*class Append extends ast.Operator implements ast.Value{
    ast.Value left;
    ast.Value right;

    public Append(String spelling, ast.Value left, ast.Value right) {
        super(spelling);
        this.left = left;
        this.right = right;
    }
}*/

/*class ArrayLiteral extends ast.Terminal{ //skal den med?

    public ArrayLiteral(String spelling) {
        super(spelling);
    }
}*/

