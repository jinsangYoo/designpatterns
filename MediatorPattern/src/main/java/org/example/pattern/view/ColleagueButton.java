package org.example.pattern.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import org.example.pattern.myInterface.Colleague;
import org.example.pattern.myInterface.Mediator;

public class ColleagueButton extends android.support.v7.widget.AppCompatButton implements Colleague {
    private static final String TAG = "ColleagueButton";

    private Mediator mediator;

    public ColleagueButton(Context context) {
        super(context);
    }

    public ColleagueButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColleagueButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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
