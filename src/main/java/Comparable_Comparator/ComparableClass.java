package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;


//This is Comparable interface
//Single sorting sequence (Sort on the basis of a single element such as id, name, fathername)
class Student implements Comparable<Student> {

    int id;
    String name;
    String fatherName;

    public Student(int id, String name, String fatherName) {
        this.id = id;
        this.name = name;
        this.fatherName = fatherName;
    }

    public String toString(){
        return this.id+" "+ this.name+ " "+ this.fatherName;
    }


    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class ComparableClass {

    public static void main(String[] args) {
        Student s1 = new Student(1,"aviral","sumit");
        Student s2 = new Student(2,"booby","amit");
        Student s3 = new Student(3,"kaevin","gaurav");

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s3);
        arr.add(s1);
        arr.add(s2);
        System.out.println("Before Sorting-------------------------");
        for(Student s: arr){
            System.out.println(s.toString());
        }

        System.out.println("After Sorting-------------------------");

        Collections.sort(arr);

        for(Student s: arr){
            System.out.println(s.toString());
        }

    }
}
