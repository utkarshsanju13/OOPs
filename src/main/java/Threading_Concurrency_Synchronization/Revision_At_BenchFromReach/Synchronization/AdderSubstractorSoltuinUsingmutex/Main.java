package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Synchronization.AdderSubstractorSoltuinUsingmutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(v,lock);

        Substractor substractor = new Substractor(v,lock);

        ExecutorService executorService = Executors.newCachedThreadPool();

      Future<Void> add =   executorService.submit(adder);
        Future<Void> sub = executorService.submit(substractor);
        add.get();
        sub.get();

        System.out.println(v.value);
        executorService.shutdown();
    }

}
