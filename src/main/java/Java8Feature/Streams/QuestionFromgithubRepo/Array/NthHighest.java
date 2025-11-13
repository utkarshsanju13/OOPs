package Java8Feature.Streams.QuestionFromgithubRepo.Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class NthHighest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();

        System.out.println(list.stream().sorted(Comparator.reverseOrder())
                .skip(n-1).findFirst());
    }
}
