package Assignment;// write your code here
import java.util.Iterator;
public class Node implements Iterable<Node> {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
}

class NodeIterator implements Iterator<Node>{
    Node root;

    NodeIterator(Node node){
        this.root = node;
    }

    @Override
    public boolean hasNext() {
        if(root!=null)
            return true;

        return  false;
    }

    @Override
    public Node next() {
        Node temp = root;
        root = root.next;

        return root;
    }
}

