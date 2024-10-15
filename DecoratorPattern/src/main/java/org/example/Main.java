package org.example;

import org.example.pattern.Display;
import org.example.pattern.FullBorder;
import org.example.pattern.SideBorder;
import org.example.pattern.StringDisplay;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello World.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();

        Display b4 = // getRows, getColumns
                new SideBorder( // 7, 16
                        new FullBorder( // 7, 14
                                new FullBorder( // 5, 12
                                        new SideBorder( // 3, 10
                                                new FullBorder( // 3, 8
                                                        new StringDisplay("ABCDFG") // 1, 6
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );
        b4.show();
    }
}