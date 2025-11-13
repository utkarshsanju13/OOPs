package Java8Feature.Streams.QuestionFromgithubRepo.impQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenceOfWords {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Hello","Hello","hi","hi","hi"));
        String sentence = "Java is fun and Java is powerful";

        Map<String, Long> res =
                list.stream().collect(Collectors.groupingBy(word-> word,Collectors.counting()));

        System.out.println(res);

        Map<String,Long> result = Arrays.stream(sentence.split(" ")).collect(
                Collectors.groupingBy(word-> word, Collectors.counting())
        );


        System.out.println(result);


    }
}
