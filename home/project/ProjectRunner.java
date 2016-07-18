package oop.home.project;

/**
 * @author ParseJava on 17.07.2016.
 */
public class ProjectRunner {

    public static void main(String[] args) {
        Customer customer = new Customer("John", "Swan");
        customer.setEMail("johnswan@gmail.com");
        customer.setCityAddress("Kiev");
        customer.setPhoneNumber("+38(050)6785485");
        customer.setAreaNeeds("City center");

        System.out.println(customer.toString());

        Master master = new Master("Alex", "Upland");
        master.setAge(40);
        master.setGender("Male");
        master.setSpecialty("Plumber");
        master.setServiceArea("Right bank");
        master.setServiceTime("From 8 to 20");
        master.setEMail("plumber.kiev2005@gmail.com");
        master.setCityAddress("Kiev");
        master.setPhoneNumber("+38(063)2459021");

        System.out.println(master.toString());
        System.out.println(master.getPriceList());


    }
}
