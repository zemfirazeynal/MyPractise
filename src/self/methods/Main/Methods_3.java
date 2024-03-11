package self.methods.Main;

public class Methods_3 {
    public static void main(String[] args) {
        int a = foo1(5);
        System.out.println("a="+a);
    }

    public static int foo1(int i) {
        System.out.println("foo1 is called!");
        return 200;
    }
}
