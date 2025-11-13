package DSARevision25.DSA1_Array.OneDimensional;

import java.util.ArrayList;
import java.util.List;

public class AbsoluteMaximumValue {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4));
        ArrayList<Integer> B = new ArrayList<>(List.of(-1,4,5,6));
        ArrayList<Integer> C = new ArrayList<>(List.of(-10,5,3,-8));
        ArrayList<Integer> D = new ArrayList<>(List.of(-1,-9,-6,-10));

        System.out.println(findMaximum(A,B,C,D));

    }

    public static int findMaximum(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D) {
        int n = A.size();
        int result = 0;

        // Iterate over all 32 combinations of signs (+/-) for 5 variables (A, B, C, D, i)
        for (int mask = 0; mask < 32; mask++) {
            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int curr = 0;

                curr += ((mask & (1 << 0)) != 0 ? A.get(i) : -A.get(i));
                curr += ((mask & (1 << 1)) != 0 ? B.get(i) : -B.get(i));
                curr += ((mask & (1 << 2)) != 0 ? C.get(i) : -C.get(i));
                curr += ((mask & (1 << 3)) != 0 ? D.get(i) : -D.get(i));
                curr += ((mask & (1 << 4)) != 0 ? i : -i); // index

                maxVal = Math.max(maxVal, curr);
                minVal = Math.min(minVal, curr);
            }

            result = Math.max(result, maxVal - minVal);
        }

        return result;
    }

//    public static int findMax(ArrayList<Integer> A,ArrayList<Integer> B,ArrayList<Integer> C,ArrayList<Integer> D){
//
//        int n = A.size();
//        int res = 0;
//
//        for(int i = 0 ; i < 16; i++){
//            int maxi = Integer.MIN_VALUE;
//            int mini = Integer.MAX_VALUE;
//
//            for(int j = 0; j < n; j++){
//                int curr = A.get(j);
//                int temp = 0;
//                for(int k = 0 ; k < 4; k++){
//                    if(k == 0) temp = B.get(j);
//                    if(k == 1) temp = C.get(j);
//                    if(k == 2) temp = D.get(j);
//                    else
//                        temp = j;
//
//                    if(i & (1<<k))
//                            curr+=temp;
//                    else
//                        curr-=temp;
//                }
//
//                maxi = Math.max(maxi,curr);
//                mini = Math.min(mini, curr);
//            }
//
//            res = Math.max(res,maxi - mini);
//        }
//
//        return  res;
//    }



}
