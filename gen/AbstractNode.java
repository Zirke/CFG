import java.util.List;

public abstract class AbstractNode {

}

class StatementList extends AbstractNode{
    List<Statement> stmts;

    public StatementList(List<Statement> stmts) {
        this.stmts = stmts;
    }

    public List<Statement> getStmts() {
        return stmts;
    }
}

abstract class Statement extends AbstractNode{

}

//Declaration types
class IntDeclaration extends Statement{
    Identifier id;
    Statement stm;

    public IntDeclaration(Identifier id, Statement stm) {
        this.id = id;
        this.stm = stm;
    }
}


class floatDeclaration extends Statement{
    Identifier id;
    Statement stm;

    public floatDeclaration(Identifier id, Statement stm) {
        this.id = id;
        this.stm = stm;
    }
}

class TextDeclaration extends Statement{
    Identifier id;
    Value val;

    public TextDeclaration(Identifier id, Value stm) {
        this.id = id;
        this.val = stm;
    }
}

class TruthDeclaration extends Statement{
    Identifier id;
    TruthOperator expr;

    public TruthDeclaration(Identifier id, TruthOperator expr) {
        this.id = id;
        this.expr = expr;
    }
}

class ArrayDeclaration extends Statement{
    Identifier id;
    List<Value> values;

    public ArrayDeclaration(Identifier id, List<Value> values) {
        this.id = id;
        this.values = values;
    }
}

//assignments
class IntAssignemnt extends Statement{
    Identifier id;
    Value value; //needs arithmeritc expression

    public IntAssignemnt(Identifier id, Value value) {
        this.id = id;
        this.value = value;
    }
}

class FloatAssignemnt extends Statement{
    Identifier id;
    Value value;

    public FloatAssignemnt(Identifier id, Value value) {
        this.id = id;
        this.value = value;
    }
}

class TextAssignemnt extends Statement{
    Identifier id;
    TextLiteral text;

    public TextAssignemnt(Identifier id, TextLiteral text) {
        this.id = id;
        this.text = text;
    }
}

class ArrayAssignemnt extends Statement{
    Identifier id;
    ArrayAsmValue value;

    public ArrayAssignemnt(Identifier id, ArrayAsmValue value) {
        this.id = id;
        this.value = value;
    }
}

//The values which can be assigned to arrays will implement the ArrayAsmValue interface
interface ArrayAsmValue{}

class SingleElementAssign implements ArrayAsmValue{
    IntegerLiteral elementNr;
    Value assignemntVal;

    public SingleElementAssign(IntegerLiteral elementNr, Value assignemntVal) {
        this.elementNr = elementNr;
        this.assignemntVal = assignemntVal;
    }
}

class MultipleElementAssign implements ArrayAsmValue{
    List<Value> elements;

    public MultipleElementAssign(List<Value> elements) {
        this.elements = elements;
    }
}

//Array operation classes
class ArrayIndexStatement extends Statement{
    Identifier id;
    IntegerLiteral number;

    public ArrayIndexStatement(Identifier id, IntegerLiteral number) {
        this.id = id;
        this.number = number;
    }
}

class ArrayElementAddStatement extends Statement{
    Identifier arrayName;
    IntegerLiteral elementNumber;
    Value value;

    public ArrayElementAddStatement(Identifier arrayName, IntegerLiteral elementNumber, Value value) {
        this.arrayName = arrayName;
        this.elementNumber = elementNumber;
        this.value = value;
    }
}


//Selective control structure(s)
class IfStatement extends Statement{
    TruthOperator truthVal;
    StatementList trueStm;
    List<ElseIfStatement> elseifs;
    ElseThenStmt elsethen;

    public IfStatement(TruthOperator truthVal, StatementList trueStm, List<ElseIfStatement> elseifs, ElseThenStmt elsethen) {
        this.truthVal = truthVal;
        this.trueStm = trueStm;
        this.elseifs = elseifs;
        this.elsethen = elsethen;
    }
}

class ElseIfStatement{
    TruthOperator truth;
    StatementList stms;

    public ElseIfStatement(TruthOperator truth, StatementList stms) {
        this.truth = truth;
        this.stms = stms;
    }
}

class ElseThenStmt{
    StatementList stms;

    public ElseThenStmt(StatementList stms) {
        this.stms = stms;
    }
}

//Iterative control structure(s)
class WhileStatement extends Statement{
    TruthOperator expr;
    StatementList stmts;

    public WhileStatement(TruthOperator expr, StatementList stmts) {
        this.expr = expr;
        this.stmts = stmts;
    }
}

class RepeatStatement extends Statement{
    StatementList stmts;
    TruthOperator expr;

    public RepeatStatement(StatementList stmts, TruthOperator expr) {
        this.stmts = stmts;
        this.expr = expr;
    }
}

class FromStatement extends Statement{
    Value fromVal;
    Value toVal;
    FromKeyword uptoOrDownto;
    StatementList stmts;

    public FromStatement(Value fromVal, Value toVal, FromKeyword uptoOrDownto, StatementList stmts) {
        this.fromVal = fromVal;
        this.toVal = toVal;
        this.uptoOrDownto = uptoOrDownto;
        this.stmts = stmts;
    }
}

