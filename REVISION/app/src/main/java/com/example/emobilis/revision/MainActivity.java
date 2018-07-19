package com.example.emobilis.revision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bb=run(view);{
            try{
                sleep(5*1000);
                Intent jj=new Intent(getApplicationContext(),def.class);
                startActivity(jj);
                finish();
            }catch(Exception e){

            }
        };
        bb.start();
    }
}
