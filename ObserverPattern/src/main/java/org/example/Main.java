package org.example;

import org.example.pattern.DigitObserver;
import org.example.pattern.GraphObserver;
import org.example.pattern.NumberGenerator;
import org.example.pattern.RandomNumberGenerator;
import org.example.pattern.myInterface.Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        Observer ob1 = new DigitObserver();
        Observer ob2 = new GraphObserver();

        generator.addObserver(ob1);
        generator.addObserver(ob2);

        generator.execute();
    }
}