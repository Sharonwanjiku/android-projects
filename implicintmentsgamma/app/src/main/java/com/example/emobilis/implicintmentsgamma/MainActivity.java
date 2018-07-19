package com.example.emobilis.implicintmentsgamma;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText mEnterUrl;
    Button mOpenWebPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign variables
        mEnterUrl = (EditText)findViewById(R.id.edtUrl);
        mOpenWebPage =(Button)findViewById(R.id.btnopen_browser);

        //set Onclick listener
        mOpenWebPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the url text
                String url = mEnterUrl.getText().toString();
                //parse the Uri and create intent to launch browser
                Uri webPage = Uri.parse(url);
                Intent openBrowser = new Intent(Intent.ACTION_VIEW,webPage);

                startActivity(openBrowser);
            }
        });
    }
}
