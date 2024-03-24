package bdc.static_instance.part_4;

public class Main_4 {
    public static void main(String[] args) {
        Store store1 = new Store();
        store1.a = 3;
        store1.b=4;

        store1.foo(); // 3
        store1.foo2(); // 4

        Store store2 = new Store();
        store2.a = 5;
        store2.b=6;

        store1.foo(); // 5
        store2.foo(); // 5
        store2.foo2(); // 6


    }


}
