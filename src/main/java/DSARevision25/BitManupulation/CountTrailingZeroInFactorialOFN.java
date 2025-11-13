package DSARevision25.BitManupulation;

public class CountTrailingZeroInFactorialOFN {

    public static void main(String[] args) {
        int A = 251;
        System.out.println(findtrailingZero(A));
    }

    public static int findtrailingZero(int n){

        int count = 0;

        //In a factorial of n
//        1 2 3 4 5 6 7 8 9 10 11.....25.....125....n
//        The 0 is at trailing in the product , we must have 2 and 5 as a pair
        //One observation is that we have no's of 2's is greater than no of 5's
        //If we count the number of 5's in the factorial product
//        we can get the total trailing 0's
//        But one catch is that.  some number which has 2 5's
//            Eg - 25 has 2 5's. we have to count that other 5 as well
//            and some have 3 5's -> 125 = 5 * 5 * 5
//            SO if we divide n/5 -> we will get all the number 5 one time
//                n/25 -> we will count the number of 5 in which there are 2 5's
//                similar for 125 -> we will get the count which has 3 5's

        for(int i = 5 ; i <=n; i= i*5){
            count += n/i; // i = 5 -> n/5, i = 25 = n/25....
        }
        return count;
    }
}
