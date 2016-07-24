package oop.lecture6.film;

/**
 * @authro ParseJava on 19.07.2016.
 */
public enum Genre {
    ADVENTURE("Adventure"),
    COMEDY("Comedy"),
    GANGSTERS("Gangsters"),
    DRAMA("Drama"),
    THRILLER("Thriller"),
    HORROR("Horror"),
    MUSICALS("Musicals"),
    WESTERNS("Westerns"),
    CRIME("Crime"),
    MONSTER("Monster"),
    ACTION("Action");


    private final String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

