package com.example.emobilis.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
CircleImageView ss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ss=findViewById(R.id.profile_image);
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ss.setImageResource(R.drawable.audi);
            }
        });
    }
}
