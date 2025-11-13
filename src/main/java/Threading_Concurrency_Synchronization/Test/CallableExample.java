package Threading_Concurrency_Synchronization.Test;

import OOps_3_Inheritance_Polymorphism.Abstraction.A;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class ArrayCreater implements Callable<List<Integer>>{

    private int n;

    public ArrayCreater(int n) {
        this.n = n;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            list.add(i);
        }
        return list;
    }
}

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayCreater arrayCreater = new ArrayCreater(100);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<List<Integer>> res = executorService.submit(arrayCreater);
        List<Integer> finalResult = res.get();

        System.out.println(finalResult);

    }
}
