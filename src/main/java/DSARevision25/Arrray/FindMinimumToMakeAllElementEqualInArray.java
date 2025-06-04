package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.List;

public class FindMinimumToMakeAllElementEqualInArray {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(2, 4, 1, 3, 2));

        System.out.println(solve(arr));

    }

    public static int solve(ArrayList<Integer> A) {

        int avg = (int) A.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        int nearest_to_avg = 0;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < A.size(); i++){
            if(avg - A.get(i) < diff){
                nearest_to_avg = A.get(i);
                diff = avg = A.get(i);
            }
        }

        int result = 0;
        for(int i = 0 ; i < A.size(); i++){

            result += nearest_to_avg - A.get(i);
        }

        return result;
    }

}


