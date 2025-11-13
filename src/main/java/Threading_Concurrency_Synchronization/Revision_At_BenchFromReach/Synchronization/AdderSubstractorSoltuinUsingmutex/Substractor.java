package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Synchronization.AdderSubstractorSoltuinUsingmutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Void> {

    Value v;
    Lock lock;

    Substractor(Value v,Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0; i<10000; i++) {
            lock.lock();
            this.v.value -= i;
            lock.unlock();
        }

        
        return null;
    }
}
