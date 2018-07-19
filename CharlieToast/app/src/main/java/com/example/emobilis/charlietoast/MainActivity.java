
package com.example.emobilis.charlietoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declare a variable to hold our view
    Button nShowToast,mCountUp;
    TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assign memeber variable to the view

        nShowToast = findViewById(R.id.TOAST);
        mShowCount = findViewById(R.id.txtShowCount);
        mCountUp = findViewById(R.id.button);


    }


}
