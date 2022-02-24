package com.example.warimano.exercises.section.nine.playlistinnerclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Album {
    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumberInAlbum, LinkedList<Song> playlist) {
        Song checkedSong = songs.findSong(trackNumberInAlbum);
        if (checkedSong == null) return false;

        return playlist.add(checkedSong);
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if (song == null) return false;

        return playlist.add(song);
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) return false;

            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song checkingSong : songs) {
                if (Objects.equals(checkingSong.getTitle(), title)) {
                    return checkingSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index < 0 || index > songs.size()) return null;
            return songs.get(index);
        }
    }
}
