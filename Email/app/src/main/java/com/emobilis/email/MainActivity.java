package com.emobilis.email;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(Button)findViewById(R.id.button);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  //intent to send to email
                Intent email=new Intent
                        (Intent.ACTION_SENDTO, Uri.fromParts
                                ("malito","victorknight191@gmail.com",null));
                email.putExtra(Intent.EXTRA_SUBJECT,"ANDROID CLASS");
                email.putExtra(Intent.EXTRA_TEXT,"Thanks for choosing us");
                startActivity(Intent.createChooser(email,"share mail via"));
            }
        });
    }
}
