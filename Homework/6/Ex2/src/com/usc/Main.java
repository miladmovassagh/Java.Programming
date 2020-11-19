package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: insert information");
        System.out.println("2: delete information");
        System.out.print("enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch(choice) {
            case 1:
                System.out.print("enter the employee id: ");
                int employeeId = Integer.parseInt(input.nextLine());
                System.out.print("enter the name: ");
                String name = input.nextLine();
                System.out.print("enter the id: ");
                String id = input.nextLine();
                System.out.print("enter the father name: ");
                String fatherName = input.nextLine();
                System.out.print("enter the position: ");
                String employeePosition = input.nextLine();
                System.out.print("enter the salary: ");
                String income = input.nextLine();
                System.out.print("enter the work experience: ");
                int workExperience = Integer.parseInt(input.nextLine());
                Employees employees = new Employees().setEmployeeId(employeeId).setName(name).setId(id).setFatherName(fatherName).setPosition(employeePosition).setSalary(income).setWorkExperience(workExperience);
                try {
                    employees.connection();
                    employees.insert();
                    employees.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("enter the employee id: ");
                int employeeId1 = Integer.parseInt(input.nextLine());
                Employees employees1 = new Employees().setEmployeeId(employeeId1);
                try {
                    employees1.connection();
                    employees1.delete();
                    employees1.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("invalid choice number.");
        }
    }
}
