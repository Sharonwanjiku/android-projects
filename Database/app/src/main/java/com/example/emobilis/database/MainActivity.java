package com.example.emobilis.database;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb=new Databasehelper(this);
        //find views based on id
        editName=findViewById(R.id.editText);
        editSurname=findViewById(R.id.editText2);
        editMarks=findViewById(R.id.editText3);
        editTextId=findViewById(R.id.editText4);
        btnAddData=findViewById(R.id.button);
        btnviewAll=findViewById(R.id.button2);
        btnDelete=findViewById(R.id.button3);
        //user defined functions to add view and delete
        AddData();
        viewAll();
        DeleteData();
    }

    private void DeleteData() {
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deletedRows=myDb.deleteData(editTextId.getText().toString());
                if (deletedRows>0)
                    Toast.makeText(MainActivity.this,"DELETED", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"FAILED TO DELETE", Toast.LENGTH_SHORT);
            }
        });
    }

    private void viewAll() {
        btnviewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=myDb.getAllData();
                if (res.getCount()==0){
                    showMessage("Error","No Student in database");
                    return;

                }
                StringBuffer buffer=new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("My ID :" + res.getString(0)+"\n");
                    buffer.append("My NAME :" + res.getString(1)+"\n");
                    buffer.append("My SURNAME :" + res.getString(2)+"\n");
                    buffer.append("My MARKS :" + res.getString(3)+"\n");
                }
                showMessage("STUDENTS RECORD ",buffer.toString());

            }
        });
    }

    public void showMessage(String title_, String Message) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title_);
        builder.setMessage(Message);
        builder.show();
    }

    private void AddData() {
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=myDb.insertData(
                        editName.getText().toString(),
                        editSurname.getText().toString(),
                        editMarks.getText().toString());
                if (isInserted==true)
                    Toast.makeText(MainActivity.this,"Inserted",Toast.LENGTH_SHORT);
                else
                    Toast.makeText(MainActivity.this,"Failed to insert", Toast.LENGTH_SHORT);


            }
        });
    }
}

    }
}
