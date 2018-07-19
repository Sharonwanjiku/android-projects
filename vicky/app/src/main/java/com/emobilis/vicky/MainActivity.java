package com.emobilis.vicky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //A thread refers to a number of processes running cocurretly
        Thread bb=new Thread() {
            //execute thread
            public void run(){
                try{
                    //the progress bar will load for five seconds
                    sleep(5000);
                    //get application context(),-->same as MainActivity.this
                    Intent jj = new Intent(MainActivity.this,app2.class);
                    startActivity(jj);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }; bb.start();
    }

}
