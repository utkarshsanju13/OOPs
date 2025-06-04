package DSARevision25.Arrray;

public class ArrayRotation {


    public static void main(String[] args) {

        int A[] = {1,1,4,9,4,7,1};
        int B = 9;

        A = solve(A,B);
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }

    public static int[] solve(int[] A, int B) {

        B = B % A.length;
        reverse(A,0,B-1);
        reverse(A,B,A.length-1);
        reverse(A,0,A.length-1);

        return A;

    }

    public static int[] reverse(int[] A, int B, int C) {

        int start = B;
        int end = C;

        while(start < end){
            int temp = A[start];
            A[start]  = A[end];
            A[end] = temp;
            start++;
            end--;
        }

        return A;
    }

}
