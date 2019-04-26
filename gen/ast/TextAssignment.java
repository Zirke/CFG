package ast;

public class TextAssignment extends Statement{
    Identifier id;
    TextLiteral text;

    public TextAssignment(Identifier id, TextLiteral text) {
        this.id = id;
        this.text = text;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    public TextLiteral getText() {
        return text;
    }

    public void setText(TextLiteral text) {
        this.text = text;
    }
}
