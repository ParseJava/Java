package oop.lecture10.filmIOUtils;

import oop.lecture6.film.Film;
import oop.lecture6.film.Genre;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ParseJava on 05.08.2016.
 */
public class FilmIOUtils {

    private static final String CSV_DELIMITER = ";";
    private static final int BUFFER_SIZE = 8 * 1024;

    private FilmIOUtils() {
    }


    public static void outputFilmToFile(Film film, String dstFileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dstFileName), true)) {
            writer.println(convertFilmToCsv(film));
        }

    }


    public static void outputListFilmsToFile(List<Film> films, String dstFileName) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(dstFileName), true);
        try {
            for (Film film : films) {
                writer.println(convertFilmToCsv(film));
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static String convertFilmToCsv(Film film) {
        return film.getFilmTitle().toUpperCase() + CSV_DELIMITER
                + film.getYearOfRelease() + CSV_DELIMITER
                + film.getNamesActors() + CSV_DELIMITER
                + film.getGenre();
    }


    public static List<Film> readFilmsFromFile(String srcFile) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(srcFile), BUFFER_SIZE))) {
            List<Film> result = new ArrayList<>();
            Film film;
            String csvString;

            while ((scanner.hasNextLine()) == true) {
                csvString = scanner.nextLine();
                film = parseFilmFromCsvString(csvString);
                result.add(film);
            }
            return result;
        }
    }

    public static void printFilms(List<Film> films) {
        for (Film film : films) {
            System.out.println(film);
        }
    }

    public static Film readFilmFromFile(String srcFile) throws IOException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(srcFile), BUFFER_SIZE));
        try {
            return readFilm(scanner);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static Film readFilm(Scanner scanner) throws IOException {
        String csvString = scanner.nextLine();
        return parseFilmFromCsvString(csvString);
    }

    public static Film parseFilmFromCsvString(String csvString) {
        if (csvString == null || csvString.isEmpty()) {
            return null;
        }

        String[] tokens = csvString.split(CSV_DELIMITER);

        String filmTitle = tokens[0];
        int yearOfRelease = Integer.parseInt(tokens[1]);

        Genre genre = null;
        for (Genre value : Genre.values()) {
            if (value.getName().compareTo(tokens[3]) == 0) {
                genre = value;
            }
        }
        return new Film(filmTitle, yearOfRelease, genre).addActor(tokens[2]);
    }


    public static void outputBinaryFilmsIntoFile(List<Film> films, String binaryDstFile) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(binaryDstFile), BUFFER_SIZE))) {
            outputStream.writeObject(films);
        }
    }

    public static List<Film> readBinaryFilmsFromFile(String binarySrcFile) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(binarySrcFile), BUFFER_SIZE));
        try {
            return (List<Film>) inputStream.readObject();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
