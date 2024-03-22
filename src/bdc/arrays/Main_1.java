package bdc.arrays;

public class Main_1 {
    public static void main(String[] args) {
        int [] a = {};
        System.out.println(a); // yaddaş ünvanı
        System.out.println(a[0]); // ArrayIndexOutOfBound


        int [] b = {1, 9, 56, 89};
        System.out.println(b); // yaddaş ünvanı
        System.out.println(b[2]); // 56

        // int [] c = new int[]; Array initializer expected

        int [] d = new int [8];
        System.out.println(d[4]); // 0

        int [] e = new int[]{}; // boshdur

        // int [] f = new int [8]{}; CompileTimeError


        int [] f = new int[] {4, 9, 14};
        System.out.println(f[1]);

        // int [] h  = new int[2] {4, 9, 14}; CompileTimeError

        int [] k = new int [] {4, 90, 56, 45, 12};
        for (int i =0; i<k.length; i++){
            System.out.println(k[4]);
        }

    }
}
