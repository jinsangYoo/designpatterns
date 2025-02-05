package org.example;

import org.example.pattern.framework.Factory;
import org.example.pattern.framework.Product;
import org.example.pattern.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");

        card1.use();
        card2.use();
        card3.use();
    }
}