package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConcumerProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(5);

        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

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
