package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConcumerProblem;

public class Consumer implements Runnable {

    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if(store.getItemCount() > 0){
                    store.removeItem();
                    System.out.println(" consumed an item : count : " + store.getItemCount());
                }
            }

        }
    }
}
