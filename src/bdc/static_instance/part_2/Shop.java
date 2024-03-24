package bdc.static_instance.part_2;

public class Shop {
    public String name;
    public String adress;
    public int size;

    public static String colorOfDoor = "brown";

    public static void printOurDoor(){
        System.out.println(colorOfDoor);

    }
}
