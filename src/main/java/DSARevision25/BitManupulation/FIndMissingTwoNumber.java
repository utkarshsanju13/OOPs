package DSARevision25.BitManupulation;

import java.util.Arrays;

public class FIndMissingTwoNumber {

    public static void main(String[] args) {

        int [] arr = {186, 256, 102, 377, 186, 377};
//                {3,2,4};
//                {4,5,2,9,3,7,8,11,10};

        int [] result = solve(arr);

    }

    public static int[] solve(int[] A) {

        int n = A.length;
        int xor = 0;

        for(int i = 0 ; i < n ; i++){
            xor ^= A[i];
        }

        for(int i = 1; i <=n+2; i++){
            xor^=i;
        }

        int right_most_set_bit = 0;

        for(int i = 0; i < 32; i++){
            if((xor & (1<<i)) > 0){
                right_most_set_bit = i;
                break;
            }
        }

        int num1 = 0;
        int num2 = 0;

        for(int i = 0 ; i < n; i++){

            if((A[i] & (1 << right_most_set_bit)) > 0){
                num1^=A[i];
            }else{
                num2^=A[i];
            }
        }

        for(int i = 1 ; i <=n+2; i++){

            if((i & (1 << right_most_set_bit)) > 0){
                num1^=i;
            }else{
                num2^=i;
            }
        }

        int Arr[]=new int[2];
        Arr[0]=num1;
        Arr[1]=num2;
        Arrays.sort(Arr);
        return Arr;
    }


}
