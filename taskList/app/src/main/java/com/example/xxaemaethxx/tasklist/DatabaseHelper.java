package com.example.xxaemaethxx.tasklist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

// Class must extend SQLiteOpenHelper and needs 2 methods (onCreate, onUpgrade) and constructor

public class dDatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "Courses.db";
    private static final String TABLE_NAME = "Courses";
    private static final String COL_ID = "id"; // COL 0
    private static final String COL_NAME = "name"; // COL 1
    private static final String COL_DATE = "date"; // COL 2
    private static final String COL_TIME = "time"; // COL 3
    SQLiteDatabase db;

    // Create Student table
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (id integer primary key AUTOINCREMENT, " +
            " name text not null , date text not null , time text not null);";

    // Constructor
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Necessary onCreate method
    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE);
    this.db = db;
    }

    // Necessary onUpgrade method
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

    public void addCourses(Courses c) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_NAME, c.getName());
        values.put(COL_DATE, c.getDate());
        values.put(COL_TIME, c.getTime());

        //inserts Course object into database
        db.insert(TABLE_NAME, null , values);
        db.close();
    }


    public Cursor getCourses() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor courses = db.rawQuery(query, null);
        return courses;
    }

    public Cursor getItemID(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT " + COL_ID + " FROM " + TABLE_NAME +
                " WHERE " + COL_NAME + " = '" + name + "'";

        Cursor data = db.rawQuery(query, null);
        return data;
    }

    public void updateName(String newName, int id, String oldName) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "UPDATE " + TABLE_NAME + " SET " + COL_NAME +
                " = '" + newName + "' WHERE " + COL_ID + " = '" + id + "'" +
                " AND " + COL_NAME + " = '" + oldName + "'";

        Log.d("DatabaseHelper", "updateName: query: " + query);
        Log.d("DatabaseHelper", "updateName: Setting name to " + newName);
        db.execSQL(query);
    }

    public void deleteName(int id, String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE "
                + COL_ID + " = '" + id + "'" +
                " AND " + COL_NAME + " = '" + name + "'";

        db.execSQL(query);
    }

}
