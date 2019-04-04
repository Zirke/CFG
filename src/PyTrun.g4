parser grammar PyTrun;

options { tokenVocab=PyTrunLexer; }

start
        :  stmts EOF?; //(functiondcl | stmt)*
stmts
        : stmt (EOL stmt)*;
stmt
        : dcl
        | ifstmt
        | whilestmt
        | returnstmt
        | functioncall EOL? //A bit weird, only stmt that needs EOL, as it can be a statement as well as part of an expr
        | repeatuntilstmt
        | fromstmt
        | assignment
        | arradd
        | arrindex
        | functiondcl
        //| BLOCKCOMMENT
        | EOL ;

functiondcl
        : FUNCTION ID RETURNS type LPAR paramlist RPAR LCB stmt* returnstmt RCB
        | FUNCTION ID LPAR paramlist RPAR stmtblock ;

dcl
        : INTDCL ID (assignment)? EOL?
        |  FLOATDCL ID (assignment)? EOL?
        |  TEXTDCL ID (assignment)? EOL?
        |  TRUTHDCL ID (ASSIGN (truthexpr))?(ASSIGN (arrindex))? EOL?
        |  type ARRDCL ID (ASSIGN LCB arrelems RCB)? EOL? ;

truedcl
        : INTDCL ID
        | FLOATDCL ID
        | TEXTDCL ID
        | TRUTHDCL ID ;

functioncall
        : ID LPAR args RPAR;

args
        : (types (COMMA types)*)* ;

ifstmt
        : IF truthpar THEN stmtblock EOL*
          (ELSE IF truthpar THEN stmtblock EOL*)*
          (ELSE THEN stmtblock)? ;

whilestmt
        : WHILE truthpar DO stmtblock ;

repeatuntilstmt
        : REPEAT stmtblock UNTIL truthpar ;

fromstmt
        : FROM LPAR value (UPTO | DOWNTO) value RPAR stmtblock ;

returnstmt
        : RETURN (value | truthexpr)* ;

assignment
        : (ID ASSIGN value
        | ID ASSIGN arrindex
        | ID ASSIGN TEXT
        | ID ASSIGN expr
        | ID ASSIGN LCB arrelems RCB) EOL? ;

value
        : arithmexpr
        | functioncall
        | ID ;

expr
        : arithmexpr
        | truthexpr
        | append;

arithmexpr
         : multexpr ((PLUS | MINUS ) multexpr)* ; //TODO: Add function calls?
multexpr
         : parexpr ((TIMES | DIVIDES) parexpr)* ;
parexpr
         : nums
         | functioncall
         | LPAR arithmexpr RPAR ;

truthexpr
        : logicalexpr;

logicalexpr
        :  truth (OR logicalexpr | AND logicalexpr)* //and or
        | (NOT)? truth
        | relationalexpr
        ;

relationalexpr
        :   value ((EQUALS  | GRTHAN | LESSTHAN)  value)+
        |   LPAR logicalexpr RPAR //grt less equals
        ;
append
        : (TEXT | ID) PLUS (TEXT | ID) ;

arrelems
        : (types (COMMA types)*)* ;

arrindex
        : ID ELEMENT INUM ;

arradd
        : ID ELEMENT INUM ASSIGN types ;

nums
        : INUM
        | FNUM
        | ID ;

paramlist
        : (truedcl (COMMA truedcl)*)* ;

stmtblock
        : LCB stmt* RCB ;

truthpar
        : LPAR truthexpr RPAR ;

truth
        : TRUTHVAL
        | ID ;

type
        : INTDCL
        | FLOATDCL
        | TRUTHDCL
        | TEXTDCL ;

types
        : nums
        | TEXT
        | TRUTHVAL ;

stmtend
        : EOL | EOF ; //Hilfen please!!!