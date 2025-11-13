package DSARevision25.PrimeNumbeDSA1;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.*;
import java.util.stream.Collectors;

public class FactorialArray {

    public static void main(String[] args) {
        int [] arr = {2,3,4,5};
//                {3,4,5,7,10,17};
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());

        System.out.println(solve(list));

    }

    public static int solve(ArrayList<Integer> A){

        Collections.sort(A);
        //find max
        int max = 0;
        for(int i = 0 ; i < A.size(); i++){
            max = Math.max(max, A.get(i));
        }

        ArrayList<Integer> factor = findAllTheprimeTillN(max);
        Collections.sort(factor);
        int ans = 0;
        int primePtr = 0;
        int curr = 0;
        int next = 0;
        while (primePtr < factor.size() && next < A.size()){

            int prime = factor.get(primePtr);

            while(A.get(next) < prime){
                next++;
            }
            int count = next - curr;
            if(count > 0) {
                ans += (power(2, count) - 1);
                curr = next;
            }
            primePtr++;
        }

        if(next < A.size()){
            int count = A.size() - next;
            ans += (power(2, count) -1);
        }


        return ans;
    }

    static long power(long x, long y) {
        int MOD = 1000000007;
        long res = 1;
        while (y > 0) {
            if ((y & 1) == 1) res = (res * x) % MOD;
            x = (x * x) % MOD;
            y >>= 1;
        }
        return res;
    }


    public static ArrayList<Integer> findAllTheprimeTillN(int n){
        List<Integer> factor = new ArrayList<>();

        //create spf array
        int [] spf = new int[n+1];
        for(int i = 2 ; i <=n; i++){
            spf[i] = i;
        }
        for(int i = 2; i*i <=n; i++){
            if(spf[i] == i){
                for(int j = i*i; j <=n; j=j+i){
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2 ; i <=n; i++){
            set.add(spf[i]);
        }


        return new ArrayList<>(set);
    }

}
