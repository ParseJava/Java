package oop.lecture11.factorial.multithreading;


import java.io.IOException;

import static oop.lecture11.factorial.multithreading.FactorialUtils.calculateFactorial;
import static oop.lecture11.factorial.multithreading.FactorialUtils.outputFactorialToFile;
import static oop.lecture11.factorial.multithreading.FactorialUtils.outputStringToFile;

/**
 * @author ParseJava on 13.08.2016.
 */
public class Factorial implements Runnable {
    private Thread thread = new Thread(this);
    private int cycles;
    private String dstFile;

    public Factorial(int number, String dstFile) {
        this.dstFile = dstFile;
        this.cycles = number;
        System.out.println("Thread started  " + thread.getName());
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try {
            for (int j = 1; j < cycles * 1000; j++) {
                String original = Integer.toString(j) + "!=";
                outputStringToFile(original, dstFile);
                outputFactorialToFile(calculateFactorial(j), dstFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
