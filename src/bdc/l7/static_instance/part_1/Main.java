package bdc.l7.static_instance.part_1;

public class Main {
    public static void main(String[] args) {

        Shop.printOurDoor();

        Shop.colorOfDoor = "red";
        Shop.printOurDoor();

        Shop.colorOfDoor = "blue";
        Shop.printOurDoor();

    }
}
