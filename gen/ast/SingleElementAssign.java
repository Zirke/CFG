package ast;

public class SingleElementAssign implements visitable {
    IntegerLiteral elementNr;
    Value assignemntVal;
    int linenumber;

    public SingleElementAssign(IntegerLiteral elementNr, Value assignemntVal, int linenr) {
        this.elementNr = elementNr;
        this.assignemntVal = assignemntVal;
        this.linenumber = linenr;
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

    public int getLinenumber() {
        return linenumber;
    }
}
