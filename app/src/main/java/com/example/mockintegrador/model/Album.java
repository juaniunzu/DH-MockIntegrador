package com.example.mockintegrador.model;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private Integer id;
    private String title;
    private String cover;
    private List<Track> tracks;
    private Artist artist;
    private List<Genre> listGenres;

    public Album(Integer id, String title, String cover, List<Track> tracks, Artist artist, List<Genre> listGenres) {
        this.id = id;
        this.title = title;
        this.cover = cover;
        this.tracks = new ArrayList<>();
        this.artist = artist;
        this.listGenres = new ArrayList<>();
    }
}
