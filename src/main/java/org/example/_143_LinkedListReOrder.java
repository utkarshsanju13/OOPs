package org.example;


class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

class _143_LinkedListReOrder {
    public void reorderList(Node head) {
       /* if (head == null || head.next == null) return;

        HashMap<Integer, Node> hm = new HashMap<>();

        Node temp = head;
        int i = 0;
        while (temp != null) {
            hm.put(i, temp);
            temp = temp.next;
            i++;
        }

        int end = i; // fix the end index
        Node curr = head;
        boolean joinLast = true;
        int start = 2;

        while (start <= end) {
            if (joinLast) {
                curr.next = hm.get(end);
                end--;
            } else {
                curr.next = hm.get(start);
                start++;
            }
            curr = curr.next;
            joinLast = !joinLast;
        }

        curr.next = null; // to avoid cycle*/

        //find mid
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse the 2nd half of LinkedList
        Node pre = null;
        Node curr = mid.next;
        mid.next = null;

        while(curr!=null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        //the LL will becamoe as 1->2->3 && 5->4
        //then we join the both LL as 1->5->2->4->3

        Node left = head, right = pre;
        while(left!=null && right!=null){
            Node nextL = left.next;
            Node nextR = right.next;

            left.next = right;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }

        return ;
    }

    public static void main(String[] args) {
        // Create the input linked list 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // Print the original list
        System.out.print("Original list: ");
        printList(head);

        // Reorder the list
        _143_LinkedListReOrder solution = new _143_LinkedListReOrder();
        solution.reorderList(head);

        // Print the reordered list
        System.out.print("Reordered list: ");
        printList(head);
    }

    // Helper method to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

