package com.example.emobilis.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progress = findViewById(R.id.progressBar);

        Thread splashScreen = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                    Intent launchMain = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(launchMain);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        splashScreen.start();

    }
}
