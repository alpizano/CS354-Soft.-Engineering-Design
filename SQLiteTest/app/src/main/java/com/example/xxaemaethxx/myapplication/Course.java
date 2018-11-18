package com.example.xxaemaethxx.myapplication;

public class Course {
    private String name;
    private String date;
    private String time;

    public Course() {
        name = "";
        date  = "";
        time = "";
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
