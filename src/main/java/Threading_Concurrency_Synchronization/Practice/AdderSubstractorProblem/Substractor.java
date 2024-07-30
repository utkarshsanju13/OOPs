package Threading_Concurrency_Synchronization.Practice.AdderSubstractorProblem;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Substractor implements Callable<Void> {

    Value value;
    Lock lock;

    public Substractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i = 0; i < 100000; i++){
//            lock.lock();
            synchronized (value){
                this.value.val -=i;
            }
//            this.value.val -=i;
//            this.value.decrement(i);
//            System.out.println("Substracting " + i + "in " + value.val);
//            lock.unlock();
        }


        return null;
    }
}
