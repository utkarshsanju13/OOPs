package DSARevision25.Arrray;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;
import java.util.List;

public class FindNumberOfSubarrayWithSumB {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,0,1));
        System.out.println(findNoOfSubarrayCumlativeSumApproach(arr,1));

    }

    public static int findNoOfSubarrayCumlativeSumApproach(ArrayList<Integer> A, int B){

        int n = A.size();
        int[] cumSum = new int[n + 1];
        cumSum[0] = 0;

        for (int i = 0; i < n; i++) {
            cumSum[i + 1] = cumSum[i] + A.get(i);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (cumSum[j + 1] - cumSum[i] == B) {
                    count++;
                }
            }
        }
        return count;
//        int n = arr.size();
//        ArrayList<Integer> cumSum = new ArrayList<>();
//        cumSum.add(0);
//
//        for(int i = 0 ; i < n; i++){
//            cumSum.add(arr.get(i) + cumSum.get(i));
//        }
//
//        //0 1 1 2
//        //i   j
//
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j > 0; j--){
//
//            }
//        }
    }
}
