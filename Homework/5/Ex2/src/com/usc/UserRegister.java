package com.usc;

public class UserRegister {
    private static String username;
    private static String name;
    private static String password;
    private static String email;

    private static UserRegister userRegister = new UserRegister();

    public static UserRegister getInstance() {
        return userRegister;
    }

    private UserRegister() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        UserRegister.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        UserRegister.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        UserRegister.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        UserRegister.email = email;
    }

    public void showUserInformation() {
        System.out.println("user information:");
        System.out.println("username is: " + username);
        System.out.println("name is: " + name);
        System.out.println("password is: " + password);
        System.out.println("email is: " + email);
    }
}
