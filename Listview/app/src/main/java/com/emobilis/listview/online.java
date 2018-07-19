package com.emobilis.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class online extends AppCompatActivity {
    WebView online;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        online=findViewById(R.id.button2);
        online.getSettings().setJavaScriptEnabled(true);
        online.loadUrl("file:///android_asset/index.html");
    }
}
