package self.conditions;

import java.util.Scanner;

public class ConditionsPractise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a-ni daxil edin: ");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin: ");
        double b = sc.nextDouble();

        System.out.println("emeliyyati daxil edin: ");
        int emeliyyat = sc.nextInt(); // 0,1,2,3

        double netice=0;

        if(emeliyyat==1){
            netice = a+b;
        }else if (emeliyyat==2){
            netice = a-b;
        }else if(emeliyyat==3){
            netice = a*b;
        }else if(emeliyyat==4){
            netice = a/b;
        }

        System.out.println("netice="+netice);

    }
}

