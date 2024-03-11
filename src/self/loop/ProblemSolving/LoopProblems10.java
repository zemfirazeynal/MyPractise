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
        int setirsayi =6;
        for (int setir=0;setir<setirsayi;setir++){

            for (int boshluq=0;boshluq<setir;boshluq++){
                System.out.print(" ");
            }
            for (int ulduz =0; ulduz<(setirsayi-setir)*2-1;ulduz++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
