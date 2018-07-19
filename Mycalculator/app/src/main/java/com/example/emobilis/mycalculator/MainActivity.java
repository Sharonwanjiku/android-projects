package com.example.emobilis.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//define variables to hold the views
    TextView mAnswer;
    EditText firstnum,secondnum;
    Button mAdd,mSub,mDiv,mMult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find text based on the id
        mAnswer=(TextView)findViewById(R.id.textView);
        firstnum=findViewById(R.id.editText);
        secondnum=findViewById(R.id.editText2);
        mAdd=findViewById(R.id.button);
        mSub=findViewById(R.id.button2);
        mAdd.setOnClickListener(this);
        mSub.setOnClickListener(this);
        mDiv.setOnClickListener(this);
        mMult.setOnClickListener(this);
    }

    public void onClick(View view) {
        String fnum = firstnum.getText().toString();
        String snum = secondnum.getText().toString();
        //checks if the field is empty
        /*a toast refers to a message that is
        displayed for a short time*/

        if (fnum.isEmpty() || snum.isEmpty()) {
            Toast.makeText(this, "fill in all slots", Toast.LENGTH_SHORT).show();
        } else {
            switch (view.getId()) {
                case R.id.button:
                    double add = Double.parseDouble(fnum) +
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(add));
                    break;
                case R.id.button2:
                    double sub = Double.parseDouble(fnum) -
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(sub));
                    break;
                case R.id.button3:
                    double div = Double.parseDouble(fnum) /
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(div));
                    break;
                case R.id.button4:
                    double mult = Double.parseDouble(fnum) *
                            Double.parseDouble(snum);
                    mAnswer.setText(String.valueOf(mult));
                    break;
                default:
                    Toast.makeText(this, "Enter valid values", Toast.LENGTH_SHORT);
            }
        }
    }
           //helps track changes on the pointer
        public void onPointerCaptureChanged
        (boolean hasCapture){
    }
}
