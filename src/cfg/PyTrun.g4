parser grammar PyTrun;

options { tokenVocab=PyTrunLexer; }

start
        : EOL* (stmts | functiondcl)* EOL* EOF?;
stmts
        : stmt (EOL stmt)*;
stmt
        : dcl
        | ifstmt
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
        //| BLOCKCOMMENT
        | EOL ;

functiondcl

        : FUNCTION ID RETURNS (type | ARRDCL) LPAR (truedcl (COMMA truedcl)*)? RPAR LCB stmt* RCB //TODO: FIxed superfluous asterisk hereh
        | FUNCTION ID LPAR (truedcl (COMMA truedcl)*)? RPAR LCB stmt* RCB ;


dcl
        : INTDCL ID dclValue?
        |  FLOATDCL ID dclValue?
        |  TEXTDCL ID dclValue?
        |  TRUTHDCL ID (ASSIGN truthexpr)?
        |  type ARRDCL ID (ASSIGN ((functioncall) | LCB (types (COMMA types)*) RCB))?; //TODO: FIxed superfluous asterisk here

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
        : ID LPAR (types (COMMA types)*)? RPAR; //TODO: FIxed superfluous asterisk here

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
        |  ELEMENT INUM ASSIGN value
        |  ASSIGN TEXT
        |  ASSIGN expr
        |  ASSIGN LCB (types (COMMA types)*) RCB) ; //TODO: FIxed superfluous asterisk here

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
        :  NOT? relationalexpr ((OR| AND) NOT? relationalexpr)* //and or
        //| relationalexpr
        ;

relationalexpr
        :   value ((EQUALS  | GRTHAN | LESSTHAN)  value)
        |   LPAR logicalexpr RPAR //grt less equals
        |   truth
        ;
append
        : (TEXT | ID) PLUS (TEXT | ID) ;

arrindex
        :  ID ELEMENT (INUM | ID);

arradd
        : ID ELEMENT (INUM | ID) ASSIGN types ;

drive   : DRIVE LPAR value RPAR;

turnleft   : TURNLEFT LPAR value RPAR;

turnright   : TURNRIGHT LPAR value RPAR;

nums
        : INUM
        | FNUM
        | ID | MINUS nums;

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