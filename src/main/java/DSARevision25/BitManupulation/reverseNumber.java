package DSARevision25.BitManupulation;

public class reverseNumber {

    public static void main(String[] args) {

        long n = 3;
        System.out.println(reverse(n));
    }

    public static long reverse(long A) {

        long i = 0L;
        long ans = 0L;
        long s = 0;
        while(A > 0){
            if((A & 1) == 1){
                ans = ans | (1L << (31L - i));
            }
            i++;
            A = A >> 1;
        }

        return ans;


    }
}
