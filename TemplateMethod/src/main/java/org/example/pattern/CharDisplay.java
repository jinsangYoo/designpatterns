package org.example.pattern;

import org.example.pattern.myAbstract.AbstractDisplay;

public class CharDisplay extends AbstractDisplay {
    private static final String TAG = "CharDisplay";

    private char ch;
    private StringBuilder sb;

    public CharDisplay(char ch) {
        this.ch = ch;
        sb = new StringBuilder();
    }

    @Override
    public void open() {
        sb.append("<<");
    }

    @Override
    public void print() {
        sb.append(ch);
    }

    @Override
    public void close() {
        sb.append(">>");

        System.out.println(sb.toString());
    }
}
