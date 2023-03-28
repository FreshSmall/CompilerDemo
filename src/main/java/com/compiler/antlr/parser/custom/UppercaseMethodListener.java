package com.compiler.antlr.parser.custom;

import com.compiler.antlr.parser.Java8BaseListener;
import com.compiler.antlr.parser.Java8Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yinchao
 * @ClassName: UppercaseMethodListener
 * @Description:
 * @team wuhan operational dev.
 * @date: 2023/3/28 15:51
 */
public class UppercaseMethodListener extends Java8BaseListener {

    private List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx) {
        TerminalNode node = ctx.Identifier();
        String methodName = node.getText();

        if (Character.isUpperCase(methodName.charAt(0))) {
            String error = String.format("Method %s is uppercased!", methodName);
            errors.add(error);
        }
    }
}
