package bdc.path_by_value_reference.part_6;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.name = "Zemfira"; // new String("Zemfira");
        customer.store = new Store();
    }
}
