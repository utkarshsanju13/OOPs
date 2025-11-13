package DSARevision25.BasicRecursion;

import java.util.ArrayList;

public class KthSymbolEasy {

    public static void main(String[] args) {
        System.out.println(solve(4,4l));
    }

    public static int solve(int A, long B) {
        return solveHelper(A,B,false);
    }

    public static int solveHelper(int A,long B,boolean flag){
        if(A==1){
            return flag?1:0;
        }
        long res = (long) Math.pow(2,A-2);
        if(res > B){
            return solveHelper(A-1,B,flag);
        } else {
            return solveHelper(A-1,B-res,!flag);
        }
    }

/*
    public static int solve(int A, int B) {
        return A_th_Row(A).get(B);
    }

    public static ArrayList<Integer> A_th_Row(int A) {
        if(A == 1){
            ArrayList<Integer> v2 = new ArrayList<Integer>();
            v2.add(0);
            return v2;
        }
        ArrayList<Integer> v1 = A_th_Row(A - 1);
        ArrayList<Integer> v2 = new ArrayList<Integer>();
        for(int i = 0 ; i < v1.size(); i++){
            if(v1.get(i) == 0){
                v2.add(0);
                v2.add(1);
            }
            else{
                v2.add(1);
                v2.add(0);
            }
        }
        return v2;
    }
*/


    /*public static int solve(int A, int B) {

        String str = "0";

        while(A > 1){ //A= 4
            // str = 01101001
            StringBuilder strB = new StringBuilder();
            for(int i = 0 ; i < str.length(); i++){
                if(str.charAt(i) == '0'){
                    strB.append("01");
                }else{
                    strB.append("10");
                }
            }
            str = strB.toString();
            A--;
        }

        return Integer.parseInt(String.valueOf(str.charAt(B)));
    }*/
}
