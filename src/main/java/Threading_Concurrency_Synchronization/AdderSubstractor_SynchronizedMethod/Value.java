package Threading_Concurrency_Synchronization.AdderSubstractor_SynchronizedMethod;

public class Value {
    private int val = 0;

    public synchronized void incrementBy(int num){
        //As this method is synchronized it means the obj access this method gets lock
        //this.lock()
        this.val += num;
        //this.unlock()
    }

    public synchronized void decrementBy(int num){
        //As this method is synchronized it means the obj access this method gets lock
        //this.lock()
        this.val -= num;
        //this.unlock()
    }

    public int getVal(){
        return this.val;
    }
}
