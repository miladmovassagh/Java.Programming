package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.sign up");
        System.out.println("2.login");
        System.out.print("enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch(choice) {
            case 1:
                System.out.print("enter the name: ");
                String name = input.nextLine();
                System.out.print("enter the username: ");
                String username1 = input.nextLine();
                System.out.print("enter the password: ");
                String password1 = input.nextLine();
                System.out.print("enter the email: ");
                String email = input.nextLine();
                UserAccount userAccount1 = new UserAccount().setName(name).setUsername(username1).setPassword(password1).setEmail(email);
                try {
                    userAccount1.connection();
                    userAccount1.signUp();
                    userAccount1.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("enter the username: ");
                String username2 = input.nextLine();
                System.out.print("enter the password: ");
                String password2 = input.nextLine();
                UserAccount userAccount2 = new UserAccount().setUsername(username2).setPassword(password2);
                try {
                    userAccount2.connection();
                    userAccount2.login();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("invalid choice number.");
        }
    }
}
