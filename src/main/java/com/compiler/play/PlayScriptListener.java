// Generated from PlayScript.g4 by ANTLR 4.9.2

package com.compiler.play;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayScriptParser}.
 */
public interface PlayScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PlayScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PlayScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PlayScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PlayScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PlayScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PlayScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PlayScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PlayScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PlayScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PlayScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PlayScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PlayScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PlayScriptParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PlayScriptParser.ArgumentListContext ctx);
}