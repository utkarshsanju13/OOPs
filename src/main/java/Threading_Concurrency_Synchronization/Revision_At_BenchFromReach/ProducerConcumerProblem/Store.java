package Threading_Concurrency_Synchronization.Revision_At_BenchFromReach.ProducerConcumerProblem;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int maxSize;
    List<Integer> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<Integer>();
    }

    public void addItem(int item) {
        items.add(item);
    }

    public int removeItem() {
        return items.remove(items.size() - 1);
    }

    public int getItemCount() {
        return items.size();
    }
}
