package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class _239_Sliding_Window_Maximum {

    public static void main(String[] args) {

        int [] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] result = maxSlidingWindowOptimal(arr,k);
        for(int i = 0 ; i < result.length; i++){
            System.out.print(result[i] +" ");
        }

    }


    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < k; i++){
            pq.offer(nums[i]);
        }
        ans.add(pq.peek());
        for(int i = k; i < n; i++){
            pq.remove(nums[i-k]);
            pq.offer(nums[i]);
            ans.add(pq.peek());
        }

        int [] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            result[i] = ans.get(i);
        }

        return result;
    }
//    int [] arr = {1,3,-1,-3,5,3,6,7};
    public static int[] maxSlidingWindowOptimal(int [] nums, int k){
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;


        for(int i = 0; i < n; i++){
            //removing from front to maintain the window size
          if(!deq.isEmpty() && deq.peekFirst() == i-k){
                deq.removeFirst();
            }

          //maintain decresing order of new element to be queue
          while(!deq.isEmpty() && nums[deq.peekLast()] <= nums[i]){
              deq.removeLast();
          }

          deq.addLast(i);

          if(i >= k-1)
              ans.add(nums[deq.peekFirst()]);
        }

        int [] result = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;

    }
}
