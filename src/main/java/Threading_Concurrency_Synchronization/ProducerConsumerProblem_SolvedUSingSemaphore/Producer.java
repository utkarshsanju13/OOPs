package Threading_Concurrency_Synchronization.ProducerConsumerProblem_SolvedUSingSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore producereSema;
    private Semaphore consumerSema;

    public Producer(Store store,Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.producereSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {

        while(true){
            try {
                producereSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if(store.items.size() < store.maxSize){ //Semaphore handles it
                store.addItem(); // producing the item if maxSize is not reached
                System.out.println("Produced the item : count "+ this.store.items.size());
//            }
            consumerSema.release();
        }
    }
}
