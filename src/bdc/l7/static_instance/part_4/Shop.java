package bdc.l7.static_instance.part_4;

public class Shop {
    public String name;
    static int a;
    int b;

    public static void foo(){ // static methods
        // foo2(); CompileTime Error
        foo3();
        //System.out.println(b); CompileTime Error
        System.out.println(a);
    }

    public  void foo2(){ // instance methods
        foo();
        System.out.println(a);
        System.out.println(b);
    }

    public static void foo3(){ // static methods
        // foo2(); CompileTime Error
        foo();
        //System.out.println(b); CompileTime Error
        System.out.println(a);

    }
}
