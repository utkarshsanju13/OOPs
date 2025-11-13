package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConcumerProblem;

public class Producer implements Runnable {

    Store store;

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while(true){
            synchronized (store) {
                if(store.getItemCount() < store.maxSize){
                    store.addItem(1);
                    System.out.println("Produced an item : count " + store.getItemCount());
                }
            }

        }
    }
}
