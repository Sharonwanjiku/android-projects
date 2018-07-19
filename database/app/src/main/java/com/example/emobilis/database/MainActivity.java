package com.example.emobilis.database;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
DatabaseHelper mydb;
EditText textname,textmarks,textadm,textid;
Button btnadd,btnview,btndelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb=new DatabaseHelper(this);
        textname=findViewById(R.id.editText);
        textmarks=findViewById(R.id.editText2);
        textadm=findViewById(R.id.editText4);
        textid=findViewById(R.id.editText5);
        btnadd=findViewById(R.id.button);
        btnview=findViewById(R.id.button2);
        btndelete=findViewById(R.id.button3);
        addData();
        viewAll();
        DeleteData();
    }
    private void DeleteData(){
        btndelete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Integer deleteRows=mydb.deleteData(editTextId.getText().toString());
                if (deleteRows>0)
                    Toast.makeText(MainActivity.this, "DELETED", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "FAILED TO DELETE", Toast.LENGTH_SHORT).show();
            }
            });
        }
private void viewAll(){
        btnviewAll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
           Cursor res=mydb.getAllData();
           if (res.getCount()==0){
               showM("Error","No student in database");
               return;
           }
           StringBuffer buffer=new StringBuffer();
           while (res.moveToNext()){
               buffer.append("MY ID :" + res.getString(0)+"/n");
               buffer.append("MY NAME :" + res.getString(1)+"/n");
               buffer.append("surname :" + res.getString(2)+"/n");
               buffer.append("my marks :" + res.getString(3)+"/n");
           }
           showMessage("students RECORDS",buffer.toString());
            }
        });
}
private void addData(){
        btnAddData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                boolean isInserted=mydb.insertData
                        (editName.getText().toString(),
                                editSurname.getText().toString(),
                                editMarks.getText().toString());
                if (isInserted==true)
                    Toast.makeText(MainActivity.this,"Inserted",Toast.LENGTH_SHORT);
                else
                    Toast.makeText(MainActivity.this,"failed to Insert",Toast.LENGTH_SHORT);
            }
        });
}














    public void setBtnadd(Button btnadd) {
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deleteRows=db.deleteData(editTextid.getText().toString());
                if (deleteRows>0)
                    Toast.makeText(MainActivity.this,"Succefully Deleted",
                            Toast.LENGHT_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"not deleted",Toast.LENGTH_SHORT).show();
                boolean isInserted=db.insertData(
                        textadm.getText().toString(),
                        textid.getText().toString(),
                        textmarks.getText().toString(),
                        textname.getText().toString());
         if (isInserted== true)
             Toast.makeText(MainActivity.this,).show();
            }
        });
private void showMessage(String title,String message){
            AlertDialog.Builder builder=
                    new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setCancelable(title);
            builder.setMessage(message);
            builder.show;
        }
    }
}

