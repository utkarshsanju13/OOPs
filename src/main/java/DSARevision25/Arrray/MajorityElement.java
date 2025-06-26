package DSARevision25.Arrray;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,1,2));
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(final List<Integer> A) {

        int n = A.size();
        int majorIdx = 0;
        int count = 1;

        for(int i = 1 ; i < n; i++){

            if(A.get(majorIdx) == A.get(i)){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                majorIdx = i;
                count = 1;
            }
        }

        return A.get(majorIdx);
    }
}
