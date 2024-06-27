package OOps_3_Inheritance_Polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        //Inheritance

//        Mentor m = new Mentor(10);
//        m.setId(1);
//        m.name = "utkarsh";
//        m.role = "instructor";

//        m.greet();
//        m.printdetails();
//        m.greetAll();
//        Map<Integer,Integer> hm = new HashMap<>();
//        Collections.sort(new ArrayList<Integer>());


        //Polymorphism

        User user = new Mentor(); //Upcasting (implicit i.e. no casting is required)
        user.greetFromUser();
//        user.greetFromMentor(); //additional feature are not being used

//        Mentor mentor = (Mentor) new User(); //Downcasting (we have to explicit do the casting)
//        mentor.greetFromMentor(); //runtime exception
//        mentor.greetFromUser(); //runtime exception

        /*NOTE: Downcasting is availbale for other datatype
                eg:
        for primitive datatype:*/
        long l = 120;
        int i = (int)l;
        System.out.println(l);






    }
}
