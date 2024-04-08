package self.loop;

public class LoopPractise9 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                result += i;
            } else if (i % 5 == 0) {
                continue;
            }
            result -= 1;
        }
        System.out.println(result);
        /*int i = 0;
        while (i<10){
            // filan ishi gor
            i++;
            if(i==3) break;
            System.out.println("i="+(i));
        }
        System.out.println("Finished");

         */
    }
}
