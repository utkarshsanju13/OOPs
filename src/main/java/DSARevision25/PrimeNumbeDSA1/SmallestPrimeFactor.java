package DSARevision25.PrimeNumbeDSA1;

import java.util.Arrays;

public class SmallestPrimeFactor {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(Arrays.toString(getSPFFrom1toN(n)));
    }

    public static int [] getSPFFrom1toN(int n){

        int [] spf = new int[n+1];
        for(int i = 2; i <=n; i++){
            spf[i] = i;
        }

        for(int i = 2; i*i <=n; i++){
            if(spf[i] == i){
                for(int j = i*i ; j <=n; j = j + i){
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }

        return spf;
    }

}
