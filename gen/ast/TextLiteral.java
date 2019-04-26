package ast;

public class TextLiteral extends Terminal implements Value{
    public TextLiteral(String spelling) {
        super(spelling);
    }
}
