package DSARevision25.GCD;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.*;

public class AllGCDPair {

    public static void main(String[] args) {

//        int A[] = {2, 2, 2, 2, 8, 2, 2, 2, 10};
        ArrayList<Integer> A = new ArrayList<>(List.of(2, 2, 2, 2, 8, 2, 2, 2, 10));

        Collections.sort(A,Collections.reverseOrder());

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < A.size(); i++) {
            int num = A.get(i);

            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) - 1);
                if(hm.get(num) == 0){
                    hm.remove(num);
                }
                continue;
            } else {
                for (int j = 0; j < res.size(); j++) {
                    int GCD = gcd(res.get(j), num);
                    hm.put(GCD, hm.getOrDefault(GCD, 0) + 2);
                }
                res.add(num);
            }
        }

        System.out.println(res);

    }

    public static int gcd(int a, int b){
        if(b == 0)
            return a;

        return gcd(b, a%b);
    }


}
