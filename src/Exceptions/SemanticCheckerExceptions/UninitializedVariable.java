package Exceptions.SemanticCheckerExceptions;

import Exceptions.SemanticException;

public class UninitializedVariable extends SemanticException {
    public UninitializedVariable(String msg){
        super(msg);
    }
}
