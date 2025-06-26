package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConsumerUsingSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Producer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {

        while(true){

            try{
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.getItemCount() < store.maxSize) {
                    store.addItem(1);
                    System.out.println("Produced an item : count " + store.getItemCount());
            }
            consumerSemaphore.release();

        }
    }
}
