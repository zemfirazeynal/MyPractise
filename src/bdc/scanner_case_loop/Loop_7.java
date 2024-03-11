package bdc.scanner_case_loop;

import java.util.Scanner;

public class Loop_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();

        do {
            a++;
            System.out.println("a:" + a);
        } while (a < 10);
    }
}
