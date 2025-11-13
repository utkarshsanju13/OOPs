package DSARevision25.PrimeNumbeDSA1;

public class CountFactorFrom1ToN {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(coutnFactorFrom1ToN(n));

    }

    public static int coutnFactorFrom1ToN(int n){

        int count = 0;
        int [] temp = new int[n+1];
        for(int i = 1; i <=n; i++){
            for(int j = i ; j <=n; j= j + i){
                temp[j]++;
            }
        }
        for(int i = 0; i <= n; i++){
            count+=temp[i];
        }

        return  count;
    }

}
