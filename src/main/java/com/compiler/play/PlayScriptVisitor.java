// Generated from PlayScript.g4 by ANTLR 4.9.2

package com.compiler.play;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PlayScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PlayScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PlayScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PlayScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PlayScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PlayScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PlayScriptParser.ArgumentListContext ctx);
}