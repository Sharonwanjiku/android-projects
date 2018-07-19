package com.example.emobilis.BMIcalc;

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
    EditText editText,editText2;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);
        //find text based on the id
        editText=(TextView)findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        button2=findViewById(R.id.button2);
        mAnswer=findViewById(R.id.TextView);
        editText.setOnClickListener(this);
        editText2.setOnClickListener(this);
    }

    public void onClick(View view) {
        String editText = editText.getText().toString();
        String editText2 = editText2.getText().toString();

        if (editText.isEmpty() || editText.isEmpty()) {
            Toast.makeText(this, "fill in all slots", Toast.LENGTH_SHORT).show();
        } else {
            switch (view.getId()) {
                case R.id.button2:
                    double add = (Double.parseDouble(editText2)/
                            Double.parseDouble(editText))/
                            Double.parseDouble(editText)
                            ;
                    mAnswer.setText(String.valueOf(add));
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
