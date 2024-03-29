package com.compiler.official_demo.interp.syntax; /***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.List;
import java.util.ArrayList;

public class ResultSet {
    List<List<Object>> results = new ArrayList<List<Object>>();

    public void add(List<Object> row) {
        results.add(row);
    }
}
