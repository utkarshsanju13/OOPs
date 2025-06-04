package DSARevision25.Arrray;

import java.util.Collection;
import java.util.Collections;

public class Good_Pair {

    public static void main(String[] args) {

        int [] arr = {1,2,4};
        int B = 4;

        System.out.println(solve(arr,B));
    }

    public static int solve(int[] A, int B) {

        for(int i = 0 ; i < A.length-1; i++){
            for(int j = i+1; j < A.length; j++){
                if(A[i] + A[j] == B)
                    return 1;
            }
        }

        return 0;
    }
}
