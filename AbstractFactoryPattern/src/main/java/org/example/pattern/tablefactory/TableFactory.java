package org.example.pattern.tablefactory;

import org.example.pattern.factory.Factory;
import org.example.pattern.factory.Link;
import org.example.pattern.factory.Page;
import org.example.pattern.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
