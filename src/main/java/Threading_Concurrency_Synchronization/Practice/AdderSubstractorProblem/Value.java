package Threading_Concurrency_Synchronization.Practice.AdderSubstractorProblem;

public class Value {

    int val =0;

    public synchronized void increment(int i){
        this.val+=i;
    }

    public synchronized void decrement(int i){
        this.val-=i;
    }
}
