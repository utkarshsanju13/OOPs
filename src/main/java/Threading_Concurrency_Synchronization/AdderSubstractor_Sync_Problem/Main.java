package Threading_Concurrency_Synchronization.AdderSubstractor_Sync_Problem;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Value v = new Value();

        Adder adder = new Adder(v);
        Substractor substractor = new Substractor(v);

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adder);
        Future<Void> substractorFuture = es.submit(substractor);

        adderFuture.get();
        substractorFuture.get();

        System.out.println(v.val);
    }
}
