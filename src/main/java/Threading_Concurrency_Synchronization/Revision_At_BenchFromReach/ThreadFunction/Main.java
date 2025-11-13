package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ThreadFunction;



public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Thread t1 = new Thread(()->{
            System.out.println("Thread 1 Running");
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.sleep(500);
//        t1.join();

        System.out.println(t1.getPriority());
        System.out.println(main.getPriority());
        System.out.println("printing from main thread");

    }
}
