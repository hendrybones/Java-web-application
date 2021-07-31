package com.pluralsight.calcengine;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<>();
        al.add("hendry");
        al.add("mwamburi");
        al.add("mkandoe");
        System.out.println("After adding: "+al);
        al.remove("hendry");
        System.out.println("After removing: "+al);
        al.set(1,"vivek");
        System.out.println("After changing: "+al);
        Iterator<String> itr=al.iterator();
/*
        for (String s:al){
            System.out.println(s);
        }
*/
/*
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
*/


    }

}
