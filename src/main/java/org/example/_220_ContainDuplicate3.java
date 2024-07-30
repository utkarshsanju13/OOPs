package org.example;

import java.util.Arrays;
import java.util.TreeSet;

public class _220_ContainDuplicate3 {

    public static void main(String[] args) {
            int arr[] = {1,2,3,1};
        System.out.println(containsNearbyAlmostDuplicate(arr,3,0));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> tset = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){
            Long curr = (long)nums[i];

            Long tsetFloor = tset.floor((long)(curr));
            Long tsetceil = tset.ceiling((long)(curr));

            if(tsetceil!= null && Math.abs(curr - tsetceil) <= valueDiff){
                        return true;
            }

            if(tsetFloor!= null && Math.abs(curr - tsetFloor) <= valueDiff){
                return true;
            }

            tset.add(curr);

            if(tset.size() > indexDiff) {
                tset.remove((long) (nums[i - indexDiff]));
            }
        }

        return false;
    }
}
