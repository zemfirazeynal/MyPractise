package bdc.static_instance.part_3;

public class Shop {
    public String name;
    public String adress;
    public int size;

    public static String colorOfDoor = "black";

    public static void printOurDoor(){
        System.out.println(colorOfDoor);

    }
}
