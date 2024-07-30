package Threading_Concurrency_Synchronization.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        //Created a thread pool of 10 thread only
//        ExecutorService e1 = Executors.newFixedThreadPool(10);

        ExecutorService e = Executors.newCachedThreadPool();
//        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 1; i <= 100; i++){
            NumberPrinter nmp = new NumberPrinter(i);
//            e1.execute(nmp);
            e.execute(nmp);

            /*The Difference between the Executors.newFixedThreadPool(10); and Executors.newCachedThreadPool();
            1. pool has fixed thread as 10 but cached has no limit
            2. pool do context switching between the 10 thread but in cache if there is no free thread it will
            create a new thread and execute the task*/

        }
    }
}
