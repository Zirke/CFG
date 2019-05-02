package ast;

public class ArrayElementAddStatement extends Statement{
    Identifier arrayName;
    Value elementNumber;
    Value value;

    public ArrayElementAddStatement(Identifier arrayName, Value elementNumber, Value value, int linenr) {
        this.arrayName = arrayName;
        this.elementNumber = elementNumber;
        this.value = value;
        this.setLineNumber(linenr);
    }

    public Identifier getArrayName() {
        return arrayName;
    }

    public void setArrayName(Identifier arrayName) {
        this.arrayName = arrayName;
    }

    public Value getElementNumber() {
        return elementNumber;
    }

    public void setElementNumber(Value elementNumber) {
        this.elementNumber = elementNumber;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
