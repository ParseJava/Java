package oop.lecture3.blinov.chapter4.option.a7;

/**
 * @author Parse Java on 13.07.2016.
 */
public class ComputerRunner {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.getHdd().setCapacity(500);

        computer.turnOn();

        computer.turnOff();

        computer.turnOn();

        computer.checkViruses();

        System.out.println("Capacity HDD = " + computer.getHdd().getCapacity() + " gb");
    }
}
