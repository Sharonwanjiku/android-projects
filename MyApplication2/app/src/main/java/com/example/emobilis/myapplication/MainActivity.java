package com.example.emobilis.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nlist=(ListView) findViewById(R.id.ListView);
     //define data to be displayed in a list view
         "Mercury"
          "Venus"
          "Earth"
          "Mars"


    }
}
