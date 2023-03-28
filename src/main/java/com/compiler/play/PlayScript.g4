grammar PlayScript;
import CommonLexer; //导入词法定义

/*下面的内容加到所生成的Java源文件的头部，如包名称，import语句等。*/
@header {
package com.compiler.play;
}

expression
    :   assignmentExpression
    |   expression ',' assignmentExpression
    ;

assignmentExpression
    :   additiveExpression
    |   Identifier assignmentOperator additiveExpression
    ;

assignmentOperator
    :   '='
    |   '*='
    |  '/='
    |   '%='
    |   '+='
    |   '-='
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

multiplicativeExpression
    :   primaryExpression
    |   multiplicativeExpression '*' primaryExpression
    |   multiplicativeExpression '/' primaryExpression
    |   multiplicativeExpression '%' primaryExpression
    ;

primaryExpression
  : Id
  | literal
  | Identifier
  | functionCall
  ;

literal
  : IntegerLiteral
  | FloatingPointLiteral
  | StringLiteral
  | BooleanLiteral
  | NullLiteral
  ;

functionCall
  : Identifier '(' argumentList? ')'
  ;

argumentList
  : expression (',' expression)*
  ;

// 标识符
Id : [a-zA-Z_]([a-zA-Z_] | [0-9])*;

// 数字
IntegerLiteral : [0-9]+;



