package com.pluralsight.calcengine;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetF {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(4);
        set.add(34);
        set.add(12);
        //hashset are unordered

        for (int element : set) {
            System.out.println(element + "");
        }
        set.remove(34);
        set.contains(10);
        set.clear();
        set.isEmpty();


        System.out.println();
        Set<Integer> set1=new TreeSet<>();
        set1.add(23);
        set1.add(4);
        set1.add(34);
        set1.add(12);
        for (int element:set1){
            System.out.println(element + "");
        }
    }
}