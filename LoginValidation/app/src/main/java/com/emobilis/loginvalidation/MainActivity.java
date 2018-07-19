package com.emobilis.loginvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declare variables to hold views
    private EditText username;
    private EditText password;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find items based on their ids
        username=findViewById(R.id.edittext);
        password=findViewById(R.id.edittext2);
        submit=findViewById(R.id.button);
        /*this code is to enanble a method to listen for input changes
         in the edit text field such that the button remains disabled
         unless something is input*/
        username.addTextChangedListener(vicky);
        password.addTextChangedListener(vicky);
    }
    private TextWatcher vicky=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//get input directly from edit text
            String usernameinput=username.getText().toString().trim();
            String passwordinput=password.getText().toString().trim();
            //we then check if fields are empty
            submit.setEnabled(!usernameinput.isEmpty()
            && !passwordinput.isEmpty());
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
