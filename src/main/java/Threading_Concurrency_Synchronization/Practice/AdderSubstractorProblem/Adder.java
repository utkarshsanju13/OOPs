package Threading_Concurrency_Synchronization.Practice.AdderSubstractorProblem;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Value value;
    Lock lock;

    public Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i = 0; i < 100000; i++){
//            lock.lock();
            synchronized (value){
                this.value.val +=i;
            }
//            this.value.val +=i;
//            this.value.increment(i);
//            System.out.println("Adding " + i + "in " + value.val);
//            lock.unlock();
        }


        return null;
    }
}
