package com.example.admin.locationtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;


class MyDBadapter {
    myDbHelper myhelper;
    public MyDBadapter(Context context)
    {
        myhelper = new myDbHelper(context);
    }

    public long insertData(String name, String mobile, String email, String password )
    {
        SQLiteDatabase dbb = myhelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(myDbHelper.NAME, name);
        contentValues.put(myDbHelper.MyMOBILE, mobile);
        contentValues.put(myDbHelper.MyEMAIL, email);
        contentValues.put(myDbHelper.MyPASSWORD, password);

        long id = dbb.insert(myDbHelper.TABLE_NAME, null , contentValues);
        return id;
    }

    public String getData()
    {
        SQLiteDatabase db = myhelper.getWritableDatabase();
        String[] columns = {myDbHelper.UID,myDbHelper.NAME, myDbHelper.MyMOBILE, myDbHelper.MyEMAIL, myDbHelper.MyPASSWORD
        };
        Cursor cursor =db.query(myDbHelper.TABLE_NAME,columns,null,null,null,null,null);
        StringBuffer buffer= new StringBuffer();
        while (cursor.moveToNext())
        {
            int cid =cursor.getInt(cursor.getColumnIndex(myDbHelper.UID));
            String name =cursor.getString(cursor.getColumnIndex(myDbHelper.NAME));
            String  mobile =cursor.getString(cursor.getColumnIndex(myDbHelper.MyMOBILE));
            String  email =cursor.getString(cursor.getColumnIndex(myDbHelper.MyEMAIL));
            String  password =cursor.getString(cursor.getColumnIndex(myDbHelper.MyPASSWORD));
            buffer.append(cid+ "   " + name + "   " + mobile +"   "+ email +"   " +password+ " \n");
        }
        return buffer.toString();
    }



    static class myDbHelper extends SQLiteOpenHelper
    {
        private static final String DATABASE_NAME = "myDatabase";    // Database Name
        private static final String TABLE_NAME = "myTable";   // Table Name
        private static final int DATABASE_Version = 1;    // Database Version
        private static final String UID="_id";     // Column I (Primary Key)
        private static final String NAME = "Name";    //Column II
        private static final String MyMOBILE = "Mobile";    //Column III
        private static final String MyEMAIL = "Email";    //Column IV
        private static final String MyPASSWORD= "Password";    // Column V
        private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
                " ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" VARCHAR(255) ,"+ MyMOBILE+" NUMBER(255),"+ MyEMAIL+" VARCHAR(255),"+ MyPASSWORD+" VARCHAR(255))"
                ;
        private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+TABLE_NAME;
        private Context context;

        public myDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.context=context;
        }

        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE);
            } catch (Exception e) {
                Message message;
                final String s = "" + e;
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            try {
                Message message;
                final String s = "OnUpgrade";
                db.execSQL(DROP_TABLE);
                onCreate(db);
            }catch (Exception e) {
                Message message;
                final String s = "" + e;
            }
        }
    }

}
