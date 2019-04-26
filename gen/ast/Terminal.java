package ast;

//Terminals
public abstract class Terminal extends AbstractNode{
    public String spelling;

    public Terminal(String spelling) {
        this.spelling = spelling;
    }

    public Terminal() {
    }

    public String getSpelling() {
        return spelling;
    }

    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }
}
