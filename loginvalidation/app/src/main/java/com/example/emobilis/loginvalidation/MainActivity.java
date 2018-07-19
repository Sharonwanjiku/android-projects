package com.example.emobilis.loginvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private EditText username;
   private EditText password;
   private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        submit=findViewById(R.id.button);
        /*this button is to enable a method to listen
        *for input changes in the edit field such that
        * the button remains disabled unless something is input*/
        username.addTextChangedListener(dudu);
        password.addTextChangedListener(dudu);
        //we then check if fields are empty

        }
        private TextWatcher dudu=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//get input direct from edit text
                String usernameinput=username.getText().toString().trim();
                String passwordinput=password.getText().toString().trim();
                submit.setEnabled(!usernameinput.isEmpty()
                        && !passwordinput.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
}
