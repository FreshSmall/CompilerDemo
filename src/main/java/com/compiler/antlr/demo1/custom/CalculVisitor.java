package com.compiler.antlr.demo1.custom;

import com.compiler.antlr.demo1.ExprBaseVisitor;
import com.compiler.antlr.demo1.ExprParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CalculVisitor extends ExprBaseVisitor<Integer> {

    @Override
    public Integer visitProg(ExprParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Integer visitExprmulti(ExprParser.ExprmultiContext ctx) {
        TerminalNode mul = ctx.MUL();
        if (mul != null) {
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(0)) / visit(ctx.expr(1));
        }
    }

    @Override
    public Integer visitExprplus(ExprParser.ExprplusContext ctx) {
        TerminalNode sub = ctx.SUB();
        if (sub != null) {
            return visit(ctx.expr(0)) - visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
        }
    }

    @Override
    public Integer visitExprint(ExprParser.ExprintContext ctx) {
        return Integer.valueOf(ctx.getText());
    }

    @Override
    public Integer visitExprbracket(ExprParser.ExprbracketContext ctx) {
        return visit(ctx.expr());
    }
}
