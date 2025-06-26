package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.MergeSortUsingMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortFunction implements Callable<List<Integer>> {
    List<Integer> list;

    MergeSortFunction(List<Integer> list) {
        this.list = list;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(list.size() <= 1)
            return list;

        int mid = list.size() / 2;
        ArrayList<Integer> leftList = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> rightList = new ArrayList<>(list.subList(mid, list.size()));

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<List<Integer>> mergedleftList = executor.submit(new MergeSortFunction(leftList));
        Future<List<Integer>> mergedrightList = executor.submit(new MergeSortFunction(rightList));

        ArrayList<Integer> sortedList = new ArrayList<>();

        List<Integer> leftLisToBemerged = mergedleftList.get();
        List<Integer> rightLisToBemerged = mergedrightList.get();

        int n1 = leftLisToBemerged.size();
        int n2 = rightLisToBemerged.size();
        int i =0,j=0;
        while(i < n1 && j < n2){
            if(leftLisToBemerged.get(i) <= rightLisToBemerged.get(j)){
                sortedList.add(leftLisToBemerged.get(i));
                i++;
            }else{
                sortedList.add(rightLisToBemerged.get(j));
                j++;
            }
        }

        while(i < n1){
            sortedList.add(leftLisToBemerged.get(i));
            i++;
        }

        while(j < n2){
            sortedList.add(rightLisToBemerged.get(j));
            j++;
        }

        return sortedList;
    }
}
