package Java8Feature.Lambda_Streams.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

//        List<String> names = new ArrayList<>(List.of("John", "Jane", "Jack", "Jill", "Jennie"));

//        List<String > ans =  names.stream()
//                .filter(name -> name.startsWith("J")) //Predicat returns boolean
//                .map(name -> name.toUpperCase())        //Convert T to R
//                .distinct()                                    //Stateful operation
//                .sorted((a,b) -> b.compareTo(a))    //use comparator
//                .limit(4)                               //limit the first n elements
//                .peek(name -> System.out.println(name))     //accept Consumer Function interface
//                .collect(Collectors.toList());
//
//        List<List<String>> arr = new ArrayList<>(
//                Arrays.asList(
//                    Arrays.asList("Hello","Utkarsh","Sanju"),
//                    Arrays.asList("world","Sanddep","pareek")
//                )
//        );
//
//        List<String> flaten = arr.stream()
//                .flatMap(List :: stream)
//                .collect(Collectors.toList());
//
//        System.out.println(flaten);

        List<String> names = new ArrayList<>(List.of("John", "John", "Jack", "Jill", "Jennie"));
//    For each (Consume)
        names.stream()
                .forEach(name-> System.out.println("hello" + name));

        //.collect
        Set<String> collectedInSet = names.stream()
                .collect(Collectors.toSet());

        System.out.println(collectedInSet);

        //Convert the List<String> into array of string
        String [] arrString = names.stream()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(arrString));

        String concatString = names.stream()
                .reduce("",String::concat);

        System.out.println(concatString);

        //reduce -> Combine all element into one
        List<Integer> numbers = Arrays.asList( 2, 3, 4, 5);
        int avg = numbers.parallelStream()
                .reduce(0,Integer::sum);

        System.out.println(avg);

        //count the number of element that are even in number.
        long count = numbers.stream()
                .filter(n -> n%2 == 0)
                .count();
        System.out.println(count);

        //find maximum in int value of stream
        OptionalInt max = numbers.stream()
                .mapToInt( Integer::intValue)
                .max();

        System.out.println(max.getAsInt());

        //find maximum using max comparator
        Optional<Integer> maxi = numbers.stream()
                .max((a,b) ->a.compareTo(b));
        System.out.println(maxi.get());

        //find min using comparator
        Optional<Integer> mini = numbers.stream()
                .min((a,b) ->b.compareTo(a));
        System.out.println(mini.get());

        //match return boolean : accept Predicate
        boolean anyMatch = numbers.stream()
                .anyMatch(num -> num == 5);
        System.out.println(anyMatch);

        boolean allMatch = numbers.stream()
                .allMatch(num -> num % 2==0);
        System.out.println(allMatch);

        boolean noneMatch = numbers.stream()
                .noneMatch(num -> num > 5);

        System.out.println(noneMatch);

        //findAny
        Optional<Integer> findAny = numbers.parallelStream()
                .findAny();
        System.out.println(findAny.get());

        //findFirst
        Optional<Integer> findFirst = numbers.parallelStream()
                .skip(0)
                .findFirst();
        System.out.println(findFirst.get());




    }

}
