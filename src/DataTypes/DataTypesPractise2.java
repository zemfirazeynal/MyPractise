package DataTypes;

public class DataTypesPractise2 {
    public static void main(String[] args) {
        int i = 25; // tam eded deyisheni
        System.out.println("int i="+i);

        int x = 500000; // 5 mb
        System.out.println("int x="+x);

        long y = x; // 10 mb
        System.out.println("long y="+y);

        long l = 25; // int dəyərini mənimsəyə bilir, çünki həcmi daha çoxdur
        System.out.println("long l="+l);

        int a = (int) l;

        double d = 5.5; // kəsr ədəd dəyişəni
        System.out.println("double d="+d);

        float f1 = (float) 25.5; // bu cür yazılış daha məqsədə uyğundur
        System.out.println("float f1="+f1);

        float f2 = 25.5f;
        System.out.println("float f2="+f2);
        
        float f3 = (float) d;
        System.out.printf("float f3="+f3);

        char c = 'c'; // 1 simvol dəyişəni
        System.out.println("char c="+c);

        String s = "hello wold"; // simvollar toplusu
        System.out.println("String s="+s);

        boolean e = true; // özündə 2 cavab saxlıyır
        System.out.println("boolean e="+e);
    }
}
