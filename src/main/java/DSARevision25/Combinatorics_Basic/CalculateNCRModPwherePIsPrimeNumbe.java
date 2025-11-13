package DSARevision25.Combinatorics_Basic;

public class CalculateNCRModPwherePIsPrimeNumbe {

    public static void main(String[] args) {

        int A = 7269,B = 4002, C =331997;
        System.out.println(findNCRModP(A,B,C));

    }

    public static int findNCRModP(int A, int B, int C){

        /*nCR = (n! / (n-r)! * r! ) % p;
            = n! % p * ((n-r)!)^-1 * r!^-1 %p;
            use the fermet little theorem
                n^-1 % p = n^ p-2 % p ( where p is prime number)*/

        //Calculate n!, n-r! , r!
        long r = 1;
        long nr = 1;
        long n =1;
        for(int i = 1; i <= A; i++){

            n = ( n * i ) % C;

            if(A - B  == i){
                nr = n;
            }
            if( B == i){
                r = n;
            }
        }

        long val1 = fastPower((int)nr,C-2,C) %  C ;
        long val2 = fastPower((int)r,C-2,C) % C;

        long ans = ((val1 * val2) % C * n) % C;
        return (int)ans;
    }

    public static long fastPower(int A, int B, int C){

        if(B==0)
            return 1;
        long pow = fastPower(A, B/2,C);
        if(B % 2 ==0){
            return (pow * pow) % C;
        }else{
            return ((A * pow) % C * pow) %C;
        }
    }


}
