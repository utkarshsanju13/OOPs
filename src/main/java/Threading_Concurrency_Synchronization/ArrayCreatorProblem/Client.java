package Threading_Concurrency_Synchronization.ArrayCreatorProblem;
//Write code to achieve the following
//A class Client with a main method.
//Create a class ArrayCreator which takes as input a number (n)
//ArrayCreator should create an ArrayList which should contain numbers from 1 to n
//ArrayCreator should implement appropriate Callable interface and return the arraylist discussed above to calling thread
//Client class should invoke ArrayCreator over a new thread and get the arraylist from ArrayCreator class and print it.

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayCreator arrayCreator = new ArrayCreator(n);

        ExecutorService es = Executors.newCachedThreadPool(); //Created a thread pool
        Future<List<Integer>> list = es.submit(arrayCreator);   //Future is like bucket that stores the return data and rest code is executed

        List<Integer> ans = list.get(); //this get method ensure that list has return value by es.submit() function
        //final returned result is stored in ans list
        System.out.println(ans);
    }
}
