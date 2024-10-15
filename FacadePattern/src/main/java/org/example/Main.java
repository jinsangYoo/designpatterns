package org.example;

import org.example.pattern.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
//        PageMaker.makeWelcomePage(this, "youngjin@youngjin.com", "welcome.html"); // and
        PageMaker.makeWelcomePage("youngjin@youngjin.com", "welcome.html");
    }
}