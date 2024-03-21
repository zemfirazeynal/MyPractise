package bdc.methods;

public class Main_2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int c = 10;
        mouse(a,b);
        mouse(a, b, c);
        mouse (a, b, c);
      //  mouse("salam", 6, 8.9);

    }

    public static void mouse(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static int mouse(int a, int b, int d) {
        return a + b + d;
    }


}
