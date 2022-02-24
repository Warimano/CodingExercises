package com.example.warimano.exercises.section.eight.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) return false;

        return songs.add(new Song(title, duration));
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (Objects.equals(song.getTitle(), title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumberInAlbum, LinkedList<Song> playlist) {
        if (songs.size() < trackNumberInAlbum || trackNumberInAlbum < 1) return false;
        return playlist.add(songs.get(trackNumberInAlbum - 1));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song == null) return false;

        return playlist.add(song);
    }
}
