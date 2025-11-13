package DSARevision25.PrimeNumbeDSA1;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;

public class CountFactor {

    public static void main(String[] args) {

        int n = 64;
        int count = countFactor(n);
        if(count == 2)
            System.out.println("n is prime");
        System.out.println(countFactor(n));

    }

    public static int countFactor(int n){

        int count  = 0;
        ArrayList<Integer> factors = new ArrayList<>();

        for(int i = 1 ; i * i < n; i++){

            if(n % i == 0){

                if( i == n/i){
                    count++;
                    factors.add(i);
                }else{
                    count++;
                    factors.add(i);
                    factors.add(n/i);
                }
            }
        }
        System.out.println("Factors are : " + factors);
        return count;
    }
}
