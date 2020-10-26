package com.usc;

public class User {
    private String userName;
    private String realName;
    private String password;
    private int age;
    private String homeAddress;
    private String mobileNumber;
    private String educationLevel;

    public User() {

    }

    public User(String userName, String realName, String password, int age, String homeAddress, String mobileNumber, String educationLevel) {
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.age = age;
        this.homeAddress = homeAddress;
        this.mobileNumber = mobileNumber;
        this.educationLevel = educationLevel;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public User setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public User setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public User setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public User setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    public void showUserInformation() {
        System.out.println("user information:");
        System.out.println("username is: " + userName);
        System.out.println("real name is: " + realName);
        System.out.println("password is: " + password);
        System.out.println("age is: " + age);
        System.out.println("home address is: " + homeAddress);
        System.out.println("mobile number is: " + mobileNumber);
        System.out.println("education level is: " + educationLevel);
    }
}
