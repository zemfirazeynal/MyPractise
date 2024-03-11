package self.loop.ProblemSolving;

import java.util.Scanner;

public class LoopProblems8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int avg=0;
        for (int i =0; i<10;i++){
            System.out.println("Enter a number:");
            sum=sum+sc.nextInt();
             avg = sum/10;

        }
        System.out.println("Average of these numbers is " +avg);
    }
}
