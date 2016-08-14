package oop.lecture11.factorial.multithreading;

import java.io.IOException;

import static oop.lecture11.factorial.multithreading.FactorialUtils.createMultiThreadedFile;
import static oop.lecture11.factorial.multithreading.FactorialUtils.createSingleThreadFile;

/**
 * @author ParseJava on 13.08.2016.
 */
public class FactorialRunner {

    public static void main(String[] args) throws IOException {
        int cycles = 100;

        long resultSingleThread = calculateTimeSingleThread(cycles);

        System.out.println(resultSingleThread);


        long resultMultiThreads = calculateTimeMultiThreads(cycles);

        System.out.println(resultMultiThreads);
    }


    private static long calculateTimeSingleThread(int cycles) throws IOException {
        long start = System.currentTimeMillis();

        createSingleThreadFile(cycles);

        long finish = System.currentTimeMillis();

        return finish - start;
    }

    private static long calculateTimeMultiThreads(int cycles) {
        long start = System.currentTimeMillis();

        createMultiThreadedFile(cycles);

        long finish = System.currentTimeMillis();

        return finish - start;
    }
}
