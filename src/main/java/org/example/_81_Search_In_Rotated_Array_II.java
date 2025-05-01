package org.example;

public class _81_Search_In_Rotated_Array_II {

    public static void main(String[] args) {

        int [] arr = {1,0,1,1,1};
        System.out.println(search(arr,0));
    }

    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return true;
            }

            // Uncommenting the next lines is not necessary for functionality.
             while ((lo != hi) && (nums[lo] == nums[mid] && nums[mid] == nums[hi]) && (lo <= hi)) {
                 lo++;
                 hi--;
             }
            // if (lo >= hi) return false;

            if (nums[lo] <= nums[mid]) {
                if (nums[lo] <= target && nums[mid] >= target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[hi] >= target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
}
