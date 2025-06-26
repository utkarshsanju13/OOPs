package DSARevision25.Arrray;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ElementRemoval {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(List.of(9,99,999,9999,9998));
//        ArrayList<Integer> arr = new ArrayList<>(List.of(8,10,5));

        System.out.println(largestNumber(arr));

    }

    public static int solve(ArrayList<Integer> A) {

        Collections.sort(A,(a,b)->{
            return b.compareTo(a);
        });

        int sum = 0;
        int cost = 0;

        for(int i = 0 ; i < A.size(); i++){
            sum+=A.get(i);
        }

        for(int i = 0 ; i < A.size(); i++){
            cost +=sum;
            sum -= A.get(i);
        }

        return cost;
    }


    public static ArrayList<Integer> solve1(ArrayList<Integer> A) {

//        Collections.sort(A, (a,b)->{
//            int aFactor = countFactor(a);
//            int bFactor = countFactor(b);
//
//            if(aFactor < bFactor)
//                return -1;
//            else if(aFactor > bFactor){
//                return 1;
//            }
//
//            return a.compareTo(b);
//        });

        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int aFactor = countFactor(a);
                int bFactor = countFactor(b);

                if(aFactor < bFactor)
                    return -1;
                else if(aFactor > bFactor){
                    return 1;
                }

                return a.compareTo(b);
            }
        });

        return A;

    }

    public static int countFactor(int a){

        int count = 0;

        for(int i = 1; i <= a/2; i++){
            if(a%i == 0){
                count++;
            }
        }
        return ++count;
    }

    public static String largestNumber(final List<Integer> A) {

//        int n = A.size();
//        String ini = String.valueOf(A.get(0));
//        for(int i = 1; i <= n-1; i++){
//
//            String pre = String.valueOf(A.get(i)) + ini;
//            String post = ini + String.valueOf(A.get(i));
//
//            if(Long.parseLong(pre) > Long.parseLong(post)){
//                ini = pre;
//            }else{
//                ini = post;
//            }
//        }
//        return ini;

        Collections.sort(A, (a,b) ->{

            String aStr = Integer.toString(a) + Integer.toString(b);
            String bStr = Integer.toString(b) + Integer.toString(a);

            return bStr.compareTo(aStr);
        });

        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < A.size(); i++){
            str.append(A.get(i));
        }

        return str.toString();
    }
}

