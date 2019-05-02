package ast;

public class ValueAssignment extends Statement{
    Identifier id;
    Value value;

    public ValueAssignment(Identifier id, Value value, int linenr) {
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

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
