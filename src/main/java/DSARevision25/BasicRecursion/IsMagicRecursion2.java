package DSARevision25.BasicRecursion;

public class IsMagicRecursion2 {

    public static void main(String[] args) {
        int A = 8355;

        System.out.println(solve(A));
    }

    public static int solve(int A) {

        boolean result = false;

        return calculateSumOfAllDigit(A) ? 1 : 0;
    }

    public static boolean calculateSumOfAllDigit(int n){

        if(n == 1)
            return true;
        if(n/10 == 0){
            return false;
        }


        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum+=digit;
            n = n/10;
        }

        return calculateSumOfAllDigit(sum);
    }
}
