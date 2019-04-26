package ast;

public class Minus extends ArithmOperator{
    public Minus(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }

    public Minus() {
    }
}
