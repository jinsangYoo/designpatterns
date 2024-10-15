package org.example.pattern.listfactory;

import org.example.pattern.factory.Factory;
import org.example.pattern.factory.Link;
import org.example.pattern.factory.Page;
import org.example.pattern.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
