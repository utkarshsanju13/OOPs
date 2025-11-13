package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AntiDiagonalTraversal {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        diagonal(arr);
    }

    public static void diagonal(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = A.size();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            int temp_row = 0;
            int temp_col = i;

            while(temp_row < n && temp_row > -1 && temp_col > -1 && temp_col < n){
                temp.add(A.get(temp_row).get(temp_col));
                temp_row++;
                temp_col--;
            }
             ans.add(temp);
        }

        for(int  i = 1; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            int temp_row = i;
            int temp_col = n-1;

            while(temp_row < n && temp_row > -1 && temp_col > -1 && temp_col < n){
                temp.add(A.get(temp_row).get(temp_col));
                temp_row++;
                temp_col--;
            }
            ans.add(temp);
//            temp.get()
        }

        for(int i = 0 ; i < ans.size(); i++){
            ArrayList<Integer> temp = ans.get(i);
            int tempSize = temp.size();

            if(tempSize <= n){
                while(tempSize <= n){
                    temp.add(0);
                    tempSize++;
                }
            }
        }


    }
}
