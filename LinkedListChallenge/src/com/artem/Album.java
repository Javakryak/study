package com.artem;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String albumTitle;
    private ArrayList<Song> albumSongList;

    public Album(String artist, String albumTitle) {
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.albumSongList = new ArrayList<Song>();
    }

    public void addSongToAlbum (String songTitle, Double songDuration){
        if (findSong(songTitle) == null) {
            this.albumSongList.add(new Song(songTitle, songDuration));
        } else {
            System.out.println("Song " + songTitle + " already exists in this album");
        }
    }

    public Song findSong (String searchTitle){
        for (int i = 0; i < albumSongList.size(); i++){
            if (albumSongList.get(i).getSongTitle().equals(searchTitle)){
                return albumSongList.get(i);
            }
        }
        return null;
    }

    public void printAlbumTracks (){
        System.out.println("Artist: " + artist +
                            "\nAlbum: " + albumTitle +
                            "\n# of songs: " + albumSongList.size());
        for (int i = 0; i < albumSongList.size(); i++){
            System.out.println("Track #"+(i+1)+ " " + albumSongList.get(i).getSongTitle() + " " +
                    albumSongList.get(i).getSongDuration());
        }
    }

    public void addSongToPlaylist (String songName, LinkedList<Song> playlist){
        if (findSong(songName) == null) {
            System.out.println("Album " + getAlbumTitle() + " doesn't have song " + songName);
        } else {
            playlist.addLast(findSong(songName));
        }
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getAlbumSongList() {
        return albumSongList;
    }
}


