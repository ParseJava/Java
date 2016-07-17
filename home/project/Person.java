package oop.home.project;

/**
 * @author ParseJava on 17.07.2016.
 */
public abstract class Person implements Communications {
    private String name;
    private String surname;
    private String phoneNumber;
    private String eMail;
    private String cityAddress;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ", cityAddress='" + cityAddress + '\'' +
                '}';
    }
}
