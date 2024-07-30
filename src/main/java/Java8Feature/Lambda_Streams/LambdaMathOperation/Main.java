package Java8Feature.Lambda_Streams.LambdaMathOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Addition
        MathOperation addtion = (a,b) ->{
            return a+b;
        };

        //Subtraction
        MathOperation subtraction = (a,b) ->{
            return a-b;
        };

        //Multiplication
        MathOperation multiplication = (a,b) ->{
            return a*b;
        };

        //Check number is even or not
        NumberCheck isEven = a-> a % 2 == 0;

        System.out.println(addtion.operate(2,4));
        System.out.println(subtraction.operate(2,4));
        System.out.println(multiplication.operate(2,4));
        System.out.println(isEven.checkNumber(4));


        //                listOfFruits.add("apple");
//        listOfFruits.add("mango","pineapple","lemon"
        List<String> listOfFruits = new ArrayList<>(List.of("apple", "mango", "pineapple", "lemon"));
//        );

        //using stream :filter the fruits starts with a
        List<String> fruitsStartswithA = listOfFruits.stream()
                .filter(frits -> frits.startsWith("a")).collect(Collectors.toList());

        System.out.println(fruitsStartswithA);

        System.out.println("Before sorting  : " + listOfFruits);
        //comparator example:
//        Collections.sort(listOfFruits,new Comparator<String>(){
//
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        Collections.sort(listOfFruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(listOfFruits, (o1,o2) -> o1.compareTo(o2));

        System.out.println("After sorting by name : " + listOfFruits);


    }
}
