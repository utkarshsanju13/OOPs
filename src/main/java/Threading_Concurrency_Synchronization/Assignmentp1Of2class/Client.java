package Threading_Concurrency_Synchronization.Assignmentp1Of2class;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Adder adder = new Adder(a,b);
        ScalerThread sc1 = new ScalerThread(adder);
        sc1.start();

    }
}
