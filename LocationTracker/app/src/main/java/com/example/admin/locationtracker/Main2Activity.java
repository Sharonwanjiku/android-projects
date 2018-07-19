package com.example.admin.locationtracker;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText Name, Mobile, Email , Password;
    private MyDBadapter helper;
    private Button msign;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = findViewById(R.id.editText);
        Mobile =  findViewById(R.id.editText2);
        Email =  findViewById(R.id.editText3);
        Password =  findViewById(R.id.editText4);




        msign = findViewById(R.id.button);

        msign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( Main2Activity.this, Main3Activity.class));
                finish();
            }
        });

    }
    public void addUser(View view)
    {
        String t1 = Name.getText().toString();
        String t2 = Mobile.getText().toString();
        String u1 = Email.getText().toString();
        String u2 = Password.getText().toString();

        if(t1.isEmpty() || t2.isEmpty() || u1.isEmpty() ||u2.isEmpty())
        {
            Toast.makeText(this, "Please insert all your details", Toast.LENGTH_SHORT).show();
        }
        else
        {
            long id = helper.insertData (t1,t2,u1,u2);
            if(id<=0)
            {
                Toast.makeText(this, "Insertion Unsuccessful", Toast.LENGTH_SHORT).show();
                Name.setText("");
                Mobile.setText("");
                Email.setText("");
                Password.setText("");
            } else
            {
                Toast.makeText(this, "Insertion Successful", Toast.LENGTH_SHORT).show();
                Name.setText("");
                Mobile.setText("");
                Email.setText("");
                Password.setText("");
            }
        }
    }


}

