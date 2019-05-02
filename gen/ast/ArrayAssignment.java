package ast;

public class ArrayAssignment extends Statement{
    Identifier id;
    ArrayAsmValue value;

    public ArrayAssignment(Identifier id, ArrayAsmValue value, int linenr) {
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

    public ArrayAsmValue getValue() {
        return value;
    }

    public void setValue(ArrayAsmValue value) {
        this.value = value;
    }

}
