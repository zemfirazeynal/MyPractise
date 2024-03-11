package self.loop;

public class LoopPractise9 {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            // filan ishi gor
            i++;
            if(i==3) break;
            System.out.println("i="+(i));
        }
        System.out.println("Finished");
    }
}
