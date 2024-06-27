package Threading_Concurrency_Synchronization.ProducerConsumer_Sync_Problem;

public class Producer implements Runnable{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while(true){
            if(store.items.size() < store.maxSize){
                store.addItem(); // producing the item if maxSize is not reached
                System.out.println("Produced the item : count "+ this.store.items.size());
            }
        }
    }
}
