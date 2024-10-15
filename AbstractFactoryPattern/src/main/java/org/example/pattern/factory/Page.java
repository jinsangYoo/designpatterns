package org.example.pattern.factory;

import java.util.ArrayList;

public abstract class Page {
    private static final String TAG = "Page";

    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        this.content.add(item);
    }
    public void output() {
        String result = this.makeHTML();
        System.out.println(result);
    }

    public abstract String makeHTML();
}
