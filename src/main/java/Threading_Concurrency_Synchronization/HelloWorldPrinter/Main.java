package Threading_Concurrency_Synchronization.HelloWorldPrinter;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();

        System.out.println("hello World from Main ");

        //The output order is decided by the CPU scheduler
    }
}
