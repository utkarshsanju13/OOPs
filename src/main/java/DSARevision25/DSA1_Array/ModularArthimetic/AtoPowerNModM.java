package DSARevision25.DSA1_Array.ModularArthimetic;

public class AtoPowerNModM {

    public static void main(String[] args) {
        int a = 2,n = 5, m = 1000000007;
        System.out.println(findApowerNmodN(a,n,m));
        System.out.println(recursiveFindPower(a,n,m));
        System.out.println(recursivelogN(a,n,m));
    }

    //optimize to TC =logn
    public static int recursivelogN(int a, int n, int m){
        if(n == 0){
            return 1;
        }

        long pow = recursivelogN(a,n/2,m);
        long ans =0;
        if(n %2 == 0){
            ans = (pow * pow) % m;
        }else {
            ans = ((a * pow) % m * pow) % m;
        }
        return (int)ans;
    }
    //Recursive
    public static int recursiveFindPower(int a, int n, int m){
        if( n == 0)
            return 1;

        int  rr = recursiveFindPower(a, n-1,m);
        long ans = (a * (long)rr) % m;
        return (int)ans;
    }
    //Iteartive
    public static int findApowerNmodN(int a, int n, int m){

        long ans = 1;
        for(int i = 0 ; i < n; i++){

            ans = (ans * a) % m;
        }
        return (int) ans;
    }
}
