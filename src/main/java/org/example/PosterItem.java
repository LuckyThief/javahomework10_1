package org.example;

public class PosterItem {
    private int id;
    private int filmId;
    private String filmName;

    public PosterItem(int id, int filmId, String filmName) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}

