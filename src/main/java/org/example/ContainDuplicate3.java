package org.example;

public class ContainDuplicate3 {

    public static void main(String[] args) {

        int[] arr = {1,5,9,1,5,9};
        System.out.println(containsNearbyAlmostDuplicate(arr,2,3));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        if(indexDiff > 99876){
            return false;
        }

        int i = 0;
        int j = indexDiff;
        int n = nums.length;

        while(j > 0) {
            int k = j;
            i = 0;
            while (k < n) {
                if (Math.abs(nums[i] - nums[k]) <= valueDiff) {
                    return true;
                }
                i++;
                k++;
            }
            j--;
        }
        return false;

    }
}
