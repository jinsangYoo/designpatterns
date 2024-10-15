package org.example;

import org.example.pattern.Director;
import org.example.pattern.HTMLBuilder;
import org.example.pattern.TextBuilder;

public class Main {
    public static void main(String[] args) {
        String _args = "plain";
//        String _args = "html";
        if (_args.compareToIgnoreCase("plain") == 0) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        }
        else if (_args.compareToIgnoreCase("html") == 0) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "가 작성되었습니다.");
        }
    }
}