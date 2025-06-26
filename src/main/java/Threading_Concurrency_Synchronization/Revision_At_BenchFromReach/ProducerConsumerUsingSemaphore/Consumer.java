package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConsumerUsingSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try{
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.getItemCount() > 0){
                    store.removeItem();
                    System.out.println(" consumed an item : count : " + store.getItemCount());
            }
            producerSemaphore.release();
        }
    }
}
