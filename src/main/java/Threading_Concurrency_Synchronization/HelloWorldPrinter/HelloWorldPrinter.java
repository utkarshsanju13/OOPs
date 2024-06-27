package Threading_Concurrency_Synchronization.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("hello World from HelloWorldPrinter");
        doSomething();
    }

    public void doSomething(){
        System.out.println("Hello world from doSomething");
    }
}
