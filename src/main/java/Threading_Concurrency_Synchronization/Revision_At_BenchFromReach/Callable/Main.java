package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Callable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class ArrayCreated implements Callable<List<Integer>>{
    int n;

    ArrayCreated(int n){
        this.n = n;
    }

    @Override
    public List<Integer> call() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(i);
        }
        return list;
    }
}
public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<10; i++){

            Future<List<Integer>> res = executor.submit(new ArrayCreated(i));
            List<Integer> listRes = res.get();
            list.add(listRes);
        }

        System.out.println(list.toString());
        executor.shutdown();

    }
}
