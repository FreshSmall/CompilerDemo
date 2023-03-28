package com.compiler.antlr.parser.custom;

import com.compiler.antlr.parser.Java8Lexer;
import com.compiler.antlr.parser.Java8Parser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @author: yinchao
 * @ClassName: Java8Demo
 * @Description:
 * @team wuhan operational dev.
 * @date: 2023/3/28 17:07
 */
public class Java8Demo {

    public static void main(String[] args) {
        String javaClassContent = "public class SampleClass { void DoSomething(){} }";
        Java8Lexer java8Lexer = new Java8Lexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        Java8Parser parser = new Java8Parser(tokens);
        ParseTree tree = parser.methodDeclarator();

        /*ParseTree tree = parser.compilationUnit();
        System.out.println(tree.toStringTree(parser));*/

        /*ParseTreeWalker walker = new ParseTreeWalker();
        UppercaseMethodListener listener = new UppercaseMethodListener();

        walker.walk(listener, tree);
        System.out.println(listener.getErrors());*/
        UppercaseMethodVistor visitor = new UppercaseMethodVistor();
        visitor.visit(tree);
    }
}
