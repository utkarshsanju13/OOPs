package LRUCacheImplementatiom;

public class Node {

    Pair pair;
    Node prev;
    Node next;

    Node(Pair pair){
        this.pair = pair;
        this.prev = null;
        this.next = null;
    }
}
