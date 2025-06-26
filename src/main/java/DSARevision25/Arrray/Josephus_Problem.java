package DSARevision25.Arrray;

public class Josephus_Problem {

    public static void main(String[] args) {

        int n = 100;
        System.out.println(josephus_Problem(n));
    }

    public  static int josephus_Problem(int n){

        int nearestTwoPower = (int)Math.floor(Math.log((double) n)/Math.log(2));
        int kills = (int) (n - Math.pow(2,(double) nearestTwoPower));
        return 1 + 2*kills;
    }

}
