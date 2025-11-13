package Java8Feature.Streams.QuestionFromgithubRepo.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortValues {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 12, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> increasinglist = list.stream().sorted().collect(Collectors.toList());
        System.out.println(increasinglist);

        List<Integer> declist = list.stream().sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(declist);

        list.stream().sorted(Comparator.comparingInt((Integer x)->x)).collect(Collectors.toList());

    }
}
