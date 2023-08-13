package Methods;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("a-ni daxil edin!");
    double a = sc.nextDouble();

    System.out.println("a-ni daxil edin!");
    double b = sc.nextDouble();

    System.out.println("Operationu daxil edin!");
    int operation= sc.nextInt();

    double result =0;

      if(operation==1){
          result = toplama(a,b);
      } else if (operation==2) {
          result = cix(a,b);
      } else if (operation==3) {
          result = vur(a,b);
      }else if(operation==4) {
          result = cix(a,b);
      }else {
          System.out.println("Operation is invalid!");
      }
        System.out.println("result="+result);
    }

    public static double toplama(double a, double b){  // single responsibility
        System.out.println("a+b="+(a+b));
        return a+b;
    }

    public static double cix(double a, double b){
        return a-b;
    }

    public static double vur(double a, double b){
        return a*b;
    }

    public static double bol(double a, double b){
        return a/b;
    }
}
