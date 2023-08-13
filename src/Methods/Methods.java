package Methods;

public class Methods {
        public static void main(String[] args) {
            String s = foo2();
            System.out.println("s="+s);

            System.out.println("---------");

            boolean b = foo3();
            if (b==true){
                foo2();
            }
        }

        public static void foo1() {
            System.out.println("foo1 is called");
        }

        public static String foo2() {
            System.out.println("foo2 is called");
            return "ishi gordum";
        }

        public static boolean foo3() {
            System.out.println("foo3 is called");
            return true;
        }
    }
