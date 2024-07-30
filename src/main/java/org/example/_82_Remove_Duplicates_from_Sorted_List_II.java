package org.example;

public class _82_Remove_Duplicates_from_Sorted_List_II {

    public static void main(String[] args) {
        // Create the nodes
        Node node1 = new Node();
//        ListNode node2 = new ListNode(1);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(4);
//        ListNode node6 = new ListNode(4);
//        ListNode node7 = new ListNode(5);

        // Link the nodes
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;

        // Print the linked list
        printLinkedList(node1);
        Node newhead = deleteDuplicates(node1);
        printLinkedList(newhead);
    }

    public static Node deleteDuplicates(Node head) {
        Node currNode = head;

        //creating a prev node from where head starts
        Node prevNode = new Node(); // dummy node
        head = prevNode;
        prevNode.next = currNode;

        //if there is only single node LL
        if (currNode == null || currNode.next == null) {
            return currNode;
        }

        Node nextNode = currNode.next;
        //if there is only two node in LL
        if (nextNode.next == null && currNode.val != nextNode.val) {
            return currNode;
        } else if (nextNode.next == null && currNode.val == nextNode.val) {
            return null;
        }

        //More than two node in LL
        int temp;
        while (nextNode != null) {

            if (currNode.val == nextNode.val) {
                temp = nextNode.val;
                while (nextNode.val == temp) {
                    nextNode = nextNode.next;
                    //Case when all the next node are same  [prev->1->1->1->->null]
                    if (nextNode == null) {
                        prevNode.next = null; //[prev->null]
                        return head.next;
                    }
                }

                currNode = nextNode;
                nextNode = nextNode.next;
                prevNode.next = currNode;
            } else {
                prevNode = prevNode.next;
                currNode = currNode.next;
                nextNode = nextNode.next;
            }
        }
        return head.next;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
