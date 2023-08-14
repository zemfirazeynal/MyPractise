package Methods.Util;

public class Calculator_1 {
    public static void main(String[] args) {
     double r = toplama(3,4);
        System.out.println("r="+r);
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
