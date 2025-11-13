package Neetcode150;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class AddTwoNumber_2 {

    public static void main(String[] args) {
        // First linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);


        // Second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(l1,l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        int carry = 0;
        ListNode prevhead1 = new ListNode();
        while(head1!=null && head2!=null){

            int sum = head1.val + head2.val + carry;
            int digit = sum%10;
            carry = sum/10;

            head1.val = digit;
            prevhead1.next = head1;
            head1 = head1.next;
            head2 = head2.next;
        }

        while(head1!=null){
            int sum = head1.val+carry;
            int digit = sum%10;
            carry = sum/10;
            head1.val = digit;
            prevhead1.next = head1;
            head1 = head1.next;
        }

        head1 = prevhead1.next;
        while(head2 != null){
            int sum = head2.val + carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode newNode = new ListNode(digit);
            head1.next = newNode;
            prevhead1.next = newNode;
            head1 = head1.next;
            head2 = head2.next;
        }

        head1 = prevhead1.next;

        if(carry != 0){
            head1.next = new ListNode(carry);
            head1 = head1.next;
        }

        return l1;
    }

    public static ListNode reverseLinkedList(ListNode l1){

        ListNode curr = l1;
        ListNode prev = null;
        while(curr.next != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        curr.next = prev;
        return curr;
    }
}
