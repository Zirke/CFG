public class PrettyPrintAST extends AbstractNodeVisitor<AbstractNode>{

    @Override
    public AbstractNode visit(AbstractNode node) {
        if(node instanceof StatementList){
            visit((StatementList) node);
        }else if(node instanceof Statement){
            visit((Statement) node);
        }else if(node instanceof Terminal){
            visit((Terminal) node); //should not be possible
        }else if(node instanceof Type){
            visit((Type) node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(And node) {
        visit(node.lhs);
        visit(node.rhs);
        System.out.println("And Node");
        return null;
    }

    @Override
    public AbstractNode visit(ArithmParenthesis node) {
        visit(node.left);
        System.out.println("Arithmetic Parenthesis");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayAssignment node) {
        visit(node.id);
        visit(node.value);
        System.out.println("Array assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayAsmValue node) {
        if(node instanceof SingleElementAssign){
            visit((SingleElementAssign)node);
        }else if(node instanceof MultipleElementAssign){
            visit((MultipleElementAssign) node);
        }else if(node instanceof FunctionCall){
            visit((FunctionCall)node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(ArrayDeclaration node) {
        visit(node.id);
        visit(node.type);
        visit(node.values);
        System.out.println("Array declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayElementAddStatement node) {
        visit(node.arrayName);
        visit(node.elementNumber);
        visit(node.value);
        System.out.println("Array element add statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ArrayIndexStatement node) {
        visit(node.id);
        visit(node.number);
        System.out.println("ArrayIndexStatement node");
        return null;
    }

    @Override
    public AbstractNode visit(Divide node) {
        visit(node.left);
        visit(node.right);
        System.out.println("Divide node");
        return null;
    }

    @Override
    public AbstractNode visit(Downto node) {
        System.out.println("Down to Node");
        return null;
    }

    @Override
    public AbstractNode visit(ElseIfStatement node) {
        visit(node.truth);
        visit(node.stms);
        System.out.println("Else if statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ElseThenStmt node) {
        visit(node.stms);
        System.out.println("Else then statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ValueAssignment node) {
        visit(node.id);
        visit(node.value);
        System.out.println("Value assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(FLOATDCL node) {
        System.out.println("Float Node");
        return null;
    }

    @Override
    public AbstractNode visit(FloatDeclaration node) {
        visit(node.id);
        visit(node.stm);
        System.out.println("Float Declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(FloatLiteral node) {
        System.out.println(node.spelling);
        System.out.println("Float Literal Node");
        return null;
    }

    @Override
    public AbstractNode visit(FromKeyword node) {
        System.out.println("From Keyword node");
        return null;
    }

    @Override
    public AbstractNode visit(FromStatement node) {
        visit(node.fromVal);
        visit(node.toVal);
        visit(node.uptoOrDownto);
        visit(node.stmts);
        System.out.println("From statement");
        return null;
    }

    @Override
    public AbstractNode visit(FunctionCall node) {
        visit(node.functionName);
        for(Value x : node.arguments){
            visit(x);
        }
        System.out.println("Function Call node");
        return null;
    }

    @Override
    public AbstractNode visit(FunctionDeclaration node) {
        visit(node.functionName);
        for(Parameter x : node.parameters){
            visit(x);
        }
        visit(node.stmtBody);
        System.out.println("Function declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(GreaterThan node) {
        visit(node.lhs);
        visit(node.rhs);
        System.out.println("Greater than Node");
        return null;
    }

    @Override
    public AbstractNode visit(Identifier node) {
        System.out.println(node.spelling +"  : Identifier Node");
        return null;
    }

    @Override
    public AbstractNode visit(IfStatement node) {
        visit(node.truthVal);
        visit(node.trueStm);
        if(node.elseifs != null) {
            for (ElseIfStatement x : node.elseifs) {
                visit(x);
            }
        }
        if(node.elsethen != null)
            visit(node.elsethen);
        System.out.println("If statement node");
        return null;
    }

    @Override
    public AbstractNode visit(INTDCL node) {
        System.out.println("Int dcl");
        return null;
    }

    @Override
    public AbstractNode visit(IntDeclaration node) {
        visit(node.id);
        visit(node.stm);
        System.out.println("Integer declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(IntegerLiteral node) {
        System.out.println(node.spelling);
        System.out.println("Integer Literal node");
        return null;
    }

    @Override
    public AbstractNode visit(LessThan node) {
        visit(node.lhs);
        visit(node.rhs);
        System.out.println("Less than node");
        return null;
    }

    @Override
    public AbstractNode visit(Minus node) {
        visit(node.left);
        visit(node.right);
        System.out.println("Minus node");
        return null;
    }

    @Override
    public AbstractNode visit(MultipleElementAssign node) {
        for(Value x : node.elements){
            visit(x);
        }
        return null;
    }

    @Override
    public AbstractNode visit(Not node) {
        visit(node.lhs); //TODO double check whether value is stored in lhs.
        System.out.println("Not node");
        return null;
    }

    @Override
    public AbstractNode visit(Or node) {
        visit(node.lhs);
        visit(node.rhs);
        System.out.println("Or node");
        return null;
    }

    @Override
    public AbstractNode visit(Parameter node) {
        visit(node.paramType);
        visit(node.id);
        System.out.println("Paramenter node");
        return null;
    }

    @Override
    public AbstractNode visit(Plus node) {
        visit(node.left);
        visit(node.right);
        System.out.println("Plus node");
        return null;
    }

    @Override
    public AbstractNode visit(RepeatStatement node) {
        visit(node.expr);
        visit(node.stmts);
        System.out.println("Repeat statement node");
        return null;
    }

    @Override
    public AbstractNode visit(ReturnFunctionDeclaration node) {
        visit(node.functionName);
        visit(node.returnType);
        for(Parameter x : node.parameters){
            visit(x);
        }
        visit(node.stmtBody);
        System.out.println("Return Function declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(SingleElementAssign node) {
        visit(node.elementNr);
        visit(node.assignemntVal);
        return null;
    }

    @Override
    public AbstractNode visit(StatementList node) {
        for(Statement x : node.stmts){
            visit(x);
        }
        return null;
    }

    @Override
    public AbstractNode visit(TextAssignment node) {
        visit(node.id);
        visit(node.text);
        System.out.println("Text assignment node");
        return null;
    }

    @Override
    public AbstractNode visit(TEXTDCL node) {
        System.out.println("Text dcl node");
        return null;
    }

    @Override
    public AbstractNode visit(TextDeclaration node) {
        visit(node.id);
        visit(node.val);
        System.out.println("Text declaration");
        return null;
    }

    @Override
    public AbstractNode visit(TextLiteral node) {
        System.out.println(node.spelling);
        return null;
    }

    @Override
    public AbstractNode visit(Times node) {
        visit(node.left);
        visit(node.right);
        System.out.println("Times node");
        return null;
    }

    @Override
    public AbstractNode visit(TRUTHDCL node) {
        System.out.println("Truth dcl");
        return null;
    }

    @Override
    public AbstractNode visit(TruthDeclaration node) {
        visit(node.id);
        visit(node.expr);
        System.out.println("Truth declaration node");
        return null;
    }

    @Override
    public AbstractNode visit(TruthLiteral node) {
        System.out.println(node.spelling);
        return null;
    }

    @Override
    public AbstractNode visit(TruthParenthesis node) {
        visit(node.expr);
        System.out.println("Truth Parenthesis node");
        return null;
    }

    @Override
    public AbstractNode visit(Type node) {
        if(node instanceof INTDCL){
            visit((INTDCL) node);
        }else if(node instanceof FLOATDCL){
            visit((FLOATDCL) node);
        }else if(node instanceof TRUTHDCL){
            visit((TRUTHDCL) node);
        }else if(node instanceof TEXTDCL){
            visit((TEXTDCL) node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(Upto node) {
        System.out.println("upto node");
        return null;
    }

    @Override
    public AbstractNode visit(WhileStatement node) {
        visit(node.expr);
        visit(node.stmts);
        System.out.println("While statement");
        return null;
    }

    @Override
    public AbstractNode visit(Value node) {
        if(node instanceof FunctionCall){
            visit((FunctionCall)node);
        }else if(node instanceof TruthOperator){
            visit((TruthOperator)node);
        }else if(node instanceof ArithmOperator){
            visit((ArithmOperator)node);
        }else if(node instanceof IntegerLiteral){
            visit((IntegerLiteral)node);
        }else if(node instanceof FloatLiteral){
            visit((FloatLiteral)node);
        }else if(node instanceof TextLiteral){
            visit((TextLiteral)node);
        }else if(node instanceof TruthLiteral){
            visit((TruthLiteral)node);
        }else if(node instanceof Identifier){
            visit((Identifier)node);
        }else if(node instanceof Parameter) {
            visit((Parameter)node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(TruthOperator node) {
        if(node instanceof Or){
            visit((Or) node);
        }else if( node instanceof  Not){
            visit((Not) node);
        }else if(node instanceof GreaterThan){
            visit((GreaterThan) node);
        }else if(node instanceof LessThan){
            visit((LessThan)node);
        }else if(node instanceof Equal){
            visit((Equal)node);
        }else if(node instanceof TruthParenthesis){
            visit((TruthParenthesis)node);
        }else if(node instanceof And){
            visit((And) node);
        }
        return null;
    }

    @Override
    public AbstractNode visit(Equal node) {
        visit(node.lhs);
        visit(node.rhs);
        System.out.println("Equal node");
        return null;
    }

    @Override
    public AbstractNode visit(ArithmOperator node) {
        if(node instanceof Plus)
            visit((Plus) node);
        else if(node instanceof Minus)
            visit((Minus) node);
        else if(node instanceof Divide)
            visit((Divide) node);
        else if(node instanceof Times)
            visit((Times) node);
        else if(node instanceof ArithmParenthesis)
            visit((ArithmParenthesis) node);
        return null;
    }



    @Override
    public AbstractNode visit(Statement node){
        if(node instanceof IntDeclaration){
            visit((IntDeclaration) node);
        }else if(node instanceof FloatDeclaration){
            visit((FloatDeclaration) node);
        }else if(node instanceof TextDeclaration){
            visit((TextDeclaration) node);
        }else if(node instanceof TruthDeclaration){
            visit((TruthDeclaration) node);
        } else if(node instanceof ArrayDeclaration){
            visit((ArrayDeclaration) node);
        } else if(node instanceof ValueAssignment){
            visit((ValueAssignment) node);
        } else if(node instanceof TextAssignment){
            visit((TextAssignment) node);
        } else if(node instanceof ArrayAssignment){
            visit((ArrayAssignment) node);
        } else if(node instanceof ArrayIndexStatement){
            visit((ArrayIndexStatement) node);
        } else if(node instanceof ArrayElementAddStatement){
            visit((ArrayElementAddStatement) node);
        } else if(node instanceof IfStatement){
            visit((IfStatement) node);
        } else if(node instanceof WhileStatement){
            visit((WhileStatement) node);
        } else if(node instanceof RepeatStatement){
            visit((RepeatStatement) node);
        } else if(node instanceof FromStatement){
            visit((FromStatement) node);
        } else if(node instanceof ReturnStatement){
            visit((ReturnStatement) node);
        }else if(node instanceof ReturnFunctionDeclaration){
            visit((ReturnFunctionDeclaration) node);
        }else if(node instanceof FunctionDeclaration){
            visit((FunctionDeclaration) node);
        } else if(node instanceof FunctionCall){
            visit((FunctionCall) node);
        } else if(node instanceof DriveStatement){
            visit((DriveStatement) node);
        } else if(node instanceof TurnLeftStatement){
            visit((TurnLeftStatement) node);
        } else if(node instanceof TurnRightStatement){
            visit((TurnRightStatement) node);
        }
        return null;
    }


    @Override
    public AbstractNode visit(DriveStatement node) {
        visit(node.val);
        System.out.println("Drive Statmenet node");
        return null;
    }

    @Override
    public AbstractNode visit(ReturnStatement node) {
        visit(node.val);
        System.out.println("Return Statement node");
        return null;
    }

    @Override
    public AbstractNode visit(TurnLeftStatement node) {
        visit(node.val);
        System.out.println("Turn Left Node");
        return null;
    }

    @Override
    public AbstractNode visit(TurnRightStatement node) {
        visit(node.val);
        System.out.println("Turn Right Statement");
        return null;
    }
}
