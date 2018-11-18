package com.example.xxaemaethxx.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;
    private static final String COL_1 = "id";
    private static final String COL_2 = "name";
    private static final String COL_3 = "date";
    private static final String COL_4 = "time";

    private static final String DATABASE_NAME = "Courses.db";
    private static final String TABLE_NAME = "courses";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(id integer primary key autoincrement, name text, date text, time text);";

    // Default constructor, use only Context context parameter. Pass null for factory
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
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


    }

}
