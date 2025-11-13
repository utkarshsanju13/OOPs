package Java8Feature.Streams.QuestionFromgithubRepo.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

    list.stream().filter((num)-> num%2 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> evenList = list.stream().filter((num)-> num%2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);
    }
}
