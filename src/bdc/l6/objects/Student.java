package bdc.l6.objects;

public class Student {
    public String name;
    public String surname;
    public int age;
    public String className;
    public int classNo;


    public static void toStringV1( Student s){
        System.out.println("name:"+s.name);
        System.out.println("surname:"+s.surname);
        System.out.println("age:"+s.age);
        System.out.println("className:"+s.className);
        System.out.println("classNo:"+s.classNo);

    }
}
