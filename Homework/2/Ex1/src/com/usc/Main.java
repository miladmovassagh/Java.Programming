package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        double a = input.nextDouble();
        System.out.print("enter the second number: ");
        double b = input.nextDouble();
        SimpleCalculator math = new SimpleCalculator(a, b);
        math.showOperations();
    }
}
