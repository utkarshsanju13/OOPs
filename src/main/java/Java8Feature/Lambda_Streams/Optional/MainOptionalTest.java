package Java8Feature.Lambda_Streams.Optional;

import java.util.Arrays;
import java.util.Optional;

public class MainOptionalTest {

    public static void main(String[] args) {

      /*  String[] str = new String[10];
        String str1 = str[5].toUpperCase(); //throw null pointer exception
        System.out.println(str1);*/

        //To prevent NPE we use below code and apply check null

        /*String[] str = new String[10];
        String str1 = "";
        if(null != str[5]){
            str1 = str[5].toUpperCase();
            System.out.println(str1);
        }
        else{
            System.out.println("The string is empty");
        }*/

        //we use option class to handle null pointer exception

        String str[] = new String[10];
//        str[5] = "Hello";
//        String strLateral = "String lateral";
        Optional<String> str1 = Optional.ofNullable(str[5]);

//        System.out.println(str1.isEmpty());
//        System.out.println(Optional.of(str1));
//        Optional<String> stringOptional = Optional.of(strLateral);

        if(str1.isPresent()){
            System.out.println(str1.get().toUpperCase());
        }else{
            System.out.println("String is empty");
        }


        //orElse of Optional class

        System.out.println(str1.orElse("String is empty"));
        System.out.println(str1.orElseThrow(RuntimeException::new));



    }



}
