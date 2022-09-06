package com.example.form;

public class User {

    public String userName,course,email,branch;

    public String getUserName() {
        return userName;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public String getBranch() {
        return branch;
    }

    public User (String userName, String course, String email, String branch ){
        this.userName = userName;
        this.course = course;
        this.email = email;
        this.branch = branch;
    }
    public User(){}
}
