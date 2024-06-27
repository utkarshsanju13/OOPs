package Threading_Concurrency_Synchronization.AdderSubstractor_SynchronizedKeyword;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Value v;

    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i =1; i <= 100000; i++){
            synchronized (v){ //this will create a lock on v object
                //every object has implicit lock: this will add
//                v.lock();
                this.v.val+=i;
//                v.unlock();
            }
        }
        return null;
    }
}
