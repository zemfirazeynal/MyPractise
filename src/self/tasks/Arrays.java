package self.tasks;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] arr = new int[n][n];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();

        System.out.println("Output:");
        int k = n - 1;
        int a;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                a = arr[i][j];
                arr[i][j] = arr[k - i][k - j];
                arr[k - i][k - j] = a;
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

