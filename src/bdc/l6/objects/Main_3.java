package bdc.l6.objects;

public class Main_3 {
    public static void main(String[] args) {
        Student zemfira = new Student();
        Student zemfira1 = new Student();

        System.out.println(zemfira);
        System.out.println(zemfira1);

        zemfira1=zemfira;

        System.out.println(zemfira);
        System.out.println(zemfira1);

        zemfira = null;

        System.out.println(zemfira);
        System.out.println(zemfira1);

        zemfira = zemfira1;
        System.out.println(zemfira);


    }
}
