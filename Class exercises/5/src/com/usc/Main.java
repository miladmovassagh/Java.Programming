package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[3];
        System.out.print("enter the array containing '+' or '-' in second index: ");
        for(int i = 0; i < 3; i++)
            array[i] = input.next();
        try {
            Calculate calculate = CalculateFactory.getCalculate(array[1]);
            calculate.calc(Double.parseDouble(array[0]), Double.parseDouble(array[2]));
        } catch(ExceptionManager e) {
            e.printStackTrace();
        }
    }
}
