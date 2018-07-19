package com.example.emobilis.revision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class def extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def);
 webView=findViewById(R.id.webview);
 webView.loadurl("https://www.google.com");
    }
}
