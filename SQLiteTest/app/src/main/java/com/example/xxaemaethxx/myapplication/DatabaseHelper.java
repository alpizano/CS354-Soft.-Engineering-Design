package com.example.xxaemaethxx.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;
    private static final String COL_0 = "id";
    private static final String COL_1 = "name";
    private static final String COL_2 = "date";
    private static final String COL_3 = "time";

    private static final String DATABASE_NAME = "Courses.db";
    private static final String TABLE_NAME = "courses";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (id integer primary key autoincrement, name text, date text, time text);";

    // Default constructor, use only Context context parameter. Pass null for factory
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 2);
    }


    // onCreate and onUpgrade are necessary methods
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

    public void addCourse(Course c) {
    db = getWritableDatabase();

    ContentValues values = new ContentValues();
    values.put(COL_1, c.getName());
    values.put(COL_2, c.getDate());
    values.put(COL_3, c.getTime());

    db.insert(TABLE_NAME, null, values);

    // Tried using SQL query similiar to PHP/web but did not work.
    /*
    String query = "INSERT INTO" + TABLE_NAME + " (name, date, time) " + "values (" + c.getName() + "," + c.getDate() + "," + c.getTime() + ");";
    db.execSQL(query);
    */
    }

    public Cursor getCourse() {
        db = getWritableDatabase(); // Why not getReadableDatabase() ?
        String query = "SELECT * FROM " + TABLE_NAME;
        // use rawQuery vs. execSQL for SELECT statements returning data in cursor
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }

    public void deleteCourse() {
        db = getWritableDatabase();
        String query = "DELETE FROM " + TABLE_NAME;

    }

}
