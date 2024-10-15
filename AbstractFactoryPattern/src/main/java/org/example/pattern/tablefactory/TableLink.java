package org.example.pattern.tablefactory;

import org.example.pattern.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + this.url + "\">" + this.caption + "</a></td>\n";
    }
}
