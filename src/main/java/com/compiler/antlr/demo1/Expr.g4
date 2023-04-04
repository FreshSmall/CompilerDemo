grammar Expr;
prog:	expr EOF ;
expr
    :	expr ( MUL | DIV) expr  # exprmulti
    |	expr ( ADD | SUB ) expr  # exprplus
    |	INT                  # exprint
    |	'(' expr ')'         # exprbracket
    ;
NEWLINE : [\r\n]+ -> skip;
INT     : [0-9]+ ;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';