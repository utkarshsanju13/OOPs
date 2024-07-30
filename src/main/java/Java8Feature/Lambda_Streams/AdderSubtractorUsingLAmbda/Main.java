package Java8Feature.Lambda_Streams.AdderSubtractorUsingLAmbda;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Value v = new Value();
        Lock l = new ReentrantLock();

//        Adder adder = new Adder(v);
//        Substractor substractor = new Substractor(v);

        //Declared Adder Lambda Using Lambda Expression
        //What this la
        Callable<Void> adderLambda = ()-> {
            for(int i =1; i <= 100000; i++){
                l.lock(); //We can use lock as the scope of l lock is available here
                v.val+=i;  //Similarly we can use v value as the scope is available here
                l.unlock();
            }
            return null;
        };
        //BTS:
//        1. Create a anonymous Subtractorlambda class
//        2. It implements the interface Callable<Void>
//        3. It will pass all the variable being shared in current class scope to subtractorLambda class
//        4. it will copy the code inside lambda body into the interface method of that class
        Callable<Void> subtractorLambda = ()-> {
            for(int i =1; i <= 100000; i++){
                l.lock();
                v.val-=i;
                l.unlock();
            }
            return null;
        };


        ExecutorService es = Executors.newCachedThreadPool();
        Future<Void> adderFuture = es.submit(adderLambda); //We can pass adderLambda
        Future<Void> substractorFuture = es.submit(subtractorLambda);

        adderFuture.get();
        substractorFuture.get();

        System.out.println(v.val);

//        StringBuilder
//        AtomicInteger
//        Consumer<Integer>
//        Semaphore
    }
}
