package com.pluralsight.calcengine;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<>();
        al.add("hendry");
        al.add("mwamburi");
        al.add("mkandoe");
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
