package DSARevision25.BasicRecursion;

//print nth fibonacci number
public class Fibonacci {

    public static void main(String[] args) {
        //0 1 1 2 3 5 8
        int n = 5;

        System.out.println(findFibonacci(n));

    }

    public static int findFibonacci(int n){

        if(n == 1)
            return 0;
        if(n == 2)
            return 1;

        return findFibonacci(n-2) + findFibonacci(n-1);
    }
}
