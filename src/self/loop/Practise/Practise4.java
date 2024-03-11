package self.loop.Practise;

public class Practise4 {
    public static void main(String[] args) {
        int a = 12345;
        int qaliq=0;
        int revereseda=0;
        for (int i =0; i<5; i++){
            qaliq=a%10;
            a=a/10;
            revereseda= revereseda*10+ qaliq;


        }
        System.out.println(revereseda);

    }
}
