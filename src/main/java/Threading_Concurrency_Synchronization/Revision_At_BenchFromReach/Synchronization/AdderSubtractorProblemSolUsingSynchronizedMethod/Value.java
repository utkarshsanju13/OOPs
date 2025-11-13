package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.Synchronization.AdderSubtractorProblemSolUsingSynchronizedMethod;

public class Value {
    int value = 0;

    public synchronized void increment(int num) {
        this.value += num;
    }

    public synchronized void decrement(int num) {
        this.value -= num;
    }

    public int getValue() {
        return value;
    }

}
