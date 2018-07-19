package com.example.admin.ecommerceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bb=new Thread(){
            //execute thread
            public void run() {
                try {
                    //the progress bar will load for 5 seconds
                    sleep(5 * 1000);
                    //intents allow you to perform an activity
                    Intent jj = new Intent(MainActivity.this,
                            LogIn.class);
                    startActivity(jj);
                    finish();
                } catch (Exception e) {
                }
            }

        };
        bb.start();
    }
}
