parser grammar PyTrun;

options { tokenVocab=PyTrunLexer; }

start
        : (functiondcl | stmt /*| BLOCKCOMMENT*/)* EOF?;

stmt
        : dcl
        | ifstmt
        | whilestmt
        | returnstmt
        | functioncall EOL? //A bit weird, only stmt that needs EOL, as it can be a statement as well as part of an expr
        | repeatuntilstmt
        | fromstmt
        | assignment
        //| BLOCKCOMMENT
        | EOL ;

functiondcl
        : FUNCTION ID RETURNS type LPAR paramlist RPAR LCB stmt* returnstmt RCB
        | FUNCTION ID LPAR paramlist RPAR stmtblock ;

dcl
        : (INTDCL ID (ASSIGN (value))?
        |  FLOATDCL ID (ASSIGN (value))?
        |  TEXTDCL ID (ASSIGN TEXT)?
        |  TRUTHDCL ID (ASSIGN (truthexpr))?
        |  type ARRDCL ID (ASSIGN LCB arrelems RCB)?) EOL ;

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
        : IF truthpar THEN stmtblock
          (ELSE IF truthpar THEN stmtblock)*
          (ELSE THEN stmtblock)? ;

whilestmt
        : WHILE truthpar DO stmtblock ;

repeatuntilstmt
        : REPEAT stmtblock UNTIL truthpar ;

fromstmt
        : FROM LPAR value (UPTO | DOWNTO) value RPAR stmtblock ;

returnstmt
        : RETURN (value | truthexpr)* EOL ;

assignment
        : (ID ASSIGN value
        | ID ASSIGN truthexpr
        | ID ASSIGN TEXT
        | ID ASSIGN LCB arrelems RCB) EOL ;

value
        : arithmexpr
        | functioncall
        | ID ;

arithmexpr
         : multexpr ((PLUS | MINUS ) multexpr)* ; //TODO: Add function calls?
multexpr
         : parexpr ((TIMES | DIVIDES) parexpr)* ;
parexpr
         : nums
         | LPAR arithmexpr RPAR ;

truthexpr
        : logicalexpr;

logicalexpr
        :  truth (OR logicalexpr | AND logicalexpr)* //and or
        | (NOT)? truth
        | LPAR logicalexpr RPAR
        | relationalexpr
        ;

relationalexpr
        :   value ((EQUALS  | GRTHAN | LESSTHAN)  value)+ //grt less equals
        ;
append
        : (TEXT | ID) PLUS (TEXT | ID) ; //Unused

arrelems
        : (ID (COMMA ID)*)* ;

arrindex
        : ID ELEMENT INUM ;             //Unused

arradd
        : ID ELEMENT INUM ASSIGN type ; //Unused

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
        : TRUTHID
        | ID ;

type
        : INTDCL
        | FLOATDCL
        | TRUTHDCL
        | TEXTDCL ;

types
        : nums
        | TEXT
        | TRUTHID ;

stmtend
        : EOL | EOF ; //Help