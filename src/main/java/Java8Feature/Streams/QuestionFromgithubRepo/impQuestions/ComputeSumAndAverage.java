package Java8Feature.Streams.QuestionFromgithubRepo.impQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComputeSumAndAverage {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6)); //Mutable list
//        List<Integer> list = List.of(1,2,3,4,5,6); //Immutable list
//        System.out.println(list);
//        list.add(10);
//        System.out.println(list);


        Map<String, Double> result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(n->n),
                        Collectors.averagingDouble(n->n),
                        (sum,avg)-> Map.of("Sum",sum, "Average", avg)
                ));

        System.out.println(result);
    }
}
