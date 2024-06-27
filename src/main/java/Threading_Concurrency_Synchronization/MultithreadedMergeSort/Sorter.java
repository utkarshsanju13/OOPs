package Threading_Concurrency_Synchronization.MultithreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;

    public Sorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(arrayToSort.size() <= 1){  //Base condition
            return arrayToSort;
        }

        //Created two left and right array
        int mid = arrayToSort.size()/2;

        List<Integer> leftarrayToSort = new ArrayList<>();
        List<Integer> rightarrayToSort = new ArrayList<>();

        for(int i = 0; i < mid; i++){
            leftarrayToSort.add(arrayToSort.get(i));
        }

        for(int i = mid; i < arrayToSort.size(); i++){
            rightarrayToSort.add(arrayToSort.get(i));
        }

//        Creating a pool to run of leftArray To sort and right Array to sort
        ExecutorService es = Executors.newCachedThreadPool();

        //Calling the same callable from executors
        Future<List<Integer>> leftArray = es.submit(new Sorter(leftarrayToSort)); //Store in future as, its a bucket in which the resulted array
        // should store and this will not hamper the call of next line code.
        // But if we do List<Integer> to store it will only runs the next line if and only if the List<Integer is build
        Future<List<Integer>> rightArray = es.submit(new Sorter(rightarrayToSort));


        List<Integer> leftArrayToMerge = leftArray.get();//this will only run the next line if the List is build
        List<Integer> rightArrayToMerge = rightArray.get();

        //Logic to merge two sorted array
        int i = 0;
        int j = 0;
        List<Integer> sorted = new ArrayList<>();

        while( i < leftArrayToMerge.size() && j < rightArrayToMerge.size()){

            if(leftArrayToMerge.get(i) <= rightArrayToMerge.get(j)){
                sorted.add(leftArrayToMerge.get(i));
                i++;
            }else{
                sorted.add(rightArrayToMerge.get(j));
                j++;
            }
        }

        while(i < leftArrayToMerge.size()){
            sorted.add(leftArrayToMerge.get(i));
            i++;
        }

        while(j < rightArrayToMerge.size()){
            sorted.add(rightArrayToMerge.get(j));
            j++;
        }

        return  sorted;
    }
}
