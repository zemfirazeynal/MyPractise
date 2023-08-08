package Operators;

import java.util.Scanner;

public class OperatorsPractise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a-ni daxil edin: ");
        double a = sc.nextDouble();

        System.out.println("b-ni daxil edin: ");
        double b = sc.nextDouble();

        System.out.println("emeliyyati daxil edin: ");
        int emeliyyat = sc.nextInt(); // 0,1,2,3

        double netice=0;

        if(emeliyyat==1 && emeliyyat==4){ //AND
            netice = a+b;
        }

        if(emeliyyat==2 || emeliyyat==3){ // OR
            netice = a-b;
        }

        if(!(a>4)){
            netice = a*b;
        }

        if(!(a==5)){ // a!=5
            netice = a*b;
        }

        netice = (a!=7)?a-b:2;

        int x=4;
        int y=5;

        if(x==y)
            System.out.println("a y-e beraberdir");
            System.out.println("bbb");

        boolean bb = true;
        System.out.println("bb="+bb);
        bb=!bb;
        System.out.println("bb="+bb);

        System.out.println("netice="+netice);

    }
}
