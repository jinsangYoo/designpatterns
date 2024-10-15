package org.example.pattern;

public class StringDisplayImpl extends DisplayImpl {
    private static final String TAG = "StringDisplayImpl";

    private String string;
    private int width;
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        StringBuilder sb = new StringBuilder("+");
        for (int i = 0; i < width; i++) {
            sb.append("-");
        }
        sb.append("+");

        System.out.println(sb.toString());
    }
}
