package Threading_Concurrency_Synchronization.ProducerConsumerProblem_SolvedUSingSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore consumerSema;
    private Semaphore producerSema;

    public Consumer(Store store,Semaphore producerSema,Semaphore consumerSema ) {
        this.store = store;
        this.consumerSema = consumerSema;
        this.producerSema = producerSema;
    }

    @Override
    public void run() {
        while(true){
            try {
                consumerSema.acquire();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if(this.store.items.size() > 0){ //We can remove this condition as it is handled by semaphore itself
                this.store.removeItem(); //Consuming the item if the item present
                System.out.println("Consumed item : count " + this.store.items.size());
//            }
            producerSema.release();
        }
    }
}
