package bdc.l8.path_by_value_reference.part_3;

public class Main_3 {
    public static void main(String[] args) {
        int a = 5;
        a = getNewInt(a);
        System.out.println(a);
    }

    public static int getNewInt(int a){
        a++;
        return a;
    }
}
