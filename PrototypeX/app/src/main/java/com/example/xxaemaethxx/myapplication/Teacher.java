package com.example.xxaemaethxx.myapplication;

public class Teacher extends User {
    int auth;

    public Teacher() {
        auth = 1; // 1 auth is for Teacher/Admin access
    }
}
