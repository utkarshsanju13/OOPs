package Threading_Concurrency_Synchronization.SemaphoreExample;

import java.util.concurrent.Semaphore;

//public class Main {
//    public static void main(String[] args) {
//        SharedResource sharedResource1 = new SharedResource();
//        SharedResource sharedResource2 = new SharedResource();
//
//        Semaphore semaphorep = new Semaphore(1);
//        Semaphore semaphorec = new Semaphore(1);
//
//        // Example threads using the shared resource
////        Thread producerThread1 = new Thread(() -> sharedResource1.producer(semaphorep,semaphorec));
////        Thread consumerThread1 = new Thread(() -> sharedResource1.consumer(semaphorep,semaphorec));
//
//        Thread producerThread1 = new Thread(() -> sharedResource1.producer(semaphorep,semaphorec));
//        Thread consumerThread1 = new Thread(() -> sharedResource1.consumer(semaphorep,semaphorec));
//
//        producerThread1.start();
//        consumerThread1.start();
//    }
//}

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        //SharedResource sharedResource2 = new SharedResource();

        Semaphore semaphore = new Semaphore(1);

        // Example threads using the shared resource
        Thread producerThread1 = new Thread(() -> sharedResource1.producer(semaphore));
        Thread producerThread2 = new Thread(() -> sharedResource1.producer(semaphore));

        producerThread1.start();
        producerThread2.start();

    }
}

