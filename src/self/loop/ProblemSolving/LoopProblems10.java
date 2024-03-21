package self.loop.ProblemSolving;

public class LoopProblems10 {
    public static void main(String[] args) {


        /*
        10.
      *********** 11
       ********* 9
        ******* 7
         ***** 5
          ***  3
           *  1
         */

        int row = 5;
        for (int i =0; i<row; i++){
            for (int j =0; j<i;j++){
                System.out.print(" ");
            }
            for (int j =0; j<(row-i)*2-1;j++){
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
