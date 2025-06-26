package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach;

import Threading_Concurrency_Synchronization.ThreadPool.NumberPrinter;

class PrintNumber implements Runnable {

    int i;

    PrintNumber(int i) {
        this.i = i;
    }
    public void run() {
        System.out.println("printing i : "+ i + "Thread name : " + this);
    }
}

public class PrintOneToHundreadFromEachThread {

    public static void main(String[] args) {

        for(int i = 1;  i <=100; i++){
//            NumberPrinter np = new NumberPrinter(i);
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
        }
    }
}
