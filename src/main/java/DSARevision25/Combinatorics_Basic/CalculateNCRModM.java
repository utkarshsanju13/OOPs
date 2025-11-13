package DSARevision25.Combinatorics_Basic;

public class CalculateNCRModM {

    public static void main(String[] args) {
        int A = 5, B = 2, C = 13;
        System.out.println(solve(A,B,C));
    }

    public static int solve(int A, int B, int C) {

        int dp [][] = new int [A+1][B+1];
        int mod = C;
        int n = dp.length;
        int m = dp[0].length;
        for(int  i = 0 ; i < dp.length; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){

                dp[i][j] = (dp[i-1][j-1] % mod + dp[i-1][j] % mod) % mod;
            }
        }

        return dp[A][B];

    }
}
