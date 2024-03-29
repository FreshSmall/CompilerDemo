package com.compiler.official_demo.reader.fig; /***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.*;
public class Server {        // can refer to Server in a Fig file
    public List<Site> sites; // list of references to Sites
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("<Server [");
        boolean first = true;
        for ( Site s : sites ) {
            if ( !first ) buf.append(", ");
            buf.append("Site "+s.answers);
            first = false;
        }
        buf.append("]>");
        return buf.toString();
    }
}
