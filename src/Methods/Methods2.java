package Methods;

public class Methods2 {
    public static void main(String[] args) {
        String b = foo2("Salam");
        System.out.println("b="+b);
        }


    public static void foo1( String s) {
        System.out.println("foo1="+s);
    }

    /*
    public static String foo2() {

        System.out.println("foo2 is called");
        return "ishi gordum";
    }
     */
    public static String foo2(String s) {
        System.out.println("foo2 is called");
        return "ishi gordum";
    }


    public static boolean foo3() {
        System.out.println("foo3 is called");
        return true;
    }
    }

