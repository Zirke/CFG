lexer grammar PyTrunLexer;

INTDCL   : 'integer' ; //Name a bit weird? ast.Not a dcl on its own.
FLOATDCL : 'decimal' ; //
TRUTHDCL : 'truth' ; //
TEXTDCL  : 'text' ; //
ARRDCL   : 'array' ; //
LPAR     : '(' ;
RPAR     : ')' ;
TIMES    : '*' ;
DIVIDES  : '/' ;
PLUS     : '+' ;
MINUS    : '-' ;
AND      : 'AND' ;
OR       : 'OR' ;
NOT      : 'NOT' ;
TRUTHVAL  : 'true' | 'false' ;
EQUALS   : '=' ;
GRTHAN   : '>' ;
LESSTHAN : '<' ;
IF       : 'if' ;
ELSE     : 'else' ;
WHILE    : 'while' ;
DO       : 'do' ;
FROM     : 'from' ;
REPEAT   : 'repeat' ;
UNTIL    : 'until' ;
THEN     : 'then' ;
UPTO     : 'upto' ;
DOWNTO   : 'downto' ;
COMMA    : ',' ;
RETURN   : 'return' ;
RETURNS  : 'returns' ;
FUNCTION : 'function' ;
ELEMENT  : 'element' ;
ASSIGN   : 'is' ;
LCB      : '{' ;
RCB      : '}' ;
DRIVE    : 'drive';
TURNLEFT    : 'turnleft';
TURNRIGHT    : 'turnright';
EOL      : NEWLINE+ ; //for newline
FNUM     : ([0-9])+ '.' ([0-9])+ ;
INUM     : ([0-9])+ ;
ID       : (([A-Za-z])+([0-9A-Za-z])*) ; //TODO: Add support for symbols for example: _funcName()
TEXT
   : '"' ~ ["\r\n]* '"' //Tilde symbol means negate, dot means include (Blockcomment)
   | '\'' ~ ['\r\n]* '\''
   ;






WS : [ \t\u000C]+ -> skip ; //Unsure if \r\n should be in here as well, parser accepts multiple \n's as statement end/EOL atm

COMMENT       : '/#' .*? '#/' -> skip ;
LINE_COMMENT  : '#' .*? NEWLINE -> skip ;

fragment UNICODE  :  '\u0000'..'\u00FF' ;
fragment NEWLINE   : '\r' '\n' | '\n' | '\r';

