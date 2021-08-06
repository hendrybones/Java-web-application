package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Checker implements Comparator<Player> {
    ArrayList<Player>list=new ArrayList<>();
    ArrayList<Checker> check=new ArrayList<>();

    @Override
    public int compare(Player a, Player b) {
        if(a.score == b.score)
        {
            return a.name.compareTo(b.name);
        }
        return ((Integer) b.score).compareTo(a.score);
    }
//    public void solution(List<Player> PlayerNames, Map<String, List<Integer>> scores){
//        for (Map.Entry<String, List<Integer>> p:scores.entrySet())
//        {
//            String query=p.getKey();
//            List<Integer>params=p.getValue();
//            if
//        }

}

