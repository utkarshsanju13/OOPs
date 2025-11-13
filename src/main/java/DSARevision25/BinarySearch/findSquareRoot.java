package DSARevision25.BinarySearch;

public class findSquareRoot {

    public static void main(String[] args) {
        int n  = 96629;
        System.out.println(findSqrtUsingBinarySearch(n));
    }

    public static int findSqrtUsingBinarySearch(int A){

        long low = 0, high = A;
        long ans = 0;

        while(low <= high){
            long mid = (high + low)/2;

            if(mid * mid == A){
                return (int)mid;
            }else if((mid * mid) < A){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return (int)ans;
    }
}
