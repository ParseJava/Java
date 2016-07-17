package oop.home.project;

/**
 * @author ParseJava on 17.07.2016.
 */
public class Customer extends Person {

    private String homeAddress;
    private String areaNeeds;

    public Customer(String name, String surname) {
        super(name, surname);
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setAreaNeeds(String areaNeeds) {
        this.areaNeeds = areaNeeds;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getAreaNeeds() {
        return areaNeeds;
    }

    @Override
    public String writePrivateMessage() {
        return null;
    }

    @Override
    public String readPrivateMessage(String message) {
        return message;
    }

    @Override
    public String writeReview() {
        return null;
    }

    @Override
    public String readReview(String review) {
        return review;
    }

    @Override
    public void setAccessPrivateInfo() {

    }

    @Override
    public void getAccessPrivateInfo() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", eMail='" + super.getEMail() + '\'' +
                ", cityAddress='" + super.getCityAddress() + '\'' +
                ", areaNeeds='" + areaNeeds + '\'' +
                '}';
    }
}
