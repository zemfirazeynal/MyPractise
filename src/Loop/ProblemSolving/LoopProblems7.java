package Loop.ProblemSolving;

public class LoopProblems7 {
    public static void main(String[] args) {
        /*
        = = =  = = =
        = = =  = = =
        = = =  = = =
        = = =  = = =
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("= ");

                if (j!=2) {
                    System.out.print(" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}