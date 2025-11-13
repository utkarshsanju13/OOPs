package ImmutableCustomeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Student {

    private final String name;
    private final List<String> subject;
    private final int rollNo;

    public Student(String name, List<String> subject, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        List<String> listOfSubject = new ArrayList<>(subject);
        //Created deep copy + unmodifiable wrapper
        this.subject = Collections.unmodifiableList(listOfSubject);
    }

    public String getName() {
        return name;
    }

    public List<String> getSubject() {
        return subject;
        //This redundant code not needed -> as we have already initialized the list as Unmodifiable in constructor only.

//        List<String> listOfSubject = new ArrayList<>();
//        for(String sub : this.subject){
//            listOfSubject.add(sub);
//        }
//        return Collections.unmodifiableList(listOfSubject);

    }

    public int getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {

        List<String> listOfSub = List.of("English","Hindi", "Maths");
        Student student = new Student("utkarsh",listOfSub,20);

//        student.name = "hello"; //Compilation error
//        student.rollNo = 89; //Compilation error
        List<String> stdListOfSubject = student.getSubject();
        stdListOfSubject.add("SST");

        System.out.println(student);
    }
}
