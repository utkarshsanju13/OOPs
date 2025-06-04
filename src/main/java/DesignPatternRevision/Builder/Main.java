package DesignPatternRevision.Builder;

public class Main {

    public static void main(String[] args) {

        Student student = Student.builder()
                .setAge(20)
                .setGender("Male")
                .setId(1)
                .setGradeYear(2023)
                .setName("Abhay")
                .build();

        System.out.println("DEBUG");
    }
}
