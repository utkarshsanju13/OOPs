package org.example;

public class _1423_Leetcode {

    public static void main(String[] args) {

        int arr[] = {96,90,41,82,39,74,64,50,30};
//                {1,2,3,4,5,6,1};
        System.out.println(maxScore(arr,8));

    }

    public static  int maxScore(int[] nums, int k) {

        int n = nums.length;

        int lSum = 0,rSum = 0,maxSum = 0;
        for(int i = 0; i <= k-1; i++){
            lSum += nums[i];
        }
        int rIndex = n-1;
        for(int i = k-1; i>=0; i--){
            lSum -= nums[i];
            rSum += nums[rIndex];
            rIndex--;

            maxSum = Math.max(maxSum,lSum+rSum);
        }

        return maxSum;

    }
}
