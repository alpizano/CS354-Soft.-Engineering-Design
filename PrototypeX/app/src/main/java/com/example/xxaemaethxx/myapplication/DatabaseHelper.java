package com.example.xxaemaethxx.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;

    private static final String DATABASE_NAME = "Users.db";
    private static final int DATABASE_VERSION = 2;
    private static final String TABLE_NAME = "Users";
    private static final String COL_0 = "id";
    private static final String COL_1 = "name";
    private static final String COL_2 = "email";
    private static final String COL_3 = "username";
    private static final String COL_4 = "password";
    private static final String COL_5 = "auth";


    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +  "(id integer primary key autoincrement," +
            "name text not null," +
            "username text not null," +
            "email text not null," +
            "password text not null," +
            "auth text not null);";

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

    public void insertStudent(Student s) {
        db = getWritableDatabase();

        ContentValues values = new ContentValues();

        String name = s.getName();
        String email =  s.getEmail();
        String username = s.getUsername();
        String pw =  s.getPW();
        int auth = s.getAuth();


        values.put(COL_1,name);
        values.put(COL_2,email);
        values.put(COL_3,username);
        values.put(COL_4,pw);
        values.put(COL_5,auth);

        db.insert(TABLE_NAME,null,values);
    }

    public void insertTeacher(Teacher t) {
        db = getWritableDatabase();

        ContentValues values = new ContentValues();

        String name = t.getName();
        String email =  t.getEmail();
        String username = t.getUsername();
        String pw =  t.getPW();
        int auth = t.getAuth();


        values.put(COL_1,name);
        values.put(COL_2,email);
        values.put(COL_3,username);
        values.put(COL_4,pw);
        values.put(COL_5,auth);

        db.insert(TABLE_NAME,null,values);
    }

    public Cursor getUsers() {
        db = getWritableDatabase(); // Why not getReadableDatabase() ?
        String query = "SELECT * FROM " + TABLE_NAME;
        // use rawQuery vs. execSQL for SELECT statements returning data in cursor
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }

    public boolean checkPW(String username, String pw){

        boolean match = false;

        //System.out.println(username);
        //System.out.println(pw);
        Log.i("ADebugTag", "value of username passed to db: " + username);
        Log.i("ADebugTag", "value of pw passed to db: " + pw);

        db = getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;

        // use rawQuery vs. execSQL for SELECT statements returning data in cursor
        Cursor cursor = db.rawQuery(query,null);

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext())
        {
            // col_2 is username for some reason, col_3 was email?
            System.out.println(cursor.getString(2) + " " + cursor.getString(4));

            if(cursor.getString(2).equals(username) && cursor.getString(4).equals(pw))
            {
                match = true;
            }

        }
        return match;
    }
}
