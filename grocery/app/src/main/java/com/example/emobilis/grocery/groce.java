package com.example.emobilis.grocery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class groce extends AppCompatActivity {
    Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groce);
        pay = (Button) findViewById(R.id.button);
        pay.setOnClickListener(View ){
        Intent launchme = getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.stk");
        if (launchme != null) {
            startActivity(launchme);
        }
    }
        });
    }
}
