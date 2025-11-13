package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.MergeSortUsingMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,12,32,11,4,16,3,2,78,54));

        ExecutorService exec = Executors.newCachedThreadPool();

        Future<List<Integer>> res = exec.submit(new MergeSortFunction(arr));

        List<Integer> resulteget = res.get();

        System.out.println(resulteget);

    }
}
