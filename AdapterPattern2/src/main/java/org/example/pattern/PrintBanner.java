package org.example.pattern;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
