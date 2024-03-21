package bdc.methods;

public class Main_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        sum(a,b);

        long c = subtract(a, b);
        System.out.println(c);
        //short cc = subtract(a, b); compile time error

        int i = 7;
        long l = i;

        int d = (int) divide(a, b);
        System.out.println(divide(a, b));


    }

    public static void sum(int first, int second) {
        int c = first + second;
        System.out.println(c);
    }

    public static int subtract(int first, int second){
        return first - second;
    }


    /* public static int multiple (long first, long second){

        return first * second; // compile time error

     */

    public static long divide (int first, int second){
        return first/second;
    }

}
