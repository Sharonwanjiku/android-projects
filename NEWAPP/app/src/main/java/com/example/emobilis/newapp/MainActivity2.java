package com.example.emobilis.newapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button call,share,sms,capture,simtoolkit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        call=(Button)findViewById(R.id.button);
        share=findViewById(R.id.button5);
        sms=findViewById(R.id.button2);
        capture=findViewById(R.id.button3);
        simtoolkit=findViewById(R.id.button4);
                    call.setOnClickListener(new View.OnClickListener(){
                            @Override
                    public void onClick(View v){
              String phonenumber="+2547095433534";
                Intent callit=new Intent
                        (Intent.ACTION_DIAL, Uri.fromParts("tel",phonenumber,null));
                startActivity(callit);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dee=new Intent (Intent.ACTION_SEND);
                dee.setType("plain/text");
                startActivity(Intent.createChooser(dee,"SHARE NOW"));
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textm=new Intent (Intent.ACTION_MAIN);
                textm.setType("vnd.android-dir/mms-sms");
                startActivity(textm);
            }
        });
        capture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
             Intent picha=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
             startActivityForResult(picha,0);
            }
        });
        simtoolkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Launch = getApplicationContext().getPackageManager().
                        getLaunchIntentForPackage
                                ("com.android.stk");
                if (Launch != null) {
                    startActivity(Launch);
                }
            }
        });
    }
}
