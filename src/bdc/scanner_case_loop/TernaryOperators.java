package bdc.scanner_case_loop;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String answer = (a>b) ? "hello" : "hi";

        System.out.println(answer);
    }
}
