package Threading_Concurrency_Synchronization.AssignmentCounter;


public class Counter {

    private int count;

    public Counter(int count) {
        this.count = count;
    }
    public synchronized void incValue(int offset){
        this.count += offset;
    }
    public synchronized int getValue(){
        return this.count;
    }

    public synchronized void decValue(int offset){
        this.count -= offset;
    }

//    This method should decrement the value of count by offset. Also make this method synchronized

//    This method should return the value of count. Also make this method synchronized

//    This method should increment the value of count by offset. Also make this method synchronized
}
