package org.example;

import org.example.pattern.factory.Factory;
import org.example.pattern.factory.Link;
import org.example.pattern.factory.Page;
import org.example.pattern.factory.Tray;

public class Main {
    public static void main(String[] args) {

        //        Factory factory = Factory.getFactory("org.example.pattern.listfactory.ListFactory");
        Factory factory = Factory.getFactory("org.example.pattern.tablefactory.TableFactory");

        Link joins = factory.createLink("중앙일보", "www.joins.com");
        Link daum = factory.createLink("다음일보", "www.daum.net");

        Link us_yahoo = factory.createLink("yahoo", "www.yahoo.com");
        Link kr_yahoo = factory.createLink("yahoo!korea", "www.yahoo.co.kr");
        Link excite = factory.createLink("Excite", "www.excite.com");
        Link google = factory.createLink("google", "www.google.com");

        Tray trayNews = factory.createTray("신문");
        trayNews.add(joins);
        trayNews.add(daum);

        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(kr_yahoo);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "영진닷컴");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}