package com.pluralsight.calcengine;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String args[]){
        Map<String, String> fruits=new HashMap<>();
        fruits.put("red","apple");
        fruits.put("yellow","banana");
        fruits.put("green","mango");
        fruits.put("white ","radish");
        //print all using for loop
        for (Map.Entry pairEntry:fruits.entrySet()){
            System.out.println(pairEntry.getKey()+ " :" + pairEntry.getValue());
        }
    }
}
