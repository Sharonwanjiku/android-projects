package com.example.emobilis.myshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //a thread refers to one or more processes running concurrently at the same thread background=new thread()
        Thread background = new Thread() {
            public void run() {
                try {
                    //its going to load for 5 secs
                    sleep(5 * 1000);
                    //intents enable you to move to the next page
                    Intent jj = new Intent(MainActivity.this, Main2.class);

                    startActivity(jj);

                    finish();
                } catch (Exception e) {
                }
            }
        };
        background.start();
        }

    }

