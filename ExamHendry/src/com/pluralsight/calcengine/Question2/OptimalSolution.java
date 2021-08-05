package com.pluralsight.calcengine.Question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptimalSolution {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Map<String,String> map=new HashMap<>();
        for (int i=0;i<n;i++)
        {
            String name=scanner.next();
            int phone=scanner.nextInt();

            String phoneNum="" + phone;
            map.put(name,phoneNum);
        }
        while (scanner.hasNext())
        {
            String s=scanner.next();
            if (map.containsKey(s))
            {
                System.out.println(s +"=" + map.get(s));
            }
            else {
                System.out.println("not found");
            }
            scanner.close();
        }
    }
}
