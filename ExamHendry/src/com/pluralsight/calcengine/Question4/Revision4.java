package com.pluralsight.calcengine.Question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Revision4 {
    public static void main(String args[]){
        ArrayList[] list= new ArrayList[20000];
        Scanner scanner=new Scanner(System.in);
        int li=scanner.nextInt();

        for (int i=0;i<li;i++){
            list[i] =new ArrayList();
            int number=scanner.nextInt();
            for (int j=0;j<number;j++){
                int value=scanner.nextInt();
                list[i].add(value);
            }
        }
        int queries=scanner.nextInt();
        for (int i=0;i<queries;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            try {
                System.out.println(list[x-1].get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
