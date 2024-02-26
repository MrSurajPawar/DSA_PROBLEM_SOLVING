public class RemoveFromEnd {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head , fast = head ;
            for(int i = 0 ; i < n ; i++ ) {
                fast = fast.next;
            }
            
            if(fast == null) {
                ListNode newHead = head.next;
                return  newHead;
            }
    
            while( fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
    
            slow.next = slow.next.next;
            return head;
        }
}