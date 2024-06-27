package Threading_Concurrency_Synchronization.ArrayCreatorProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    public int n;

    public ArrayCreator(int n) {
        this.n = n;
    }
    @Override
    public List<Integer> call() throws Exception {

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        return list;
    }
}
