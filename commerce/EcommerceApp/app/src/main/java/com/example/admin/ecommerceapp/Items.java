package com.example.admin.ecommerceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Items extends AppCompatActivity {
    ImageButton b1,b2,b3,b4;
    TextView textView;
    Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        b1=(ImageButton)findViewById(R.id.imageButton);
        b2=(ImageButton)findViewById(R.id.imageButton2);
        b3=(ImageButton)findViewById(R.id.imageButton3);
        b4=(ImageButton)findViewById(R.id.imageButton4);
        email=(Button)findViewById(R.id.button);
        //set onclick listener for each image button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manlunye=new Intent(Items.this
                        ,Jacket.class);
                startActivity(manlunye);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manlunye=new Intent(Items.this
                        ,Toja.class);
                startActivity(manlunye);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manlunye=new Intent(Items.this
                        ,GirlsSneakers.class);
                startActivity(manlunye);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manlunye=new Intent(Items.this
                        ,BoySneakers.class);
                startActivity(manlunye);

            }
        });

    }
}




