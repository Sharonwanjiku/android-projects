package com.emobilis.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webit extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webit);
        web=findViewById(R.id.webview);
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/index.html");
    }
}
