package com.usc;

public class StudentLogin {
    final String name = "milad movassagh";
    final String userName = "981113069";
    final String password = "123456789";

    public StudentLogin() {

    }

    public void checkingInformation(String name, String userName, String password) throws StudentLoginException {
        if(name != null && !name.equals(this.name)) {
            throw new StudentLoginException("the name entered is incorrect.");
        } else if(userName != null && !userName.equals(this.userName)) {
            throw new StudentLoginException("the username entered is incorrect.");
        } else if(password != null && !password.equals(this.password)) {
            throw new StudentLoginException("the password entered is incorrect");
        } else {
            System.out.println("Student entry was successful.");
        }
    }
}
