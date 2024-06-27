package Threading_Concurrency_Synchronization.Assignmentp4;

public class Client {

    public static void main(String[] args) {

        System.out.println("I am the main class");
        Adder adder = new Adder();
        ScalerThread sc1 = new ScalerThread(adder);
        sc1.start();

        Subtractor subtractor = new Subtractor();
        ScalerThread sc2 = new ScalerThread(subtractor);
        sc2.start();
    }
}
