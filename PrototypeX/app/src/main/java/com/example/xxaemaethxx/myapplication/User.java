package com.example.xxaemaethxx.myapplication;

import java.util.ArrayList;

public class User {
    String name;
    String username;
    String pw;
    String email;
    ArrayList<User> users = new ArrayList<>();

    public User() {
        this.name = name;
        this.username = username;
        this.pw = pw;
        this.email = email;
    }

    public User(String name, String username, String pw, String email) {
        this.name = name;
        this.username = username;
        this.pw = pw;
        this.email = email;
    }

public String getName() {
    return this.name;
}

public void setName(String name) {
        this.name = name;
}

public String getUsername() {
       return this.username;
}

public void setUsername(String username) {
        this.username = username;
}

public String getPW() {
        return this.pw;
}

public void setPW(String pw) {
        this.pw = pw;
}

public String getEmail() {
        return this.email;
}

public void setEmail(String email) {
        this.email = email;
}
}
