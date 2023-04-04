package com.compiler.antlr.demo1.custom;


import com.compiler.antlr.demo1.ExprBaseVisitor;
import com.compiler.antlr.demo1.ExprParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprVisitor extends ExprBaseVisitor<String> {


    @Override
    public String visitProg(ExprParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public String visitExprmulti(ExprParser.ExprmultiContext ctx) {
        TerminalNode mul = ctx.MUL();
        if (mul != null) {
            return visit(ctx.expr(0)) + "*" + visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(0)) + "/" + visit(ctx.expr(1));
        }
    }

    @Override
    public String visitExprplus(ExprParser.ExprplusContext ctx) {
        TerminalNode sub = ctx.SUB();
        if (sub != null) {
            return visit(ctx.expr(0)) + "-" + visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(0)) + "+" + visit(ctx.expr(1));
        }
    }

    @Override
    public String visitExprint(ExprParser.ExprintContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExprbracket(ExprParser.ExprbracketContext ctx) {
        return "(" + visit(ctx.expr()) + ")";
    }
}
