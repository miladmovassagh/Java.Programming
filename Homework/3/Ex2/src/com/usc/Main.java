package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a: ");
        double a = input.nextDouble();
        System.out.print("enter b: ");
        double b = input.nextDouble();
        System.out.print("enter c: ");
        double c = input.nextDouble();

        SecondDegreeEquation equation = new SecondDegreeEquation(a, b, c);
        try {
            equation.deltaCalculation();
        } catch (EquationException e) {
            e.printStackTrace();
        }
    }
}
