package ExeptionalHandling;

import java.io.NotActiveException;
import java.util.Random;

public class Doer {

    public static Object findRollNumber(int roll) throws ClassNotFoundException, EvenNumberFoundException {
        //we haven't handle the exception. We throw the exception to caller using throws in method declaration.
        if(roll < 10){
            throw new ClassNotFoundException();
//            return new Object();
        }
        Random r = new Random();

        int num = r.nextInt();

        if(num %2 == 0){
            throw new EvenNumberFoundException();
//            throw new NotActiveException();  // if random number is even then throw NotActiveException (checked exception)
        }

//        throw new ArithmeticException();//No compile time error as there is runtime exception
        throw new ClassNotFoundException(); //its howing compile time error as this checked(compile time) exception
    }
}
