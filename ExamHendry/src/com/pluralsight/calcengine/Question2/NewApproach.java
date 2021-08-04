package com.pluralsight.calcengine.Question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewApproach {
    public static void main(String args[]) {

        HashMap<String, String> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("first name");
            String firstName = in.nextLine();
            System.out.println("second name");
            String secondName = in.nextLine();
            System.out.println("phone number");
            String phoneNumber = in.nextLine();
/*
            Integer a = in.nextInt();
            String b = in.next();

*/

            hmap.put(firstName, phoneNumber);
        }

        for (Map.Entry<String, String> m : hmap.entrySet()) {
            System.out.println(m.getKey() + "= " + m.getValue());
        }
    }
}