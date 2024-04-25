public class DeleteMiddleNode 
        public ListNode deleteMiddle(ListNode head) {
            ListNode fast = head , slow = head , prev =  null;
    
            while ( fast != null && fast.next != null ) {
                prev = slow;
                fast = fast.next.next;
                slow = slow.next;
            }
    
            if ( prev != null) {
                prev.next = slow.next;
            } else {
                head = slow.next;
            }
           
            return head;
        }
    }

