package Threading_Concurrency_Synchronization.AdderSubstractor_Mutex;

import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Void> {

    private Value v;
    private Lock lock;

    public Substractor(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        //        lock.lock(); // if we use the lock here, so it will complete the whole adding task and then release the lock
        //but it will kill the concept of Concurrency, we supposed to do both task simultaneously as the lock gets free
        for(int i = 1; i <= 100000; i++){
            lock.lock(); // we lock before executing critical section : section that is using shared resource/variable
            this.v.val-=i;
            System.out.println("Subtracting "+ i);
            lock.unlock();//unlock as the task is done
        }

        return null;
    }
}
