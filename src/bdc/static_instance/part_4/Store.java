package bdc.static_instance.part_4;

public class Store {
    public String name;
    static int a;
    int b;

    public void foo(){
        System.out.println(a);
    }

    public void foo2(){
        System.out.println(b);
    }

}
