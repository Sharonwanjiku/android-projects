package com.example.emobilis.shiks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
edittext Textname;
EditText firstname,secondname;
Button submit,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textedit=(TextView)findViewById(R.id.textView);
        firstname=findViewById(R.id.editText2);
        secondname=findViewById(R.id.editText3);

    }
}
