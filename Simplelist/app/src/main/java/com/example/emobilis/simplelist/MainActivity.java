package com.example.emobilis.simplelist;

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
                Intent email=new Intent
                        (Intent.ACTION_SENDTO, Uri.fromParts
                                ("mailto","wanjikusharon@gmail.com",null));
             email.putExtra(Intent.EXTRA_SUBJECT,"ANDROID CLASS");
             email.putExtra(Intent.EXTRA_SUBJECT,"Thank you for the surprise");
             startActivity(Intent.createChooser(email,"share mail via"));
            }
        });
    }
}
