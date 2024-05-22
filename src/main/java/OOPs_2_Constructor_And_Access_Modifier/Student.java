package OOPs_2_Constructor_And_Access_Modifier;

public class Student {
    // write the code of student class here
    int age;
    String name;

    public Student(){
        this(0,null);
    }

    public Student(int age){
        this(age,null);
    }

    public Student(String name){
        this(0,name);
    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }





}
