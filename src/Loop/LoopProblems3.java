package Loop;

public class LoopProblems3 {
    public static void main(String[] args) {
        /*
        3.
        *****
        ****
        ***
        **
        *
         */

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
