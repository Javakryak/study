package com.artem;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String albumTitle;
    private SongList albumSongList;

    public Album(String artist, String albumTitle) {
        this.artist = artist;
        this.albumTitle = albumTitle;
        this.albumSongList = new SongList();
    }

    public void addSongToAlbum (String songTitle, Double songDuration){
        albumSongList.addSongToAlbum(songTitle, songDuration);
    }


    public void addSongToPlaylist (String songName, LinkedList<Song> playlist){
        if (albumSongList.findSong(songName) == null) {
            System.out.println("Album " + getAlbumTitle() + " doesn't have song " + songName);
        } else {
            playlist.addLast(albumSongList.findSong(songName));
        }
    }


    public String getAlbumTitle() {
        return albumTitle;
    }


    // Modify the playlist challenge so that the Album class uses an inner class.
    // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    // The inner SongList class will use an ArrayList and will provide a method to add a song.
    // It will also provide findSong() methods which will be used by the containing Album class
    // to add songs to the playlist.
    // Neither the Song class or the Main class should be changed.

    public class SongList {
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<Song>();
        }

        public Song findSong (String searchTitle){
            for (int i = 0; i < songList.size(); i++){
                if (songList.get(i).getSongTitle().equals(searchTitle)){
                    return songList.get(i);
                }
            }
            return null;
        }

        public void addSongToAlbum (String songTitle, Double songDuration){
            if (findSong(songTitle) == null) {
                this.songList.add(new Song(songTitle, songDuration));
            } else {
                System.out.println("Song " + songTitle + " already exists in this album");
            }
        }
    }
}


