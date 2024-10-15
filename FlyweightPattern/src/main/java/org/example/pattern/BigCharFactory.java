package org.example.pattern;

import android.content.Context;

import java.util.HashMap;

public class BigCharFactory {
    private static final String TAG = "BigCharFactory";

    private HashMap<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() { }

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(Context context, char charName) {
        BigChar bc = (BigChar)pool.get("" + charName);
        if (bc == null) {
            bc = new BigChar(context, charName);
            pool.put("" + charName, bc);
        }

        return bc;
    }
}
