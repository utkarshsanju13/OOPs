package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World from thread class");
        doSomething();

    }

    public void doSomething() {
        System.out.println("Hello World from doSomething");
    }

    public static void main(String[] args) {

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
        System.out.println("Hello World from main thread");
    }
}
