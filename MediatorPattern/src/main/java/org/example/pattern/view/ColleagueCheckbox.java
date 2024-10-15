package org.example.pattern.view;

import android.content.Context;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import org.example.pattern.myInterface.Colleague;
import org.example.pattern.myInterface.Mediator;

public class ColleagueCheckbox extends AppCompatRadioButton implements Colleague {
    private static final String TAG = "ColleagueCheckbox";

    private Mediator mediator;
    private OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (mediator != null) {
                mediator.colleagueChanged();
            }
        }
    };

    public ColleagueCheckbox(Context context) {
        super(context);

        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public ColleagueCheckbox(Context context, AttributeSet attrs) {
        super(context, attrs);

        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public ColleagueCheckbox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        try {
            System.out.println(new Object() {}.getClass().getEnclosingMethod().getName());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

        setEnabled(enabled);
    }
}
