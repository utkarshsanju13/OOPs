package Java8Feature.Lambda_Streams.Revision;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        MathOperation add = (a,b) -> a+b;
        MathOperation sub = (a,b) -> a-b;
        MathOperation mul = (a,b) -> a*b;
        MathOperation div = (a,b) -> a/b;

        System.out.println(add.operation(2,3));
        System.out.println(sub.operation(5,3));
        sub.print();
        MathOperation.printFromStaticMethod();

        Print printAnyThing = ()-> System.out.println("Hello World");
        printAnyThing.print();

        //Function
//        Basically <String,String> will tells the input parameter type and result type
        Function<String,String> function = str -> str.toUpperCase();


        //forEach using lambda
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(n-> System.out.println(n));


        //ThreadUsing lambda
        Runnable runnable = ()-> System.out.println("Hello World");

        Thread t1 = new Thread(runnable);
        t1.start();

        List<Integer> list1 = new ArrayList<>(List.of(2,1,4,3));
        //lambda use in comparator class
        Collections.sort(list1,(a,b) -> a.compareTo(b));

        //lambda used in filter
       List<Integer> res = list1.stream()
                .filter(i -> i%2 == 0)
               .collect(Collectors.toList());

        res.forEach(n -> System.out.print(n));
    }

}
