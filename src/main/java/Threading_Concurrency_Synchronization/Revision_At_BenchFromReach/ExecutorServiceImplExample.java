package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumberGiven implements Runnable{
    int i ;

    PrintNumberGiven(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("Prinitng number "+i);
    }
}
public class ExecutorServiceImplExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i = 0 ; i <10; i++){
            executorService.execute(new PrintNumberGiven(i));
        }

        executorService.shutdown();
    }
}
