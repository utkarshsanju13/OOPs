package org.example;

public class ContainsDuplicateIII {

    public static void main(String[] args) {

        int [] arr = {1,2,3,1};
        System.out.println(containsNearbyAlmostDuplicate(arr,3,0));


    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        int i = 0;
        int j = indexDiff;
        int n = nums.length;

        while(j < n){

            for(int k = i+1; k <=j; k++){
                if(Math.abs(nums[i] - nums[k]) <= valueDiff){
                    return true;
                }
            }
            i++;
            j++;
        }

        return false;

    }

    // 1 1 1 0 0 1
}
