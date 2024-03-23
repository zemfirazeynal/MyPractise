package self.objects;

public class Main {
    public static User u = new User();
    public static String umumi2;
    public static void main(String[] args) {
        User.umumi ="Salam";
        System.out.println(User.umumi);

        User u1 = new User();
        u1.name ="Zemfira";

        User u2 = new User();
        u2.name ="Rahaddin";

        Test.change();
        u2.foo2();
        Test.change();
        User.foo1();

        System.out.println(u1.name);
        System.out.println(u2.name);
        System.out.println(User.umumi);
    }
}
