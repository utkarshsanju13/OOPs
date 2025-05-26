package Threading_Concurrency_Synchronization.DeadLock;

public class DeadlockExample {
    public static void main(String[] args) {

        String lock1 = "Lock1";
        String lock2 = "Lock2";

        Thread t1 = new Thread(()-> {
            System.out.println("Thread t1 : Acquired lock1");
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread t1 : waiting to acquire lock2");
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread t2 = new Thread(()-> {
            System.out.println("Thread t2 : Acquired lock2");
            synchronized (lock2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread t2 : waiting to acquire lock1");
            synchronized (lock1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();

    }
}
