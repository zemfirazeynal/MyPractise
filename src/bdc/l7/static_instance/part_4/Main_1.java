package bdc.l7.static_instance.part_4;

public class Main_1 {

    int a; // instance, field, global
    static int b; // static, global
    public static void main(String[] args) {
        Main_1 m = new Main_1();
        System.out.println(m.a);

        System.out.println(b);
    }

    public static void foo(){ // static methods
        int c =10; // local variable
        System.out.println(c);
    }

    public static void foo2(){ // instance methods
        int c =10; // local variable
        System.out.println(c);
    }
}
