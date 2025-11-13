package Java8Feature.Streams.QuestionFromgithubRepo.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FIndMaxElement {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        System.out.println(list.stream().sorted(Comparator.comparingInt((Integer x)->x).reversed())
                .findFirst().get());

        list.stream().sorted(Integer::compareTo).findFirst().get();
        System.out.println(list.stream().max(Integer::compareTo).get());

    }

}
