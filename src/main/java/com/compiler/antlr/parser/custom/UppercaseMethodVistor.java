package com.compiler.antlr.parser.custom;

import com.compiler.antlr.parser.Java8BaseVisitor;
import com.compiler.antlr.parser.Java8Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class UppercaseMethodVistor extends Java8BaseVisitor<Object> {


    @Override
    public Object visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx){
        TerminalNode node = ctx.Identifier();
        String method = node.getText();
        System.out.println(method);
        return null;
    }
}
