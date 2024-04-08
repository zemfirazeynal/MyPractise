package bdc.l4.arrays;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] table = new int[2][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("enter table["+"["+i+"]"+"["+j+"] ");
                table[i][j]= sc.nextInt();
            }

        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("table["+"["+i+"]"+"["+j+"]="+table[i][j] +" ");
            }
            System.out.println();
        }
    }
}