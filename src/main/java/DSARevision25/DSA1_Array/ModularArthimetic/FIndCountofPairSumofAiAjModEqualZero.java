package DSARevision25.DSA1_Array.ModularArthimetic;

import java.util.HashMap;

public class FIndCountofPairSumofAiAjModEqualZero {

    public static void main(String[] args) {
        int arr[] =
                {1,2,3,4,5};
//        {5,17,100,11};
        System.out.println(countPair(arr,2));

    }
//
//    public static int countPair(int [] A, int B){
//        int n = arr.length;
//        int ans = 0;
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for(int i = 0 ; i < n; i++){
//            arr[i] = arr[i] % mod; //modifyign the same arr as
//            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1); //creating hashmap as an frequecny of each remider
//        }
//
//        //if here are n number with remider 0
////        then pair possible between then is nC2 -> (n*n-1)/2
//        if(hm.get(0) != null){
//            int zeroMod = hm.get(0);
//            ans += (zeroMod * zeroMod - 1)/2;
//        }
//
//
////        if the mod is even number
////        that also create pair with itself [0,1,2,3] there the mod is 4 and the range lie between
////                [0,3] of mod value so the reminder with value 2  will also create pair we them
//        if(mod % 2 ==0 && hm.get(mod/2) != null){
//            int halfmod = hm.get(mod/2);
//            ans+= (halfmod * (halfmod - 1)) / 2;
//        }
//
////        then the other pair with first half we other half
//        for(int i = 1 ; i <=(mod-1)/2; i++){
//            if(hm.get(i) != null && hm.get(mod - i)!=null)
//                ans += hm.get(i) * hm.get(mod - i);
//        }
//        return ans;
        public static int countPair(int [] A, int B){
            int n = A.length;
            int mod = 1000000007;

            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int i = 0; i < n; i++){
               A[i] = A[i] % B;
               hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            }


            long ans = 0;
            if(hm.get(0) != null){
                int val_at_0 = hm.get(0);
                ans += (((long)val_at_0 * (val_at_0 - 1)) / 2)%mod;
            }

            if(B % 2 == 0 && hm.get(B/2) != null){
                int val_at_half = hm.get(B/2);
                ans += (((long)val_at_half * (val_at_half - 1))/2)%mod;
            }

            for(int j = 1; j <=(B-1)/2; j++){
                if(hm.get(j) != null && hm.get(B-j)!=null)
                    ans += (((long)hm.get(j) * hm.get(B-j)))%mod;
            }

            return (int)ans%mod;
    }
}
