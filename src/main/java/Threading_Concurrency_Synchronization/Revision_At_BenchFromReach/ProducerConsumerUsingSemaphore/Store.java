package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConsumerUsingSemaphore;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int maxSize;
    List<Integer> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<Integer>();
    }

    public  synchronized void addItem(int item) {
        items.add(item);
    }

    public synchronized int removeItem() {
        return items.remove(items.size() - 1);
    }

    public synchronized int getItemCount() {
        return items.size();
    }
}
