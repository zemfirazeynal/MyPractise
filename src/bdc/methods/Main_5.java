package bdc.methods;

public class Main_5 {
    public static void main(String[] args) {
        boolean b = foo3();
        if (b==true){
            foo1("True - dur");
            System.out.println(foo2());
        }
    }

    public static void foo1(String s){
        System.out.println(s);

    }

    public static String foo2(){
        System.out.println("foo2 is called");
        return "Done!";
    }

    public static boolean foo3(){
        System.out.println("foo3 is called");
      return true;
    }
}
