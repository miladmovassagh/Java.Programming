package com.usc;

public class Person {
    private String name;
    private String family;
    private int age;
    private String pass;
    private String username;
    private String job;

    public Person() {

    }

    public Person(String name, String family, int age, String pass, String username, String job) {
        setName(name);
        setFamily(family);
        setAge(age);
        setPass(pass);
        setUsername(username);
        setJob(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void showInformation() {
        System.out.println("user information:");
        System.out.println("Name is: " + getName());
        System.out.println("Family is: " + getFamily());
        System.out.println("Age is: " + getAge());
        System.out.println("Password is: " + getPass());
        System.out.println("Username is: " + getUsername());
        System.out.println("Job is: " + getJob());
    }
}
