package DSARevision25.DSA1_Array.OneDimensional;

public class KadanesAlgo {

    public static void main(String[] args) {
        int [] arr =
                {-2,1,5};
//                {-2,1,-3,4,-1,2,1,-5,4};
//        {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(maxSubArray(arr));

    }

    public static int maxSubArray(int[] nums) {

//        int currSum = nums[0];
//        int ans = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            currSum += nums[i];
//
//            if (currSum > ans) {
//                ans = currSum;
//            }
//
//            if (currSum < 0) {
//                currSum = 0;
//            }
//        }
//        return ans;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                end = i;
                start = tempStart;
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                tempStart = i+1;
                currentSum = 0;
            }
        }

        return maxSum;

    }
}
