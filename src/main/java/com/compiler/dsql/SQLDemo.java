package com.compiler.dsql;

import com.compiler.dsql.custom.SQLVisitor;
import com.compiler.dsql.custom.SelectStmt;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author: yinchao
 * @ClassName: SQLDemo
 * @Description:
 * @team wuhan operational dev.
 * @date: 2023/3/28 14:26
 */
public class SQLDemo {

    public static String getAST(String sql) {

        //词法分析
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //语法分析
        SQLiteParser parser = new SQLiteParser(tokens);
        ParseTree tree = parser.sql_stmt();

        //输出lisp格式的AST
//        System.out.println(tree.toStringTree(parser));
        return tree.toStringTree(parser);
    }

    public static String getDBName(String sql) {
        // 词法解析
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 语法解析
        SQLiteParser parser = new SQLiteParser(tokens);
        ParseTree tree = parser.sql_stmt();

        // 获得select 语句的要素，包括表名和where条件
        SQLVisitor visitor = new SQLVisitor();
        SelectStmt selectStmt = (SelectStmt) visitor.visit(tree);
        return null;
    }

    public static void main(String[] args) {
        String sql = "select order_id from orders where cust_id = 'SDYT987645' and price > 200";
        String result = getAST(sql);
        String dbName = getDBName(sql);
        System.out.println(result);


    }
}
