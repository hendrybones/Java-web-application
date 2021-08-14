package com.pluralsight.calcengine;

public class Song implements Comparable<Song>{
    private String artist;
    private String title;
    private  Integer year;

    public Song(String artist, String title, Integer year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Song anotherSong) {
        return this.getTitle().compareTo(anotherSong.getTitle());
    }
}
