package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name of student: ");
        String a = input.nextLine();
        System.out.print("enter the username of student: ");
        String b = input.nextLine();
        System.out.print("enter the password of student: ");
        String c = input.nextLine();

        StudentLogin student = new StudentLogin();
        try {
            student.checkingInformation(a, b, c);
        } catch(StudentLoginException e) {
            e.printStackTrace();
        }
    }
}
