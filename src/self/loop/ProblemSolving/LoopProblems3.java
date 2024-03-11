package self.loop.ProblemSolving;

public class LoopProblems3 {
    public static void main(String[] args) {
         /*
        3.
        ****
         ***
          **
           *
          */


        for (int i=0;i<4;i++){
            for (int k=0; k<i;k++) {
                System.out.print(" ");
            }
            for (int j=0; j<4-i;j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
