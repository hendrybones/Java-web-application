package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Iterator;

public class List<S> {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<>();
        list.add("hendry");
        list.add("mwamburi");
        list.add("mkandoe");
        Iterator itr=list.iterator();

        System.out.println("Returning element"+ " "+ list.get(1));
        list.set(1,"dates");
        for (String fruit:list){
            System.out.println(fruit);
        }


    }
}
