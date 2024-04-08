package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;


public class Main_12 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(3, "Zemfira", 26),
                new Student(4, "Rahaddin", 26),
                new Student(1, "Ilkin", 31),
                new Student(2, "Fərizə", 29));
        students.stream()
                .sorted()
                .forEach(System.out::println);
    }
}