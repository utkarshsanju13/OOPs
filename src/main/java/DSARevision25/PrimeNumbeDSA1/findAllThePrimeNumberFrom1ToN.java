package DSARevision25.PrimeNumbeDSA1;

import java.util.List;

public class findAllThePrimeNumberFrom1ToN {

    public static void main(String[] args) {

        int n = 2;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {

        if(n == 0 || n == 1)
            return 0;

        int count = 0;
        int [] temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 1; // 1 means the number is not prime

        for(int i = 2; i *i <= n; i++){

            if(temp[i] == 0){

                for(int j = i*i; j <= n; j = j + i){
                    temp[j] = 1;
                }
            }
        }

        for(int i = 0; i < temp.length; i++){
            if(temp[i] == 0){
                count++;
            }
        }

        return count;
    }

//    public static List<Boolean> findAllOfBooleanWhichIsPrime(int n){
//
//
//    }

}
