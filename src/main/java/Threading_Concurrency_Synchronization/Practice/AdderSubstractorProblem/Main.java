package Threading_Concurrency_Synchronization.Practice.AdderSubstractorProblem;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(value,lock);
        Substractor substractor = new Substractor(value,lock);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> addFuture = es.submit(adder);
        Future<Void> substractorFuture = es.submit(substractor);

        addFuture.get();
        substractorFuture.get();

        System.out.println(value.val);

    }
}
