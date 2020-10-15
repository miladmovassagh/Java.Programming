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
        System.out.println("values is:");
        for(Object o : collection)
            System.out.println(o);
        /* or
        Set<String> set = map.keySet();
        System.out.println("keys is:");
        for(Object o : set)
            System.out.println(o);
        System.out.print("enter a key: ");
        System.out.println("value of key is: " + map.get(input.nextLine()));
         */

    }
}
