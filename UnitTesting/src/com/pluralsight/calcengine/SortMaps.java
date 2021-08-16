package com.pluralsight.calcengine;

import java.util.HashMap;
import java.util.Map;

public class SortMaps {
    public Map Numbers(Map<Integer, String> map){
//        map = new HashMap();
//        map.put(10,"hendry");
//        map.put(20,"anthony");
//        map.put(30,"ben");
//        map.put(40,"maggie");
//        map.put(50,"jane");

        System.out.println("original map");
        map.forEach((k,v)->System.out.println(k+"\t"+v));
        return map;

    }
}
