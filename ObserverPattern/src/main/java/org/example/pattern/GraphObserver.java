package org.example.pattern;

import org.example.pattern.myInterface.Observer;

public class GraphObserver implements Observer {
    private static final String TAG = "GraphObserver";

    @Override
    public void update(NumberGenerator generator) {
        StringBuilder sb = new StringBuilder("GraphObserver: ");

        int count = generator.getNumber();
        for (int i = 0; i < count; ++i) {
            sb.append('*');
        }

        System.out.println(sb.toString());

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
