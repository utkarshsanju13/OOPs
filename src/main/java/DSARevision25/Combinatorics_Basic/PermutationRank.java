package DSARevision25.Combinatorics_Basic;

public class PermutationRank {

    public static void main(String[] args) {

        String str = "acb";
        System.out.println(findRank(str));

    }

    public static int findRank(String A) {

        int mod = 1000003;
        int n = A.length();
        int p = n-1;
        long ans = 0;
        for(int i = 0; i < n-1; i++){
            int smallerCount = 0;
            for(int j = i+1; j < n; j++){
                if(A.charAt(j) < A.charAt(i)){
                    smallerCount++;
                }
            }

            ans = (ans + (smallerCount * factorial(p)) % mod) %mod;
            p--;
        }

        return (int)ans +1;

    }

    public static int factorial(int num){

        int mod = 1000003;
        long ans = 1;
        for(int i = 1; i <= num; i++){
            ans  = (ans * i) % mod;
        }

        return (int)ans;
    }
}
