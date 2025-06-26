package DSARevision25.BitManupulation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindUnique {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1,2,2,1,3,5,4,3,4));
        System.out.println(findUnique(list));
        System.out.println(1<<findUnique(list)); //1<<n = Math.pow(2,n)
    }

    public static int findUnique(ArrayList<Integer> A) {

        int ans = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            ans = ans ^ A.get(i);
        }

        return ans;

    }
}
