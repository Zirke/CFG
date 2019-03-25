parser grammar Parser;

options { tokenVocab=Lexer; }

start
        : (functiondcl | stmt /*| BLOCKCOMMENT*/)* EOF;

stmt
        : dcl
        | ifstmt
        | whilestmt
        | returnstmt
        | functioncall EOL
        | repeatuntilstmt
        | fromstmt
        | assignment
        //| BLOCKCOMMENT
        | EOL ;

stmtblock
        : LCB stmt* RCB ;

truthpar
        : LPAR truthexpr RPAR ;

dcl
        : (INTDCL ID (ASSIGN (value))?
        |  FLOATDCL ID (ASSIGN (value))?
        |  TEXTDCL ID (ASSIGN TEXT)?
        |  TRUTHDCL ID (ASSIGN (truthexpr))?
        |  ARRDCL ID (ASSIGN LCB (ID (COMMA ID)*)* RCB)) EOL ;

functiondcl
        : FUNCTION ID RETURNS type LPAR paramlist RPAR LCB stmt* returnstmt RCB
        | FUNCTION ID LPAR paramlist RPAR stmtblock ;

paramlist
        : (truedcl (COMMA truedcl)*)* ;

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
        | ID ASSIGN truthexpr) EOL ;

value
        : addexpr
        | functioncall ;
        //| ID ;

addexpr
         : multexpr ((PLUS | MINUS ) multexpr)* ; //TODO: Add function calls?
multexpr
         : parexpr ((TIMES | DIVIDES) parexpr)* ;
parexpr
         : nums
         | LPAR addexpr RPAR ;

truthexpr
        : truth (OR | AND)*
        | value ((EQUALS  | GRTHAN | LESSTHAN)  value)*
        | (NOT)? (TRUTHID | ID)
        | LPAR truthexpr RPAR ;

truth
        : TRUTHID
        | ID ;

type
        : INTDCL
        | FLOATDCL
        | TRUTHDCL
        | TEXTDCL ;
nums
        : INUM
        | FNUM
        | ID ;
types
        : nums
        | TEXT
        | TRUTHID ;