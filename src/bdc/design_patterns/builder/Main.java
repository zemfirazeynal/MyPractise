package bdc.design_patterns.builder;

public class Main {
    public static void main(String[] args) {

        Teacher.TeacherBuilder teacherBuilder = Teacher.builder();
        Teacher zemfira = teacherBuilder.whatYouWantGiveId(1)
                          .whatIsYourName("Zemfira")
                          .build();

        Teacher zeynalli = teacherBuilder.whatYouWantGiveId(2)
                .whatIsYourSurname("zeynalli")
                .build();

        System.out.println(zemfira);
        System.out.println(zeynalli);
    }
}
