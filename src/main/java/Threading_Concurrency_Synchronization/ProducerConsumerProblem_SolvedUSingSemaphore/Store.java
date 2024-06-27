package Threading_Concurrency_Synchronization.ProducerConsumerProblem_SolvedUSingSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    ConcurrentLinkedDeque<Object> items;
    int maxSize; //the maximum unit that can be produced/displayed

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public void addItem(){

        this.items.add(new Object()); //adding a item
    }

    public void removeItem(){
        this.items.remove(this.items.size()-1); //removing an item
    }

}
