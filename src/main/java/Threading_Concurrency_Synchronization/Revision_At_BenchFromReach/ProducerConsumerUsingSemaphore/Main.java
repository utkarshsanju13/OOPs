package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConsumerUsingSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(5);

        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer producer = new Producer(store,producerSemaphore,consumerSemaphore);
        Consumer consumer = new Consumer(store,producerSemaphore,consumerSemaphore);

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0 ;  i < 8; i++){
            executorService.submit(producer);
        }

        for(int i = 0 ;  i < 5; i++){
            executorService.submit(consumer);
        }
        executorService.shutdown();
    }
}
