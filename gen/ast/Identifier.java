package ast;

public class Identifier extends Terminal implements Value{
    public Identifier(String spelling) {
        super(spelling);
    }
}
