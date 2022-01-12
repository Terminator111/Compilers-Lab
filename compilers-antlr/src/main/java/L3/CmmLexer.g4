lexer grammar CmmLexer;

TYPE : 'int' | 'float' ;
STRUCT : 'struct' ;
RETURN : 'return' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
ID : (LETTER | '_') WORD* ;

FLOAT: ( DIGIT* DOT DIGIT+ | DIGIT+ DOT )EXP | DIGIT+ DOT DIGIT+;
INT: DECIMAL | OCT | HEX ;

WS: [ \t\r\n]+ -> skip ;

LP : '(' ;
RP : ')' ;
LB : '[' ;
RB : ']' ;
LC : '{' ;
RC : '}' ;
DOT : '.' ;
NOT : '!' ;
STAR : '*' ;
DIV : '/' ;
PLUS : '+' ;
MINUS : '-' ;
RELOP: '>' | '<' | '>=' | '<=' | '==' | '!=' ;
AND : '&&' ;
OR : '||' ;
ASSIGNOP : '=' ;
COMMA : ',' ;
SEMI : ';' ;

SL_COMMENT : '//' .*? '\n' -> skip; // non-greedy
ML_COMMENT : '/*' .*? '*/' -> skip; // non-greedy

fragment
DIGIT : [0-9] ;
fragment
LETTER : [a-zA-Z] ;
fragment
WORD : [a-zA-Z0-9_];
fragment
EXP: [eE][+-]?INT ;
fragment
DECIMAL: '0' | [1-9][0-9]*;
fragment
OCT: '0'[0-7]+;
fragment
HEX: ('0x'|'0X')[0-9a-fA-F]+ ;