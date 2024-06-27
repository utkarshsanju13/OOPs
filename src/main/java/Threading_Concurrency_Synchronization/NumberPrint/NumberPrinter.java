package Threading_Concurrency_Synchronization.NumberPrint;

public class NumberPrinter implements  Runnable{

    int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i+ " thread: strated with "+ Thread.currentThread().getName());

    }
}
