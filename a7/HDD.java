package oop.lecture3.blinov.chapter4.option.a7;

/**
 * @author Parse Java on 13.07.2016.
 */
public class HDD {

    private String type; // Internal, External
    private String manufacturer;
    private int capacity;


    protected void setType(String type) {
        this.type = type;
    }

    protected void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected String getType() {
        return type;
    }

    protected String getManufacturer() {
        return manufacturer;
    }

    protected int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
