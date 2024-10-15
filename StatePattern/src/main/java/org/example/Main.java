package org.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.acecounter.android.statepatternapplication.pattern.DayState;
import com.acecounter.android.statepatternapplication.pattern.myInterface.Context;
import com.acecounter.android.statepatternapplication.pattern.myInterface.State;

import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements Context {
    private static final String TAG = "MainActivity";

    private State state = DayState.getInstance();
    private TextView currentTime;
    private ListView processLog;
    private ArrayList<String> logList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    private ScheduledThreadPoolExecutor exec;
    private ScheduledFuture<?> future;
    private int changedTimeCount;
    private final int changedTimeMaxCount = 24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentTime = findViewById(R.id.currentTime);
        processLog = findViewById(R.id.processLog);
        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                logList);
        processLog.setAdapter(adapter);

        findViewById(R.id.useSafe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.doUse(MainActivity.this);
            }
        });
        findViewById(R.id.emergencyBell).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.doAlarm(MainActivity.this);
            }
        });
        findViewById(R.id.normalCall).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.doPhone(MainActivity.this);
            }
        });

        findViewById(R.id.stopTime).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopTime();
            }
        });

        exec = new ScheduledThreadPoolExecutor(1);
        future = exec.scheduleWithFixedDelay(new Runnable() {
            public void run() {
                changedTime();
            }
        }, 1, 1, TimeUnit.SECONDS);
    }

    public void changedTime() {
        changedTimeCount %= 25;
        setClock(changedTimeCount);
        ++changedTimeCount;
    }

    public void stopTime() {
        if (exec != null) {
            boolean res = future.cancel(false);
            Log.d(TAG, "Previous task canceled: " + res);
            if (!exec.isShutdown() || !exec.isTerminated()) {
                exec.shutdown();
                future = null;
            }
            else {
                if (exec.isShutdown()) {
                    Log.d(TAG, "isShutdown is true");
                }
                else if (exec.isTerminated()) {
                    Log.d(TAG, "isTerminated is true");
                }
                else {
                    Log.d(TAG, "failed exec shutdown.");
                }
            }
        }
    }

    @Override
    public void setClock(final int hour) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String clockString = "현재 시간은 ";
                if (hour < 10) {
                    clockString += "0" + hour + ":00";
                }
                else {
                    clockString += hour + ":00";
                }

                Log.d(TAG, clockString);
                currentTime.setText(clockString);
            }
        });

        state.doClock(this, hour);
    }

    @Override
    public void changeState(final State state) {
        Log.d(TAG, this.state + " 에서 " + state + " 로 상태가 변화했습니다.");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(final String msg) {
        Log.d(TAG, "call! " + msg);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                logList.add("call! " + msg);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void recordLog(final String msg) {
        Log.d(TAG, "record ... " + msg);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                logList.add("record ... " + msg);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
