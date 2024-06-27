package org.example;

public class SortColor {

    public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void sortColors(int[] nums) {

        int i = 0, j =0, k = nums.length-1;

        while( j < k){

            if(nums[j] == 0){
                swap(nums,i,j);
                i++;
                j++;
            }else if(nums[j] == 1){
                j++;
            }else{
                swap(nums,j,k);
                k--;
            }
        }


    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
