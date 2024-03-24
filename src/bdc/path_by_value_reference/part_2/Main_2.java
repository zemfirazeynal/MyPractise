package bdc.path_by_value_reference.part_2;

public class Main_2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer); // Customer@65ab7765
        initializeCustomerData(customer);
        printCustomerData(customer);
    }

    public static void initializeCustomerData(Customer customer){
        customer.name = "Zemfira";
        customer.surname = "Zeynalli";
        customer.age = 26;
        customer.address = "Xirdalan";
    }

    public static void printCustomerData(Customer customer){
        System.out.println("name: "+customer.name);
        System.out.println("surname: "+customer.surname);
        System.out.println("age: "+customer.age);
        System.out.println("address: "+customer.address);
    }
}
