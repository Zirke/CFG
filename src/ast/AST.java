package ast;

import java.util.ArrayList;

public abstract class AST {

}

abstract class Statement extends AST{

}

//Declaration types
class IntDeclaration extends Statement{
    ID id;
    Statement stm;
}

class floatDeclaration extends Statement{
    ID id;
    Statement stm;
}

class TextDeclaration extends Statement{
    ID id;
    Statement stm;
}

class TruthDeclaration extends Statement{
    ID id;
    TruthExpr expr;
}

class ArrayDeclaration extends Statement{
    ID id;
    ValueList values;
}

class IntAssignemnt extends Statement{
    ID id;
    IntAsmVal value;
}

class FloatAssignemnt extends Statement{
    ID id;
    FloatAsmVal value;
}

class TextAssignemnt extends Statement{
    ID id;
    TEXT text;
}

class ArrayAssignemnt extends Statement{
    ID id;
    ArrayAsmValue value;
}


//control structures
class IfStatement extends Statement{
    TruthExpr truthVal;
    Statement trueStm;
    ArrayList<ElseIfStatement> elseifs;
    ElseThenStmt elsethen;
}

class WhileStatement extends Statement{
    TruthExpr expr;
    Statement stmt;
}

class RepeatStatement extends Statement{
    Statement stmt;
    TruthExpr expr;
}

class FromStatement extends Statement{
    FromstatementVal fromVal;
    FromstatementVal toVal;
    FromKeyWord uptoOrDownto;
    Statement stmt;
}

class ArrayIndexStatement extends Statement{
    ID id;
    INUM number;
}

class ArrayElementAddStatement extends Statement{
    ID arrayName;
    INUM elementNumber;
    TypeValues value;
}

class FunctionDeclaration extends Statement{
    ID functionName;
    ArrayList<Parameter> list;
    Statement stmtBody;
}

class ReturnFunction extends FunctionDeclaration{
    Types returnType;

    ReturnStatement returnstm;
}

interface ReturnStatement{

}

class ProcedureFunction extends FunctionDeclaration{

}


class SequentialStatement extends Statement{
        Statement stmt1;
        Statement stmt2;
}


abstract class Types extends AST{

}

class INTDCL extends Types{

}
class FLOATDCL extends Types{

}

class TRUTHDCL extends Types{

}

class TEXTDCL extends Types{

}

//Truth expression types
abstract class TruthExpr extends AST implements ReturnStatement{

}

class LogicalExpr extends TruthExpr{
    TruthExpr expr1;
    LogicalOperand operand;
    TruthExpr expr2;
}
abstract class LogicalOperand{}
class NotExpr extends TruthExpr{

}

class RelationalExpr extends TruthExpr{

}

class ParTruthExpr extends TruthExpr{

}

//maybe nums should extend ArithmExpr (functioncall)
abstract class ArithmExpr extends AST implements IntAsmVal, FloatAsmVal, FromstatementVal{

}

class PlusMinusExpr extends ArithmExpr{

}

class TimesDivideExpr extends ArithmExpr{

}


class ParArithmExpr extends ArithmExpr{

}

//should the different types have a String field?
interface TypeValues{

}

class TEXT implements TypeValues{

}

class TRUTHVAL implements TypeValues{

}

abstract class Nums implements TypeValues, ReturnStatement{

}

class ID extends Nums implements IntAsmVal, FloatAsmVal, FromstatementVal {

}

class INUM extends Nums implements IntAsmVal{

}

class FNUM extends Nums implements FloatAsmVal {

}


class ValueList{
    ArrayList<TypeValues> values;
}


interface IntAsmVal{

}

interface FloatAsmVal{

}

interface AssignmentVal{

}


class FunctionCall implements IntAsmVal, FloatAsmVal, FromstatementVal{

}

//nok ikke rigtig

//The values which can be assigned to arrays will implement the ArrayAsmValue interface
interface ArrayAsmValue{}

class SingleElementAssign implements ArrayAsmValue{
    INUM elementNr;
    TypeValues assignemntVal;
}

class MultipleElementAssign implements ArrayAsmValue{
    ArrayList<TypeValues> elements;
}

//For if
class ElseIfStatement{
    TruthExpr truth;
    Statement stm;
}

class ElseThenStmt{
    Statement stm;
}

interface FromstatementVal{

}

interface FromKeyWord{

}

class UpTo implements FromKeyWord{

}
class DownTo implements FromKeyWord{

}

class Parameter{
    Types typeOfParamenter;
    ID parameterName;
}

abstract class Terminal extends AST{
    public String spelling;
}

class IntegerLiteral extends Terminal {

}

class FloatLiteral extends Terminal {

}

class TextLiteral extends Terminal {

}

class Operator extends Terminal {

}
