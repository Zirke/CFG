parser grammar PyTrun;

options { tokenVocab=PyTrunLexer; }

start
        : stmts EOL* EOF?; //(functiondcl | stmt)*
stmts
        : stmt (EOL stmt)*;
stmt
        : dcl
        | ifstmt
        | whilestmt
        | returnstmt
        | functioncall //A bit weird, only stmt that needs EOL, as it can be a statement as well as part of an expr
        | repeatuntilstmt
        | fromstmt
        | assignment
        | arradd
        | arrindex
        | functiondcl
        | drive
        | turnleft
        | turnright
        //| BLOCKCOMMENT
        | EOL ;

functiondcl
        : FUNCTION ID RETURNS (type | ARRDCL) LPAR paramlist RPAR LCB stmt* returnstmt RCB
        | FUNCTION ID LPAR paramlist RPAR stmtblock ;

dcl
        : INTDCL ID dclValue?
        |  FLOATDCL ID dclValue?
        |  TEXTDCL ID dclValue?
        |  TRUTHDCL ID (ASSIGN truthexpr)?
        |  type ARRDCL ID (ASSIGN ((functioncall) | LCB arrelems RCB))?;

dclValue
        :( ASSIGN value
        |  ASSIGN TEXT
        |  ASSIGN expr);

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
        : RETURN (value | truthexpr) EOL* ;

assignment
        : ID ( ASSIGN value
        |  ASSIGN arrindex
        |  ASSIGN TEXT
        |  ASSIGN expr
        |  ASSIGN LCB arrelems RCB) ;

value
        : arithmexpr
        | functioncall
        | arrindex
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
        :  (NOT)? relationalexpr ((OR| AND) (NOT)? relationalexpr)* //and or
        //| relationalexpr
        ;

relationalexpr
        :   value ((EQUALS  | GRTHAN | LESSTHAN)  value)+
        |   LPAR logicalexpr RPAR //grt less equals
        |   truth
        ;
append
        : (TEXT | ID) PLUS (TEXT | ID) ;

arrelems
        : (types (COMMA types)*)* ;

arrindex
        : ID ELEMENT INUM ;

arradd
        : ID ELEMENT (INUM | ID) ASSIGN types ;

drive   : DRIVE LPAR value RPAR;

turnleft   : TURNLEFT LPAR value RPAR;

turnright   : TURNRIGHT LPAR value RPAR;

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