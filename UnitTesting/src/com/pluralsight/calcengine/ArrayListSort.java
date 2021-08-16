package com.pluralsight.calcengine;

import java.util.Collections;
import java.util.List;

public class ArrayListSort {

    public  static List<Integer> Array(List<Integer> list){
//        list.add(10);
//        list.add(20);
//        list.add(50);
//        list.add(30);
//        list.add(40);

//        list.forEach(s->{
//            System.out.println(s);
//        });
        for (Integer temp:list){
            System.out.println(temp);
        }
        Collections.sort(list);
        System.out.println("after sorting");
        for (Integer temp:list){
            System.out.println(temp);
        }
        return list;
    }
//    public static void main(String[] args){
//        Array();
//    }
}
