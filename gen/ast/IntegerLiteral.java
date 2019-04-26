package ast;

public class IntegerLiteral extends Terminal implements Value {
    public IntegerLiteral(String spelling) {
        super(spelling);
    }
}
