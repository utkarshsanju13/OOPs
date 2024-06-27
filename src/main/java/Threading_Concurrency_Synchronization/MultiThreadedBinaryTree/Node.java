package Threading_Concurrency_Synchronization.MultiThreadedBinaryTree;

public class Node {

    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) throws Exception {

        Node node8 = new Node(8);
        Node node6 = new Node(6,node8,null);
        Node node7 = new Node(7);
        Node node3 = new Node(3,node6,node7);

        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(node3);

        int size = treeSizeCalculator.call();

        System.out.println(size);
    }


}
