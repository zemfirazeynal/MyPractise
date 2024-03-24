package bdc.static_instance.part_4;

public class Main_2 {

    int a;
    static int b;
    public static void main(String[] args) {

    }

    public static void foo(){ // static methods
     // foo2(); CompileTime Error
        foo3();
        //System.out.println(a); CompileTime Error
        System.out.println(b);
    }

    public  void foo2(){ // instance methods
        foo();
        System.out.println(a);
        System.out.println(b);
    }

    public static void foo3(){ // static methods
        // foo2(); CompileTime Error
        foo();
        //System.out.println(a); CompileTime Error
        System.out.println(b);

    }
}
