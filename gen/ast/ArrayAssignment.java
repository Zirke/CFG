package ast;

public class ArrayAssignment extends Statement{
    Identifier id;
    SingleElementAssign value;

    public ArrayAssignment(Identifier id, SingleElementAssign value, int linenr) {
        this.id = id;
        this.value = value;
        this.setLineNumber(linenr);
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public SingleElementAssign getValue() {
        return value;
    }

    public void setValue(SingleElementAssign value) {
        this.value = value;
    }
}
