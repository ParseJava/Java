package oop.home.project;

/**
 * @author ParseJava on 18.07.2016.
 */
public class Master extends Person {

    private NumberMaster currentNumber = new NumberMaster();
    private int age;
    private String gender; // at this stage it is mostly men, but if you connect new types of masters, can be useful
    private String specialty; // to do: select the type of variable
    private String serviceArea;
    private String serviceTime; // to do: select the type of variable
    private MasterPriceList priceList = new MasterPriceList();

    public Master(String name, String surname) {
        super(name, surname);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public NumberMaster getCurrentNumber() {
        return currentNumber;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public MasterPriceList getPriceList() {
        return priceList;
    }

    @Override
    public String writePrivateMessage() {
        return null;
    }

    @Override
    public String readPrivateMessage(String message) {
        return null;
    }

    @Override
    public String writeReview() {
        return null;
    }

    @Override
    public String readReview(String review) {
        return null;
    }

    @Override
    public void setAccessPrivateInfo() {

    }

    @Override
    public void getAccessPrivateInfo() {

    }

    @Override
    public String toString() {
        return "[" + currentNumber + "] " +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", eMail='" + super.getEMail() + '\'' +
                ", cityAddress='" + super.getCityAddress() + "," + "\n" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", specialty='" + specialty + '\'' +
                ", serviceArea='" + serviceArea + '\'' +
                ", serviceTime='" + serviceTime + '\'';
    }
}
