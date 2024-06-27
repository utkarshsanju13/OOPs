package Opps_4_PassByValueAndPassBYReference;

import javax.xml.stream.events.StartDocument;

public class StudentExample1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";

        swap(s1,s2);
        s1.display();
    }

//    public static void swap(Student s1, Student s2){
//        Student temp = s1;
//        s1 = s2;
//        s2 = temp;
//    }

    public static void swap(Student s1, Student s2){
        int tempage = s1.age;
        s1.age = s2.age;
        s2.age = tempage;

        String tempName = s1.name;
        s1.name = s2.name;
        s2.name = tempName;
    }
}
