package Threading_Concurrency_Synchronization.NumberPrint;

public class Main {

    public static void main(String[] args) {


        //Question is that Print 1 t0 100 by separate 100 thread
        for(int i = 1; i <= 100; i++){
            NumberPrinter nmp = new NumberPrinter(i);
            Thread t = new Thread(nmp);
            t.start();
        }
    }
}
