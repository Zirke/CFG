package ast;

public class Plus extends ArithmOperator{ //can also be used with truth values and in that case is not an arithmetic operation.
    public Plus(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }

    public Plus() {
    }
}
