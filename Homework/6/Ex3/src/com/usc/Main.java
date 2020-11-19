package com.usc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: insert information of Student");
        System.out.println("2: update information of Student");
        System.out.println("3: delete information of Student");
        System.out.print("enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch(choice) {
            case 1:
                System.out.print("enter the student id: ");
                long studentId = Long.parseLong(input.nextLine());
                System.out.print("enter the name: ");
                String name = input.nextLine();
                System.out.print("enter the year of entry: ");
                int entryYear = Integer.parseInt(input.nextLine());
                System.out.print("enter the average: ");
                String average = input.nextLine();
                Student student = new Student().setStudentId(studentId).setName(name).setEntryYear(entryYear).setAverage(average);
                try {
                    student.connection();
                    student.insert();
                    student.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("enter the current student id: ");
                long studentId1 = Long.parseLong(input.nextLine());
                System.out.print("enter the new name: ");
                String name1 = input.nextLine();
                System.out.print("enter the new year of entry: ");
                int entryYear1 = Integer.parseInt(input.nextLine());
                System.out.print("enter the new average: ");
                String average1 = input.nextLine();
                Student student1 = new Student().setStudentId(studentId1).setName(name1).setEntryYear(entryYear1).setAverage(average1);
                try {
                    student1.connection();
                    student1.update();
                    student1.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.print("enter the student id: ");
                long studentId2 = Long.parseLong(input.nextLine());
                Student student2 = new Student().setStudentId(studentId2);
                try {
                    student2.connection();
                    student2.delete();
                    student2.commit();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("invalid choice number.");
        }
    }
}
