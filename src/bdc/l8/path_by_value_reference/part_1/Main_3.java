package bdc.l8.path_by_value_reference.part_1;

import bdc.l8.path_by_value_reference.part_2.Customer;

public class Main_3 {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.name ="Rahaddin";
        customer.surname = "Asadzade";

        customer = new Customer();

        System.out.println(customer.surname);
        System.out.println(customer.name);

    }
}
