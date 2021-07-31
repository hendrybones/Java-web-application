package com.pluralsight.calcengine;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionDeque {
    public static void main(String args[]) {
        Deque<String>deque=new ArrayDeque<>();
        deque.add("hendry");
        deque.add("mwamburi");
        deque.add("mkandoe");
        for (String str: deque){
            System.out.println(str);
        }


    }
}
