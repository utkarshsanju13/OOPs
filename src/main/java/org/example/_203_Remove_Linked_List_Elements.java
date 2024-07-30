package org.example;




public class _203_Remove_Linked_List_Elements {

    public static void main(String[] args) {
        // Create the nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(6);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(5);
        Node node7 = new Node(6);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        // Print the linked list
        printLinkedList(node1);
        Node newhead = removeElements(node1,6);
        printLinkedList(newhead);
    }

    public static Node removeElements(Node head, int val) {

        while(head != null && head.val == val){
            head = head.next;
        }

        if(head == null){
            return null;
        }



        Node prev = head;
        Node curr = head.next;

        while(curr!=null){

            if(curr.val == val){
                prev.next = curr.next;
                curr = prev.next;
            }else{
                prev = prev.next;
                curr = curr.next;
            }
        }

        return head;
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
