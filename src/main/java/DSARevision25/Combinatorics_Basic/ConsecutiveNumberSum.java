package DSARevision25.Combinatorics_Basic;

public class ConsecutiveNumberSum {

    public static void main(String[] args) {

        int n = 9;
        System.out.println(findWays(n));

    }

    public static int findWays(int n){

//        int count = 0;
//
//        for(int i = 1; i <=Math.sqrt(2*n); i++){
//            long T = n - (i * ( i - 1 ))/2;
//            if(T%i == 0)
//                count++;
//        }
//
//        return count;
        int l = 1;
        int r = 1;
        int sum = 1;
        int count = 0;

        while(sum < n){
            r++; //4
            sum+=r;//10
        }

        //l = 1; r = 4;
        while(l <= n){
            if(sum == n){
                count++;
                sum-=l;
                l++;
            }else if(sum > n){
                sum -= l;
                l++;
            }else{
                r++;
                sum += r;
            }
        }

        return count;
    }
}
