package ast;

public class Identifier extends Terminal implements Value{
    public boolean isText;
    public Identifier(String spelling) {
        super(spelling);
    }

    public boolean isText() {
        return isText;
    }

    public void setText(boolean text) {
        isText = text;
    }
}
