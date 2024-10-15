package org.example.pattern;

public class Banner {
    private static final String TAG = "Banner";

    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
