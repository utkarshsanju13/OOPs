package Threading_Concurrency_Synchronization.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumber implements Runnable{
    private  int i;

    public PrintNumber(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i+ " " + Thread.currentThread());
    }
}
public class Main {

    public static void main(String[] args) {

//        for(int i = 0 ; i < 100; i++){
//            int num = i;
//            Thread t1 = new Thread(()->
//                    System.out.println(num));
//            t1.start();
//        }

//        for(int i = 0; i < 100; i++){
//            Thread t1 = new Thread(new PrintNumber(i));
//            t1.start();
//        }

        //Join function
//        Thread t2 = new Thread(()->
//                System.out.println("Thread t2 is executing...." + Thread.currentThread()));
//
//        t2.start();
//
//        try{
//            t2.join();
//        }catch(InterruptedException e){
//            System.out.println(e);
//        }
//
//        System.out.println("Thread has finished executing " + Thread.currentThread());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 100; i++){
            executorService.execute(new PrintNumber(i));

        }
        executorService.shutdown();
    }

}
