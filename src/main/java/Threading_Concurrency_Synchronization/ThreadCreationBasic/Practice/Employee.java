package Threading_Concurrency_Synchronization.ThreadCreationBasic.Practice;

public class Employee implements Runnable{
    @Override
    public void run() {
        System.out.println("run method of employee class");
    }
}
