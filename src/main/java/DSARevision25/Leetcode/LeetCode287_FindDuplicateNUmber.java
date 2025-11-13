package DSARevision25.Leetcode;

public class LeetCode287_FindDuplicateNUmber {

    public static void main(String[] args) {

        int [] arr = {1,3,4,2,2};
        System.out.println(findDuplicateOptimize(arr));

    }

//    Using the linkedlist cyclic method
//    TC = O(n) & S.C = O(1) & no original array modification
    public static int findDuplicateOptimize(int [] arr){

        int slow = 0;
        int fast = 0;

        while(true){
             slow = arr[slow];
             fast = arr[arr[fast]];

             if(slow == fast)
                 break;
        }

        int slow2 = 0;

        while(slow2 != slow){

            slow =arr[slow];
            slow2 = arr[slow2];
        }

        return slow2;
    }
    public static int findDuplicate(int [] arr){

        int n = arr.length;

        for(int i = 0 ; i < n; i++){

            int idx = Math.abs(arr[i]);
            if(arr[idx] < 0){
                return idx;
            }else{
                arr[idx] = -1 * arr[idx];
            }
        }
        return 0;
    }

}
