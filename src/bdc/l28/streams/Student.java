package bdc.l28.streams;

import java.util.Comparator;

public class Student implements Comparable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if(this.id >student.id) return 1;
        else if (this.id<student.id) return -1;
        return 0;
    }

    class StudentAgeComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.age> o2.age)
            return 1;
            else if (o1.age<o2.age)
                return -1;
            return 0;
        }
        }

}
