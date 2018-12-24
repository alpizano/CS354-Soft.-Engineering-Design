package com.example.xxaemaethxx.myapplication;

import java.util.ArrayList;

public class Student extends User {
    int id;
    int auth;
    ArrayList<String> courses = new ArrayList<>();

    public Student() {
        id = 0;
        auth = 0; // 0 auth is for Student access
    }

    public void setAuth(int a) {
        auth = a;
    }

    public int getAuth() {
        return auth;
    }
}
