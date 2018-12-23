package com.example.xxaemaethxx.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;

    private static final String DATABASE_NAME = "Users.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "Users";
    private static final String COL_0 = "id";
    private static final String COL_1 = "name";
    private static final String COL_2 = "email";
    private static final String COL_3 = "username";
    private static final String COL_4 = "password";


    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +  "(id integer primary key autoincrement," +
            "name text not null," +
            "username text not null," +
            "email text not null," +
            "password text not null);";

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

    public void insertUser(User u) {
        db = getWritableDatabase();

        ContentValues values = new ContentValues();

        String name = u.getName();
        String username = u.getUsername();
        String pw =  u.getPW();
        String email =  u.getEmail();

        values.put(COL_1,name);
        values.put(COL_2,email);
        values.put(COL_3,username);
        values.put(COL_4,pw);


        db.insert(TABLE_NAME,null,values);
    }

    public Cursor getUsers() {
        db = getWritableDatabase(); // Why not getReadableDatabase() ?
        String query = "SELECT * FROM " + TABLE_NAME;
        // use rawQuery vs. execSQL for SELECT statements returning data in cursor
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
}
