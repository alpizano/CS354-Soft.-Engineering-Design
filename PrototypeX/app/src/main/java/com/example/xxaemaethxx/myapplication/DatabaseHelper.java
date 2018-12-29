package com.example.xxaemaethxx.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    ArrayList<User> users = new ArrayList<>();

    // columns of Users table
    private static final String TABLE_USERS = "Users";
    private static final String COL_USER_ID = "id";
    private static final String COL_USER_NAME = "name";
    private static final String COL_USER_EMAIL = "email";
    private static final String COL_USER_USERNAME = "username";
    private static final String COL_USER_PW = "password";
    private static final String COL_USER_AUTH = "auth";

    // columns of Courses
    private static final String TABLE_COURSES = "Courses";
    private static final String COL_COURSE_ID = COL_USER_ID;
    private static final String COL_COURSE_NAME = "name";
    private static final String COL_COURSE_BELONGS_USER_ID = "user id";


    private static final String DATABASE_NAME = "Users.db";
    private static final int DATABASE_VERSION = 3;
    SQLiteDatabase db;

    // SQL statement of Users table creation
    private static final String CREATE_TABLE_USERS = "CREATE TABLE " + TABLE_USERS +  "(id integer primary key autoincrement," +
            "name text not null," +
            "email text not null," +
            "username text not null," +
            "password text not null," +
            "auth text not null);";

    // SQL statement of Courses table creation
    private static final String CREATE_TABLE_COURSES = "CREATE TABLE " + TABLE_COURSES + "(id integer primary key autoincrement,"+
            COL_COURSE_ID + "text not null,"+
            COL_COURSE_NAME + "text not null," +
            COL_COURSE_BELONGS_USER_ID + "int not null);";

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USERS);
        db.execSQL(CREATE_TABLE_COURSES);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COURSES);
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


        values.put(COL_USER_NAME,name);
        values.put(COL_USER_EMAIL,email);
        values.put(COL_USER_USERNAME,username);
        values.put(COL_USER_PW,pw);
        values.put(COL_USER_AUTH,auth);

        db.insert(TABLE_USERS,null,values);
    }

    public void insertTeacher(Teacher t) {
        db = getWritableDatabase();

        ContentValues values = new ContentValues();

        String name = t.getName();
        String email =  t.getEmail();
        String username = t.getUsername();
        String pw =  t.getPW();
        int auth = t.getAuth();

        values.put(COL_USER_NAME,name);
        values.put(COL_USER_EMAIL,email);
        values.put(COL_USER_USERNAME,username);
        values.put(COL_USER_PW,pw);
        values.put(COL_USER_AUTH,auth);

        db.insert(TABLE_USERS,null,values);
    }

    public Cursor getUsers() {
        db = getWritableDatabase(); // Why not getReadableDatabase() ?
        String query = "SELECT * FROM " + TABLE_USERS;
        // use rawQuery vs. execSQL for SELECT statements returning data in cursor
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }

    public Cursor getId(String username) {
        db = getWritableDatabase();
        String query = "SELECT id FROM " + TABLE_USERS + " WHERE username = '" + username +"'";
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
        String query = "SELECT * FROM " + TABLE_USERS;

        // use rawQuery vs. execSQL for SELECT statements returning data in cursor
        Cursor cursor = db.rawQuery(query,null);

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext())
        {

            System.out.println(cursor.getString(2) + " " + cursor.getString(4));

            if(cursor.getString(3).equals(username) && cursor.getString(4).equals(pw))
            {
                match = true;
            }

        }
        return match;
    }
}
