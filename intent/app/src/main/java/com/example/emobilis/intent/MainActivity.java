package com.example.emobilis.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //intent
    EditText mEnterText;
    Button mlauncheractvivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign variables
        mEnterText = (EditText)findViewById(R.id.edname);
        mlauncheractvivity =(Button)findViewById(R.id.btnsend);
        mlauncheractvivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent to launch new activity
                Intent launchActivity = new Intent(getApplicationContext() , SecondActivity.class);
            }
        });

    }
}
