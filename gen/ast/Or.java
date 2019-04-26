package ast;

public class Or extends TruthOperator{

    public Or(String spelling, Value lhs, Value rhs) {
        super(spelling);
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public Or() {
    }
}
