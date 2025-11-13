package Java8Feature.Streams.QuestionFromgithubRepo.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberStartsWith1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(10,20,13,24,15,26,17,18,99));

        Set<Integer> set = list.stream().map(n -> n.toString())
                .filter(n-> n.startsWith("1"))
                .map(n->Integer.parseInt(n))
                .collect(Collectors.toSet());

        //More optimized
        List<Integer> newlist = list.stream().filter(n-> String.valueOf(n).startsWith("1"))
                        .collect(Collectors.toList());

        System.out.println(newlist);

        System.out.println(set);
    }
}
