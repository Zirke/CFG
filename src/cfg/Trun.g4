parser grammar Trun;

options { tokenVocab=TrunLexer; }

start
        : dclblock arrdclblock functiondclblock stmtstartblock;

dclblock:
        (dcl (EOL dclblock)*) EOF?
        | EOF?;

arrdclblock:
        (arrdcl (EOL arrdclblock)*) EOF?
        | EOF?;
functiondclblock:

        (functiondcl (EOL functiondclblock)*) EOF?
        |EOF?;

stmtstartblock:
        (stmt (EOL stmtstartblock)*) EOF?
        | EOF?;
stmt
        : ifstmt
        | whilestmt
        | returnstmt
        | functioncall
        | repeatuntilstmt
        | fromstmt
        | assignment
        | arradd
        | arrindex
        | drive
        | turnleft
        | turnright
        | pause
        ;

functiondcl
        : FUNCTION ID RETURNS type LPAR (param (COMMA param)*)? RPAR stmtblock
        | FUNCTION ID LPAR (param (COMMA param)*)? RPAR stmtblock ;


dcl
        : INTDCL ID dclValue?
        |  FLOATDCL ID dclValue?
        |  TEXTDCL ID dclValue?
        |  TRUTHDCL ID (ASSIGN truthexpr)?
        ;

arrdcl :
        type ARRDCL  ID
       ;

dclValue
        :( ASSIGN value
        |  ASSIGN TEXT
        |  ASSIGN expr);

param
        : INTDCL ID
        | FLOATDCL ID
        | TEXTDCL ID
        | TRUTHDCL ID ;

functioncall
        : ID LPAR (arg (COMMA arg)*)? RPAR;

ifstmt
        : IF truthpar THEN stmtblock EOL*
          (ELSE IF truthpar THEN stmtblock EOL*)*
          (ELSE THEN stmtblock)? ;

whilestmt
        : WHILE truthpar DO stmtblock ;

repeatuntilstmt
        : REPEAT stmtblock UNTIL truthpar ;

fromstmt
        : FROM LPAR valueorfunctioncallortext  (UPTO | DOWNTO) valueorfunctioncallortext RPAR stmtblock ;

returnstmt
        : RETURN (valueorfunctioncallortext | truthexpr) EOL* ;

assignment
        : ID ( ASSIGN valueorfunctioncallortext
        |  ASSIGN TEXT
        |  ASSIGN expr );
value
        : arithmexpr
        | arrindex
        | ID ;

valueorfunctioncallortext
        : value
        | functioncall
        | TEXT;

expr
        : arithmexpr
        | truthexpr
        | append;

arithmexpr
         : multexpr ((PLUS | MINUS ) multexpr)* ;
multexpr
         : unaryminus ((TIMES | DIVIDES) unaryminus)* ;
unaryminus
        :  (MINUS)? parexpr;
parexpr
         : nums
         | functioncall
         | arrindex
         | LPAR arithmexpr RPAR ;

truthexpr
        : logicalexpr;

logicalexpr
        :  NOT? relationalexpr ((OR| AND) NOT? relationalexpr)*
        ;

relationalexpr
        :   valueorfunctioncallortext ((EQUALS  | GRTHAN | LESSTHAN)  valueorfunctioncallortext)
        |   LPAR logicalexpr RPAR
        |   truth
        |   functioncall
        ;
append
        : textorid APPEND textorid ;
textorid
        : arrindex | TEXT | ID;

arrindex
        :  ID ELEMENT arithmexpr;

arradd
        : ID ELEMENT arithmexpr ASSIGN (expr | TEXT);

drive   : DRIVE LPAR valueorfunctioncallortext RPAR;

turnleft   : TURNLEFT LPAR valueorfunctioncallortext RPAR;

turnright   : TURNRIGHT LPAR valueorfunctioncallortext RPAR;

pause    : PAUSE LPAR valueorfunctioncallortext RPAR;

nums
        : INUM
        | FNUM
        | ID;

stmtblock
        : LCB EOL* dclblock stmtstartblock RCB ;

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

arg
        : nums
        | expr
        | TEXT
        | TRUTHVAL ;