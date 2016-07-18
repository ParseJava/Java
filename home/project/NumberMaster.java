package oop.home.project;

/**
 * @author ParseJava on 18.07.2016.
 */
public class NumberMaster {
    private static int initialNumberMaster = 1000;

    private int numberMaster = initialNumberMaster++;

    public NumberMaster() {
        this.numberMaster = numberMaster;
    }

    public int getNumberMaster() {
        return numberMaster;
    }

    @Override
    public String toString() {
        return "numberMaster=" + numberMaster +
                '}';
    }
}
