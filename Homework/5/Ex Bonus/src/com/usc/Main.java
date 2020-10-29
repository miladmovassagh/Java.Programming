package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your username: ");
        String username = input.nextLine();
        System.out.print("enter your user id: ");
        String userId = input.nextLine();
        System.out.print("enter your password: ");
        String password = input.nextLine();
        System.out.print("enter your age: ");
        String age = input.nextLine();

        CheckUser.getInstance().setUsername(username);
        CheckUser.getInstance().setUserId(userId);
        CheckUser.getInstance().setPassword(password);
        CheckUser.getInstance().setAge(age);

        try {
            User user = CheckUser.getInstance().checkUserInformation();
            user.showUserInformation();
        } catch(ExceptionManager e) {
            e.printStackTrace();
        }
    }
}
