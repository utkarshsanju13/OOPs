package Threading_Concurrency_Synchronization.LeetCodeProblemOnConcurrency.Leetcode1195;

import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        int n = 15; // Example value for n
        FizzBuzz fizzBuzz = new FizzBuzz(n);

        // Define the printFizz, printBuzz, printFizzBuzz, and printNumber runnables
        Runnable printFizz = () -> System.out.print("fizz ");
        Runnable printBuzz = () -> System.out.print("buzz ");
        Runnable printFizzBuzz = () -> System.out.print("fizzbuzz ");
        IntConsumer printNumber = number -> System.out.print(number + " ");

        // Create threads for fizz, buzz, fizzbuzz, and number methods
        Thread threadFizz = new Thread(() -> {
            try {
                fizzBuzz.fizz(printFizz);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadBuzz = new Thread(() -> {
            try {
                fizzBuzz.buzz(printBuzz);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadFizzBuzz = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(printFizzBuzz);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadNumber = new Thread(() -> {
            try {
                fizzBuzz.number(printNumber);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start all threads
        threadFizz.start();
        threadBuzz.start();
        threadFizzBuzz.start();
        threadNumber.start();

        // Join all threads to ensure they complete before exiting main
        try {
            threadFizz.join();
            threadBuzz.join();
            threadFizzBuzz.join();
            threadNumber.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

