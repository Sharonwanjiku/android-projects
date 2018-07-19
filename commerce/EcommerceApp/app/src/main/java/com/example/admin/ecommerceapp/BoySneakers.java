package com.example.admin.ecommerceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoySneakers extends AppCompatActivity {
    Button toolkit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy_sneakers);
        toolkit=(Button)findViewById(R.id.button);
        toolkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sim=getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage
                                ("com.android.stk");
                if(sim!=null) {
                    startActivity(sim);
                }
            }
        });
    }
}
