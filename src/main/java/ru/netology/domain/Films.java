package ru.netology.domain;

public class Films {
    private int id;
    private String name;
    private String genre;
    private boolean dateRelease;

    public Films(int id, String name, String genre, boolean dateRelease) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.dateRelease = dateRelease;
    }

//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public boolean getDateRelease() {
//        return dateRelease;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public void setDateRelease(boolean dateRelease) {
//        this.dateRelease = dateRelease;
//    }
}
