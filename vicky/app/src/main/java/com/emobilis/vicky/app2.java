package com.emobilis.vicky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class app2 extends AppCompatActivity {
    //declare variables to hold view
    ImageButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);
        //identify button based on their id
        b1=(ImageButton)findViewById(R.id.imageButton5);
        b2=(ImageButton)findViewById(R.id.imageButton6);
        //set onclick listeners
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mickey=new Intent(app2.this,blue.class);
                startActivity(mickey);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mickey=new Intent(app2.this,blue.class);
                startActivity(mickey);

            }
        });
    }
}


