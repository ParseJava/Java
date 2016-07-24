package oop.lecture6.film;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ParseJava on 24.07.2016.
 */
public class FilmUtils {

    public static List<Film> sortByGenre(List<Film> films, Genre genre) {
        List<Film> result = new ArrayList<>();

        for (Film film : films) {
            if (film.getGenre().equals(genre)) {
                result.add(film);
            }
        }

        return result;
    }


    public static List<Film> sortByYearOfRelease(List<Film> films, int startYear, int endYear) {

        checkYear(startYear, endYear);

        List<Film> result = new ArrayList<>();

        for (Film film : films) {
            if (film.getYearOfRelease() > startYear && film.getYearOfRelease() < endYear) {
                result.add(film);
            }
        }
        return result;
    }


    private static void checkYear(int startYear, int endYear) {
        if (startYear >= endYear) {
            throw new IllegalArgumentException();
        }
    }
}
