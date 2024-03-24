package bdc.path_by_value_reference.part_5;

public class Main {
    public static void main(String[] args) {
        String arg1 = args[0];
        String arg2 = args[2];
        if(!(arg1.equals("admin") && arg2.equals("Zemfira"))){
            System.err.println("senin bunu ishletmeyine icaze yoxdur!");
            System.exit(0);
        }
    }
}
