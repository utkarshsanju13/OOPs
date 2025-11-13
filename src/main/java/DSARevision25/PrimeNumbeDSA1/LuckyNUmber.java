package DSARevision25.PrimeNumbeDSA1;

public class LuckyNUmber {

    public static void main(String[] args) {

        int A = 16;
        System.out.println(solve(A));
    }

    public static int solve(int A) {

        if(A < 6)
            return 0;

        int ans = 0;
        int [] spf = new int[A+1];
        for(int i = 2 ; i <=A; i++){
            spf[i] = i;
        }


        for(int i = 2; i*i<=A; i++){
            if(spf[i] == i){
                for(int j = i*i; j<=A; j = j+i){
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }

        for(int i = 6; i <=A; i++){
            if(countPrimeDivisor(spf,i) == 2){
                ans++;
            }
        }

        return ans;
    }

    public static int countPrimeDivisor(int [] spf, int n){

        int power = 0;
        while(n > 1){
            int divisor = spf[n];
            while(n % divisor == 0){
                n=n/divisor;
            }
            power++;
        }

        return power;
    }
}
