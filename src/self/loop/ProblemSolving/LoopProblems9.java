package self.loop.ProblemSolving;

public class LoopProblems9 {
    public static void main(String[] args) {
        /*
        9.
            *     1
           ***    2
          *****   3
         *******  4
        ********* 5


         */
        int row = 5;
        for (int i =1; i<=row; i++){
            for (int j =0; j<row-i;j++){
                System.out.print(" ");
            }
            for (int j =1; j<i*2;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
