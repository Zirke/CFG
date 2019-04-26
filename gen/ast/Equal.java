package ast;

public class Equal extends TruthOperator{
    public Equal() {
    }

    public Equal(Value lhs, Value rhs) {
        super(lhs, rhs);
    }

}
