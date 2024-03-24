package bdc.path_by_value_reference.part_1;

import bdc.path_by_value_reference.part_2.Customer;

public class Main_4 {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.name ="Rahaddin";
        customer.surname = "Asadzade";

        customer = null;

        System.out.println(customer.surname); // Asadzade
        System.out.println(customer.name); // NullPointerException

    }
}
