package bdc.immutable_mutable;

public class Main {
    public static void main(String[] args) {
        CustomString customString = new CustomString("Zemfira");
        System.out.println(customString);
        System.out.println(customString.getName());

        customString = customString.appendName(" Zeynalli");
        System.out.println(customString);
        System.out.println(customString.getName());
    }
}
