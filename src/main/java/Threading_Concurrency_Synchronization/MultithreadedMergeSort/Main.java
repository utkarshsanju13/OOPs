package Threading_Concurrency_Synchronization.MultithreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Integer> arrayToSort = List.of(
                8,4,5,1,7,3,6,0
        );

        //If you want to run the sorted from main thread only
//        Sorter sorter = new Sorter(arrayToSort);
//        List<Integer> ans = sorter.call();

        //If you want to run the sorter from another thread
        ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedList = es.submit(new Sorter(arrayToSort));  //call the executor to implement the call on arrayToSort array

        List<Integer> ans = sortedList.get();

        for(Integer num : ans){
            System.out.println(num);
        }


    }
}
