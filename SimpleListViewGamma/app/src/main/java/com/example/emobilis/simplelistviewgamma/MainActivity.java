package com.example.emobilis.simplelistviewgamma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView mList;

    //define an array that will hold your data
    String[] favfood =new String[]{
            "ugali",
            "choma",
            "mutura",
            "fish",
            "bacon",
            "chips",
            "samosa",





    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = findViewById(R.id.list);

        //define an array adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, favfood);

        //set your data to your list view
        mList.setAdapter(adapter);
        //set onclick listener

        mList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "hi there wabis wanna have " +favfood[position]+ " for supper", Toast.LENGTH_SHORT).show();
                if(position ==4){
                    Intent fish = new Intent(getApplicationContext())
                }
            }
        });
    }
}
