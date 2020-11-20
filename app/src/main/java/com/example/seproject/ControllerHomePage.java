package com.example.seproject;

public class ControllerHomePage {
    private String username, password;

    public ControllerHomePage() {
        this.username = "admin";
        this.password = "1234";
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
}
