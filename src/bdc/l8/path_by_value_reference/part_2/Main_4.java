package bdc.l8.path_by_value_reference.part_2;

public class Main_4 {
    public static void main(String[] args) {
        Customer customer = new Customer(); //c11
        System.out.println("main method customer address: "+customer);

        printCustomerData(customer); // Stringler null, intler 0
        System.out.println("____");
        
        initializeCustomerData_V1(customer);
        initializeCustomerData_V2(customer);
        printCustomerData(customer);
    }

    public static void initializeCustomerData_V1(Customer customer){
        System.out.println("initializeCustomerData_V1 method customer address: "+customer);
        customer.name = "Zemfira";
        customer.surname = "Zeynalli";
        customer.age = 26;
        customer.address = "Xirdalan";
    }

    public static void initializeCustomerData_V2(Customer customer){
        System.out.println("initializeCustomerData_V2 method customer address: "+customer);
        customer = new Customer();
        System.out.println("initializeCustomerData_V2 method customer address: "+customer);

        customer.name = "Rahaddin";
        customer.surname = "Asadzade";
        customer.age = 26;
        customer.address = "Zovle";
    }

    public static void printCustomerData(Customer customer){
        System.out.println("name: "+customer.name);
        System.out.println("surname: "+customer.surname);
        System.out.println("age: "+customer.age);
        System.out.println("address: "+customer.address);
    }
}
