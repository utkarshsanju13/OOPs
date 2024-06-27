package Threading_Concurrency_Synchronization.AdderSubstractor_Mutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Value v = new Value();
        Lock lock = new ReentrantLock(); // we created a lock (mutex lock)
//         we have use the ReentrantLock because it allows to give the same lock to same thread again and again

        Adder adder = new Adder(v,lock); // pass that common lock instance to Adder
        Substractor substractor = new Substractor(v,lock); //pass the same lock instance to Subtractor

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adder);
        Future<Void> substractorFuture = es.submit(substractor);

        adderFuture.get();
        substractorFuture.get();

        System.out.println(v.val);
    }
}
