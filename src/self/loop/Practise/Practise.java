package self.loop.Practise;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int multiple =0;

        if (a>0){
            for (int i=1; i<10;i++){
                multiple = a*i;
                System.out.println(a + "*" + i +"="+multiple );

            }

        }
    }
}
