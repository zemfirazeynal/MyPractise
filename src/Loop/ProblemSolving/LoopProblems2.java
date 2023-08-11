package Loop.ProblemSolving;

public class LoopProblems2 {
    public static void main(String[] args) {
        /*
        2.
        *
        **
        ***
        ****
         */

        for (int i = 1; i < 5; i++) { // 0, 1, 2
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
