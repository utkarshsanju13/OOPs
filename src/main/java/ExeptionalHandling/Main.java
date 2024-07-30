package ExeptionalHandling;

import java.io.NotActiveException;

public class Main {

    public static void main(String[] args) {

        Doer doer = new Doer();
        try {
            System.out.println("Before the exception occur in try block");
            Doer.findRollNumber(2);
            System.out.println("After the exception occur in try block");
            System.exit(0);
        }catch (EvenNumberFoundException e){
            System.out.println("Even NUmber found...");
        }
        catch (ClassNotFoundException e){
            System.out.println("Roll not found");
        }finally {
            System.out.println("Finally block....");
        }

        System.out.println("Outside of try catch and finally block...");



    }

}
