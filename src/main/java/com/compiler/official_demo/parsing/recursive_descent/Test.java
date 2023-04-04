package com.compiler.official_demo.parsing.recursive

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class Test {
    public static void main(String[] args) {
        ListLexer lexer = new ListLexer(args[0]); // parse command-line arg
        ListParser parser = new ListParser(lexer);
        parser.list(); // begin parsing at rule list
    }
}
