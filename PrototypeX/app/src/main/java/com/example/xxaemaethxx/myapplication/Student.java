package com.example.xxaemaethxx.myapplication;

public class Student extends User {
    int id;
    int auth;

    public Student() {
        id = 0;
        auth = 0; // 0 auth is for Student access
    }
}
