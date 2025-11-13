package Java8Feature.Streams.QuestionFromgithubRepo.impQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPalindrome {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "racecar", "java", "level",
                "hello");

        List<String> result = words.stream().filter(str ->
            str.equals(new StringBuilder(str).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
