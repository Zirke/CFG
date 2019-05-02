package ast;

import java.util.List;

public class MultipleElementAssign implements ArrayAsmValue{
    List<Value> elements;
    int linenumber;

    public MultipleElementAssign(List<Value> elements, int linenr) {
        this.elements = elements;
        this.linenumber = linenr;
    }

    public List<Value> getElements() {
        return elements;
    }

    public void setElements(List<Value> elements) {
        this.elements = elements;
    }

    public int getLinenumber() {
        return linenumber;
    }
}
