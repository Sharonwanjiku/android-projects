package com.example.emobilis.grocery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity{
//declare variables to hold view
    ImageButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    b1=(ImageButton)findViewById(R.id.imageButton);
    b2=(ImageButton)findViewById(R.id.imageButton2);
    b3=(ImageButton)findViewById(R.id.imageButton4);
    b4=(ImageButton)findViewById(R.id.imageButton3);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent can=new Intent(Main2Activity.this,groce.class);
            startActivity(can);
    }
});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent can=new Intent(Main2Activity.this,groce.class);
                startActivity(can);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent can=new Intent(Main2Activity.this,groce.class);
                startActivity(can);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent can=new Intent(Main2Activity.this,groce.class);
                startActivity(can);
            }
        });
    }
}
