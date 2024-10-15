package org.example.pattern;

import org.example.pattern.framework.Product;

public class MessageBox implements Product {
    private static final String TAG = "MessageBox";
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length + 4; i++) {
            sb.append(decochar);
        }
        System.out.println(sb.toString());
        sb.delete(0, sb.length());
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            sb.append(decochar);
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
