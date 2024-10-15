package org.example.pattern.view;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import org.example.pattern.myInterface.Colleague;
import org.example.pattern.myInterface.Mediator;

public class ColleagueTextField extends AppCompatEditText implements Colleague {
    private static final String TAG = "ColleagueTextField";

    private Mediator mediator;
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (mediator != null) {
                mediator.colleagueChanged();
            }
        }
    };

    public ColleagueTextField(Context context) {
        super(context);

        addTextChangedListener(textWatcher);
    }

    public ColleagueTextField(Context context, AttributeSet attrs) {
        super(context, attrs);

        addTextChangedListener(textWatcher);
    }

    public ColleagueTextField(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        addTextChangedListener(textWatcher);
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
