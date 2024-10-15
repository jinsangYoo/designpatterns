package org.example;

import org.example.pattern.CountDisplay;
import org.example.pattern.Display;
import org.example.pattern.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new Display(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.multiDisplay(5);
    }
}