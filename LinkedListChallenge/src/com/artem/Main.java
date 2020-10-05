package com.artem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static ArrayList<Album> myAlbums = new ArrayList<Album>();
    private static LinkedList<Song> myPlaylist = new LinkedList<Song>();

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
        Album vzdor = new Album("Kluvozhor", "Vzdor EP");
        vzdor.addSongToAlbum("Pokemon's Revenge", 3.25d);
        vzdor.addSongToAlbum("Squanchy wanna love", 5.45d);
        vzdor.addSongToAlbum("Riding the dog", 7.62d);
        Album pirogi = new Album("Semyon Markovich", "Kormi Menya Polnostiu");
        pirogi.addSongToAlbum("Oda Kotlete", 4.20d);
        pirogi.addSongToAlbum("Skazhi kormu Da", 1.23d);
        pirogi.addSongToAlbum("Koshachiy Bluz", 10.26);
        pirogi.addSongToAlbum("Sopli Lubvi", 3.33d);
        pirogi.addSongToAlbum("Smert Golubyam", 5.00d);
        Album respect = new Album("DMY", "Re$pect");
        respect.addSongToAlbum("Money", 2.20d);
        respect.addSongToAlbum("Bitches", 4.12d);
        respect.addSongToAlbum("Gangsta", 2.38d);
        respect.addSongToAlbum("Re$pect", 0.55d);
        respect.addSongToAlbum("Thug Life", 3.30d);
        myAlbums.add(vzdor);
        myAlbums.add(pirogi);
        myAlbums.add(respect);
        myAlbums.get(0).addSongToPlaylist("Riding the dog", myPlaylist);
        myAlbums.get(0).addSongToPlaylist("Barking on the Mars", myPlaylist);
        myAlbums.get(1).addSongToPlaylist("Sopli Lubvi", myPlaylist);
        myAlbums.get(1).addSongToPlaylist("Oda Kotlete", myPlaylist);
        myAlbums.get(1).addSongToPlaylist("Koshachiy Bluz", myPlaylist);
        myAlbums.get(2).addSongToPlaylist("Money", myPlaylist);
        myAlbums.get(2).addSongToPlaylist("Re$pect", myPlaylist);
        myAlbums.get(2).addSongToPlaylist("Thug Life", myPlaylist);

        boolean exit = false;
        boolean goingForward = true;
        ListIterator<Song> songListIterator = myPlaylist.listIterator();
        if (myPlaylist.isEmpty()) {
            System.out.println("Your playlist are empty");
        } else {
            System.out.println("Now playing " + songListIterator.next().toString());
            printOptions();
        }
        while (!exit) {
            int action = s.nextInt();
            s.nextLine();
            switch (action) {
                case 1:
                    if (!goingForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("It's the last track in your playlist");
                        goingForward = false;
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (songListIterator.hasPrevious()){
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songListIterator.hasPrevious()){
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    } else {
                        System.out.println("It's the first track in your playlist");
                        goingForward = true;
                        System.out.println("Now playing " + songListIterator.next().toString());
                    }
                    break;
                case 3:
                    if (goingForward){
                        songListIterator.previous();
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        songListIterator.next();
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    }
                    break;
                case 4:
                    printPlaylist();
                    break;
                case 5:
                    if (goingForward){
                        System.out.println("Track "+ songListIterator.previous().toString() + " has been removed form your playlist");
                        songListIterator.next();
                        songListIterator.remove();
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("Track " + songListIterator.next().toString() + " has been removed form your playlist");
                        songListIterator.previous();
                        songListIterator.remove();
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    }
                    break;
                case 0:
                    exit = true;
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("Audioplayer options:");
        System.out.println("\t1 - play next");
        System.out.println("\t2 - play previous");
        System.out.println("\t3 - replay current");
        System.out.println("\t4 - show playlist");
        System.out.println("\t5 - remove current song from playlist");
        System.out.println("\t0 - exit");
    }

    public static void printPlaylist() {
        System.out.println("Your playlist have " + myPlaylist.size() + " tracks");
        for (int i = 0; i < myPlaylist.size(); i++){
            System.out.println("#" + (i+1) + " " + myPlaylist.get(i).getSongTitle() + " " + myPlaylist.get(i).getSongDuration());
        }
    }

}
