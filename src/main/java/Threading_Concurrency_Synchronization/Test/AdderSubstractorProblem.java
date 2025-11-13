package Threading_Concurrency_Synchronization.Test;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;
import Threading_Concurrency_Synchronization.Practice.AdderSubstractorProblem.Substractor;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Value{
    int val = 0;
}

class Adder implements Callable<Void> {
    private Value value;
    private Lock lock;

    public Adder(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        synchronized (lock){

            for(int i = 0; i < 100000; i++){
                lock.lock();
                value.val+=i;
                lock.unlock();;
            }
        }

        return null;
    }
}

class Subtractor implements Callable<Void>{
    private Value value;
    private Lock lock;

    public Subtractor(Value value, Lock lock) {
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        synchronized (lock){
            lock.lock();
            for(int i = 0; i < 100000; i++){
                value.val-=i;
            }
            lock.unlock();
        }
        return null;
    }
}

public class AdderSubstractorProblem {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(value, lock);
        Subtractor substractor = new Subtractor(value, lock);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Void> adderFuture = executorService.submit(adder);
        Future<Void> subFuture = executorService.submit(substractor);

        adderFuture.get();
        subFuture.get();

        System.out.println(value.val);
    }


}
