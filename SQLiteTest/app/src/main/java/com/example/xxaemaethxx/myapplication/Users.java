package com.example.xxaemaethxx.myapplication;

public class Users {
    String Name;
    String Email;
    String Username;
    String Password;
    boolean admin; // for determinig admin or student account

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPassword() {
        return this.Password;
    }
}

