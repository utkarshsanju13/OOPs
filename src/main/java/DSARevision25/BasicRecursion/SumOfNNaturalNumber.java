package DSARevision25.BasicRecursion;

public class SumOfNNaturalNumber {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(sumOFn(n));

    }

    public static int sumOFn(int n){

        if(n == 1)
            return 1;
        return sumOFn(n-1) + n;
    }
}
