package com.usc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your student id: ");
        String studentId = input.nextLine();
        System.out.print("enter your name: ");
        String name = input.nextLine();
        System.out.print("enter your total average: ");
        double totalAverage = Double.parseDouble(input.nextLine());

        Map<String,String> map = new LinkedHashMap<>();
        map.put("studentId",studentId);
        map.put("name",name);
        map.put("totalAverage",String.valueOf(totalAverage));
        Collection<String> collection = map.values();
        for(Object o : collection)
            System.out.println(o);
        /* or
        System.out.print("enter a key: ");
        System.out.println(map.get(input.nextLine()));
         */
    }
}
