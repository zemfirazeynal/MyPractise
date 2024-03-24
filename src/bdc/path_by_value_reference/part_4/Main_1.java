package bdc.path_by_value_reference.part_4;

public class Main_1 {
    public static void main(String[] args) {
        int [] a ={5};
        System.out.println(a); // yaddash unvani

        System.out.println(a[0]); // 5

        changeArrayValue(a);
        System.out.println(a[0]);
    }

    public static void changeArrayValue(int [] a){
        a[0] = 7;
    }


}
