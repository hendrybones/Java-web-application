package com.pluralsight.calcengine;

import java.util.HashSet;
import java.util.Iterator;

public class SetInt {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("hendry");
        set.add("mwamburi");
        set.add("mkandoe");
        Iterator<String> itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
