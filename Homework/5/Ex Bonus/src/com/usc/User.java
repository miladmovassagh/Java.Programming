package com.usc;

public class User {
    private String username;
    private String userId;
    private String password;
    private String age;

    public User() {

    }

    public User(String username, String userId, String password, String age) {
        this.username = username;
        this.userId = userId;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getAge() {
        return age;
    }

    public User setAge(String age) {
        this.age = age;
        return this;
    }

    public void showUserInformation() {
        System.out.println("user information:");
        System.out.println("username is: " + username);
        System.out.println("user id is: " + userId);
        System.out.println("password is: " + password);
        System.out.println("age is: " + age);
    }
}
