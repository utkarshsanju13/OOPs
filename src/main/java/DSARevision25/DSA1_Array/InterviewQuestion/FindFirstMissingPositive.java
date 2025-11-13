package DSARevision25.DSA1_Array.InterviewQuestion;

public class FindFirstMissingPositive {

    public static void main(String[] args) {

//        int[] arr = {2,3,1,2};
        int[] arr = {2};
//        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));

    }

    public static int firstMissingPositive(int[] A) {

        int n = A.length;

        int i = 0;
        while(i < n){
            if(A[i] > 0 && A[i] < n+1){
                if(A[i] != i+1 && A[A[i]-1] != A[i]){
                    int temp = A[A[i]-1];
                    A[A[i]-1] = A[i];
                    A[i] = temp;
                }else{
                    i++;
                }
            }else
                i++;
        }

        for(int j = 0 ; j < n; j++){
            if(A[j] != j+1){
                return j+1;
            }
        }
    return n+1;

    }
}
