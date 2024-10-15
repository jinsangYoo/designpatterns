package org.example.pattern;

import android.content.Context;

public class BigString {
    private static final String TAG = "BigString";

    private BigChar[] bigChars;
    public BigString(Context context, String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; ++i) {
            bigChars[i] = factory.getBigChar(context, string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; ++i) {
            bigChars[i].print();
        }
    }
}
