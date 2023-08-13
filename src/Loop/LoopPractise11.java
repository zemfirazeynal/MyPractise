package Loop;

public class LoopPractise11 {
    public static void main(String[] args) {
        int i = 0;
        do {
            // filan ishi gor
            i++;
            if (i == 3) break;
            System.out.println("i=" + (i));
        } while (i < 10);
        System.out.println("Finished");
    }
}