package bdc.design_patterns.singleton.practise_2;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
        }
    }
}