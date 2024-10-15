package org.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.acecounter.android.flyweightpatternapplication.pattern.BigString;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sample = "9876A";
        BigString bs = new BigString(this, sample);
        bs.print();
    }
}