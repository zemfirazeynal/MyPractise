package bdc.scanner_case_loop;

import java.util.Scanner;

public class Loop_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();

        System.out.println("b = ");
        int b = scanner.nextInt();

        for (;;){
            if(a>b){
                System.out.println("a b-dən böyükdür. a:"+a +" b:"+b);
                break;
            }else if(a<b){
                a++;
                continue;
            }else {
                System.out.println("a b-yə bərabərdir və 1 vahid artıtırıram a:"+a + " b:"+b);
                a++;
            }
            System.out.println("Artıq işimiz bitdi  a:"+a + " b:"+b);
        }
    }
}
