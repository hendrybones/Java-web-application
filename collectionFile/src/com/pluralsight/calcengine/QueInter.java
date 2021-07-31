package com.pluralsight.calcengine;

import java.util.*;

public class QueInter {
    public static void main(String args[]) {
        Queue<String> q1 = new PriorityQueue<String>();
        Queue<String> q2 = new ArrayDeque<>();

        q1.add("hendry");
        q1.add("mwamburi");
        q1.add("mkandoe");
        System.out.println("head:" + q1.element());
        System.out.println("head:" + q1.peek());
        Iterator<String> itr=q1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        q1.remove();
        q1.poll();
    }
}
