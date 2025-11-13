package DSARevision25.PrimeNumbeDSA1;

public class NumberOfOpenDoor {

    public static void main(String[] args) {
        int A = 10;
        System.out.println(solve(A));
    }

    public static int solve(int A) {

        boolean [] doors = new boolean[A+1];
        int count = 0;
        for(int i = 1; i <=A; i++){
            for(int j = i; j <=A; j = j + i){
                doors[j] = !doors[j];
            }
        }

        for(int i = 0 ; i <=A; i++){
            System.out.println(i + " th door is " + doors[i] + " ");
            if(doors[i])
                count++;
        }

        return count;


    }
}
