package Threading_Concurrency_Synchronization.ThreadCreationBasic;

public class MainForRunnableThread {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new RunnableThread());
        t.start();
        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Hello from main");
        //interrupt the t thread execution in between
        //And starts the other thread to execute
//        t.interrupt();

        Runnable r = ()->{
            System.out.println("Lambda thread running");
        };

        Thread t2 = new Thread(r);

        t2.start();
    }
}
