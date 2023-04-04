package com.compiler.antlr.demo1.custom;

import com.compiler.antlr.demo1.ExprLexer;
import com.compiler.antlr.demo1.ExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExprDemo {

    public static String exprMethod(ParseTree tree) {
        ExprVisitor visitor = new ExprVisitor();
        return visitor.visit(tree);
    }

    public static int calculMethod(ParseTree tree) {
        CalculVisitor visitor = new CalculVisitor();
        return visitor.visit(tree);
    }

    public static void main(String[] args) {
        String str = "10 + 20 * 30";
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.expr();
        System.out.println(exprMethod(tree));
        System.out.println(calculMethod(tree));
    }
}
