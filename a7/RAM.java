package oop.lecture3.blinov.chapter4.option.a7;

/**
 * @author Parse Java on 13.07.2016.
 */
public class RAM {

    private String manufacturer;
    private String type; // SODIMM DDR3L
    private int capacity;
    private int memoryFrequency;


    protected void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected void setMemoryFrequency(int memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }

    protected String getManufacturer() {
        return manufacturer;
    }

    protected String getType() {
        return type;
    }

    protected int getCapacity() {
        return capacity;
    }

    protected int getMemoryFrequency() {
        return memoryFrequency;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", memoryFrequency=" + memoryFrequency +
                '}';
    }
}
