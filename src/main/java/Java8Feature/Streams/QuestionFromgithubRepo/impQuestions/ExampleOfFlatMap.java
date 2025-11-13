package Java8Feature.Streams.QuestionFromgithubRepo.impQuestions;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOfFlatMap {

    public static void main(String[] args) {
        List<List<Integer>> nestedlist = new ArrayList<>(
                List.of(
                    new ArrayList<>(List.of(1,2,3)),
                    new ArrayList<>(List.of(5,6,7,8)),
                    new ArrayList<>(List.of(12,34,54))
                )
        );

        List<Integer> result = nestedlist.stream()
                .flatMap(List::stream).collect(Collectors.toList());

        System.out.println(result);
    }

}
