package oop.home.project;

/**
 * @author ParseJava on 18.07.2016.
 */
public class NumberCustomer {
    private static int initialNumberMaster = 1000;

    private int numberCustomer = initialNumberMaster++;

    public NumberCustomer() {
        this.numberCustomer = numberCustomer;
    }

    public int getNumberCustomer() {
        return numberCustomer;
    }

    @Override
    public String toString() {
        return "numberCustomer = " + numberCustomer;
    }
}
