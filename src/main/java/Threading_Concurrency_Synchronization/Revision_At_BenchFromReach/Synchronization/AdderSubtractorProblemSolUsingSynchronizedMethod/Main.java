package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Synchronization.AdderSubtractorProblemSolUsingSynchronizedMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Adder adder = new Adder(v);

        Substractor substractor = new Substractor(v);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Void> add =   executorService.submit(adder);
        Future<Void> sub = executorService.submit(substractor);
        add.get();
        sub.get();

        System.out.println(v.getValue());
        executorService.shutdown();
    }

}
