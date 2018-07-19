package com.example.emobilis.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mAnswer;
    EditText firstnum,secondnum;
    Button mAdd,mSub,mDiv,mMult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find items based on id
        mAnswer = findViewById(R.id.textView);
        firstnum = findViewById(R.id.editText3);
        secondnum = findViewById(R.id.editText4);
        mAdd = findViewById(R.id.button2);
        mSub = findViewById(R.id.button);
        mDiv = findViewById(R.id.button3);
        mMult = findViewById(R.id.button4);
        //we then set onclick listeners for all the four buttons
        mAdd.setOnClickListener(this);
        mDiv.setOnClickListener(this);
        mMult.setOnClickListener(this);
        mSub.setOnClickListener(this);
    }
        //abstract class for the onclick listener
        public void onClick(View view){
            String fnum=firstnum.getText().toString();
            String snum=secondnum.getText().toString();
            if (fnum.isEmpty() || snum.isEmpty()) {
                Toast.makeText(this,"fill in all the slots", Toast.LENGTH_SHORT);
            }
            else {
                switch (view.getId()){
                    case R.id.button2:
                        double addition=Double.parseDouble(fnum)+Double.parseDouble(snum);
                        mAnswer.setText(String.valueOf(addition));
                    case R.id.button:
                        double subtraction=Double.parseDouble(fnum)-Double.parseDouble(snum);
                        mAnswer.setText(String.valueOf(subtraction));
                    case R.id.button4:
                        double multiply=Double.parseDouble(fnum)*Double.parseDouble(snum);
                        mAnswer.setText(String.valueOf(multiply));
                    case R.id.button3:
                        double div=Double.parseDouble(fnum)/Double.parseDouble(snum);
                        mAnswer.setText(String.valueOf(div));

                }
            }


        }
        public void onPointerCaptureChanged(boolean hasCapture){
        
        }

    }

