package org.example.pattern;

import org.example.pattern.framework.Product;

public class UnderlinePen implements Product {
    private static final String TAG = "UnderlinePen";
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        System.out.println("\"" + s + "\"");
        sb.append(" ");
        for (int i = 0; i < length; i++) {
            sb.append(ulchar);
        }
        System.out.println(sb.toString());
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
