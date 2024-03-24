package self.objects.part_2;

public class Main_6 {
    public static void main(String[] args) {
        User armud = new User();
        System.out.println(armud.name); // null

        change(armud);
        System.out.println(armud.name); // changed


    }

    public static void change(User alma) {
        alma.name = "cahnged";
    }
}
