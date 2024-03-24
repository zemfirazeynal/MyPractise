package self.objects.part_2;

public class Main_2 {
    public static void main(String[] args) {

        User.companyName = "BSP TECH";
        System.out.println(User.companyName);

        System.out.println("________________");

        User u = new User();
        u.name = "Zemfira";
        User.companyName = "BSP TECH 2";

        System.out.println(u.name);
        System.out.println(User.companyName);

        System.out.println("________________");

        User u2 = new User();
        u2.name = "Rahaddin";
        User.companyName = "BSP TECH 3";

        System.out.println(u2.name);
        System.out.println(User.companyName);
    }
}