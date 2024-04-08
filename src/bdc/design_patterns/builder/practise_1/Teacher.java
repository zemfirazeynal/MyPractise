package bdc.design_patterns.builder.practise_1;

public class Teacher {
    private final int id;
    private final String name;
    private final String surname;
    private final int age;
    private final String facility;

    private Teacher(TeacherBuilder teacherBuilder){
        this.id = teacherBuilder.id;
        this.age = teacherBuilder.age;
        this.name = teacherBuilder.name;
        this.surname = teacherBuilder.surname;
        this.facility = teacherBuilder.facility;
    }


    public static TeacherBuilder builder(){
         return  new TeacherBuilder();
    }

    public static class TeacherBuilder {
        private  int id;
        private String name;
        private String surname;
        private int age;
        private String facility;

        public TeacherBuilder whatYouWantGiveId(int id) {
            this.id = id;
            return this;
        }

        public TeacherBuilder whatIsYourName(String name) {
            this.name = name;
            return this;
        }

        public TeacherBuilder whatIsYourSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public TeacherBuilder age(int age) {
            this.age = age;
            return this;
        }

        public TeacherBuilder facility(String facility) {
            this.facility = facility;
            return this;
        }

        public Teacher build(){
            Teacher teacher = new Teacher(this);
            return teacher;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", facility='" + facility + '\'' +
                '}';
    }
}
