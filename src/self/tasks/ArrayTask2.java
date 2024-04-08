package self.tasks;

import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int k = 5;
        int[][] arr = new int[n][k];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("Input:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {

                System.out.print("arr["+i+"]["+j+"]="+arr[i][j] + " ");

            }
            System.out.println();
        }


        System.out.println();
        System.out.println("Output:");
        int s = n - 1;
        int a = 0;
        for (int i = 0; i < n/2; i++)
        {
            for (int j = 0; j < k; j++) {
                a = arr[i][j];
                arr[i][j] = arr[s - i][s - j];
                arr[s - i][s - j]=a;
                //System.out.print("arr["+i+"]["+j+"]="+arr[i][j] + " ");
            }

            System.out.println();


        }



        for (int i = k/2; i <k; i++) {
            for (int j = 0; j < n; j++) {
                //arr[i][j] = arr[i][j];
               // System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + " ");

            }

            System.out.println();
        }

    }

}
