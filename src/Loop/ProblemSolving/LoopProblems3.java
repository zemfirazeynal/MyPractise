package Loop.ProblemSolving;

public class LoopProblems3 {
    public static void main(String[] args) {
         /*
        3.
        ****
         ***
          **
           *
          */

        for (int i=4;i>0;i--){
            for (int k=0; k<4-i;k++) {
                System.out.print(" ");
            }
            for (int j=0; j<=i-1;j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }




    }
}
