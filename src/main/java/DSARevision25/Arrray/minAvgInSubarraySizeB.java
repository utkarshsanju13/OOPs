package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.List;

public class minAvgInSubarraySizeB {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(List.of(15,7,11,7,9,8,18,1,16,18,6,1,1,4,18));

        System.out.println(solve(arr,6));

    }

    public static int solve(ArrayList<Integer> A, int B) {

        int n = A.size();

        int sum = 0;
        int minAvg = Integer.MAX_VALUE;

        for(int i = 0 ; i < B; i++){
            sum+=A.get(i);
        }

        minAvg = Math.min(sum/B,minAvg);
        int ans = 0;
        int start = 0;
        int end = B;
        while(start < n-B){
            sum-=A.get(start);
            sum+=A.get(end);
            if(sum/B <= minAvg){
                minAvg = sum/B;
                ans = start+1;
            }
            start++;
            end++;
        }
        return A.get(ans);
    }
}
