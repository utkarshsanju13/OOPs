package DSARevision25.DSA1_Array.OneDimensional;

import java.util.ArrayList;

public class Flip {

    public static void main(String[] args) {
        String str = "0011101";

        System.out.println(flip(str));
    }


    public static ArrayList<Integer> flipOptimal(String A){
        int  s = 0;
        int end = 0;
        int start = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length(); i++){

            int ele = A.charAt(i) - '0';

            ele = ele == 0 ? 1: -1;

            sum = sum + ele;

            if(sum > max_sum){
                max_sum = sum;
                end = i;
                start = s;
            }

            if(sum < 0){
                sum = 0;
                s = i+1;
            }
        }

        if(max_sum < 0){
            return new ArrayList<Integer>();
        }


        ArrayList<Integer> result = new ArrayList<>();

        result.add(start+1);
        result.add(end+1);

        return result;
    }



    public static ArrayList<Integer> flip(String A) {

        ArrayList<Integer> tempArr = new ArrayList<>();

        for(int i = 0 ; i < A.length(); i++){
            if(A.charAt(i) == '0'){
                tempArr.add(1);
            }else if(A.charAt(i) == '1'){
                tempArr.add(-1);
            }
        }

        return maxSubArray(tempArr);

    }

    public static ArrayList<Integer> maxSubArray(ArrayList<Integer> nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(0);
        int tempStart = 0;

        for (int i = 0; i < nums.size(); i++) {
            currentSum += nums.get(i);


            if (currentSum > maxSum) {
                // end = i;
                ans.set(1,i);
                // start = tempStart;
                ans.set(0,tempStart);
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                tempStart = i+1;
                currentSum = 0;
            }
        }

        ans.set(0,ans.get(0)+1);
        ans.set(1, ans.get(1)+1);

        if(maxSum < 0){
            return new ArrayList<>();
        }
        return ans;

    }
}
