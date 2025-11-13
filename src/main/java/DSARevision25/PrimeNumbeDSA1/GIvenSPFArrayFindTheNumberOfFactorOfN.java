package DSARevision25.PrimeNumbeDSA1;

public class GIvenSPFArrayFindTheNumberOfFactorOfN {

    public static void main(String[] args) {
        int spf[] = {0, 0, 2, 3, 2, 5, 2, 7, 2, 3, 2};

        System.out.println(findNumberOfFactor(spf,10));
    }

    public static int findNumberOfFactor(int [] spf,int n){

        int count = 1;

        while(n > 1){
            int divisor = spf[n];
            int power = 0;
            while(n%divisor == 0){
                n = n/divisor;
                power++;
            }
            System.out.println(power + 1);
            count = count * (power + 1);
        }
        return count;
    }
}
