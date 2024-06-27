package Threading_Concurrency_Synchronization.AdderSubtractor_AtomicDatatype;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> esAdder = es.submit(new Adder(v));
        Future<Void> esSubstractor = es.submit(new Subtractor(v));
        esAdder.get();
        esSubstractor.get();

        System.out.println(v.atomicInteger.get());
    }
}
