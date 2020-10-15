package com.usc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name of student: ");
        String name = input.nextLine();
        System.out.print("enter the student id of student: ");
        String studentId = input.nextLine();
        System.out.print("enter the father name of student: ");
        String fatherName = input.nextLine();

        Student<String,String,String> student = new Student<>(name, studentId, fatherName);
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            System.out.print("enter the " + (i+1) + "th grade: ");
            list.add(input.nextDouble());
        }
        student.showStudentInformation();
        System.out.println("grades of student is:");
        for(Double x : list)
            System.out.println(x);
    }
}
