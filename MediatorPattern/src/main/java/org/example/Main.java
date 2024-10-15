package org.example;

public class MainActivity extends AppCompatActivity implements Mediator {
    private static final String TAG = "MainActivity";

    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;

    private ColleagueTextField textUser;
    private ColleagueTextField textPass;

    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createColleagues();
        colleagueChanged();
    }

    @Override
    public void createColleagues() {
        checkGuest = findViewById(R.id.checkGuest);
        checkLogin = findViewById(R.id.checkLogin);

        textUser = findViewById(R.id.textUser);
        textPass = findViewById(R.id.textPass);

        buttonOk = findViewById(R.id.buttonOk);
        buttonCancel = findViewById(R.id.buttonCancel);

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
    }

    @Override
    public void colleagueChanged() {
        try {
            Log.d(TAG, new Object() {}.getClass().getEnclosingMethod().getName());
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }

        if (checkGuest.isChecked()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }
        else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        try {
            if (textUser.getText().length() > 0) {
                textPass.setColleagueEnabled(true);
                if (textPass.getText().length() > 0) {
                    buttonOk.setColleagueEnabled(true);
                } else {
                    buttonOk.setColleagueEnabled(false);
                }
            } else {
                textPass.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(false);
            }
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}