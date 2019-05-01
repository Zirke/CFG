package ast;

public abstract class ArithmOperator extends Operator implements Value{
    Value left;
    Value right;


    public ArithmOperator(String spelling, Value left, Value right) {
        super(spelling);
        this.left = left;
        this.right = right;
    }

    public ArithmOperator() {
    }

    public Value getLeft() {
        return left;
    }

    public void setLeft(Value left) {
        this.left = left;
    }

    public Value getRight() {
        return right;
    }

    public void setRight(Value right) {
        this.right = right;
    }


}
