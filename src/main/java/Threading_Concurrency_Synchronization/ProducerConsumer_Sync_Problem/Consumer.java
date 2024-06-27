package Threading_Concurrency_Synchronization.ProducerConsumer_Sync_Problem;

public class Consumer implements Runnable{

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while(true){
            if(this.store.items.size() > 0){
                this.store.removeItem(); //Consuming the item if the item present
                System.out.println("Consumed item : count " + this.store.items.size());
            }
        }
    }
}
