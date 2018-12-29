package com.example.xxaemaethxx.myapplication;

import java.util.ArrayList;

public class Student extends User {
    static int counter;
    int id;
    int auth;
    ArrayList<String> courses = new ArrayList<>();

    public Student() {
        counter++;
        id = id + counter;
        auth = 0; // 0 auth is for Student access
    }

    public int getId() {
        return id;
    }

    public void setAuth(int a) {
        auth = a;
    }

    public int getAuth() {
        return auth;
    }

    public void addCourse(String course) {
        courses.add(course);
    }


}
