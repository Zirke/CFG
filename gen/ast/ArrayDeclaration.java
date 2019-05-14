package ast;

public class ArrayDeclaration extends Statement{
    Identifier id;
    Type type;

    public ArrayDeclaration(Identifier id,  Type type) {
        this.id = id;
        this.type = type;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
