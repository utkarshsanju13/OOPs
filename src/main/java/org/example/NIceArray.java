package org.example;

import java.util.HashMap;

public class NIceArray {

    public static void main(String[] args) {

        int[] arr = {1,1,2,1,1};
        System.out.println(numberOfSubarrays(arr,3));

    }

    public static int numberOfSubarrays(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> hm  = new HashMap<>();
        int oddCount = 0, ans =0;
        hm.put(0,1);
        for(int i =0; i < n;i++){
            if(nums[i] %2 != 0){
                oddCount++;
            }

            if(hm.containsKey(oddCount-k)){
                ans+=hm.get(oddCount-k);
            }

            hm.put(oddCount, hm.getOrDefault(oddCount,0)+1);
        }

        return ans;

    }
}
