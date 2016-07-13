package oop.lecture3.blinov.chapter4.option.a7;

import java.util.Random;

/**
 * @author Parse Java on 13.07.2016.
 */
public class Computer {

    private String name;
    private boolean isTurnedOn;

    private OpticalDrive opticalDrive = new OpticalDrive();
    private HDD hdd = new HDD();
    private RAM ram = new RAM();
    private CPU cpu = new CPU();



    protected void setName(String name) {
        this.name = name;
    }

    protected void setOpticalDrive(OpticalDrive opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    protected void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    protected void setRam(RAM ram) {
        this.ram = ram;
    }

    protected void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    protected String getName() {
        return name;
    }

    protected OpticalDrive getOpticalDrive() {
        return opticalDrive;
    }

    protected HDD getHdd() {
        return hdd;
    }

    protected RAM getRam() {
        return ram;
    }

    protected CPU getCpu() {
        return cpu;
    }

    protected void turnOn() {
        isTurnedOn = true;
        System.out.println("Computer is turned on");
    }

    protected void turnOff() {
        isTurnedOn = false;
        System.out.println("Computer is turned off");
    }

    protected void checkViruses() {
        if (isTurnedOn) {
            Random random = new Random();
            boolean infected = random.nextBoolean();

            System.out.println("Computer is infected? = " + infected);
        } else {
            System.out.println("Check viruses is impossible computer is turned off");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "opticalDrive=" + opticalDrive +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", cpu=" + cpu +
                '}';
    }
}
