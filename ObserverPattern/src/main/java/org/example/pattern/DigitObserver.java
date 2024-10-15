package org.example.pattern;

import org.example.pattern.myInterface.Observer;

public class DigitObserver implements Observer {
    private static final String TAG = "DigitObserver";

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
