package com.pluralsight.calcengine;

import java.util.Iterator;
import java.util.Vector;

public class Vect {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("hendry");
        v.add("mwamburi");
        v.add("mkandoe");

        Iterator<String> itr=v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
