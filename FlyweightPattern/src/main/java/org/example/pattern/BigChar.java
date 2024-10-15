package org.example.pattern;

import android.content.Context;
import android.util.Log;

import com.acecounter.android.flyweightpatternapplication.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigChar {
    private static final String TAG = "BigChar";

    private char charName;
    private String fontData;

    public BigChar(Context context, char charName) {
        this.charName = charName;
        try {
            int resourceID = BigChar.getResourceID(charName);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(context.getResources().openRawResource(resourceID))
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontData = buf.toString();
        }
        catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        Log.d(TAG, this.fontData);
    }

    private static int getResourceID(char charName) throws IOException {
        switch (charName) {
            case '1':
                return R.raw.big1;
            case '2':
                return R.raw.big2;
            case '3':
                return R.raw.big3;
            case '4':
                return R.raw.big4;
            case '5':
                return R.raw.big5;
            case '6':
                return R.raw.big6;
            case '7':
                return R.raw.big7;
            case '8':
                return R.raw.big8;
            case '9':
                return R.raw.big9;
            case '0':
                return R.raw.big0;
            case '-':
                return R.raw.big_;
            default:
                throw new IOException("not found charName: " + charName);
        }
    }
}
