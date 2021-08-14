package com.pluralsight.calcengine;

import java.util.Comparator;

public class SortByComparator implements Comparator<Song> {
    @Override
    public int compare(Song firstSong, Song anotherSong) {
        if (firstSong.getYear()>anotherSong.getYear()){
            return +1;
        }
        if (firstSong.getYear()<anotherSong.getYear()){
            return -1;
        }
        return 0;
    }
}
