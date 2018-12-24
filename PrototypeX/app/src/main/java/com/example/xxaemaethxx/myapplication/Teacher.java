package com.example.xxaemaethxx.myapplication;

public class Teacher<E> extends User {
    int auth;

    public Teacher() {
        auth = 1; // 1 auth is for Teacher/Admin access
    }

    public void setAuth(int a) {
        auth = a;
    }

    public int getAuth() {
        return auth;
    }
}
