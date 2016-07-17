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
    }
}
