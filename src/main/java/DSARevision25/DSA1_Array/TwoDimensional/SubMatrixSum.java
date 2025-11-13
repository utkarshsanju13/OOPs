package DSARevision25.DSA1_Array.TwoDimensional;

import java.util.ArrayList;
import java.util.List;

public class SubMatrixSum {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of(1,2,3)),
                        new ArrayList<>(List.of(4,5,6)),
                        new ArrayList<>(List.of(7,8,9))
                )
        );

        ArrayList<Integer> B = new ArrayList<>(List.of(1,2));
        ArrayList<Integer> C = new ArrayList<>(List.of(1,2));
        ArrayList<Integer> D = new ArrayList<>(List.of(2,3));
        ArrayList<Integer> E = new ArrayList<>(List.of(2,3));

        System.out.println(solve(A,B,C,D,E));
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {

        int n = A.size();
        int m = A.get(0).size();
        ArrayList<ArrayList<Integer>> prefixSum = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();


        for(int i = 0; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(A.get(i).get(0));
            for(int j = 1; j < m; j++){
                temp.add(temp.get(j-1) + A.get(i).get(j));
            }
            prefixSum.add(temp);
        }

        for(int j = 0; j < m; j++){

            for(int i = 1; i< n; i++){
                int prevValue = prefixSum.get(i-1).get(j);
                int newValue = prefixSum.get(i).get(j) + prevValue;

                prefixSum.get(i).set(j,newValue);
            }
        }


        for(int i = 0 ; i < B.size(); i++){
            int tlx = B.get(i)-1;
            int tly = C.get(i)-1;
            int brx = D.get(i)-1;
            int bry = E.get(i)-1;



            int sum = prefixSum.get(brx).get(bry);
            if(tly > 0){
                sum -= prefixSum.get(brx).get(tly-1);
            }

            if(tlx > 0){
                sum -=  prefixSum.get(tlx -1).get(bry);
            }

            if(tlx > 0 && tly > 0){
                sum += prefixSum.get(tlx-1).get(tly - 1);
            }

            ans.add(sum);

        }

        return ans;


    }
}
