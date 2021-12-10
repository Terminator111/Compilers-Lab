parser grammar CmmParser;
options {
 tokenVocab=CmmLexer;
}

// high-level definitions
program: extDef* EOF;
extDef: specifier extDecList SEMI
 | specifier SEMI
 | specifier funDec compSt
 ;
extDecList: varDec (COMMA varDec)*;

// specifiers
specifier: TYPE
    | structSpecifier
    ;
structSpecifier: STRUCT optTag LC defList RC
    | STRUCT tag
    ;
optTag: ID?;
tag: ID;

// declarators
varDec: ID (LB (INT
                   | ID {notifyErrorListeners("array size must be an integer constant, not id");}
                   | FLOAT {notifyErrorListeners("array size must be an integer constant, not float");}
                ) RB)*;
funDec: ID LP varList? RP;
varList: paramDec (COMMA paramDec)*;
paramDec: specifier varDec;

// statements
compSt: LC defList stmtList RC;
stmtList: stmt*;
stmt: exp SEMI
    | compSt
    | RETURN exp SEMI
    | IF LP exp RP stmt (ELSE stmt)?
    | WHILE LP exp RP stmt
    ;

// local definitions
defList: def*;
def: specifier decList SEMI;
decList: dec (COMMA dec)*;
dec: varDec (ASSIGNOP exp)?;

// expressions
exp : (ID | INT | FLOAT)
    | LP exp RP
    | ID LP args? RP
    | exp LB exp RB
    | exp DOT ID
    | <assoc=right> (NOT|MINUS) exp
    | exp (DIV|STAR) exp
    | exp (MINUS|PLUS) exp
    | exp RELOP exp
    | exp AND exp
    | exp OR exp
    | <assoc=right> exp ASSIGNOP exp
    ;
args: exp (COMMA exp)*;
