package DSARevision25.DSA1_Array.OneDimensional;

public class MaxContiguousArray {

    public static void main(String[] args) {
        int[] arr = {
                -2,1,-3,4,-1,2,1,-5,4
        };

        System.out.println(maxSubArray(arr));

    }

    public static int maxSubArray(final int[] A) {
        int ptr1 = 0;
        int ptr2 = 0;
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        while(ptr1 < n){
            int sum = 0;
            ptr2 = ptr1;
            while(ptr2 < n){
                sum+=A[ptr2];
                ptr2++;
                ans = Math.max(sum,ans);
            }
            ptr1++;
        }

        return ans;
    }


}
