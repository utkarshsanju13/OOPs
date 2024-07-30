package JavaCollection.Iterator;

import java.util.*;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

// The NestedIterator class that implements the Iterator interface
class NestedIterator implements Iterator<Integer> {

    private ArrayDeque<Integer> q;

    public NestedIterator(List<NestedInteger> nestedList) {
        q = new ArrayDeque<>();
        pushAll(nestedList);
    }

    @Override
    public Integer next() {
        return q.removeFirst();
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }

    private void pushAll(List<NestedInteger> nestedList) {
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                q.addLast(ni.getInteger());
            } else {
                pushAll(ni.getList());
            }
        }
    }
}

// A sample implementation of the NestedInteger interface for testing
class NestedIntegerImpl implements NestedInteger {
    private Integer singleInteger;
    private List<NestedInteger> nestedList;

    //Constructor for single integer
    public NestedIntegerImpl(Integer value) {
        this.singleInteger = value;
        this.nestedList = null;
    }

    //Constructor for nested list
    public NestedIntegerImpl(List<NestedInteger> list) {
        this.singleInteger = null;
        this.nestedList = list;
    }

    @Override
    public boolean isInteger() {
        return singleInteger != null;
    }

    @Override
    public Integer getInteger() {
        return singleInteger;
    }

    @Override
    public List<NestedInteger> getList() {
        return nestedList;
    }
}

// Main class to test the NestedIterator
public class Main {
    public static void main(String[] args) {
        // Create a nested list [[1,1],2,[1,1]]
        List<NestedInteger> nestedList = Arrays.asList(
                new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1))),
                new NestedIntegerImpl(2),
                new NestedIntegerImpl(Arrays.asList(new NestedIntegerImpl(1), new NestedIntegerImpl(1)))
        );

        // Create an instance of NestedIterator
        NestedIterator i = new NestedIterator(nestedList);


        // Use the iterator to flatten the nested list
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        // Output: 1 1 2 1 1
    }
}

