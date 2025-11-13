package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ThreadCreation;

class NewThread extends Thread{

    public void run(){
        System.out.println("Hi from new Thread");
    }
}
public class UsingThread {

    public static void main(String[] args) {
        Thread t1 = new NewThread();
//        t1.run();
        t1.start();
        t1.start();

        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Hi from Runnable");
            }
        };

        Thread t2 = new Thread(r1);
        t2.start();
        t2.start(); //throw IllegalThreadStateException
    }
}
