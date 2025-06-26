package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.List;

public class GoodSubarrayEasy {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(3,12,11,11,11,15));
        System.out.println(solve(arr,12));


    }

    public static int solve(ArrayList<Integer> A, int B) {

        int n = A.size();
        int count = 0;
        for(int i = 0; i < n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            int sum = 0;
            for(int j = i; j < n; j++){
                temp.add(A.get(j));
                sum+=A.get(j);
                if(temp.size() %2 == 0 && sum < B){
                    count++;
                    System.out.println("Even ");
                    GoodSubarrayEasy.print(temp);
                }else if(temp.size() %2 != 0 && sum > B){
                    count++;
                    System.out.println("Odd ");
                            GoodSubarrayEasy.print(temp);
                }
            }
        }
        return count;
    }

    public static void print(ArrayList<Integer> A){

        for(int i = 0; i < A.size(); i++){
            System.out.print(A.get(i) + " ");
        }
        System.out.println();
    }

}
