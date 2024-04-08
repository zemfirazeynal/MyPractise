package bdc.l7.static_instance.part_4;

public class Main_3 {
    public static void main(String[] args) {
        Shop shop11 = new Shop();
        shop11.a = 3;
        shop11.b=4;

        Shop shop12 = new Shop();
        shop12.a = 5;
        shop11.b=6;

        System.out.println("shop1.a="+ shop11.a); // 3
        System.out.println("shop1.b="+ shop11.b); // 6

        System.out.println("shop2.a="+ shop12.a); // 5
        System.out.println("shop2.b="+ shop12.b); // 6

    }


}
