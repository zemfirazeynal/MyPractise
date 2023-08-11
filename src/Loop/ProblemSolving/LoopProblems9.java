package Loop.ProblemSolving;

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

        int setirsayi=5;
        for (int setir=0;setir<setirsayi;setir++){

            for (int boshluq =0; boshluq<setirsayi-setir; boshluq++){
                System.out.print(" ");
            }
            for (int ulduz =0; ulduz<1+(setir*2); ulduz++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
