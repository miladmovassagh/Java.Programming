package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your username: ");
        String username = input.nextLine();
        System.out.print("enter your name: ");
        String name = input.nextLine();
        System.out.print("enter your password: ");
        String password = input.nextLine();
        System.out.print("enter your email address: ");
        String email = input.nextLine();

        UserRegister.getInstance().setUsername(username);
        UserRegister.getInstance().setName(name);
        UserRegister.getInstance().setPassword(password);
        UserRegister.getInstance().setEmail(email);
        UserRegister.getInstance().showUserInformation();
    }
}
