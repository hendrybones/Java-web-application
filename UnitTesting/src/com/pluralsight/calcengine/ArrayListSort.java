package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

    public  static void Array(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(40);

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
    }
    public static void main(String[] args){
        Array();
    }
}
