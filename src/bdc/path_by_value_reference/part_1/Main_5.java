package bdc.path_by_value_reference.part_1;

import bdc.path_by_value_reference.part_2.Customer;

public class Main_5 {
    public static void main(String[] args) {

        Customer customer = null;

        customer.surname = "Asadzade";
        customer.name ="Rahaddin"; //NullPointerException


        customer = null;

        System.out.println(customer.surname); // Asadzade
        System.out.println(customer.name); // NullPointerException

    }
}
