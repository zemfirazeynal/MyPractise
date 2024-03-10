package bdc.design_patterns.singleton.practise_3;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();

        System.out.println(singleton.getName());
        System.out.println(singleton.getSurname());
        System.out.println(singleton.getEmail());
    }
}
