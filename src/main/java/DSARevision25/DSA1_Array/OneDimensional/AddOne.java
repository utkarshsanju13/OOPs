package DSARevision25.DSA1_Array.OneDimensional;

import java.util.ArrayList;
import java.util.List;

public class AddOne {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(
//                0,9,9
                0,3,7,6,4,0,5,5,5
//                0,5,5
        ));

        System.out.println(plusOne(arr));



    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;

        for(int i = A.size()-1; i>=0; i--){
            int tempSum = carry + A.get(i);
            carry = tempSum /10;
            if((carry!=0 || tempSum!=0))
                ans.add(0,tempSum % 10);
        }

        if(carry > 0){
            ans.add(0,carry);
        }

        return ans;
    }
}
