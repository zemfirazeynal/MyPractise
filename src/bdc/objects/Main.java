package bdc.objects;

public class Main {
    static Student shabnam;
    static Student ferize = new Student();
    public static void main(String[] args) {
        Student zemfira = new Student();
        zemfira.name = "Zemfira";
        zemfira.surname = "Zeynalli";
        zemfira.age = 26;
        zemfira.className = "A";
        zemfira.classNo = 11;

        Student.toStringV1(zemfira);

        Student rahaddin = new Student();

        Student.toStringV1(rahaddin);
        Student.toStringV1(ferize);
        System.out.println(ferize); // yaddash unvani
        System.out.println(shabnam); // null
        Student.toStringV1(shabnam); // NullPointerException
        //ferize.name.length(); // NullPointerException
        shabnam.name.length(); // NullPointerException
    }
}
