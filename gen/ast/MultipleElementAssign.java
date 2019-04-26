package ast;

import java.util.List;

public class MultipleElementAssign implements ArrayAsmValue{
    List<Value> elements;

    public MultipleElementAssign(List<Value> elements) {
        this.elements = elements;
    }

    public List<Value> getElements() {
        return elements;
    }

    public void setElements(List<Value> elements) {
        this.elements = elements;
    }
}
