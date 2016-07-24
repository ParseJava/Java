package oop.lecture6.film;

import java.util.ArrayList;
import java.util.List;

import static oop.lecture6.film.FilmUtils.sortByGenre;
import static oop.lecture6.film.FilmUtils.sortByYearOfRelease;

/**
 * @author ParseJava on 19.07.2016.
 */
public class FilmRunner {

    public static void main(String[] args) {

        List<Film> films = createFilms();

        List<Film> dramaFilms = sortByGenre(films, Genre.DRAMA);

        System.out.println("Drama films from 1990 - 2000 = " + sortByYearOfRelease(dramaFilms, 1990, 2000));
    }

//    Drama films from 1990 - 2000 = [Film{Film Title= The Sweet Hereafter , yearOfRelease= 1997, namesActors= [Ian Holm, Sarah Polley, Bruce Greenwood], genre= Drama}]

    private static List<Film> createFilms() {
        List<Film> films = new ArrayList<>();

        films.add(new Film("Pulp Fiction", 1994, Genre.CRIME)
                .addActor("John Travolta")
                .addActor("Samuel L. Jackson")
                .addActor("Uma Thurman"));
        films.add(new Film("Good fellas", 1990, Genre.CRIME)
                .addActor("Robert De Niro")
                .addActor("Ray Liotta")
                .addActor("Joe Pesci"));
        films.add(new Film("Psycho", 1960, Genre.THRILLER)
                .addActor("Anthony Perkins")
                .addActor("Vera Miles")
                .addActor("John Gavin"));
        films.add(new Film("The Silence of the Lambs", 1991, Genre.HORROR)
                .addActor("Jodie Foster")
                .addActor("Anthony Hopkins")
                .addActor("Scott Glenn"));
        films.add(new Film("King Kong ", 1933, Genre.MONSTER)
                .addActor("Fay Wray")
                .addActor("Robert Armstrong")
                .addActor("Bruce Cabot"));
        films.add(new Film("The Great Silence", 1968, Genre.WESTERNS)
                .addActor("Jean Louis Trintignant")
                .addActor("Klaus Kinski")
                .addActor("Frank Wolff"));
        films.add(new Film("Picnic at Hanging Rock", 1975, Genre.DRAMA)
                .addActor("Rachel Roberts")
                .addActor("Dominic Guard")
                .addActor("Helen Morse"));
        films.add(new Film("City of God", 2002, Genre.CRIME)
                .addActor("Alexandre Rodrigues")
                .addActor("Leandro Firmino da Hora")
                .addActor("Phellipe Haagensen"));
        films.add(new Film("The Sweet Hereafter ", 1997, Genre.DRAMA)
                .addActor("Ian Holm")
                .addActor("Sarah Polley")
                .addActor("Bruce Greenwood"));
        films.add(new Film("Embrace of the Serpent", 2015, Genre.DRAMA)
                .addActor("Jan Bijvoet")
                .addActor("Nilbio Torres")
                .addActor("Antonio Bolívar"));
        films.add(new Film("The Terminator", 1984, Genre.THRILLER)
                .addActor("Arnold Schwarzenegger")
                .addActor("Michael Biehn")
                .addActor("Linda Hamilton"));
        films.add(new Film("Die Hard ", 1988, Genre.ACTION)
                .addActor("Bruce Willis")
                .addActor("Alan Rickman")
                .addActor("Alexander Godunov"));

        return films;
    }

}
