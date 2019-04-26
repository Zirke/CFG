package ast;

public class SingleElementAssign implements ArrayAsmValue{
    IntegerLiteral elementNr;
    Value assignemntVal;

    public SingleElementAssign(IntegerLiteral elementNr, Value assignemntVal) {
        this.elementNr = elementNr;
        this.assignemntVal = assignemntVal;
    }

    public IntegerLiteral getElementNr() {
        return elementNr;
    }

    public void setElementNr(IntegerLiteral elementNr) {
        this.elementNr = elementNr;
    }

    public Value getAssignemntVal() {
        return assignemntVal;
    }

    public void setAssignemntVal(Value assignemntVal) {
        this.assignemntVal = assignemntVal;
    }
}
