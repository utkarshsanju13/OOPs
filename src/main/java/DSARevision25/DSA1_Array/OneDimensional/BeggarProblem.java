package DSARevision25.DSA1_Array.OneDimensional;

public class BeggarProblem {

    public static void main(String[] args) {
        int A = 5;
        int [][] arr = {
                {1,2,10},
                {2,3,20},
                {2,5,25}
        };
        int ans [] = solve(A,arr);
        for(int i = 0 ; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] solve(int A, int[][] B) {

        int [] beggar = new int [A];

        for(int i = 0 ; i < B.length; i++){
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            int amt = B[i][2];

            beggar[start] += amt;

            if(end+1 < A){
                beggar[end+1] += -amt;
            }
        }

        for(int i = 1 ; i < beggar.length; i++){
            beggar[i] = beggar[i] + beggar[i-1];
        }

        return beggar;
    }
}
