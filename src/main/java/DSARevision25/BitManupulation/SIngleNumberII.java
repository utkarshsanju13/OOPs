package DSARevision25.BitManupulation;

public class SIngleNumberII {

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 2,3,3,1};
        System.out.println(solve(arr));

    }

    public static int solve(int [] A){

                int n = A.length;
                int ans = 0;
                for(int i = 1; i <= 32; i++){

                    int count = 0;
                    for(int j = 0; j < n; j++){

                        if((A[j] & (1<<i)) > 0){
                            count++;
                        }
                    }

                    if(count %3 != 0){
                        ans = ans | (1<<i);
                    }
                }

                return ans;
    }
}
