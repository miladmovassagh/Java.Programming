package com.usc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your username: ");
        String username = input.nextLine();
        System.out.print("enter your password: ");
        String password = input.nextLine();

        Users<String,String> users = new Users<>(username,password);
        users.showUserInformation();
        Users<String,String> users1 = new Users<>(null, null);
        Users<String,String> users2 = new Users<>(null, null);
        Users<String,String> users3 = new Users<>(null, null);
        try {
            users1 = (Users<String,String>) users.clone();
            users2 = (Users<String,String>) users.clone();
            users3 = (Users<String,String>) users.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
