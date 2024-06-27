package Threading_Concurrency_Synchronization.LeetCodeProblemOnConcurrency.Leetcode1116;

import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Example value for n
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);

        // Create IntConsumer to be used with printNumber
        IntConsumer printNumber = number -> System.out.print(number);

        // Create threads for zero, even, and odd methods
        Thread threadZero = new Thread(() -> {
            try {
                zeroEvenOdd.zero(printNumber);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadEven = new Thread(() -> {
            try {
                zeroEvenOdd.even(printNumber);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadOdd = new Thread(() -> {
            try {
                zeroEvenOdd.odd(printNumber);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start all threads
        threadZero.start();
        threadEven.start();
        threadOdd.start();

        // Join all threads to ensure they complete before exiting main
        try {
            threadZero.join();
            threadEven.join();
            threadOdd.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
