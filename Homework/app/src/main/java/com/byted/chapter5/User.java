package com.byted.chapter5;

import com.google.gson.annotations.SerializedName;

/**
 * "admin": false,
 * "chapterTops": [],
 * "collectIds": [],
 * "email": "",
 * "icon": "",
 * "id": 58872,
 * "nickname": "wwwsjdajsd",
 * "password": "",
 * "publicName": "wwwsjdajsd",
 * "token": "",
 * "type": 0,
 * "username": "wwwsjdajsd"
 */
public class User {
    @SerializedName("nickname")
    public String nickname;
    @SerializedName("username")
    public String username;
    @SerializedName("password")
    public String password;
    @SerializedName("repassword")
    public String repassword;

    public User(String username, String password, String repassword) {
        this.username = username;
        this.password = password;
        this.repassword = repassword;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}
