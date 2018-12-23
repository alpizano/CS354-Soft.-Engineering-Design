package com.example.xxaemaethxx.myapplication;

public class User {
    String name;
    String username;
    String pw;
    String email;

    public User(String name, String username, String pw, String email) {
        this.name = name;
        this.username = username;
        this.pw = pw;
        this.email = email;
    }

public String getName() {
    return this.name;
}

public String getUsername() {
       return this.username;
}

public String getPW() {
        return this.pw;
}

public String getEmail() {
        return this.email;
}
}
