package Java8Feature.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        //from collection:
        Stream<Integer> integerStream = list.stream();

        //form array
        String[] strArr = {"a","b","vc","fg"};
        Stream<String> stringStream = Arrays.stream(strArr);

        //filter is even
        List<Integer> leven = list.stream()
                .filter(ele -> ele % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(leven);

        //convert a stream into squares of stream.
        List<Integer> lsquare = list.stream()
                .map(ele -> ele * ele)
                .collect(Collectors.toList());

        System.out.println(lsquare);

        List<Integer> list2 = new ArrayList<>(List.of(11,23,1,2,34,22,10));
        List<Integer> lsorted = list2.stream()
                .sorted(((o1, o2) -> o1.compareTo(o2)))
                .collect(Collectors.toList());

        System.out.println(lsorted);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(number -> System.out.println(number));

        //SUm of all element
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Integer ans = stream1.reduce(0, (curr_sum,ele) -> curr_sum+ele);
        System.out.println(ans);

        //find first element
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> firstEvenNumber = stream2.filter(number -> number % 2 ==
                0).findFirst();
        System.out.println(firstEvenNumber);

        //count the even number
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
       long evenC = stream3.filter(ele -> ele%2 == 0).count();
        System.out.println(evenC);


        //Concatinate all the string array
        String[] arr = {"Hello"," ","World"};
        String ans1 = Arrays.stream(arr).collect(Collectors.joining());
        System.out.println(ans1);

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.stream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        List<Integer> listOfNumbers1 = Arrays.asList(1, 2, 3, 4);
        listOfNumbers1.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );



    }
}
