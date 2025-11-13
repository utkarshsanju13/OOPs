package LRUCacheImplementatiom;

public class LRUCache {

    private int capacity;
    private Node head;
    private Node tail ;

    LRUCache(int capacity){
        this.capacity = capacity;
        head = new Node(new Pair(-1,-1));
        tail = new Node(new Pair(-1,-1));
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){

        return -1;
    }

    public int put(Pair pair){

        return -1;
    }
}
