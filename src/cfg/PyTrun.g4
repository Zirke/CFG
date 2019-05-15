parser grammar PyTrun;

options { tokenVocab=PyTrunLexer; }

start
        : stmts EOF?;//EOL* (stmts | functiondcl)* EOL* EOF?;
stmts
        : EOL* dcl* arrdcl* functiondcl* stmt*;//stmt (EOL stmt)*;
stmt
        : //dcl
          ifstmt
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
        | EOL ;

functiondcl
        : FUNCTION ID RETURNS type LPAR (truedcl (COMMA truedcl)*)? RPAR stmtblock
        | FUNCTION ID LPAR (truedcl (COMMA truedcl)*)? RPAR stmtblock ;


dcl
        : INTDCL ID dclValue?
        |  FLOATDCL ID dclValue?
        |  TEXTDCL ID dclValue?
        |  TRUTHDCL ID (ASSIGN truthexpr)?
        | EOL
        ;//(ASSIGN ((functioncall) | LCB (types (COMMA types)*) RCB))?;

arrdcl :
        type ARRDCL  ID
        | EOL;

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
        : ID LPAR (types (COMMA types)*)? RPAR;

ifstmt
        : IF truthpar THEN stmtblock EOL*
          (ELSE IF truthpar THEN stmtblock EOL*)*
          (ELSE THEN stmtblock)? ;

whilestmt
        : WHILE truthpar DO stmtblock ;

repeatuntilstmt
        : REPEAT stmtblock UNTIL truthpar ;

fromstmt
        : FROM LPAR valueorfunctioncall  (UPTO | DOWNTO) valueorfunctioncall RPAR stmtblock ;

returnstmt
        : RETURN (valueorfunctioncall | truthexpr) EOL* ;

assignment
        : ID ( ASSIGN valueorfunctioncall
        |  ASSIGN TEXT
        |  ASSIGN expr );
value
        : arithmexpr
        | arrindex
        | ID ;

valueorfunctioncall
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
         | LPAR arithmexpr RPAR ;

truthexpr
        : logicalexpr;

logicalexpr
        :  NOT? relationalexpr ((OR| AND) NOT? relationalexpr)* //and or
        //| relationalexpr
        ;

relationalexpr
        :   valueorfunctioncall ((EQUALS  | GRTHAN | LESSTHAN)  valueorfunctioncall)
        |   LPAR logicalexpr RPAR //grt less equals
        |   truth
        ;
append
        : (TEXT | ID) PLUS (TEXT | ID) ;

arrindex
        :  ID ELEMENT arithmexpr; //TODO expression in arrindex

arradd
        : ID ELEMENT arithmexpr ASSIGN expr; //TODO expression in arrindex

drive   : DRIVE LPAR valueorfunctioncall RPAR;

turnleft   : TURNLEFT LPAR valueorfunctioncall RPAR;

turnright   : TURNRIGHT LPAR valueorfunctioncall RPAR;

pause    : PAUSE LPAR valueorfunctioncall RPAR;

nums
        : INUM
        | FNUM
        | ID | MINUS nums; //TODO buildast

stmtblock
        : LCB EOL* dcl* stmt* RCB ;

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