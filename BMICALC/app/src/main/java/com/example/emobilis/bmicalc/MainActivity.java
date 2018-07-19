package com.example.emobilis.bmicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //define variables to hold the views
    TextView mAnswer,editText,editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find text based on the id
        editText=(TextView)findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        button=findViewById(R.id.button);
        mAnswer=findViewById(R.id.mAnswer);

        button.setOnClickListener(this);
    }

    public void onClick(View view) {
        String editTex = editText.getText().toString();
        String editTe = editText2.getText().toString();

        if (editTex.isEmpty() || editTe.isEmpty()) {
            Toast.makeText(this, "fill in all slots", Toast.LENGTH_SHORT).show();
        } else {
            switch (view.getId()) {
                case R.id.button:
                    double add = (Double.parseDouble(editTex)/
                            Double.parseDouble(editTe))/
                            Double.parseDouble(editTe)
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
