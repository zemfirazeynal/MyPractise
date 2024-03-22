package self.arrays;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        coxSiraliMassiv();

    }

    public static void coxSiraliMassiv() {
        int[][] arr = new int[2][5];
        System.out.println("Daxil edilme: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("a[" + i + "]" + "[" + j + "]" + " - ni daxil edin: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Chap edilme: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("a[" + i + "]" + "[" + j + "]:" + arr[i][j] + "  ");
            }
            System.out.println();
        }
    }



        public static void birSiraliMassiv(){
            int[] arr = new int[5];
            System.out.println("Daxil edilme: ");
            for (int i = 0; i < arr.length; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("a["+i+"]"+" - ni daxil edin: ");
                arr[i] = sc.nextInt();
            }

            System.out.println("Chap edilme: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

