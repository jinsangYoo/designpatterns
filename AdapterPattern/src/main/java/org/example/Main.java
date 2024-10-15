package org.example;

import org.example.pattern.PrintBanner;
import org.example.pattern.myInterface.Print;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}