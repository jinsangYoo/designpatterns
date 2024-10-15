package org.example;

import org.example.pattern.Hand;
import org.example.pattern.Player;
import org.example.pattern.ProbStrategy;
import org.example.pattern.WinningStrategy;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("두리", new WinningStrategy(100));
        Player p2 = new Player("두리", new ProbStrategy(50));
        for (int i = 0; i < 10000; ++i) {
            Hand nextHand1 = p1.nexHand();
            Hand nextHand2 = p2.nexHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + p1);
                p1.win();
                p2.lose();
            }
            else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + p2);
                p1.lose();
                p2.win();
            }
            else {
                System.out.println("Even...");
                p1.even();
                p2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}