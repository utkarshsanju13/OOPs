package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.List;

public class EquilibriumIndexInArray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(-7, 1, 5, 2, -4, 3, 0));
        System.out.println(solve(arr));
    }

    public static int solve(ArrayList<Integer> A) {

        int n = A.size();

        // If array has only one element, sum of lower and higher indices is 0
        if (n == 1) {
            return 0;
        }

        // Calculate prefix sums
        ArrayList<Long> prefix = new ArrayList<>();
        prefix.add((long) A.get(0));
        for (int i = 1; i < n; i++) {
            prefix.add(prefix.get(i - 1) + A.get(i));
        }

        // Calculate suffix sums
        ArrayList<Long> suffix = new ArrayList<>();
        suffix.add((long) A.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            suffix.add(0, suffix.get(0) + A.get(i));
        }

        // Check for equilibrium index
        for (int i = 0; i < n; i++) {
            long leftSum = (i == 0) ? 0 : prefix.get(i - 1);
            long rightSum = (i == n - 1) ? 0 : suffix.get(i + 1);
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}
