package Neetcode150;
/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] result = new int[2];
        for (int i = 0; i < n; i++) {
            int temp = target - nums[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (temp == nums[j]) {
                        result[0] = i;
                        result[1] = j;
                        return result; // exit immediately after finding answer
                    }
                }
            }
        }
        return result;
    }

}
