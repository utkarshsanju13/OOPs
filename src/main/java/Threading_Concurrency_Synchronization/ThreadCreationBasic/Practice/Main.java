package Threading_Concurrency_Synchronization.ThreadCreationBasic.Practice;

public class Main {

    public static void main(String[] args) {
        Runnable r1 = new Employee();
        Thread t1 = new Thread(r1);

        t1.start();
    }
}
