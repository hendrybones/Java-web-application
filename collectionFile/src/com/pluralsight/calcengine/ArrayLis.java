package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLis {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("hendry");
        list.add("mwamburi");
        list.add("mkandeo");
        System.out.println("traversing list through");
        //here element iterates in reverse order

        ListIterator<String> list1=list.listIterator(list.size());
        while (list1.hasPrevious()){
            String str=list1.previous();
            System.out.println(str);
        }
        System.out.println("traversing through the list for for loop");
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("traversing list forEach");
        list.forEach(a->{//here we are using lambda expression
            System.out.println(a);

        });



    }
}
