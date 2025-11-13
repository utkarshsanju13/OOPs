package Java8Feature.Streams.QuestionFromgithubRepo.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,2,4,5,5,7,9,9));

        System.out.println(list.stream().filter(n-> Collections.frequency(list,n)>1)
                .collect(Collectors.toList())); //[2, 2, 5, 5, 9, 9]

        System.out.println(list.stream().distinct().filter(n-> Collections.frequency(list,n)>1)
                .collect(Collectors.toList()));//[2, 5, 9]

        Set<Integer> set = list.stream().filter(n-> Collections.frequency(list,n) > 1)
                .collect(Collectors.toSet());
        System.out.println("Set : "+ set);

    }
}
