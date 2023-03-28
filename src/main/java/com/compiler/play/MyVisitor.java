package com.compiler.play;

/**
 * @author: yinchao
 * @ClassName: MyVisitor
 * @Description:
 * @team wuhan operational dev.
 * @date: 2023/3/28 10:54
 */
public class MyVisitor extends PlayScriptBaseVisitor<Object> {


    @Override
    public Object visitExpression(PlayScriptParser.ExpressionContext ctx) {
        // todo 实现自己的表达式求值公式
        return null;
    }
}
