package Methods.Util;

import java.util.Scanner;

public class Calculator_2 {
    public static double calculate(){
        Scanner sc = new Scanner(System.in);

        System.out.println("a-ni daxil edin!");
        double a = sc.nextDouble();

        System.out.println("a-ni daxil edin!");
        double b = sc.nextDouble();

        System.out.println("Operationu daxil edin!");
        int operation= sc.nextInt();

        double result =0;

        if(operation==1){
            result = MathUtil.toplama(a,b);
        } else if (operation==2) {
            result = MathUtil.cix(a,b);
        } else if (operation==3) {
            result = MathUtil.vur(a,b);
        }else if(operation==4) {
            result = MathUtil.bol(a,b);
        }else {
            System.out.println("Operation is invalid!");
        }
       return result;
    }
}
