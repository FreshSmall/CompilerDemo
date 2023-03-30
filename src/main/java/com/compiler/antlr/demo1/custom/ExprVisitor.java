package com.compiler.antlr.demo1.custom;

import com.compiler.antlr.demo1.ExprBaseVisitor;
import com.compiler.antlr.demo1.ExprParser;

import java.util.List;

public class ExprVisitor extends ExprBaseVisitor<Integer> {


    public Integer visitProg(ExprParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    public Integer visitExpr(ExprParser.ExprContext ctx) {

        List<ExprParser.ExprContext> expr = ctx.expr();
        for (ExprParser.ExprContext exprContext : expr) {
            String text = exprContext.INT().getText();
            System.out.println(text);
        }
        return visitChildren(ctx);
    }
}
