package bdc.l8.path_by_value_reference.part_3;

public class Main_1 {
    public static void main(String[] args) {
        int a = 5;
        incrementA(a);
        System.out.println(a);
    }

    public static void incrementA(int a){
        a++;
    }
}
