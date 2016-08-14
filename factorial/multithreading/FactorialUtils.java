package oop.lecture11.factorial.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ParseJava on 13.08.2016.
 */
public class FactorialUtils {

    public static BigInteger calculateFactorial(int number) {
        checkNumber(number);

        return (number == 0) ? BigInteger.ONE :
                BigInteger.valueOf(number).multiply(calculateFactorial(number - 1));
    }

    private static void checkNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("factorial must be >= 0, but factorial = " + number);
        }
    }


    public static void outputFactorialToFile(BigInteger factorial, String dstFile) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(dstFile, true), true)) {
            printWriter.println(factorial);
        }
    }


    public static void outputStringToFile(String original, String dstFile) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(dstFile, true), true)) {
            printWriter.print(original);
        }
    }


    public static void createSingleThreadFile(int cycles) throws IOException {
        for (int i = 1; i <= cycles; i++) {
            String dstFile = "C:/Users/HP/Desktop/TempDesktop/factorial"
                    + (i * 1000) + ".txt";
            for (int j = 1; j < i * 1000; j++) {
                String original = Integer.toString(j) + "!=";
                outputStringToFile(original, dstFile);
                BigInteger result = calculateFactorial(j);
                outputFactorialToFile(result, dstFile);
            }
        }
    }


    public static void createMultiThreadedFile(int cycles) {
        List<Factorial> factorialList = new ArrayList<>();

        for (int i = 1; i <= cycles; i++) {
            String dstFile = "C:/Users/HP/Desktop/TempDesktopFactorialMultiThreading/factorial"
                    + (i * 1000) + ".txt";
            Factorial factorial = new Factorial(i, dstFile);
            factorialList.add(factorial);
        }

        finalizeThreads(factorialList);
    }


    private static void finalizeThreads(List<Factorial> factorialList) {
        for (Factorial factorial : factorialList) {
            try {
                factorial.getThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
