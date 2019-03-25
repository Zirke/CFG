lexer grammar Lexer;

INTDCL   : 'integer' ;
FLOATDCL : 'decimal' ;
TRUTHDCL : 'truth' ;
TEXTDCL  : 'text' ;
ARRDCL   : 'array' ;
LPAR     : '(' ;
RPAR     : ')' ;
TIMES    : '*' ;
DIVIDES  : '/' ;
PLUS     : '+' ;
MINUS    : '-' ;
AND      : 'and' ;
OR       : 'or' ;
NOT      : '!' ;
TRUTHID  : 'true' | 'false' ;
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
ASSIGN   : 'is' ;
LCB      : '{' ;
RCB      : '}' ;
EOL      : NEWLINE+ ; //for newline
FNUM     : ([0-9])+ '.' ([0-9])+ ;
INUM     : ([0-9])+ ;
ID       : (([A-Za-z])+([0-9A-Za-z])*) ;
TEXT
   : '"' ~ ["\r\n]* '"'
   | '\'' ~ ['\r\n]* '\''
   ;



BLOCKCOMMENT :   '#' .* '#' EOL
        -> skip ;

WS : [ \t\u000C]+ -> skip ;

fragment UNICODE  :  '\u0000'..'\u00FF' ;
fragment NEWLINE   : '\r' '\n' | '\n' | '\r';
