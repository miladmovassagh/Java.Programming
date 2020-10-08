package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("enter the number of users: ");
        int n = Integer.parseInt(input.nextLine());
        Users users = new Users(n);
        for(i = 0; i < n; i++) {
            System.out.println("user " + (i+1) + "th info:");
            System.out.print("enter the name of user: ");
            String a = input.nextLine();
            System.out.print("enter the family of user: ");
            String b = input.nextLine();
            System.out.print("enter the age of user: ");
            int c = Integer.parseInt(input.nextLine());
            users.setUsers(i, a, b, c);
            if(i >= 1) {
                try {
                    users.checkUsers(i+1);
                } catch(UsersException e) {
                    i--;
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
