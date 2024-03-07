class Solution {
    public static ListNode reverseLL( ListNode temp) {
        ListNode prev = null;
        while ( temp != null ) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static ListNode getKthNode( ListNode temp , int k ) {
        k -= 1;
        while ( temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head , prevNode = null;

        while ( temp != null) {
            ListNode kthNode  = getKthNode( temp , k);
            if (kthNode == null) {
                if (prevNode != null)   prevNode.next = temp;   
                break;
            } 

            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL( temp );      //reversal

            if (temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }             
            
            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }
}
