package com.example.emobilis.newdatabase;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //DECLARE VARIABLES TO HOLD THE VIEWS
    public DatabaseHelper mydb;
    Button btnAdd,btnView,btnDelete;
    EditText editName,editSurname,editMarks,editId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb=new DatabaseHelper(this);
        editName=findViewById(R.id.editText2);
        editSurname=findViewById(R.id.editText3);
        editMarks=findViewById(R.id.editText4);
        editId=findViewById(R.id.editText4);
        btnAdd=findViewById(R.id.button);
        btnView=findViewById(R.id.button2);
        btnDelete=findViewById(R.id.button3);
      //user defined function calls
        AddData();
        DeleteData();
        ViewAll();
    }

    private void DeleteData() {
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deletedRows = mydb.deleteData(editId.getText().toString());
                if (deletedRows > 0)
                    Toast.makeText(MainActivity.this, "DELETED", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "FAILED TO DELETE", Toast.LENGTH_SHORT);

            }
        } );
    }


    private void AddData() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=mydb.insertData(
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


    private void ViewAll(){
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=mydb.getAllData();
                if (res.getCount()==0) {
                    showMessage("error", "nothing found in the database");
                    return;
                }
                    //a string is buffer that can be modified
                    StringBuffer buffer=new StringBuffer();
                    while (res.moveToNext()){
                        buffer.append("My ID :" + res.getString(0)+"\n");
                        buffer.append("My NAME :" + res.getString(1)+"\n");
                        buffer.append("My SURNAME :" + res.getString(2)+"\n");
                        buffer.append("My MARKS :" + res.getString(3)+"\n");
                    }
                    //display all data
                    showMessage("DATA ",buffer.toString());
                }});}

            private void showMessage(String TITLE, String MESSAGE) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle(TITLE);
                builder.setMessage(MESSAGE);
                builder.show();
                }





}

