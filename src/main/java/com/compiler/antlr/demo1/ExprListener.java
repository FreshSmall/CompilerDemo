// Generated from Expr.g4 by ANTLR 4.9.2
package com.compiler.antlr.demo1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprint}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprint(ExprParser.ExprintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprint}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprint(ExprParser.ExprintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprmulti}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprmulti(ExprParser.ExprmultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprmulti}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprmulti(ExprParser.ExprmultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprplus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprplus(ExprParser.ExprplusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprplus}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprplus(ExprParser.ExprplusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbracket}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprbracket(ExprParser.ExprbracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbracket}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprbracket(ExprParser.ExprbracketContext ctx);
}