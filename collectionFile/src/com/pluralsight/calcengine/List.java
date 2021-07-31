package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String args[]){
        ArrayList<String>list=new ArrayList<>();
        list.add("hendry");
        list.add("mwamburi");
        list.add("mkandoe");
        Iterator itr=list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
