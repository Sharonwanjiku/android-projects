package com.example.emobilis.sharedprefferences;

import android.content.SharedPreferences;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//DEFINE VARIABLES TO HOLD THE VIEWS
    android.support.v7.widget.Toolbar mToolbar;
    Button mRed,mGreen,mBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find items based on id
        mToolbar =findViewById(R.id.toolbar2);
        mRed =findViewById(R.id.button);
        mGreen =findViewById(R.id.button2);
        mBlue =findViewById(R.id.button3);
        //we then set a title for our toolbar
        mToolbar.setTitle("MY TOOLBAR");
        if (getColor()!=getResources().getColor(R.color.colorPrimary));
        mToolbar.setBackgroundColor(getColor());
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
           getWindow().setStatusBarColor(getColor());
        }
        mRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.colorRed));
                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorRed));
                }
                storesColors(getResources().getColor(R.color.colorRed));
            }
        });
        mGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorGreen));
                }
                storesColors(getResources().getColor(R.color.colorGreen));
            }
        });
        mBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mToolbar.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(getResources().getColor(R.color.colorBlue));
                }
                storesColors(getResources().getColor(R.color.colorBlue));
            }
        });
    }
    private void storesColors(int color){
        SharedPreferences mSharedPreference=getSharedPreferences("ToolbarColor",MODE_PRIVATE);
        SharedPreferences.Editor editor=mSharedPreference.edit();
        editor.putInt("color",color);
        editor.apply();
    }
    private int getColor(){
        SharedPreferences mSharedPreferences=getSharedPreferences(""+"Toolbar",MODE_PRIVATE);
        int selectedColor=mSharedPreferences.getInt("color",getResources().getColor(R.color.colorPrimary));
        return selectedColor;
    }
}
