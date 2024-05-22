package OOPs_2_Constructor_And_Access_Modifier;

public class Node {
    // write the code of node class here
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(Node node){
        this.data = node.data;
        if(node.next!=null){
            Node newNode = new Node(node.next);
            this.next = newNode;
            //    newNode.next = this.next.next;
        }else{
            this.next = null;
        }
    }

}
