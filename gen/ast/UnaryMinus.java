package ast;

public class UnaryMinus extends ArithmOperator {
    public UnaryMinus(String spelling, Value left, Value right) {
        super(spelling, left, null);
    }
}
