package ast;

public abstract class Type extends AbstractNode{
    Identifier id;

    public Type(Identifier id) {
        this.id = id;
    }

    public Type() {
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }
}
