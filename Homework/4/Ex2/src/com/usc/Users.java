package com.usc;

public class Users<Username,Password> implements Cloneable {
    private Username username;
    private Password password;

    public Users() {

    }

    public Users(Username username, Password password) {
        setUsername(username);
        setPassword(password);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public void showUserInformation() {
        System.out.println("User information:");
        System.out.println("username is: " + getUsername());
        System.out.println("password is: " + getPassword());
    }
}
