package Threading_Concurrency_Synchronization.ProducerConsumerProblem_SolvedUsingSynchronizedKEyword;

public class Consumer implements Runnable{

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

        while(true){
//            if(this.store.items.size() > 0){
//                this.store.removeItem();
//                System.out.println("Consumed item : count " + this.store.items.size());
//            }
            //Above statement lead to the concurrency problem
            synchronized (store){
                if(!this.store.items.isEmpty()){
                    this.store.removeItem();
                    System.out.println("Consumed item : count " + this.store.items.size());
                }
            }
        }
    }
}
