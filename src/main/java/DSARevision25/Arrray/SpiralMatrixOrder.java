package DSARevision25.Arrray;

public class SpiralMatrixOrder {

    public static void main(String[] args) {

        int n = 5;

        int[][] matrix = generateMatrix(n);

    }

    public static int[][] generateMatrix(int B) {

        int n = B;
        int pointer = 0;
        int [][] A = new int [n][n];

        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = n-1;

        while(pointer< n*n){

            for(int i = col_start; i <= col_end; i++){
                A[row_start][i] = ++pointer;
            }
            row_start++;

            for(int i = row_start; i <= row_end; i++){
                A[i][col_end] = ++pointer;
            }
            col_end--;

            for(int i = col_end; i>=col_start; i--){
                A[row_end][i] = ++pointer;
            }
            row_end--;

            for(int i = row_end; i>= row_start; i--){
                A[i][col_start] = ++pointer;
            }

            col_start++;
        }

        return A;
    }
}
