package ast;

public class Equal extends TruthOperator{
    public Equal() {
    }

    public Equal(Value lhs, Value rhs, int linenr) {
        super(lhs, rhs);
        this.lineNumber = linenr;
    }

}
