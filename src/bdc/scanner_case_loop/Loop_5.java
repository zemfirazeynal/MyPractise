package bdc.scanner_case_loop;

import java.util.Scanner;

public class Loop_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        while (true) {
            if (a < 10) {
                System.out.println( "a:" + a );
            } else if (a==10) {
                break;
            }
            a++;
        }
    }
}
