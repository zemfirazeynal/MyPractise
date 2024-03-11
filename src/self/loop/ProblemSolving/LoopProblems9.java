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
       ***********
      *************
     ***************
    *****************

         */

        int rowCount =11;
        for (int row=0;row<rowCount;row++){

            for (int space =0; space<rowCount-row; space++){
                System.out.print(" ");
            }
            for (int star =0; star<1+(row*2); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
