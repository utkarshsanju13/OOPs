package org.example;

public class GFG_FInd_Kth_Rotation {

    public static void main(String[] args) {
        int arr[] = {9, 2, 4, 6};
        System.out.println(findKthRatotion(arr));
    }

    public static int findKthRatotion(int arr[]){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int minIndex = 1;
        int minEle = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[low] <= arr[mid]){
                if(arr[low] < minEle) {
                    minIndex = low;
                    minEle = arr[low];
                }
                low = mid+1;
            }else{
                if(arr[mid] < minEle){
                    minIndex = mid;
                    minEle = arr[mid];
                }
                high = mid-1;
            }
        }

        return minIndex;
    }
}
