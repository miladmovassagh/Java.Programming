package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: insert information");
        System.out.println("2: update information");
        System.out.print("enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch(choice) {
            case 1:
                System.out.print("enter the user id: ");
                int userId = Integer.parseInt(input.nextLine());
                System.out.print("enter the username: ");
                String userName = input.nextLine();
                System.out.print("enter the password: ");
                String password = input.nextLine();
                System.out.print("enter the email: ");
                String email = input.nextLine();
                System.out.print("enter the age: ");
                int age = Integer.parseInt(input.nextLine());
                System.out.print("enter the education level: ");
                String educationLevel = input.nextLine();
                Users users = new Users().setUserId(userId).setUserName(userName).setPassword(password).setEmail(email).setAge(age).setEducationLevel(educationLevel);
                try {
                    users.connection();
                    users.insert();
                    users.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("enter the current user id: ");
                int userId1 = Integer.parseInt(input.nextLine());
                System.out.print("enter the new username: ");
                String userName1 = input.nextLine();
                System.out.print("enter the new password: ");
                String password1 = input.nextLine();
                System.out.print("enter the new email: ");
                String email1 = input.nextLine();
                System.out.print("enter the new age: ");
                int age1 = Integer.parseInt(input.nextLine());
                System.out.print("enter the new education level: ");
                String educationLevel1 = input.nextLine();
                Users users1 = new Users().setUserId(userId1).setUserName(userName1).setPassword(password1).setEmail(email1).setAge(age1).setEducationLevel(educationLevel1);
                try {
                    users1.connection();
                    users1.update();
                    users1.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("invalid choice number.");
        }
    }
}
