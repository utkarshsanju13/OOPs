package DSARevision25.PrimeNumbeDSA1;

import java.util.ArrayList;

public class PrimeSum {

    public static void main(String[] args) {
        int A = 16;
        System.out.println(primesum(A));

    }

    public static ArrayList<Integer> primesum(int A) {

        //create spf
        boolean[]  spf = new boolean[A+1];
        for(int i = 2; i <=A; i++){
            spf[i] = true;
        }
        for(int i = 2; i*i <= A; i++){
            if(spf[i] == true){
                for(int j = i*i; j <=A; j= j+i){
                    if(spf[j] == true){
                        spf[j] = false;
                    }
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i <=A; i++){
            if(spf[i] == true){
                int second = A - i;
                if(spf[second] == true){
                    res.add(i);
                    res.add(second);
                    break;
                    // return new ArrayList<>(List.of(i,second));
                }
            }
        }
        return res;
    }

}
