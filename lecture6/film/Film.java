package oop.lecture6.film;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ParseJava on 19.07.2016.
 */
public class Film implements Serializable{
    
    private static final long serialVersionUID = 9095904554224228095L;
    
    private String filmTitle;
    private int yearOfRelease;
    private Genre genre;
    private List<String> namesActors = new ArrayList<>();


    public Film() {
    }

    public Film(String filmName, int yearOfRelease, Genre genre) {
        this.filmTitle = filmName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;

    }

    public Film addActor(String name) {
        namesActors.add(name);
        return this;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public String getFilmTitle() {
        return filmTitle;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public List<String> getNamesActors() {
        return namesActors;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "Film Title= " + filmTitle +
                ", yearOfRelease= " + yearOfRelease +
                ", namesActors= " + namesActors +
                ", genre= " + genre +
                '}';
    }
}
