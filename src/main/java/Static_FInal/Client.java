package Static_FInal;

import java.sql.SQLSyntaxErrorException;

public class Client {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.startEngine(); //This will print Vehicle method //
        IceCar.startEngine();  //This will print Icecar method

        Vehicle v1 = new IceCar();
        v1.startEngine();   //This will print the vehicle startEngine()
        //In the case upcasting:
//        Internally what system do in case of static member
//                If it is called using a class reference means object (v1.startEngine())
//        First it will find the class associated with the object i.e. v1 --- > vehicle and calls the method of that class
//                //It is not following the property of overriding in case of upcasting


//-------------------------FINAL-----------------------------------------------

        User u = new User("B+");
        System.out.println(u.bloodGroup+ " "+ u.galaxy); //B+ Milky-Way
        User newUser = new User("A+");
        System.out.println(newUser.bloodGroup + " "+ newUser.galaxy);

        /*Note:
        --> If a value of a attribute is common/constant for all the object then make it to be static final
        --> If a value of a attribute is constant over object (means after the object creation that can't be change') then make it ti be final only (not static)*/
    }
}
