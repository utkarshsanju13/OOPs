package DSARevision25;

public class fastPower {

    public static void main(String[] args) {

        int A = 2, B= 8, C = 108;
        System.out.println(fastPower(A,B,C));
        System.out.println(fastPowerwithoutmod(A,B));

    }

    public static long fastPower(int A,int B,int C){
        if (B==0) return 1;
        long pow=fastPower(A,B/2,C)%C;
        if (B%2==0)
            return (pow*pow)%C;
        else
            return ( (A*pow)%C * pow )%C;
    }

    public static long fastPowerwithoutmod(int A,int B){
        if (B==0) return 1;
        long pow=fastPowerwithoutmod(A,B/2);
        if (B%2==0)
            return (pow*pow);
        else
            return ( (A*pow) * pow );
    }


}
