package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("list of lessons:");
        System.out.print("1:physics2\n2:math2\n3:advanced programming\n4:logic circuit\n5:technical language\n");
        System.out.print("enter the number of lesson: ");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                Physics2 physics = new Physics2();
                physics.showInformation();
                break;
            case 2:
                Math2 math = new Math2();
                math.showInformation();
                break;
            case 3:
                AdvancedProgramming programming = new AdvancedProgramming();
                programming.showInformation();
                break;
            case 4:
                LogicCircuit logicCircuit = new LogicCircuit();
                logicCircuit.showInformation();
                break;
            case 5:
                TechnicalLanguage technicalLanguage = new TechnicalLanguage();
                technicalLanguage.showInformation();
                break;
            default:
                System.out.println("invalid number of lesson");
        }
    }
}
