package com.example.emobilis.buttons;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call, share, message, capture, toolkit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = findViewById(R.id.button);
        share = findViewById(R.id.button2);
        message = findViewById(R.id.button3);
        capture = findViewById(R.id.button4);
        toolkit = findViewById(R.id.button5);
        //setting an onclick listener for the button
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "";
                //intents enable you to perform an activity
                Intent kevo = new Intent(
                        Intent.ACTION_DIAL, Uri.fromParts("tell", phone, null)
                );
                startActivity(kevo);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Intent shareme = new Intent(Intent.ACTION_SEND);
                                         shareme.setType("plain/text");
                                         startActivity(Intent.createChooser(shareme, "SEND TEXT"));
                                     }

                                 }
        );
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sms = new Intent(Intent.ACTION_MAIN);
                sms.setType("vnd.android-dir/mms-sms");
                startActivity(sms);
            }
        });
        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent picha = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(picha, 0);
            }
        });
        toolkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launch = getApplicationContext().getPackageManager().getLaunchIntentForPackage
                        ("com.android.stk");
                if (launch != null) {
                    startActivity(launch);
                }
            }

        });
    }
}