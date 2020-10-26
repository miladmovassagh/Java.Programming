package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your username: ");
        String userName = input.nextLine();
        System.out.print("enter your real name: ");
        String realName = input.nextLine();
        System.out.print("enter your password: ");
        String password = input.nextLine();
        System.out.print("enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("enter your home address: ");
        String homeAddress = input.nextLine();
        System.out.print("enter your mobile number: ");
        String mobileNumber = input.nextLine();
        System.out.print("enter your education level: ");
        String educationLevel = input.nextLine();

        User user = new User().setUserName(userName).setRealName(realName).setPassword(password).setAge(age).
                setHomeAddress(homeAddress).setMobileNumber(mobileNumber).setEducationLevel(educationLevel);
        user.showUserInformation();
    }
}
