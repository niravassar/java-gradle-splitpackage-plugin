package com.example;

import parser.xml.FastParser;

public class AppMain {
    public static void main(String[] args) {
        FastParser fastParser = new FastParser();
        System.out.println(fastParser.parse("test data"));
    }
}