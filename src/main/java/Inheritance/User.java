package Inheritance;

public class User {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.greet();

        Child c = new Child();
        c.greet();
//try{
//    Class cls = Class.forName("User");
//}


//        Parent p1 = new Child(); //Upcasting  implicitly
//        p1.greet();   // child

//        Child c1; //Downcasting   //explicit casting
//        c1 = (Child) new Parent();

//        c1.greet(); //parent
//        c1.namaste();
//        c1.greetOnlyFromChild();

//        Long l;
//        l = 10l;
//        Integer i = l.intValue();



//        long l1 = 10;
//        int i1 = (int) l1;

try{
        Class cls = Class.forName("User");

        // Creating object of main class
        // using instance method
    User obj = (User)cls.newInstance();

  } catch (Exception e) {

    // Display the exception along with line number
    // using printStacktrace() method
    e.printStackTrace();
}
    }
}
