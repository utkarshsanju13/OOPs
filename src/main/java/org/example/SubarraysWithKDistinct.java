package org.example;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct {

    public static void main(String[] args) {
//            int arr[] = {1,2,1,2,3};
        int arr[] = {1,2};
        System.out.println(subarraysWithKDistinct(arr,1));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return helperFn(nums,k) - helperFn(nums,k-1);
    }

    public static int helperFn(int[] arr, int k){
            if(k ==0)
                return 0;
        int n = arr.length;
        Map<Integer,Integer> hm = new HashMap<>();
        int s = 0,e = 0,count = 0;

        while(e < n){
            hm.put(arr[e], hm.getOrDefault(arr[e],0)+1);

            while( hm.size() > k  && s < e){
                hm.put(arr[s],hm.get(arr[s])-1);
                if(hm.get(arr[s]) == 0)
                    hm.remove(arr[s]);
                s++;
            }
            count += (e-s+1);
            e++;
        }

        return count;
    }
}
