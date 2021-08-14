package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstString {
    public static void Strings(){
        ArrayList<String> names=new ArrayList<>();
        names.add("hendry mwamburi");
        names.add("josphat mwakio");
        names.add("justin chosi");
        names.add("able mhoi");
        for (String temp: names){
            System.out.println(temp);
        }
        Collections.sort(names);
        System.out.println("after sorting");
        names.forEach(s -> {
            System.out.println(s);
        });
    }
    public static void main(String[] args){
        Strings();
    }
}
