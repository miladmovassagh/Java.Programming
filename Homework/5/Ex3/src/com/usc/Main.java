package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1:show the technical specifications of Benz S500");
        System.out.println("1:show the technical specifications of BMW X6");
        System.out.println("1:show the technical specifications of Ferrari F150");
        System.out.print("enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        try {
            switch(choice) {
                case 1:
                    Car benzS500 = CarFactory.getCar(CarModel.BENZ.toString(), "Mercedes benz s500", "black", 250, "8 cylinders", "petrol", 2014);
                    benzS500.showTechnicalSpecificationsOfCar();
                    break;
                case 2:
                    Car bmwX6 = CarFactory.getCar(CarModel.BMW.toString(), "BMW X6 xDrive50i", "gray", 250, "8 cylinders", "petrol", 2010);
                    bmwX6.showTechnicalSpecificationsOfCar();
                    break;
                case 3:
                    Car ferrariF150 = CarFactory.getCar(CarModel.FERRARI.toString(), "Ferrari F150", "red", 350, "12 cylinders", "petrol", 2017);
                    ferrariF150.showTechnicalSpecificationsOfCar();
                    break;
                default:
                    System.out.println("invalid choice.");
            }
        } catch(ExceptionManager e) {
            e.printStackTrace();
        }
    }
}
