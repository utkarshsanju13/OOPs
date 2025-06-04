package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_Array {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));

//        List<Integer> immutableList = List.of(1, 2, 3);
//        immutableList.add(4); // Throws UnsupportedOperationException
//        immutableList.set(0, 10);

//        System.out.println(immutableList);

//        Collections.reverse();

    }

//    public ArrayList<Integer> solve(final List<Integer> A) {
//
//        for(int i = 0 ; i < A.size()/2;i++){
//
//            swap(A,i,A.size()-i-1);
//        }
//
//        return A;
//    }

    public static void swap(List<Integer> A, int s, int e){

        int s_ele = A.get(s);
        int e_ele = A.get(e);

        A.set(s,e_ele);
        A.set(e,s_ele);
    }
}
