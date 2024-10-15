package org.example.pattern.tablefactory;

import org.example.pattern.factory.Item;
import org.example.pattern.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>\n");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>\n");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>\n");
        buffer.append("</td>\n");
        return buffer.toString();
    }
}