//Function declaration classes
class FunctionDeclaration extends Statement{
    Identifier functionName;
    List<Parameter> parameters;
    StatementList stmtBody;

    public FunctionDeclaration(Identifier functionName, List<Parameter> parameters, StatementList stmtBody) {
        this.functionName = functionName;
        this.parameters = parameters;
        this.stmtBody = stmtBody;
    }
}

class Parameter{
    Type paramType;
    Identifier paramName;

    public Parameter(Type paramType, Identifier paramName) {
        this.paramType = paramType;
        this.paramName = paramName;
    }
}

class ReturnFunctionDeclaration extends FunctionDeclaration{
    Type returnType;
    Value returnstm;

    public ReturnFunctionDeclaration(Identifier functionName, List<Parameter> parameters, StatementList stmtBody, Type returnType, Value returnstm) {
        super(functionName, parameters, stmtBody);
        this.returnType = returnType;
        this.returnstm = returnstm;
    }
}

class FunctionCall extends Statement implements Value{
    Identifier functionName;
    List<Parameter> arguments;

    public FunctionCall(Identifier functionName, List<Parameter> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }
}

//For all values
interface Value{}

//TruthExpression
/*abstract class TruthExpr {

}*/

abstract class TruthOperator extends Operator implements Value{
    public TruthOperator(String spelling) {
        super(spelling);
    }
}

class And extends TruthOperator{
    Value lhs;
    Value rhs;

    public And(String spelling, Value lhs, Value rhs) {
        super(spelling);
        this.lhs = lhs;
        this.rhs = rhs;
    }
}

class Or extends TruthOperator{
    Value lhs;
    Value rhs;

    public Or(String spelling, Value lhs, Value rhs) {
        super(spelling);
        this.lhs = lhs;
        this.rhs = rhs;
    }
}

class Not extends TruthOperator{
    Value truth;

    public Not(String spelling, Value truth) {
        super(spelling);
        this.truth = truth;
    }
}

class GreaterThan extends TruthOperator{
    Value left;
    Value right;

    public GreaterThan(String spelling, Value left, Value right) {
        super(spelling);
        this.left = left;
        this.right = right;
    }
}

class LessThan extends TruthOperator{
    Value left;
    Value right;

    public LessThan(String spelling, Value left, Value right) {
        super(spelling);
        this.left = left;
        this.right = right;
    }
}

class TruthParenthesis extends TruthOperator{
    Value expr;

    public TruthParenthesis(String spelling, Value expr) {
        super(spelling);
        this.expr = expr;
    }
}

abstract class ArithmOperator extends Operator implements Value{
    Value left;
    Value right;



    public ArithmOperator(String spelling, Value left, Value right) {
        super(spelling);
        this.left = left;
        this.right = right;
    }

    public ArithmOperator() {
    }
}

class Plus extends ArithmOperator{ //can also be used with truth values and in that case is not an arithmetic operation.
    public Plus(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }

    public Plus() {
    }
}

class Minus extends ArithmOperator{
    public Minus(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }

    public Minus() {
    }
}

class Times extends ArithmOperator{
    public Times(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }

    public Times() {
    }
}

class Divide extends ArithmOperator{
    public Divide(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }

    public Divide() {
    }
}

class ArithmParenthesis extends ArithmOperator{ //right should be null
    public ArithmParenthesis(String spelling, Value left, Value right) {
        super(spelling, left, right);
    }
}

/*class Append extends Operator implements Value{
    Value left;
    Value right;

    public Append(String spelling, Value left, Value right) {
        super(spelling);
        this.left = left;
        this.right = right;
    }
}*/

//Terminals
abstract class Terminal extends AbstractNode{
    public String spelling;

    public Terminal(String spelling) {
        this.spelling = spelling;
    }

    public Terminal() {
    }
}

class IntegerLiteral extends Terminal implements Value {
    public IntegerLiteral(String spelling) {
        super(spelling);
    }
}

class FloatLiteral extends Terminal implements Value{
    public FloatLiteral(String spelling) {
        super(spelling);
    }
}

class TextLiteral extends Terminal implements Value{
    public TextLiteral(String spelling) {
        super(spelling);
    }
}

class TruthLiteral extends Terminal implements Value{
    public TruthLiteral(String spelling) {
        super(spelling);
    }
}

class ArrayLiteral extends Terminal{ //skal den med?

    public ArrayLiteral(String spelling) {
        super(spelling);
    }
}

class Identifier extends Terminal implements Value{
    public Identifier(String spelling) {
        super(spelling);
    }
}

abstract class FromKeyword extends Terminal{
    public FromKeyword(String spelling) {
        super(spelling);
    }
}

class Upto extends FromKeyword{
    public Upto(String spelling) {
        super(spelling);
    }
}

class Downto extends FromKeyword{
    public Downto(String spelling) {
        super(spelling);
    }
}

abstract class Operator extends Terminal{
    public Operator(String spelling) {
        super(spelling);
    }

    public Operator() {
    }
}

abstract class Type extends AbstractNode{
    public Type() {
    }
}

class INTDCL extends Type{
    public INTDCL() {
    }
}

class FLOATDCL extends Type{
    public FLOATDCL() {
    }
}

class TRUTHDCL extends Type{
    public TRUTHDCL() {
    }
}

class TEXTDCL extends Type{
    public TEXTDCL() {
    }
}