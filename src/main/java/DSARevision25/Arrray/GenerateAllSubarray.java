package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubarray {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5));

        ArrayList<ArrayList<Integer>> ans = solve(arr);
        for(int i=0; i<ans.size(); i++){
            for(int j=0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        int n = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            ArrayList<Integer> subarray = new ArrayList<>();
            for(int j = i; j < n; j++){
                subarray.add(A.get(j));
                ans.add(new ArrayList<>(subarray));
            }
        }

        return ans;
    }
}
