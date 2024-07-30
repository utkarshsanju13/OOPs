package Generic.RawAndGenericType.Generic_Inheritance_Subtype;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;   // OK
        System.out.println(someInteger);


        Main.someMethod(new Integer(10));
        Main.someMethod(new Double(10.0));



        
    }

    public static void someMethod(Number n){
        System.out.println(n);
    }




}
