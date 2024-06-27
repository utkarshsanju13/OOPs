package Threading_Concurrency_Synchronization.ProducerConsumer_Sync_Problem;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Object> items;
    int maxSize; //the maximum unit that can be produced/displayed

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void addItem(){
        this.items.add(null); //adding a item
    }

    public void removeItem(){
        this.items.remove(this.items.size()-1); //removing an item
    }

}
