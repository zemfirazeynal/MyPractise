package bdc.path_by_value_reference.part_2;

import bdc.path_by_value_reference.part_2.Customer;

public class Main_1 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        printCustomerData(customer);
    }

    public static void printCustomerData(Customer customer){
        customer.name = "Zemfira";
        customer.surname = "Zeynalli";
        customer.age = 26;
        customer.address = "Xirdalan";

        System.out.println("name: "+customer.name);
        System.out.println("surname: "+customer.surname);
        System.out.println("age: "+customer.age);
        System.out.println("address: "+customer.address);
    }
}
