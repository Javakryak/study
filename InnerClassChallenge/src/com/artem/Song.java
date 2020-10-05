package com.artem;

public class Song {
    private String songTitle;
    private Double songDuration;

    public Song(String songTitle, Double songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return songTitle +" " + songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public Double getSongDuration() {
        return songDuration;
    }
}
