package bdc.design_patterns.singleton.practise_2;

public class Singleton {

    private static Singleton singleton;
    private static int counter = 0;

    private Singleton() {
        System.out.println("Mən yarandım");

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
                counter++;
                System.out.println(counter);
                return singleton;
            }
        }
        return singleton;
    }
}