package DSARevision25.BasicRecursion;

public class Print1ToN {
    public static void main(String[] args) {
        int n = 10;
        solve(n,n);
    }

    public static void solve(int A,int n) {

        if(A == 0){
            return;
        }

        solve(A-1,n);
        if(A == n){
            System.out.print(A);
            System.out.println();
        }else{
            System.out.print(A + " ");
        }


    }
}
