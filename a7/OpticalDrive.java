package oop.lecture3.blinov.chapter4.option.a7;

/**
 * @author Parse Java on 13.07.2016.
 */
public class OpticalDrive {

    private String manufacturer;
    private String type; // Portable, Internal


    protected void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected String getManufacturer() {
        return manufacturer;
    }

    protected String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "OpticalDrive{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
