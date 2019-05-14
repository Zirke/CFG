package Exceptions.SemanticCheckerExceptions;

import Exceptions.SemanticException;

public class MissingReturnStatement extends SemanticException {
    public MissingReturnStatement(String msg){
        super(msg);
    }
}
