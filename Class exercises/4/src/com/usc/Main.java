package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = input.nextLine();
        System.out.print("enter your family: ");
        String family = input.nextLine();
        System.out.print("enter your age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("enter your password: ");
        String pass = input.nextLine();
        System.out.print("enter your username: ");
        String username = input.nextLine();
        System.out.print("enter your job: ");
        String job = input.nextLine();

        Person person = new Person(name, family, age, pass, username, job);
        person.showInformation();
    }
}
