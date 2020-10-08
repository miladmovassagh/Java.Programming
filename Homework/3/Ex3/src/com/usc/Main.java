package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string: ");
        String a = input.nextLine();

        CheckString checkString = new CheckString(a);
        try {
            checkString.checkingString();
        } catch(StringException e) {
            e.printStackTrace();
        }
    }
}
