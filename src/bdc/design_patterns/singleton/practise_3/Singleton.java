package bdc.design_patterns.singleton.practise_3;

public class Singleton {
    private String email;
    private String name;
    private String surname;
    private String password;

    private static Singleton singleton;

    private Singleton() {
        System.out.println("Hesab açıldı");
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public static Singleton getSingleton() {
        if (singleton==null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();

                }
            }
            singleton.email = "zemfirazeynal@gmail.com";
            singleton.name = "Zemfira";
            singleton.surname = "Zeynalli";
            singleton.password = "123456";
        }

        return singleton;

    }


}