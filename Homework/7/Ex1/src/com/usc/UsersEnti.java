package com.usc;

public class UsersEnti {
    private String name;
    private String username;
    private String password;
    private String email;
    private long bill;
    private int internetPackage;

    public UsersEnti() {

    }

    public UsersEnti(String name, String username, String password, String email, long bill, int internetPackage) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.bill = bill;
        this.internetPackage = internetPackage;
    }

    public String getName() {
        return name;
    }

    public UsersEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UsersEnti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsersEnti setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsersEnti setEmail(String email) {
        this.email = email;
        return this;
    }

    public long getBill() {
        return bill;
    }

    public UsersEnti setBill(long bill) {
        this.bill = bill;
        return this;
    }

    public int getInternetPackage() {
        return internetPackage;
    }

    public UsersEnti setInternetPackage(int internetPackage) {
        this.internetPackage = internetPackage;
        return this;
    }
}
