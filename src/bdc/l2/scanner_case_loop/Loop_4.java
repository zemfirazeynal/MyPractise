package bdc.l2.scanner_case_loop;

import java.util.Scanner;

public class Loop_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        while (true) {
            if (a < 10) {
                System.out.println( "a:" + a );
                break;
            }
            a++;
        }
    }
}