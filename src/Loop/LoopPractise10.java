package Loop;

public class LoopPractise10 {
    public static void main(String[] args) {
        int i = 0;
        do {
            // filan ishi gor
            i++;
            if(i==3) continue;
            System.out.println("i="+(i));
        }while (i<10);
        System.out.println("Finished");
    }
}
