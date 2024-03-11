package bdc.scanner_case_loop;

public class Loop_2 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println("answer: " +i);
        }

        for (int i=0; i<10;  System.out.println("answer: " + (i++))){

        }
    }
}
