package com.example.android_project;

public class User {
    private String profile;
    private String id;
    private String userName;
    private String birthday;

    public User() {}

    public String getProfile() {return profile;}

    public void setProfile(String profile) {this.profile = profile;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthday() { return birthday; }

    public void setBirthday(String birthday) { this.birthday = birthday; }
}