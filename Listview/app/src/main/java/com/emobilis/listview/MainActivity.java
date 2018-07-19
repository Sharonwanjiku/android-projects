package com.emobilis.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button offline,online,share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        offline=findViewById(R.id.button);
        //set an onclick listener for the button
        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to open the next page holding the webview
                Intent silence=new Intent(
                        getApplicationContext(),webit.class
                );
                startActivity(silence);
            }
        });
        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onl=new Intent(
                        getApplicationContext(), WebView.class);
                startActivity(onl);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendit=new Intent();
                //assign intent action to perform
                sendit.setAction(Intent.ACTION_SEND);
                //set the text that is to be shared
                sendit.putExtra(Intent.EXTRA_TEXT,"My android app");
                sendit.setType("text/plain");
                //specify package to be used
                sendit.setPackage("com.whatsapp");
                startActivity(sendit);
            }
        });

    }
}




























