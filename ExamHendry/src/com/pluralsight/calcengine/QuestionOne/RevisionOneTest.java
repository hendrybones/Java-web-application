package com.pluralsight.calcengine.QuestionOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RevisionOneTest {
    @Test
    public void testSol(){
        List<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(0);
        numbers.add(1);
        numbers.add(78);
        numbers.add(12);
        List<Integer> insetParams=new ArrayList<>();
        insetParams.add(4);
        insetParams.add(23);
        List<Integer>deleteParams=new ArrayList<>();
        deleteParams.add(0);
        Map<String, List<Integer>> queries=new HashMap<>();
        queries.put("insert",insetParams);
        queries.put("delete",deleteParams);
        Assertions.assertEquals("0 1 78 12 23",new RevisionOne().solve(numbers,queries));

    }



}