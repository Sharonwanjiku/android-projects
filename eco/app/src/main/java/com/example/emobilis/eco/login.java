package com.example.admin.ecommerceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        username = findViewById(R.id.edittextusername);
        password = findViewById(R.id.edittextpassword);
        submit=findViewById(R.id.button);
        /*This code is to enable a method to listen for
         * input changes in the edit text field such that
         * the button remains unless something is input*/
        username.addTextChangedListener(br);
        password.addTextChangedListener(br);
    }

    private TextWatcher br = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
//get the input directly from the edittext
            String usernameinput=username.getText().toString().trim();
            String passwordinput=password.getText().toString().trim();
            //we then check if fields are empty
            submit.setEnabled(!usernameinput.isEmpty()
                    && !passwordinput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };



}
