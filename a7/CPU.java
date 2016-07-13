package oop.lecture3.blinov.chapter4.option.a7;

/**
 * @author Parse Java on 13.07.2016.
 */
public class CPU {

    private String processorFamily; // Intel Core i3
    private int numberCores;
    private int clockFrequency;


    protected void setProcessorFamily(String processorFamily) {
        this.processorFamily = processorFamily;
    }

    protected void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    protected void setClockFrequency(int clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    protected String getProcessorFamily() {
        return processorFamily;
    }

    protected int getNumberCores() {
        return numberCores;
    }

    protected int getClockFrequency() {
        return clockFrequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "processorFamily='" + processorFamily + '\'' +
                ", numberCores=" + numberCores +
                ", clockFrequency=" + clockFrequency +
                '}';
    }
}
