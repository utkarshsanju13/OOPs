package Java8Feature.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        //find the sum of all value in list
        Integer ans = list.stream().reduce(0,
        (curr_sum,ele)->{
            return curr_sum+=ele;
        });
        System.out.println(ans);

        //multiply each by 2 and find first element in that stream
        Optional<Integer> res = list.stream().map(ele -> ele * 2).findFirst();
        System.out.println(res.get());

        Integer ans1 = list.stream().reduce(0,
                (max,ele)->{
                return Math.max(max,ele);
                });

        System.out.println(ans1);

        Integer ans2 = list.stream().reduce(0,
                (count,ele)->{
                    return count +1;
                });

        System.out.println(ans2);
    }

}
