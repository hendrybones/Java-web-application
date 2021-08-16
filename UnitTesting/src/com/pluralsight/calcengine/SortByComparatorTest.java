package com.pluralsight.calcengine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SortByComparatorTest {

    @Test
    public void compare(){
        ArrayList<Song> musicList=new ArrayList<>();
        musicList.add(new Song("hendry","mwamburi",2019));
        musicList.add(new Song("ben","jame",2009));
        SortByComparator sortByComparator=new SortByComparator();
        Collections.sort(musicList,sortByComparator);

        ArrayList<Song> musicList2=new ArrayList<>();
        musicList2.add(new Song("ben","jame",2009));
        musicList2.add(new Song("hendry","mwamburi",2019));
       Assertions.assertEquals(musicList2,new SongApp().musicApp(musicList));

    }

}