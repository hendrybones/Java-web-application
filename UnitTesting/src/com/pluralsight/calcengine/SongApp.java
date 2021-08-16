package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Collections;

public class SongApp {
    public static ArrayList<Song> musicApp(ArrayList<Song> musicList){
        Myutils.iterateList(musicList);
//        Collections.sort(musicList);
        SortByComparator sortByComparator=new SortByComparator();
//        Collections.sort(musicList,sortByComparator);
        Collections.sort(musicList,sortByComparator);
        System.out.println("after sorting");
        Myutils.iterateList(musicList);
        return musicList;



    }

    public static void main(String[] args){
        ArrayList<Song> musicList=new ArrayList<>();
        musicList.add(new Song("hendry","mwamburi",2019));
        musicList.add(new Song("ben","jame",2009));
        musicList.add(new Song("abel","john",2020));
        musicList.add(new Song("chris","mark",202021));
        Myutils.iterateList(musicList);
//        Collections.sort(musicList);
        SortByComparator sortByComparator=new SortByComparator();
//        Collections.sort(musicList,sortByComparator);
        Collections.sort(musicList,sortByComparator);
        System.out.println("after sorting");
        Myutils.iterateList(musicList);

    }
}
