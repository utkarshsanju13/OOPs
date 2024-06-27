package Threading_Concurrency_Synchronization.MultiThreadedBinaryTree;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;

    public TreeSizeCalculator(Node root) {
        this.root = root;
    }

    @Override
    public Integer call() throws Exception {

        if(root == null)
            return 0;

        Node left = root.left;
        Node right = root.right;

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> leftSize = es.submit(new TreeSizeCalculator(left));
        Future<Integer> rightSize = es.submit(new TreeSizeCalculator(right));

        int leftSizeFinal = leftSize.get();
        int rightSizeFinal = rightSize.get();

        return leftSizeFinal + rightSizeFinal + 1;

    }
}
