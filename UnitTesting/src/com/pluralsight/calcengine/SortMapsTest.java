package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortMapsTest {
    @Test
    public  void maps(){
        SortMaps sortMaps=new SortMaps();
        Map<Integer, String> map=new HashMap();
        map.put(10,"hendry");
        map.put(20,"anthony");


        Map<Integer, String> map1=new HashMap();
        map1.put(10,"hendry");
        map1.put(20,"anthony");
       

      Assertions.assertEquals(map1,new SortMaps().Numbers(map));
    }

}