package com.compiler.official_demo.interp.stack; /***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.Arrays;

public class StructSpace {
	Object[] fields;
    public StructSpace(int nfields) { this.fields = new Object[nfields]; }
    public String toString() { return Arrays.toString(fields); }
}
