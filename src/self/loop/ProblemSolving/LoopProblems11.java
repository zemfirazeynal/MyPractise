package self.loop.ProblemSolving;

public class LoopProblems11 {
    public static void main(String[] args) {
        /*
        11.
            *     1
           ***    2
          *****   3
         *******
          *****    4   5
           ***     5   3
            *      6   1
         */
        int setirsayi = 7;

        for (int setir = 0; setir < setirsayi; setir++) {
            if (setir <= (setirsayi - 1) / 2) {
                for (int boshluq = 0; boshluq < setirsayi / 2 - setir; boshluq++) {
                    System.out.print(" ");
                }
                for (int ulduz = 0; ulduz < 1 + (setir * 2); ulduz++) {
                    System.out.print("*");
                }


            } else {
                int setirsayi2 = (setirsayi - 1) / 2;


                    for (int boshluq = 0; boshluq <setirsayi2 ; boshluq++) {
                        System.out.print(" ");
                    }

                    for (int ulduz = 0; ulduz < (setirsayi2 ) * 2 - 1; ulduz++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
