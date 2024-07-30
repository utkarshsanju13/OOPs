package Java8Feature.Lambda_Streams.Streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.counting;

public class MoreFunctionExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));

        Integer sumby2 = list.stream()
                .collect(summingInt(i -> i/2));
        System.out.println(sumby2);

        Integer ans1 = list.stream()
                .collect(maxBy((o1,o2) -> o1.compareTo(o2))).get();
        System.out.println(ans1);

        Integer ans2 = list.stream()
                .collect(minBy((o1,o2) -> o1.compareTo(o2))).get();
        System.out.println(ans2);

        Long ans3 = list.stream()
                .collect(counting());
        System.out.println(ans3);

    }
}
