package Threading_Concurrency_Synchronization.ProducerConsumerProblem_SolvedUsingSynchronizedKEyword;

public class Producer implements Runnable{
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while(true){
//            if(store.items.size() < store.maxSize){
//                store.addItem();
//                System.out.println("Produced the item : count "+ this.store.items.size());
//            }

            //above statement raise to problem of concurrency

            synchronized (store){
                if(store.items.size() < store.maxSize){
                    store.addItem();
                    System.out.println("Produced the item : count "+ this.store.items.size());
                }
            }
        }
    }
}
