/**
 * 一个报表引擎的示意性实现，展示其中用到的编译技术。
 */

package com.compiler.report.custom;

import com.compiler.report.PlayReportLexer;
import com.compiler.report.PlayReportParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import java.util.LinkedList;
import java.util.List;

public class PlayReport {

    public PlayReport() {
      
    }

    public String renderReport(ReportTemplate template, TabularData data){
        StringBuffer sb = new StringBuffer();
        
        //输出表格头
        for (String columnHeader: template.columnHeaders){
            sb.append(columnHeader).append('\t');
        }
        sb.append("\n");

        //编译报表的每个字段
        List<PlayReportParser.BracedExpressionContext> fieldASTs = new LinkedList<PlayReportParser.BracedExpressionContext>();
        for (String fieldExpr : template.fields){
            PlayReportParser.BracedExpressionContext tree = parse(fieldExpr);
            fieldASTs.add(tree);
        }

        //计算报表字段
        FieldEvaluator evaluator = new FieldEvaluator(data);
        List<String> fieldNames = new LinkedList<String>();
        for (PlayReportParser.BracedExpressionContext fieldAST: fieldASTs){
            String fieldName = fieldAST.expression().getText();
            fieldNames.add(fieldName);
            if (!data.hasField(fieldName)){
                Object field = evaluator.visit(fieldAST);
                data.setField(fieldName, field);
            }
        }

        //显示每一行数据
        for (int row = 0; row< data.getNumRows(); row++){
            for (String fieldName: fieldNames){
                Object value = data.getFieldValue(fieldName, row);
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public PlayReportParser.BracedExpressionContext parse(String exp) {
        // 词法解析
        PlayReportLexer lexer = new PlayReportLexer(CharStreams.fromString(exp));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 语法解析
        PlayReportParser parser = new PlayReportParser(tokens);
        PlayReportParser.BracedExpressionContext tree = parser.bracedExpression();

        // 以lisp格式打印AST
        System.out.println(tree.toStringTree(parser));

        return tree;
    }


    public static void main(String args[]) {
        System.out.println("Play Report!");

        PlayReport report = new PlayReport();
        //report.parse("{=sales_amount/num_person}");

        //打印报表1
        String reportString = report.renderReport(ReportTemplate.sampleReport1(), TabularData.sampleData());
        System.out.println(reportString);

        //打印报表2
        reportString = report.renderReport(ReportTemplate.sampleReport2(), TabularData.sampleData());
        System.out.println(reportString);
    }

}
