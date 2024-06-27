package Threading_Concurrency_Synchronization.LeetCodeProblemOnConcurrency.Leetcode1115;

public class Main {

    public static void main(String[] args) {

        int n  = 5;
        FooBar fooBar = new FooBar(n);

        Runnable printFoo = () -> System.out.print("foo");
        Runnable printBar = () -> System.out.print("bar");

        Thread threadFoo = new Thread(() -> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadBar = new Thread(() -> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        threadFoo.start();
        threadBar.start();

        // Join both threads to ensure they complete before exiting main
        try {
            threadFoo.join();
            threadBar.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
