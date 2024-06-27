package Threading_Concurrency_Synchronization.ProducerConsumer_Sync_Problem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Store store = new Store(5); //declare the store size as 5

        ExecutorService es = Executors.newCachedThreadPool();

        for(int i = 0 ; i<=8; i++){ //have 8 producer line
            es.execute(new Producer(store));
        }

        for(int i =0; i <= 10; i++){ //we have 10 consumer
            es.execute(new Consumer(store));
        }

    }
}
